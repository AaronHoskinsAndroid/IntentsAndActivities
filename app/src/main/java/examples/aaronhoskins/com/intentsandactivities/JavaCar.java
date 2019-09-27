package examples.aaronhoskins.com.intentsandactivities;

import android.os.Parcel;
import android.os.Parcelable;


public class JavaCar implements Parcelable {
    private String make;
    private String model;
    private String year;
    private String transmissionType;
    private int numOfCyc;

    public JavaCar() {
    }

    public JavaCar(String make, String model, String year, String transmissionType, int numOfCyc) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.transmissionType = transmissionType;
        this.numOfCyc = numOfCyc;
    }

    protected JavaCar(Parcel in) {
        make = in.readString();
        model = in.readString();
        year = in.readString();
        transmissionType = in.readString();
        numOfCyc = in.readInt();
    }

    public static final Creator<JavaCar> CREATOR = new Creator<JavaCar>() {
        @Override
        public JavaCar createFromParcel(Parcel in) {
            return new JavaCar(in);
        }

        @Override
        public JavaCar[] newArray(int size) {
            return new JavaCar[size];
        }
    };

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getNumOfCyc() {
        return numOfCyc;
    }

    public void setNumOfCyc(int numOfCyc) {
        this.numOfCyc = numOfCyc;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(make);
        parcel.writeString(model);
        parcel.writeString(year);
        parcel.writeString(transmissionType);
        parcel.writeInt(numOfCyc);
    }
}
