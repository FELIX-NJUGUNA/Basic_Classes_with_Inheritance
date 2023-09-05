package com.example.basic_classes_with_inheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val friendlyDestroyer = Destroyer("Invincible")
        val friendlyCarrier = Carrier("Indomitable")


        val enemyDestroyer = Destroyer("Grey Death")
        val enemyCarrier = Carrier("Big Grey Death")


        val friendlyShipyard = ShipYard()
// A small battle
        friendlyDestroyer.takeDamage(enemyDestroyer.attack())
        friendlyDestroyer.takeDamage(enemyCarrier.attack())
        enemyCarrier.takeDamage(friendlyCarrier.attack())
        enemyCarrier.takeDamage(friendlyDestroyer.attack())
// Take stock of the supplies situation
        friendlyDestroyer.showStats()
        friendlyCarrier.showStats()
// Dock at the shipyard
        friendlyShipyard.serviceShip(friendlyCarrier)
        friendlyShipyard.serviceShip(friendlyDestroyer)
// Take stock of the supplies situation
        friendlyDestroyer.showStats()
        friendlyCarrier.showStats()
// Finish off the enemy
        enemyDestroyer.takeDamage(friendlyDestroyer.attack())
        enemyDestroyer.takeDamage(friendlyCarrier.attack())
        enemyDestroyer.takeDamage(friendlyDestroyer.attack())

    }
}

            //output of the code above and the entire class
        /*Invincible damage taken =: 60
          Invincible hull integrity =: 140
          Invincible damage taken =: 120
          Invincible hull integrity =: 20
          Big Grey Death damage taken =: 120
          Big Grey Death hull integrity =: -20
          Carrier: Big Grey Death has been sunk
          Error: Ship does not exist
          Destroyer Invincible: Attacks:0 - Hull:20
          Carrier Indomitable: Attacks:0 - Hull:100
          Servicing: Indomitable
          Servicing: Invincible
          Destroyer Invincible: Attacks:10 - Hull:200
          Carrier Indomitable: Attacks:20 - Hull:100
          Grey Death damage taken =: 60
          Grey Death hull integrity =: 140
          Grey Death damage taken =: 120
          Grey Death hull integrity =: 20
          Grey Death damage taken =: 60
          Grey Death hull integrity =: -40
          Destroyer: Grey Death has been sunk
         */