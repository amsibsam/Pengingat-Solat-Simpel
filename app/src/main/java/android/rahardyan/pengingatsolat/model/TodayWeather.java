
package android.rahardyan.pengingatsolat.model;

import com.google.gson.annotations.SerializedName;

public class TodayWeather {

    @SerializedName("pressure")
    private String mPressure;
    @SerializedName("temperature")
    private String mTemperature;

    public String getPressure() {
        return mPressure;
    }

    public void setPressure(String pressure) {
        mPressure = pressure;
    }

    public String getTemperature() {
        return mTemperature;
    }

    public void setTemperature(String temperature) {
        mTemperature = temperature;
    }

}
