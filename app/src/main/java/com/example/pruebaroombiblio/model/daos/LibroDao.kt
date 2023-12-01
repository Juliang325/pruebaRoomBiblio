package com.example.pruebaroombiblio.model.daos

import androidx.room.*
import com.example.pruebaroombiblio.model.entities.Libro


@Dao
interface LibroDao {
    @Insert
    fun addLibro(libro: Libro)

    @Query("SELECT * FROM libros_table")
    fun getLibros(): MutableList<Libro>

    @Query("SELECT titulo FROM libros_table WHERE titulo = :t")
    fun getLibro(t:String): Libro

    @Update
    fun updateLibros(libro: Libro)

    @Delete
    fun deleteLibro(libro: Libro)
}
