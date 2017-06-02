
package android.rahardyan.pengingatsolat.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DailyPrayingTimePojo {

    @SerializedName("address")
    private String mAddress;
    @SerializedName("city")
    private String mCity;
    @SerializedName("country")
    private String mCountry;
    @SerializedName("country_code")
    private String mCountryCode;
    @SerializedName("daylight")
    private String mDaylight;
    @SerializedName("for")
    private String mFor;
    @SerializedName("items")
    private List<Item> mItems;
    @SerializedName("latitude")
    private String mLatitude;
    @SerializedName("link")
    private String mLink;
    @SerializedName("longitude")
    private String mLongitude;
    @SerializedName("map_image")
    private String mMapImage;
    @SerializedName("method")
    private Long mMethod;
    @SerializedName("postal_code")
    private String mPostalCode;
    @SerializedName("prayer_method_name")
    private String mPrayerMethodName;
    @SerializedName("qibla_direction")
    private String mQiblaDirection;
    @SerializedName("query")
    private String mQuery;
    @SerializedName("sealevel")
    private String mSealevel;
    @SerializedName("state")
    private String mState;
    @SerializedName("status_code")
    private Long mStatusCode;
    @SerializedName("status_description")
    private String mStatusDescription;
    @SerializedName("status_valid")
    private Long mStatusValid;
    @SerializedName("timezone")
    private String mTimezone;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("today_weather")
    private TodayWeather mTodayWeather;

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public String getCountryCode() {
        return mCountryCode;
    }

    public void setCountryCode(String countryCode) {
        mCountryCode = countryCode;
    }

    public String getDaylight() {
        return mDaylight;
    }

    public void setDaylight(String daylight) {
        mDaylight = daylight;
    }

    public String getFor() {
        return mFor;
    }

    public void setFor(String mfor) {
        this.mFor = mfor;
    }

    public List<Item> getItems() {
        return mItems;
    }

    public void setItems(List<Item> items) {
        mItems = items;
    }

    public String getLatitude() {
        return mLatitude;
    }

    public void setLatitude(String latitude) {
        mLatitude = latitude;
    }

    public String getLink() {
        return mLink;
    }

    public void setLink(String link) {
        mLink = link;
    }

    public String getLongitude() {
        return mLongitude;
    }

    public void setLongitude(String longitude) {
        mLongitude = longitude;
    }

    public String getMapImage() {
        return mMapImage;
    }

    public void setMapImage(String mapImage) {
        mMapImage = mapImage;
    }

    public Long getMethod() {
        return mMethod;
    }

    public void setMethod(Long method) {
        mMethod = method;
    }

    public String getPostalCode() {
        return mPostalCode;
    }

    public void setPostalCode(String postalCode) {
        mPostalCode = postalCode;
    }

    public String getPrayerMethodName() {
        return mPrayerMethodName;
    }

    public void setPrayerMethodName(String prayerMethodName) {
        mPrayerMethodName = prayerMethodName;
    }

    public String getQiblaDirection() {
        return mQiblaDirection;
    }

    public void setQiblaDirection(String qiblaDirection) {
        mQiblaDirection = qiblaDirection;
    }

    public String getQuery() {
        return mQuery;
    }

    public void setQuery(String query) {
        mQuery = query;
    }

    public String getSealevel() {
        return mSealevel;
    }

    public void setSealevel(String sealevel) {
        mSealevel = sealevel;
    }

    public String getState() {
        return mState;
    }

    public void setState(String state) {
        mState = state;
    }

    public Long getStatusCode() {
        return mStatusCode;
    }

    public void setStatusCode(Long statusCode) {
        mStatusCode = statusCode;
    }

    public String getStatusDescription() {
        return mStatusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        mStatusDescription = statusDescription;
    }

    public Long getStatusValid() {
        return mStatusValid;
    }

    public void setStatusValid(Long statusValid) {
        mStatusValid = statusValid;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public TodayWeather getTodayWeather() {
        return mTodayWeather;
    }

    public void setTodayWeather(TodayWeather todayWeather) {
        mTodayWeather = todayWeather;
    }

}
