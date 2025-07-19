package com.dessalines.thumbkey.db

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

val MIGRATION_1_2 =
    object : Migration(1, 2) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column min_swipe_length INTEGER NOT NULL default $DEFAULT_MIN_SWIPE_LENGTH",
            )
        }
    }

val MIGRATION_2_3 =
    object : Migration(2, 3) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column pushup_size INTEGER NOT NULL default $DEFAULT_PUSHUP_SIZE",
            )
        }
    }

val MIGRATION_3_4 =
    object : Migration(3, 4) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column hide_letters INTEGER NOT NULL default $DEFAULT_HIDE_LETTERS",
            )
        }
    }

val MIGRATION_4_5 =
    object : Migration(4, 5) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column keyboard_layouts TEXT NOT NULL default '$DEFAULT_KEYBOARD_LAYOUT'",
            )
        }
    }

val MIGRATION_5_6 =
    object : Migration(5, 6) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column key_borders INTEGER NOT NULL default $DEFAULT_KEY_BORDERS",
            )
        }
    }

val MIGRATION_6_7 =
    object : Migration(6, 7) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column spacebar_multitaps INTEGER NOT NULL default $DEFAULT_SPACEBAR_MULTITAPS",
            )
        }
    }

val MIGRATION_7_8 =
    object : Migration(7, 8) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column hide_symbols INTEGER NOT NULL default $DEFAULT_HIDE_SYMBOLS",
            )
        }
    }

val MIGRATION_8_9 =
    object : Migration(8, 9) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column last_version_code_viewed INTEGER NOT NULL default 0",
            )
        }
    }

val MIGRATION_9_10 =
    object : Migration(9, 10) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column slide_enabled INTEGER NOT NULL default $DEFAULT_SLIDE_ENABLED",
            )
            db.execSQL(
                "alter table AppSettings add column slide_sensitivity INTEGER NOT NULL default $DEFAULT_SLIDE_SENSITIVITY",
            )
        }
    }

val MIGRATION_10_11 =
    object : Migration(10, 11) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column backdrop_enabled INTEGER NOT NULL default $DEFAULT_BACKDROP_ENABLED",
            )
        }
    }

val MIGRATION_11_12 =
    object : Migration(11, 12) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column key_padding INTEGER NOT NULL default $DEFAULT_KEY_PADDING",
            )
            db.execSQL(
                "alter table AppSettings add column key_border_width INTEGER NOT NULL default $DEFAULT_KEY_BORDER_WIDTH",
            )
            db.execSQL(
                "alter table AppSettings add column key_radius INTEGER NOT NULL default $DEFAULT_KEY_RADIUS",
            )
        }
    }

val MIGRATION_12_13 =
    object : Migration(12, 13) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column slide_spacebar_deadzone_enabled INTEGER NOT NULL " +
                    "default $DEFAULT_SLIDE_SPACEBAR_DEADZONE_ENABLED",
            )
            db.execSQL(
                "alter table AppSettings add column slide_backspace_deadzone_enabled INTEGER NOT NULL " +
                    "default $DEFAULT_SLIDE_BACKSPACE_DEADZONE_ENABLED",
            )
            db.execSQL(
                "alter table AppSettings add column slide_cursor_movement_mode INTEGER NOT NULL " +
                    "default $DEFAULT_SLIDE_CURSOR_MOVEMENT_MODE",
            )
        }
    }

val MIGRATION_13_14 =
    object : Migration(13, 14) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column key_width INTEGER",
            )
        }
    }

val MIGRATION_14_15 =
    object : Migration(14, 15) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column drag_return_enabled INTEGER NOT NULL default $DEFAULT_DRAG_RETURN_ENABLED",
            )
            db.execSQL(
                "alter table AppSettings add column circular_drag_enabled INTEGER NOT NULL default $DEFAULT_CIRCULAR_DRAG_ENABLED",
            )
            db.execSQL(
                "alter table AppSettings add column clockwise_drag_action INTEGER NOT NULL default $DEFAULT_CLOCKWISE_DRAG_ACTION",
            )
            db.execSQL(
                "alter table AppSettings add column counterclockwise_drag_action INTEGER NOT NULL " +
                    "default $DEFAULT_COUNTERCLOCKWISE_DRAG_ACTION",
            )
        }
    }

val MIGRATION_15_16 =
    object : Migration(15, 16) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column ghost_keys_enabled INTEGER NOT NULL default $DEFAULT_GHOST_KEYS_ENABLED",
            )
        }
    }

val MIGRATION_16_17 =
    object : Migration(16, 17) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "alter table AppSettings add column key_modifications TEXT NOT NULL default ''",
            )
        }
    }

val MIGRATION_17_18 =
    object : Migration(17, 18) {
        override fun migrate(db: SupportSQLiteDatabase) {
            db.execSQL(
                "ALTER TABLE AppSettings RENAME COLUMN key_size TO key_size_defunct",
            )
            db.execSQL(
                "ALTER TABLE AppSettings RENAME COLUMN key_width TO key_width_defunct",
            )
            db.execSQL(
                "ALTER TABLE AppSettings ADD COLUMN auto_size_keys INTEGER NOT NULL DEFAULT $DEFAULT_AUTO_SIZE_KEYS",
            )
            db.execSQL(
                "ALTER TABLE AppSettings ADD COLUMN non_square_keys INTEGER NOT NULL DEFAULT $DEFAULT_NON_SQUARE_KEYS",
            )
            db.execSQL(
                "ALTER TABLE AppSettings ADD COLUMN key_width_v18 INTEGER NOT NULL DEFAULT $DEFAULT_KEY_WIDTH",
            )
            db.execSQL(
                "ALTER TABLE AppSettings ADD COLUMN key_height_v18 INTEGER NOT NULL DEFAULT $DEFAULT_KEY_HEIGHT",
            )
            db.execSQL(
                "UPDATE AppSettings SET auto_size_keys = 0 WHERE key_size_defunct != $DEFAULT_KEY_HEIGHT",
            )
            db.execSQL(
                "UPDATE AppSettings SET non_square_keys = 1 WHERE key_width_defunct != $DEFAULT_KEY_WIDTH",
            )
            db.execSQL(
                "UPDATE AppSettings SET key_width_v18 = IFNULL(key_width_defunct, $DEFAULT_KEY_WIDTH)",
            )
            db.execSQL(
                "UPDATE AppSettings SET key_height_v18 = IFNULL(key_size_defunct, $DEFAULT_KEY_HEIGHT)",
            )
        }
    }
