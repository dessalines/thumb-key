package com.dessalines.thumbkey.db

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AbbreviationRepository(
    private val abbreviationDao: AbbreviationDao,
) {
    val allAbbreviations: LiveData<List<Abbreviation>> = abbreviationDao.getAllAbbreviations()

    @WorkerThread
    suspend fun insertOrUpdate(
        abbr: String,
        expansion: String,
        id: Int? = null,
    ) {
        if (id != null) {
            abbreviationDao.update(id, abbr, expansion)
        } else {
            abbreviationDao.insert(abbr, expansion)
        }
    }

    @WorkerThread
    suspend fun delete(id: Int) {
        abbreviationDao.deleteById(id)
    }

    @WorkerThread
    fun getAbbreviation(abbr: String): Abbreviation? = abbreviationDao.getAbbreviation(abbr)
}

class AbbreviationViewModel(
    private val repository: AbbreviationRepository,
) : ViewModel() {
    val allAbbreviations: LiveData<List<Abbreviation>> = repository.allAbbreviations

    fun insertOrUpdate(
        abbr: String,
        expansion: String,
        id: Int? = null,
    ) = viewModelScope.launch {
        repository.insertOrUpdate(abbr, expansion, id)
    }

    fun delete(id: Int) =
        viewModelScope.launch {
            repository.delete(id)
        }

    fun getAbbreviation(abbr: String): Abbreviation? = repository.getAbbreviation(abbr)
}

class AbbreviationViewModelFactory(
    private val repository: AbbreviationRepository,
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AbbreviationViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return AbbreviationViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
