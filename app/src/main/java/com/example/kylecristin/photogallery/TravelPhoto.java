package com.example.kylecristin.photogallery;

import android.os.Parcel;
import android.os.Parcelable;

public class TravelPhoto implements Parcelable {

    private String mUrl;
    private String mTitle;

    public TravelPhoto(String url, String title) {
        mUrl = url;
        mTitle = title;
    }

    protected TravelPhoto(Parcel in) {
        mUrl = in.readString();
        mTitle = in.readString();
    }

    public static final  Creator<TravelPhoto> CREATOR = new Creator<TravelPhoto>() {
        @Override
        public TravelPhoto createFromParcel(Parcel in) {
            return new TravelPhoto(in);
        }

        @Override
        public TravelPhoto[] newArray(int size) {
            return new TravelPhoto[size];
        }
    };

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public static TravelPhoto[] getTravelPhotos() {

        return new TravelPhoto[] {
                new TravelPhoto("https://i.imgur.com/sduLRvf.jpg", "Glow"),
                new TravelPhoto("https://i.imgur.com/tXtwrPd.jpg", "River"),
                new TravelPhoto("https://i.imgur.com/IVyU5Im.jpg", "Dew"),
                new TravelPhoto("https://i.imgur.com/QguApMA.jpg", "Wonder"),
                new TravelPhoto("https://i.imgur.com/Xulubox.jpg", "Chills"),
                new TravelPhoto("https://i.imgur.com/yxovJ4S.jpg", "Half"),
                new TravelPhoto("https://i.imgur.com/sduLRvf.jpg", "Lake"),
                new TravelPhoto("https://i.imgur.com/gjEZAJ7.jpg", "Fog Roll"),
                new TravelPhoto("https://i.imgur.com/JHHx0AD.jpg", "Desert"),
                new TravelPhoto("https://i.imgur.com/PnSeZX3.jpg", "Beach"),
                new TravelPhoto("https://i.imgur.com/IVefonq.jpg", "Still"),
                new TravelPhoto("https://i.imgur.com/X92aA5Y.jpg", "Lonely"),
                new TravelPhoto("https://i.imgur.com/Gb6xVGP.jpg", "Star"),
                new TravelPhoto("https://i.imgur.com/I3KJdGy.jpg", "Cast"),
                new TravelPhoto("https://i.imgur.com/fgfG6Hl.jpg", "Beach Town"),
                new TravelPhoto("https://i.imgur.com/zlc7uSR.jpg", "Open Land"),
                new TravelPhoto("https://i.imgur.com/p53E302.jpg", "Oblivion"),
                new TravelPhoto("https://i.imgur.com/OdjFda3.jpg", "Lake Face"),
                new TravelPhoto("https://i.imgur.com/Pboz5mG.jpg", "Dawn"),
                new TravelPhoto("https://i.imgur.com/c3hJOBE.jpg", "Alexis"),
                new TravelPhoto("https://i.imgur.com/QO2wXxa.jpg", "Sound"),
                new TravelPhoto("https://i.imgur.com/QLJfdkH.jpg", "Early"),
                new TravelPhoto("https://i.imgur.com/ivxdtnO.jpg", "Rail"),
                new TravelPhoto("https://i.imgur.com/0ic5msX.jpg", "Lights"),
                new TravelPhoto("https://i.imgur.com/g2lgz0n.jpg", "Herd"),
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mUrl);
        parcel.writeString(mTitle);
    }
}
