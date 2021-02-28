package jp.techacademy.daichi.miyuki.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var result = 0.0
        val value1 = intent.getDoubleExtra("VALUE1", 0.0)
        val value2 = intent.getDoubleExtra("VALUE2", 0.0)
        val operator = intent.getStringExtra("Result")

        if (operator.equals("+")) {
            result = value1 + value2
            result1.text=result.toString()
        } else if (operator.equals("-")) {
            result = value1 - value2
            result1.text=result.toString()
        } else if (operator.equals("x")) {
            result = value1 * value2
            result1.text=result.toString()
        } else if (operator.equals("÷")) {
            if (value2 == 0.0) {
                result1.text = "0 では割れません"
                return
            } else {
                result = value1 / value2
                result1.text=result.toString()
            }
        }
    }
}