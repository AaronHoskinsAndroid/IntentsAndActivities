package examples.aaronhoskins.com.intentsandactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        if(intent != null) {
            val passedString = intent.getStringExtra("input")
            tvPassedString.text = passedString
        }
    }
}
