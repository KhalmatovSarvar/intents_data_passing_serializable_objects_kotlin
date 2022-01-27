package com.example.intents_data_passing_seriaizable_objects_kotlin.model

import java.io.Serializable

class User(): Serializable {
    var name: String = "Sarvar"
    var age:Int = 21
    var gender:Char ='M'

    override fun toString(): String {
        return "User(name='$name', age=$age, gender=$gender)"
    }



}