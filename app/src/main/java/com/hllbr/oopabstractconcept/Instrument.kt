package com.hllbr.oopabstractconcept

interface Instrument {
    /*bir önceki interface içerisinde property(özellik tanımlama) denedim bu yapı içerisinde fonksiyon yazmayı deniyorum.
    Bu işlemde de Java ve Kotlin arasında yine property tanımlamada olduğu gibi farklılıklar bulunuyor.

     */
    fun info(){
        println("instument info")
    }
    /*
    JAVA'da Normal şartlarda geleneksel android içerisinde bunu yapamıyor olmamız gerekiyordu olmaması gereken kısım info fonksiyonun içerisinde bir işleminin gerçekleşmesi durumudur.
    JAVA'da bir bir interface ieçrsinde fonksiyon oluştururken alt satırdaki ifade gibi oluşturuyoruz
    fun info()
    *PARANTEZ BİLE AÇMADIM.!

     */
    fun info1()
}
/*
Java içerisinde bir interface yapsında fonksiyon oluştururken body olamaz.
Override etmek zorunluluğu mevcut
Kotlin içerisinde bir interface yapsısında fonksiyon oluştururken body olabilir.
Bu durum ise isteğe bağlıdır.
İstersek body kullanarak yapıyı kurarız istersek body olmaksızın kurabiliriz.

 */