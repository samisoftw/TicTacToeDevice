package com.solo.myfirstapp


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var player = "player1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt1.setOnClickListener { buttonClick(bt1) }
        bt2.setOnClickListener { buttonClick(bt2) }
        bt3.setOnClickListener { buttonClick(bt3) }
        bt4.setOnClickListener { buttonClick(bt4) }
        bt5.setOnClickListener { buttonClick(bt5) }
        bt6.setOnClickListener { buttonClick(bt6) }
        bt7.setOnClickListener { buttonClick(bt7) }
        bt8.setOnClickListener { buttonClick(bt8) }
        bt9.setOnClickListener { buttonClick(bt9) }

        btnReset.setOnClickListener{reset()}

    }

    fun buttonClick(btn: Button) {
        if (btn.text == "") {
            if (player == "player1") {
                player = "player2"
                btn.text = "X"
            } else {
                player = "player1"
                btn.text = "O"
            }
        }
        win()
    }

    fun win() {
        if ((bt1.text == "X" && bt2.text == "X" && bt3.text == "X")
            || (bt4.text == "X" && bt5.text == "X" && bt6.text == "X")
            || (bt7.text == "X" && bt8.text == "X" && bt9.text == "X")
            || (bt1.text == "X" && bt4.text == "X" && bt7.text == "X")
            || (bt2.text == "X" && bt5.text == "X" && bt8.text == "X")
            || (bt3.text == "X" && bt6.text == "X" && bt9.text == "X")
            || (bt1.text == "X" && bt5.text == "X" && bt9.text == "X")
            || (bt3.text == "X" && bt5.text == "X" && bt7.text == "X")){textViewWinner.text="Player X is the winner" ; disableButtons()}
        else if ((bt1.text == "O" && bt2.text == "O" && bt3.text == "O")
            || (bt4.text == "O" && bt5.text == "O" && bt6.text == "O")
            || (bt7.text == "O" && bt8.text == "O" && bt9.text == "O")
            || (bt1.text == "O" && bt4.text == "O" && bt7.text == "O")
            || (bt2.text == "O" && bt5.text == "O" && bt8.text == "O")
            || (bt3.text == "O" && bt6.text == "O" && bt9.text == "O")
            || (bt1.text == "O" && bt5.text == "O" && bt9.text == "O")
            || (bt3.text == "O" && bt5.text == "O" && bt7.text == "O")){textViewWinner.text="Player O is the winner" ; disableButtons()}
        else{textViewWinner.text=""}

    }

    fun reset() {
        bt1.text=""
        bt2.text=""
        bt3.text=""
        bt4.text=""
        bt5.text=""
        bt6.text=""
        bt7.text=""
        bt8.text=""
        bt9.text=""

        textViewWinner.text=""

        bt1.isEnabled= true
        bt2.isEnabled= true
        bt3.isEnabled= true
        bt4.isEnabled= true
        bt5.isEnabled= true
        bt6.isEnabled= true
        bt7.isEnabled= true
        bt8.isEnabled= true
        bt9.isEnabled= true
    }

    fun disableButtons()
    {
        bt1.isEnabled= false
        bt2.isEnabled= false
        bt3.isEnabled= false
        bt4.isEnabled= false
        bt5.isEnabled= false
        bt6.isEnabled= false
        bt7.isEnabled= false
        bt8.isEnabled= false
        bt9.isEnabled= false
    }
}



