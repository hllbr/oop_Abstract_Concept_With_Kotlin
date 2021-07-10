package com.hllbr.oopabstractconcept

class User : People{
    //property
    var name: String? = null
    var age : Int? = null
    //Constructor vs init
     constructor(nameInput:String,ageInput:Int){
         this.name = nameInput
         this.age = ageInput
     }
    init{
        println("init")
    }
    /*
    User bir insan oluduğu için senaryoma göre People sınıfından yararlanabiliyor.Yararlanmalı bu sebeple kendisini inheri ederek faydalanmaya çalışıyorum

     */
}