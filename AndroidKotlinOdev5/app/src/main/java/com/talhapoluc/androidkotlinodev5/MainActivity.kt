package com.talhapoluc.androidkotlinodev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.talhapoluc.androidkotlinodev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        var deger : String = ""
        var islem1 : String = ""
        var islem2 : String = ""
        var islem3 : String = ""
        var islem4 : String = ""
        var sonuc : Int = 0



        tasarim.buttonBir.setOnClickListener {
            deger = "${deger + 1}"
            tasarim.textView.text = deger
        }
        tasarim.buttonIki.setOnClickListener {
            deger = "${deger + 2}"
            tasarim.textView.text = deger
        }
        tasarim.buttonUc.setOnClickListener {
            deger = "${deger + 3}"
            tasarim.textView.text = deger
        }
        tasarim.buttonDort.setOnClickListener {
            deger = "${deger + 4}"
            tasarim.textView.text = deger
        }
        tasarim.buttonBes.setOnClickListener {
            deger = "${deger + 5}"
            tasarim.textView.text = deger
        }
        tasarim.buttonAlti.setOnClickListener {
            deger = "${deger + 6}"
            tasarim.textView.text = deger
        }
        tasarim.buttonYedi.setOnClickListener {
            deger = "${deger + 7}"
            tasarim.textView.text = deger
        }
        tasarim.buttonSekiz.setOnClickListener {
            deger = "${deger + 8}"
            tasarim.textView.text = deger
        }
        tasarim.buttonDokuz.setOnClickListener {
            deger = "${deger + 9}"
            tasarim.textView.text = deger
        }
        tasarim.buttonSifir.setOnClickListener {
            deger = "${deger + 0}"
            tasarim.textView.text = deger
        }
        tasarim.buttonArti.setOnClickListener {
            deger = "${deger + "+"}"
            tasarim.textView.text = deger
        }
        tasarim.buttonEsit.setOnClickListener {
            for (i in deger){
                islem1 += i
                if (i == '+'){
                    break
                }
            }
            for (i in deger){
                if (i == '+'){
                    continue
                }
                islem2 += i
            }


            islem3 = islem2.substring(islem1.length - 1,islem2.length)
            islem4 = islem1.substring(0,islem1.length - 1)
            //islem1 = deger.substring(0,parcalamaDegeri )
            //islem2 = deger.substring(parcalamaDegeri ,deger.length)

            Log.e("islem 1 : ","$islem1")
            Log.e("islem 2 : ","$islem2")
            Log.e("islem 3 : ","$islem3")
            Log.e("islem 4 : ","$islem4")

            sonuc = islem4.toInt() + islem3.toInt()

            tasarim.textView.text = sonuc.toString()

        }
        tasarim.buttonClear.setOnClickListener {
            deger = ""
            tasarim.textView.text = deger
            islem1 = ""
            islem2 = ""

        }
    }

}