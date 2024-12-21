package com.dessalines.thumbkey.db

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AbbreviationRepository(private val abbreviationDao: AbbreviationDao) {
    val allAbbreviations: LiveData<List<Abbreviation>> = abbreviationDao.getAllAbbreviations()

    @WorkerThread
    suspend fun insertOrUpdate(abbr: String, expansion: String) {
        abbreviationDao.insertOrUpdate(abbr, expansion)
    }

    @WorkerThread
    suspend fun delete(abbr: String) {
        abbreviationDao.delete(abbr)
    }

    @WorkerThread
    fun getAbbreviation(abbr: String): Abbreviation? {
        return abbreviationDao.getAbbreviation(abbr)
    }
}

class AbbreviationViewModel(private val repository: AbbreviationRepository) : ViewModel() {
    val allAbbreviations: LiveData<List<Abbreviation>> = repository.allAbbreviations

    fun insertOrUpdate(abbr: String, expansion: String) = viewModelScope.launch {
        repository.insertOrUpdate(abbr, expansion)
    }

    fun delete(abbr: String) = viewModelScope.launch {
        repository.delete(abbr)
    }

    fun getAbbreviation(abbr: String): Abbreviation? {
        return repository.getAbbreviation(abbr)
    }
}

class AbbreviationViewModelFactory(private val repository: AbbreviationRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AbbreviationViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return AbbreviationViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
