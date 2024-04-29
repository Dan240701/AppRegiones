package com.example.regionesapp

import android.graphics.Region

object Global {

        val regiones = listOf(
            RegionLis(0, "Pacifico", "Esta zona está formada por una planicie ancha y llena de volcanes," +
                    " y se caracteriza por un clima caluroso.",7)
            , RegionLis(1, "Norte y Centro", "Esta región se caracteriza por tener unas altas " +
                    "montañas y frondosos valles.",8)
            , RegionLis(2, "Caribe", "Esta es la zona menos poblada de Nicaragua y todavía es difícil acceder a ella, a pesar de que " +
                    "ocupa más de la mitad del territorio del país. ",2)

        )

        val departamentos = listOf(
            DepartamentoLis(0,"Boaco","NI-BO","Boaco",174682.00,4177.00,41.8,
                "Norte y centro"),
            DepartamentoLis(1, "Chinandega", "NI-CI", "Chinandega", 432062.00, 4822.00, 87.7, "Pacífico"),
            DepartamentoLis(2, "Estelí", "NI-ES", "Estelí", 201548.00, 2230.00, 90.00, "Norte y centro"),
            DepartamentoLis(3, "Granada", "NI-GR", "Granada", 168186.00, 1040.00, 162.00, "Pacífico"),
            DepartamentoLis(4, "Jinotega", "NI-JI", "Jinotega", 331335.00, 9222.00, 36.00, "Norte y centro"),
            DepartamentoLis(5, "Carazo", "NI-CA", "Jinotepe", 186898.00, 1081.00, 172.8, "Pacífico"),
            DepartamentoLis(6, "Chontales", "NI-CO", "Juigalpa", 153932.00, 6481.00, 24.00, "Norte y centro"),
            DepartamentoLis(7, "León", "NI-LE", "León", 355779.00, 5138.00, 69.00, "Pacífico"),
            DepartamentoLis(8, "Madriz", "NI-MD", "Somoto", 132459.00, 1708.00, 78.00, "Norte y centro"),
            DepartamentoLis(9, "Managua", "NI-MN", "Managua", 2132421.00, 3465.00, 365.00, "Pacífico"),
            DepartamentoLis(10, "Masaya", "NI-MS", "Masaya", 289988.00, 611.00, 475.00, "Pacífico"),
            DepartamentoLis(11, "Matagalpa", "NI-MT", "Matagalpa", 469172.00, 6804.00, 69.00, "Norte y centro"),
            DepartamentoLis(12, "Nueva Segovia", "NI-NS", "Ocotal", 208523.00, 3491.00, 60.00, "Norte y centro"),
            DepartamentoLis(13, "Costa Caribe Sur", "NI-CS", "Bluefields", 306510.00, 27260.00, 11.00, "La región del Caribe"),
            DepartamentoLis(14, "Costa Caribe Norte", "NI-CN", "Puerto Cabezas", 31430.00, 33106.00, 10.00, "La región del Caribe"),
            DepartamentoLis(15, "Rivas", "NI-RI", "Rivas", 15683.00, 2162.00, 72.00, "Pacífico"),
            DepartamentoLis(16, "Río San Juan", "NI-SJ", "San Carlos", 95596.00, 7541.00, 13.00, "Norte y centro")


        )


}

class RegionLis(val id: Int, val region: String, val descripcion: String, val dp: Int)

class DepartamentoLis(val id: Int, val nombre: String, val iso: String, val cabecera: String, val poblacion: Double,
                      val area: Double, val densidad: Double, val Region: String)