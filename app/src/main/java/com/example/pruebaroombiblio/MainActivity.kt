package com.example.pruebaroombiblio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.pruebaroombiblio.database.AppDB
import com.example.pruebaroombiblio.model.entities.Libro
import com.example.pruebaroombiblio.model.entities.Prestamo
import com.example.pruebaroombiblio.model.entities.Usuario

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val conexion=AppDB.getBaseDatos(this)
        val daoLibro=conexion.DaoLibro()
        val daoUsuario=conexion.DaoUsuario()
        val daoPrestamo=conexion.DaoPrestamo()

        val libro1 = Libro("Pinocho", 100, "Pablo")
        daoLibro.addLibro(libro1)
        val usuario1 = Usuario("Juian", 21, "abd")
        daoUsuario.addUsuario(usuario1)

        val prestamo1 = Prestamo(1, 1)
        daoPrestamo.addPrestamo(prestamo1)

        var prestamoConsulta = daoLibro.getLibro("Pinocho")

        val lista:MutableList<Prestamo> = daoPrestamo.getPrestamos()
        lista.forEach {
            val listita:String=it.libroId.toString() +" "+it.usuarioId.toString()
            Log.d("room",listita)
        }
    }
}
