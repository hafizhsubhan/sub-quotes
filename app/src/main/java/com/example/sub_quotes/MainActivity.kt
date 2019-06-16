package com.example.sub_quotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.sub_quotes.model.apiQu
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getApi()

        ref.setOnClickListener {
            quotes.text = ""
            author.text = ""
            getApi()
        }

    }

    fun getApi(){
        quotServ.getAPI().getQuoteAPI().enqueue(object : Callback<apiQu> {
            override fun onFailure(call: Call<apiQu>, t: Throwable) {
                Toast.makeText(applicationContext,"Maaf kan aku Roma", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<apiQu>, response: Response<apiQu>) {
                //Log.d("isinys", response.body().toString())
                //Toast.makeText(applicationContext,"on Responso running"+response.body().toString(), Toast.LENGTH_LONG).show()
                response.body()?.let {
                    quotes.text = it.quotes!!.body
                    author.text = it.quotes!!.author
                }

            }
        })
    }
}
