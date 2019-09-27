package examples.aaronhoskins.com.intentsandactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    val TAG = "TAG_MAIN"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnStartSecondActivity.setOnClickListener(this)
        btnGetCarData.setOnClickListener(this)
//        btnStartSecondActivity.setOnClickListener(View.OnClickListener {
//
//        })
        Log.d(TAG, "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onReStart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    override fun onClick(view : View) {
        when(view.id) {
            R.id.btnStartSecondActivity -> startSecondActivity()
            R.id.btnGetCarData -> {
                //Implicit Intent
                val intent = Intent("get.car.info")
                startActivityForResult(intent, 432)
            }
        }
    }

    fun startSecondActivity() {
        val userInput = etUserInput.text.toString()
        //explicit Intent
        val intent = Intent(MainActivity@this, SecondActivity::class.java)
        intent.putExtra("input", userInput)
        startActivity(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val passedCar = data?.getParcelableExtra<KotlinCar>("car")
        tvCarInfo.text = "${passedCar?.make?: "NO MAKE"} ${passedCar?.model}"
        //In JAVA  passedCar== null ? "NO MODEL" : passedCar.getModel()
    }
}
