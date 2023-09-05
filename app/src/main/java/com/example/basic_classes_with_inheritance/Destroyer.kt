package com.example.basic_classes_with_inheritance

class Destroyer (name: String):Ship(
    name,
    "Destroyer",
    10,
    200){

    ///no external access whatsoever
    private var shotPower = 60

    override fun attack(): Int {
        //let the calling code know how much damage to do
        return if(attacksRemaining > 0){
            attacksRemaining --
            shotPower
        }else{
            0
        }
    }
}