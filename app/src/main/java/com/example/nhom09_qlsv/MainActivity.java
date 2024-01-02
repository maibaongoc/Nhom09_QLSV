package com.example.nhom09_qlsv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView_home, imageView_khoa, imageView_notification;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        imageView_home =(ImageView) findViewById(R.id.widget_home);
        imageView_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init();
            }
        });

        imageView_khoa = (ImageView) findViewById(R.id.widget_khoa);
        imageView_khoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr_add = fragmentManager.beginTransaction();
                fr_add.add(R.id.frame_layout,new Khoa_Fragment());
                fr_add.commit();
            }
        });

        imageView_notification = (ImageView) findViewById(R.id.widget_notification);
        imageView_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr_add = fragmentManager.beginTransaction();
                fr_add.add(R.id.frame_layout, new Notification_Fragment());
                fr_add.commit();
            }
        });

        init();

    }

    void init()
    {
        FragmentTransaction fr_add1= fragmentManager.beginTransaction();
        fr_add1.add(R.id.frame_layout,new Home_Fragment());
        fr_add1.commit();
    }
}