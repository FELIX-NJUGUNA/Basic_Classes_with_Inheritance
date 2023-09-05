package com.example.basic_classes_with_inheritance

class Carrier(name: String): Ship(
    name,
    "Carrier",
    20,
    100) {

    //no external access whatsoever
    private var attackPower = 120

    override fun attack(): Int {
        //let the calling code now how much damage to do
        return if(attacksRemaining > 0){
            attacksRemaining--
            attackPower
        }else{
            0
        }
    }
}