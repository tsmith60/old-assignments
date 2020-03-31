package com.teddyscreations.niceapp;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * Created by tedsmithiii on 10/29/16.
 */


public class SendInfo extends AsyncTask<String,Void,String> {
    private Context context;
    private  String brand ;
    private  String manu ;
    private  String sdk ;
    private  String enc ;
    private  String serial ;


    public SendInfo(Context context,String b, String m,String s, String seria, String encodes) {
        this.context = context;
        // this.statusField = statusField;
        // this.roleField = roleField;

        brand = b;
        manu = m;
        sdk = s;
        serial = seria;
        enc = encodes;

    }

    protected void onPreExecute(){

    }

    @Override
    protected String doInBackground(String... arg0) {//Send the information to the server


        try{//Start creating the link to server with post parameters

            String link = "http://triton.towson.edu/~bsmels1/android/upload.php";
            //String link = "http://www.teddytestit.com/TestEncode/writer.php";
            System.out.println(" Before in connect task ");
            StringBuilder sb=new StringBuilder();

            String data = "";
            data = URLEncoder.encode("brand", "UTF-8") + "=" + URLEncoder.encode(brand, "UTF-8");
            data += "&" + URLEncoder.encode("manu", "UTF-8") + "=" + URLEncoder.encode(manu, "UTF-8");
            data += "&" + URLEncoder.encode("sdk", "UTF-8") + "=" + URLEncoder.encode(sdk, "UTF-8");
            data += "&" + URLEncoder.encode("serial", "UTF-8") + "=" + URLEncoder.encode(serial, "UTF-8");
            data += "&" + URLEncoder.encode("encode", "UTF-8") + "=" + URLEncoder.encode(enc, "UTF-8");


            URL url = new URL(link);
            URLConnection conn = url.openConnection();


            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());

            wr.write(data);
            wr.flush();

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));


            String line = null;


            // Read Server Response
            while ((line = reader.readLine()) != null) {
                sb.append(line);

                break;
            }



            return sb.toString();
        }
        catch(Exception e){
            System.out.println("Exception "+e.getMessage());
            return new String("Exception: " + e.getMessage());
        }

    }



    @Override
    protected void onPostExecute(String result){

    }
}

