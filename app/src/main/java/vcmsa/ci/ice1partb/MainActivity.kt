package vcmsa.ci.ice1partb

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val num1: EditText = findViewById(R.id.InputNumOne)
        val num2: EditText = findViewById(R.id.InputNumTwo)
        val result: EditText = findViewById(R.id.result)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            val num1_text = num1.text.toString()
            val num2_text = num2.text.toString()
            val sum = num1_text.toInt() + num2_text.toInt()
            result.setText(sum.toString())
        }
        }
    }
