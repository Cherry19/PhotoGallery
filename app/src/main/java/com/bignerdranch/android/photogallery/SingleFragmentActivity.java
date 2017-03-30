package com.bignerdranch.android.photogallery;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.bignerdranch.android.photogallery.R;
import com.bignerdranch.android.photogallery.R;

/**
 * Created by Administrator on 2016/11/15.
 */
public abstract class SingleFragmentActivity extends FragmentActivity {
    protected abstract Fragment createFragment();

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState );
        setContentView(R.layout.activity_fragment );

        FragmentManager fm=getSupportFragmentManager() ;
        Fragment fragment =fm.findFragmentById(R.id.fragment_container );

        if(fragment==null){
            fragment=createFragment() ;
            fm.beginTransaction() .add(R.id.fragment_container ,fragment ).commit() ;
        }
    }
}
