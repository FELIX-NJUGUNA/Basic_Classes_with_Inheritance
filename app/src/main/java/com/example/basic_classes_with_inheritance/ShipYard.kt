package com.example.basic_classes_with_inheritance

import android.util.Log

class ShipYard {

    fun serviceShip(shipToBeServiced: Ship){
        shipToBeServiced.serviceShip()
        Log.i("Servicing","${shipToBeServiced.name}")
    }
}