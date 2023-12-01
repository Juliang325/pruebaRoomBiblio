package com.example.pruebaroombiblio.model.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(tableName="prestamos_table",
    primaryKeys = ["id_libro_fk","id_usuario_fk"],
    foreignKeys = [
        ForeignKey(
            entity = Libro::class,
            parentColumns = ["id_libro"],
            childColumns = ["id_libro_fk"]
        ),
        ForeignKey(
            entity = Usuario::class,
            parentColumns = ["id_usuario"],
            childColumns = ["id_usuario_fk"]
        )
    ]
)
data class Prestamo(
    @ColumnInfo(name = "id_libro_fk")
    var libroId: Int,
    @ColumnInfo(name = "id_usuario_fk")
    var usuarioId: Int,
   )
