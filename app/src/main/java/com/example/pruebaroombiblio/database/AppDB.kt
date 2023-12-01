package com.example.pruebaroombiblio.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pruebaroombiblio.model.daos.LibroDao
import com.example.pruebaroombiblio.model.daos.PrestamoDao
import com.example.pruebaroombiblio.model.daos.UsuarioDao
import com.example.pruebaroombiblio.model.entities.Libro
import com.example.pruebaroombiblio.model.entities.Prestamo
import com.example.pruebaroombiblio.model.entities.Usuario

@Database(entities = [Libro::class, Prestamo::class, Usuario::class], version = 1)
abstract class AppDB : RoomDatabase() {
    abstract fun DaoLibro(): LibroDao
    abstract fun DaoPrestamo(): PrestamoDao
    abstract fun DaoUsuario(): UsuarioDao
    companion object {
        private var INSTANCE: AppDB? = null
        fun getBaseDatos(context: Context): AppDB {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    AppDB::class.java,
                    "biblioBD")
                    .allowMainThreadQueries()
                    //Con migracion hay que incrementar la version y
                    //añadirle que migracion (de la 1 a la 2)
                    //.addMigrations(MIGRATION_1_2)
                    //futuras migraciones irían aquí
                    //.addMigrations(MIGRATION_2_3)
                    .build()
            }
            return INSTANCE as AppDB
        }/*
        val MIGRATION_1_2: Migration = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("ALTER TABLE usuario ADD COLUMN direccion TEXT")
            }//fin de migrate
        }//fin de Migration
        */
    }//fin de companion object
}//fin de AppDB
