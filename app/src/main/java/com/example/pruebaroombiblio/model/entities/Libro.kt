package com.example.pruebaroombiblio.model.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="libros_table")
data class Libro(
    @ColumnInfo(name = "titulo")
    var nombre:String,
    @ColumnInfo(name = "paginas")
    var pagina:Int,
    @ColumnInfo(name = "autor")
    var autor:String?=null) {
    @PrimaryKey(autoGenerate=true)
    @ColumnInfo(name = "id_libro")
    var libroId:Int=0
}
