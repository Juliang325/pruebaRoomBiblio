package com.example.pruebaroombiblio.model.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="usuarios_table")
data class Usuario(
    @ColumnInfo(name = "nombre")
    var nombre:String,
    @ColumnInfo(name = "edad")
    var edad:Int,
    @ColumnInfo(name = "direccion")
    var direccion:String?=null) {
    @PrimaryKey(autoGenerate=true)
    @ColumnInfo(name = "id_usuario")
    var usuarioId:Int=0
}


