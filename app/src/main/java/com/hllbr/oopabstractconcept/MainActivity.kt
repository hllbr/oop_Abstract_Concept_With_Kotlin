package com.hllbr.oopabstractconcept

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        Abstract & interface
        interface te bir abstracttır.
        interface keilme karşılığı olarak arayüz anlamına gelmektedir.
        Abstract temel olarak soyut sınıf oluşturma yetisine(yeteneğine) deniyor.
        Soyut sınıf nedir ? / Neden ihtiyaç duyarız.
        Soyut sınıf aslında bizim bir intance(obje) oluşturamayacağımız bir sınıf türüdür.

        *Bu yapı genel olarak inherit edilsin(kalıtıma maruz kalsın diye) oluşturulan sınıflarda kullanılır.
        10 sınıfımız her sınıfta 10 fonksyion var ve bu 10ar fonksiyonların 7 si ortak olan bir senaryo düşünürsek
        100 sınıf oluşturacağıma 11 sınıf oluştururum 11.sınfta bu ortak 7 fonksiyonu tanımlarım geri kalan sınıflarda da bunu inherit ederim
        11. sınıftan bir obje oluşturabiliyor olmasını istemiyor olabilirim .
        Sadece bu amaçla bu sınıfı oluşturabiliyor olabilirim.
        Bunu nasıl gerçekleştirebilirim ?

         */
        var myUser = User("james",40)
        println(myUser.age.toString())
        println(myUser.name)
        println(myUser.information())

        //myPeople = People() diyemem çünkü abstact classlardan instance oluşturulamaz.Mustafa Murat Coşkun derlerinde bu yapıyı sözleşme olarak ifade etmişti.
        //Derleyici myPeople oluştumaya çalıştığımda bana cannot create an instance of an abstract class ifadesi ile hatamı belirtiyor.


        /*
        Interface nedir abstract class kullanmak yerine neden bunlarıda tercih etmemiz gerekiyor¿
        Abstract classlar güzel işimize yarıyor fakat limitosyonları bulunuyor.
        Abstract classların sınırı sorunu sadece tek bir sınıf için inheritance gerçekleştirebiliyor olmamızda yatıyor.
        Aynı anda iki sınıftan inheritance alamıyorum.
        Java ve Kotlinde bu durum geçerlidir.
        Çok büyük çaplı bir projede yüzlerce sınıfım ve abstract classım olduğunu düşün bir noktada iki sınıftanda kalıtım almam gereken bir durumla karşılaşırsam  iki sınıfta abstract diyelim bu sorunu çözmek için interface ile çözülebilir.
        Interface ile %100 abstract classlar oluşturabilir ve birden fazla kalıtım alabilirim.
        interfaceler inherit edilmez implementetion (uygulama) uygulanır.
        *************************Özellikle Javada interfaceler kalıtılmaz uygulanır :))))))))))**************
        Interfaceler abstractlık konusunda %100lük sağlıyor fakat farklı özellikleride bulunuyor.
        benim HouseDecor interface yapımdan bir obje oluşturmamın bir anlamı yok

         */
        var myPiano = Piano()
        myPiano.brand = "YAMAHA"
        myPiano.digital = true
        println(myPiano.roomName)
        myPiano.info()
        myPiano.info1()
    }
}