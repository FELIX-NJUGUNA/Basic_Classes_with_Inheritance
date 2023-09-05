package com.example.basic_classes_with_inheritance

import android.util.Log

abstract class Ship (
    //initialises the variables of the constructor
    val name: String,
    private var type: String,
    private val maxAttacks: Int,
    private val maxHullIntegrity: Int){


    //characteristics of the ship
    private var sunk = false
    private var hullIntegrity: Int = 0
    protected var attacksRemaining: Int = 0

    //the init block initialises the properties not initialised in the constructor
    init {

        hullIntegrity = this.maxHullIntegrity
        attacksRemaining = 1
    }

    //anything can use this function
    fun takeDamage(damageTaken: Int){
        if(!sunk){
            hullIntegrity = damageTaken
            Log.i("$name damage taken = ","$damageTaken")
            Log.i("$name hull integrity = ","$hullIntegrity")

            if(hullIntegrity <= 0){
                Log.i(type,"$name has been sunk")
                sunk = true
            }
        }else{
            //already sunk
            Log.i("Error","Ship does not exist")
        }
    }

    fun serviceShip(){
        attacksRemaining = maxAttacks
        hullIntegrity = maxHullIntegrity
    }

    fun showStats(){
        Log.i("$type $name","Attacks: $attacksRemaining \n Hull: $hullIntegrity")
    }

    abstract fun attack():Int
}