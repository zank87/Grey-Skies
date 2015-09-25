package com.johnzank.greyskies.weather;

import com.johnzank.greyskies.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by johnzank on 8/29/15.
 */
public class Current {
    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;
    private String mSummary;
    private String mTimezone;

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public int getPrecipChance() {
        double precipPercentage = mPrecipChance * 100;
        return (int)Math.round(precipPercentage);
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public int getTemperature() {
        return (int)Math.round(mTemperature);
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimezone()));
        Date dateTime = new Date(getTime() * 1000);
        String timeString = formatter.format(dateTime);
        return timeString;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public int getIconId() {
        return Forecast.getIconId(mIcon);
    }

}
