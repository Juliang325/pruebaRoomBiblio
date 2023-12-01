package com.example.pruebaroombiblio.model.daos

import androidx.room.*
import com.example.pruebaroombiblio.model.entities.Usuario

@Dao
interface UsuarioDao {
    @Insert
    fun addUsuario(usuario: Usuario)
    @Query("SELECT * FROM usuarios_table")
    fun getUsuarios():MutableList<Usuario>
    @Update
    fun updateUsuario(usuario: Usuario)
    @Delete
    fun deleteJugador(usuario: Usuario)
}
