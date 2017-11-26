package com.example.tylones.caravan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnWC;
    private Button bouton;
    private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        web = (WebView)findViewById(R.id.web);
        btnWC = (ImageButton)findViewById(R.id.btnWC);

        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) throws IOException {

        final String requete = "http://172.20.10.3/WC";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(requete));
        startActivity(intent);
            /*Log.d("OKOK", "OKOKOK");

            URL url;
            try {
                url = new URL("http://172.20.10.3/WC");
                URLConnection urlConnection = (URLConnection) url.openConnection();
                InputStream in = urlConnection.getInputStream();


            }catch (Exception e){
                e.printStackTrace();
            } finally {

            }*/



    }

    public void onClick1(View v) throws IOException {
        final String requete = "http://172.20.10.3/NOURRITURE";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(requete));
        startActivity(intent);
    }

    public void onClick2(View v) throws IOException {
        final String requete = "http://172.20.10.3/URGENCE";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(requete));
        startActivity(intent);
    }
    }
