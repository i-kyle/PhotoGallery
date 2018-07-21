package com.example.kylecristin.photogallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class TravelPhotoActivity extends AppCompatActivity {

    public static final  String EXTRA_TRAVEL_PHOTO = "TravelPhotoActivity.TRAVEL_PHOTO";
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);

        mImageView = (ImageView) findViewById(R.id.image);
        TravelPhoto travelPhoto = getIntent().getParcelableExtra(EXTRA_TRAVEL_PHOTO);

        Glide.with(this)
                .asBitmap()
                .load(travelPhoto.getUrl())
                .into(mImageView);
    }
}
