package com.example.pruebaroombiblio.model.daos

import androidx.room.*
import com.example.pruebaroombiblio.model.entities.Prestamo

@Dao
interface PrestamoDao {
    @Insert
    fun addPrestamo(prestamo: Prestamo)
    @Query("SELECT * FROM prestamos_table")
    fun getPrestamos():MutableList<Prestamo>
    @Delete
    fun deletePrestamo(prestamo: Prestamo)
}
