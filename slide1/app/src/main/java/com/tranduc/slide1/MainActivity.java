package com.tranduc.slide1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity implements MainContact{
    private TextView tvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvView = (TextView) findViewById(R.id.tvView);

        MyTask myClass = new MyTask(tvView, this);
        myClass.execute("http://docbao.vn");
    }

    @Override
    public void onCompleted(Object s, Object o) {
        tvView.setText((String) s + o);
    }
}
