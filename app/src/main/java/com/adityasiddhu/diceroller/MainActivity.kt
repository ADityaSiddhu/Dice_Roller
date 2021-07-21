package com.adityasiddhu.diceroller


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll : Button = findViewById(R.id.btnTap)
        var tvOutput : TextView = findViewById(R.id.tvOutput)

        val imgFace : ImageView = findViewById(R.id.imgFace)

        btnRoll.setOnClickListener{
            val randomNum = (1..6).random()
            tvOutput.text = randomNum.toString()

            if(randomNum==1)
            {
                imgFace.setImageResource(R.drawable.dice1)
            }
            else if(randomNum==2)
            {
                imgFace.setImageResource(R.drawable.dice2)
            }
            else if(randomNum==3)
            {
                imgFace.setImageResource(R.drawable.dice3)
            }
            else if(randomNum==4)
            {
                imgFace.setImageResource(R.drawable.dice4)
            }
            else if(randomNum==5)
            {
                imgFace.setImageResource(R.drawable.dice5)
            }
            else
            {
                imgFace.setImageResource(R.drawable.dice6)
            }


        }

    }
}