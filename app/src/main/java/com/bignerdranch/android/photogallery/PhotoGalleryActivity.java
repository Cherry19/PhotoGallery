package com.bignerdranch.android.photogallery;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PhotoGalleryActivity extends AppCompatActivity {

    @Override
   public Fragment createFragment(){
        return PhotoGalleryActivity.newInstance();
    }
}
