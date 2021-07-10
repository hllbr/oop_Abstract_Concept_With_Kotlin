package com.hllbr.oopabstractconcept

interface HouseDecor {
    /**var roomName = "Kitchen"//Bunu initialize edemeyeceğimi ifade ediyor Kotlin bana derleyici bunu ifade edebilmek için Property initializers are not alloew in interfaces diyor.
    Sorun benim açımdan üst satırdaki tanımlamanın yapılamıyor olmasından kaynaklanıyor
   *** Sorunun sebebi ise Java Interface içersinde property oluşturlmasına izin veriyorken Kotlin bu izni bize vermiyor.
     * Javada tanımlamayı initialize etmek zorundayım burayu bu şekilde bırakamazdım
     * Durum bu şekilde olunca bunu implement ettiğimiz sınıflarda alıp değiştirmemiz gerekiyor.
     */
    var roomName : String



    /**
    %100 Abstract
     Kotlin->no initialize
     Java ->initialize
     */
}