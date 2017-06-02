
package android.rahardyan.pengingatsolat.model;

import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("asr")
    private String mAsr;
    @SerializedName("date_for")
    private String mDateFor;
    @SerializedName("dhuhr")
    private String mDhuhr;
    @SerializedName("fajr")
    private String mFajr;
    @SerializedName("isha")
    private String mIsha;
    @SerializedName("maghrib")
    private String mMaghrib;
    @SerializedName("shurooq")
    private String mShurooq;

    public String getAsr() {
        return mAsr;
    }

    public void setAsr(String asr) {
        mAsr = asr;
    }

    public String getDateFor() {
        return mDateFor;
    }

    public void setDateFor(String dateFor) {
        mDateFor = dateFor;
    }

    public String getDhuhr() {
        return mDhuhr;
    }

    public void setDhuhr(String dhuhr) {
        mDhuhr = dhuhr;
    }

    public String getFajr() {
        return mFajr;
    }

    public void setFajr(String fajr) {
        mFajr = fajr;
    }

    public String getIsha() {
        return mIsha;
    }

    public void setIsha(String isha) {
        mIsha = isha;
    }

    public String getMaghrib() {
        return mMaghrib;
    }

    public void setMaghrib(String maghrib) {
        mMaghrib = maghrib;
    }

    public String getShurooq() {
        return mShurooq;
    }

    public void setShurooq(String shurooq) {
        mShurooq = shurooq;
    }

}
