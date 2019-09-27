package examples.aaronhoskins.com.intentsandactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_car_data_entry_avtivity.*

class CarDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_data_entry_avtivity)
    }

    fun onClick(view: View) {
        val make = etMake.text.toString()
        val model = etModel.text.toString()
        val year = etYear.text.toString()
        val transmission = etTransmission.text.toString()
        val cylinders = etCylinders.text.toString()
        val car = KotlinCar(make, model, year, transmission, Integer.valueOf(cylinders))

        val intent = Intent()
        intent.putExtra("car", car)
        setResult(456 ,intent)
        finish()
    }
}
