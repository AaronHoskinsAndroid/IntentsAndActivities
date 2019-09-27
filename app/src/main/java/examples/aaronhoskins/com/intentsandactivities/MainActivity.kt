package examples.aaronhoskins.com.intentsandactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnStartSecondActivity.setOnClickListener(this)
//        btnStartSecondActivity.setOnClickListener(View.OnClickListener {
//
//        })
    }

    override fun onClick(view : View?) {
        val userInput = etUserInput.text.toString()

        val intent = Intent(MainActivity@this, SecondActivity::class.java)
        intent.putExtra("input", userInput)
        startActivity(intent)
    }
}
