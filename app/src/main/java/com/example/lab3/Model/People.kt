package com.example.lab3.Model

class People {
    var name:String? = null
    var image:Int? = null

    constructor()
    constructor(name: String?, image: Int?) {
        this.name = name
        this.image = image
    }
}