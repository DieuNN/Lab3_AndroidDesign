package com.example.lab3.Model

class Phone {
    var name:String? = null
    var price:Double? = null
    var image:Int? = null

    constructor()
    constructor(name: String?, price: Double?, image: Int?) {
        this.name = name
        this.price = price
        this.image = image
    }


}