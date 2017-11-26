package com.example.tylones.caravan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //web = (WebView)findViewById(R.id.web);
        //btnWC = (ImageButton)findViewById(R.id.btnWC);

        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) throws IOException {

        /*final String requete = "http://172.20.10.3/WC";
        final String requete2 = "http://./WC";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(requete));
        Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(requete2));
        startActivity(intent);
        startActivity(intent2);*/
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

        v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_click));


        String messageStr="1";
        int server_port = 4210;
        int msg_length=messageStr.length();
        byte[] message = messageStr.getBytes();
        DatagramSocket s1 = new DatagramSocket();
        DatagramSocket s2 = new DatagramSocket();
        InetAddress local1 = InetAddress.getByName("172.20.10.3");
        InetAddress local2 = InetAddress.getByName("172.20.10.5");
        DatagramPacket p1 = new DatagramPacket(message, msg_length,local1,server_port);
        DatagramPacket p2 = new DatagramPacket(message, msg_length,local2,server_port);
        s1.send(p1);
        s2.send(p2);

    }

    public void onClick1(View v) throws IOException {
        /*final String requete = "http://172.20.10.3/NOURRITURE";
        final String requete2 = "http://./NOURRITURE";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(requete));
        Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(requete2));
        startActivity(intent);
        startActivity(intent2);*/

        v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_click));

        String messageStr="2";
        int server_port = 4210;
        int msg_length=messageStr.length();
        byte[] message = messageStr.getBytes();
        DatagramSocket s1 = new DatagramSocket();
        DatagramSocket s2 = new DatagramSocket();
        InetAddress local1 = InetAddress.getByName("172.20.10.3");
        InetAddress local2 = InetAddress.getByName("172.20.10.5");
        DatagramPacket p1 = new DatagramPacket(message, msg_length,local1,server_port);
        DatagramPacket p2 = new DatagramPacket(message, msg_length,local2,server_port);
        s1.send(p1);
        s2.send(p2);
    }

    public void onClick2(View v) throws IOException {
        /*final String requete = "http://172.20.10.3/URGENCE";
        final String requete2 = "http://./URGENCE";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(requete));
        Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(requete2));
        startActivity(intent);
        startActivity(intent2);*/

        v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.image_click));

        String messageStr="5";
        int server_port = 4210;
        int msg_length=messageStr.length();
        byte[] message = messageStr.getBytes();
        DatagramSocket s1 = new DatagramSocket();
        DatagramSocket s2 = new DatagramSocket();
        InetAddress local1 = InetAddress.getByName("172.20.10.3");
        InetAddress local2 = InetAddress.getByName("172.20.10.5");
        DatagramPacket p1 = new DatagramPacket(message, msg_length,local1,server_port);
        DatagramPacket p2 = new DatagramPacket(message, msg_length,local2,server_port);
        s1.send(p1);
        s2.send(p2);
    }
    }
