package com.hllbr.oopabstractconcept

class Piano : HouseDecor ,Instrument{
    var brand : String? = null
    var digital : Boolean? = null
    override var roomName: String
        get() = "Kitchen"//bu ifade ile roomName içeriğini Kitchen olarak atamış olabiliyorum.
        set(value) {}

    override fun info1() {
       println("info1 is a active function")
    }
    /*
    Bir piano sınıfım var Senaryoma göre büyük bir app içerisinde piano gibi farklı farklı nesnelerim var
    örnek olarak ev dekorasyonu yapan bir app içerisinde bir element(eve eklenecek lüks eşyalar sınıfı içerisinde) olduğunu varsayıyorum
     ev dekorasyonu hemde müzik aleti sınıfı içerisinde bulunabilecek bir eleman piano
     iki sınıfın özelliklerinide kalıtım almam gereken bir durum oluşacaktı.
     Bu sorunu abstract classlar ile çözemeyiz o yüzden interface olarak ifade ettiğimiz arayüzlerle bu sorunun üstesinden gelebilirim

     */



}