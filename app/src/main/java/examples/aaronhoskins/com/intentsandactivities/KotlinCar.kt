package examples.aaronhoskins.com.intentsandactivities

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
 data class KotlinCar(
    var make: String? ,
    var model: String?,
    var year: String? ,
    var transmissionType: String?,
    var numOfCyc: Int) : Parcelable





