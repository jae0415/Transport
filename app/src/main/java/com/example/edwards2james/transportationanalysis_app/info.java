package com.example.edwards2james.transportationanalysis_app;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.net.UnknownHostException;
import java.lang.Object;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;


public class info extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_info);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_info, menu);
        return true;
    }

    private EditText cost;
    private EditText miles;



    public void onBackClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onAirClick (View view){
        PostAir postmile = new PostAir();
        postmile.execute();
        cost = (EditText) findViewById(R.id.editText);
        miles = (EditText) findViewById(R.id.editText2);
        Toast.makeText(getApplicationContext(),"Data Submitted" , Toast.LENGTH_SHORT).show();
    }
    private class PostAir extends AsyncTask <Void, Void, String> {
        protected String doInBackground (Void... voids){
            try {
                MongoClientURI uri = new MongoClientURI("mongodb://jae0415:trista511@ds033429.mongolab.com:33429/location");
                MongoClient client = new MongoClient(uri);
                DB db = client.getDB(uri.getDatabase());

                DBCollection Air = db.getCollection("air");

                SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
                String now = time.format (new Date());

                if (miles != null) {
                    BasicDBObject Data = new BasicDBObject();
                    Data.put("Cost", String.valueOf(cost.getText()));
                    Data.put("Mile", String.valueOf(miles.getText()));
                    Data.put("Time", String.valueOf(now));

                    Air.insert(Data);
                    client.close();

                    return "Submitted";
                } else {
                    client.close();
                    return "Not submitted";

                }
            }catch(UnknownHostException e) {
                return "Unknown Host Exception";
            }
        }

    }

    public void onBikeClick (View view){
        PostBike postbike = new PostBike();
        postbike.execute();
        cost = (EditText) findViewById(R.id.editText);
        miles = (EditText) findViewById(R.id.editText2);
        Toast.makeText(getApplicationContext(),"Data Submitted" , Toast.LENGTH_SHORT).show();
    }
    private class PostBike extends AsyncTask <Void, Void, String> {
        protected String doInBackground (Void... voids){
            try {
                MongoClientURI uri = new MongoClientURI("mongodb://jae0415:trista511@ds033429.mongolab.com:33429/location");
                MongoClient client = new MongoClient(uri);
                DB db = client.getDB(uri.getDatabase());

                DBCollection Bike = db.getCollection("bike");

                SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
                String now = time.format (new Date());

                if (miles != null) {
                    BasicDBObject Data = new BasicDBObject();
                    Data.put("Cost", String.valueOf(cost.getText()));
                    Data.put("Mile", String.valueOf(miles.getText()));
                    Data.put("Time", String.valueOf(now));

                    Bike.insert(Data);
                    client.close();

                    return "Submitted";
                } else {
                    client.close();
                    return "Not submitted";

                }
            }catch(UnknownHostException e) {
                return "Unknown Host Exception";
            }
        }

    }

    public void onBoatClick (View view){
        PostBoat postboat = new PostBoat();
        postboat.execute();
        cost = (EditText) findViewById(R.id.editText);
        miles = (EditText) findViewById(R.id.editText2);
        Toast.makeText(getApplicationContext(),"Data Submitted" , Toast.LENGTH_SHORT).show();
    }
    private class PostBoat extends AsyncTask <Void, Void, String> {
        protected String doInBackground (Void... voids){
            try {
                MongoClientURI uri = new MongoClientURI("mongodb://jae0415:trista511@ds033429.mongolab.com:33429/location");
                MongoClient client = new MongoClient(uri);
                DB db = client.getDB(uri.getDatabase());

                DBCollection Boat = db.getCollection("boat");

                SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
                String now = time.format (new Date());

                if (miles != null) {
                    BasicDBObject Data = new BasicDBObject();
                    Data.put("Cost", String.valueOf(cost.getText()));
                    Data.put("Mile", String.valueOf(miles.getText()));
                    Data.put("Time", String.valueOf(now));

                    Boat.insert(Data);
                    client.close();

                    return "Submitted";
                } else {
                    client.close();
                    return "Not submitted";

                }
            }catch(UnknownHostException e) {
                return "Unknown Host Exception";
            }
        }

    }

    public void onBusClick (View view){
        PostBus postbus = new PostBus();
        postbus.execute();
        cost = (EditText) findViewById(R.id.editText);
        miles = (EditText) findViewById(R.id.editText2);
        Toast.makeText(getApplicationContext(),"Data Submitted" , Toast.LENGTH_SHORT).show();
    }
    private class PostBus extends AsyncTask <Void, Void, String> {
        protected String doInBackground (Void... voids){
            try {
                MongoClientURI uri = new MongoClientURI("mongodb://jae0415:trista511@ds033429.mongolab.com:33429/location");
                MongoClient client = new MongoClient(uri);
                DB db = client.getDB(uri.getDatabase());

                DBCollection Bus = db.getCollection("bus");

                SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
                String now = time.format (new Date());

                if (miles != null) {
                    BasicDBObject Data = new BasicDBObject();
                    Data.put("Cost", String.valueOf(cost.getText()));
                    Data.put("Mile", String.valueOf(miles.getText()));
                    Data.put("Time", String.valueOf(now));

                    Bus.insert(Data);
                    client.close();

                    return "Submitted";
                } else {
                    client.close();
                    return "Not submitted";

                }
            }catch(UnknownHostException e) {
                return "Unknown Host Exception";
            }
        }

    }


    public void onCarClick (View view){
        PostCar postcar = new PostCar();
        postcar.execute();
        cost = (EditText) findViewById(R.id.editText);
        miles = (EditText) findViewById(R.id.editText2);
        Toast.makeText(getApplicationContext(),"Data Submitted" , Toast.LENGTH_SHORT).show();
    }
    private class PostCar extends AsyncTask <Void, Void, String> {
        protected String doInBackground (Void... voids){
            try {
                MongoClientURI uri = new MongoClientURI("mongodb://jae0415:trista511@ds033429.mongolab.com:33429/location");
                MongoClient client = new MongoClient(uri);
                DB db = client.getDB(uri.getDatabase());

                DBCollection Car = db.getCollection("car");

                SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
                String now = time.format (new Date());

                if (miles != null) {
                    BasicDBObject Data = new BasicDBObject();
                    Data.put("Cost", String.valueOf(cost.getText()));
                    Data.put("Mile", String.valueOf(miles.getText()));
                    Data.put("Time", String.valueOf(now));

                    Car.insert(Data);
                    client.close();

                    return "Submitted";
                } else {
                    client.close();
                    return "Not submitted";

                }
            }catch(UnknownHostException e) {
                return "Unknown Host Exception";
            }
        }

    }

    public void onMotoClick (View view){
        PostMoto postmoto = new PostMoto();
        postmoto.execute();
        cost = (EditText) findViewById(R.id.editText);
        miles = (EditText) findViewById(R.id.editText2);
        Toast.makeText(getApplicationContext(),"Data Submitted" , Toast.LENGTH_SHORT).show();
    }
    private class PostMoto extends AsyncTask <Void, Void, String> {
        protected String doInBackground (Void... voids){
            try {
                MongoClientURI uri = new MongoClientURI("mongodb://jae0415:trista511@ds033429.mongolab.com:33429/location");
                MongoClient client = new MongoClient(uri);
                DB db = client.getDB(uri.getDatabase());

                DBCollection Moto = db.getCollection("moto");

                SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
                String now = time.format (new Date());

                if (miles != null) {
                    BasicDBObject Data = new BasicDBObject();
                    Data.put("Cost", String.valueOf(cost.getText()));
                    Data.put("Mile", String.valueOf(miles.getText()));
                    Data.put("Time", String.valueOf(now));

                    Moto.insert(Data);
                    client.close();

                    return "Submitted";
                } else {
                    client.close();
                    return "Not submitted";

                }
            }catch(UnknownHostException e) {
                return "Unknown Host Exception";
            }
        }

    }

    public void onTrainClick (View view){
        PostTrain posttrain = new PostTrain();
        posttrain.execute();
        cost = (EditText) findViewById(R.id.editText);
        miles = (EditText) findViewById(R.id.editText2);
        Toast.makeText(getApplicationContext(),"Data Submitted" , Toast.LENGTH_SHORT).show();
    }
    private class PostTrain extends AsyncTask <Void, Void, String> {
        protected String doInBackground (Void... voids){
            try {
                MongoClientURI uri = new MongoClientURI("mongodb://jae0415:trista511@ds033429.mongolab.com:33429/location");
                MongoClient client = new MongoClient(uri);
                DB db = client.getDB(uri.getDatabase());

                DBCollection Train = db.getCollection("train");

                SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
                String now = time.format (new Date());

                if (miles != null) {
                    BasicDBObject Data = new BasicDBObject();
                    Data.put("Cost", String.valueOf(cost.getText()));
                    Data.put("Mile", String.valueOf(miles.getText()));
                    Data.put("Time", String.valueOf(now));

                    Train.insert(Data);
                    client.close();

                    return "Submitted";
                } else {
                    client.close();
                    return "Not submitted";

                }
            }catch(UnknownHostException e) {
                return "Unknown Host Exception";
            }
        }

    }

    public void onWalkClick (View view){
        PostWalk postwalk = new PostWalk();
        postwalk.execute();
        cost = (EditText) findViewById(R.id.editText);
        miles = (EditText) findViewById(R.id.editText2);
        Toast.makeText(getApplicationContext(),"Data Submitted" , Toast.LENGTH_SHORT).show();
    }
    private class PostWalk extends AsyncTask <Void, Void, String> {
        protected String doInBackground (Void... voids){
            try {
                MongoClientURI uri = new MongoClientURI("mongodb://jae0415:trista511@ds033429.mongolab.com:33429/location");
                MongoClient client = new MongoClient(uri);
                DB db = client.getDB(uri.getDatabase());

                DBCollection Walk = db.getCollection("walk");

                SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
                String now = time.format (new Date());

                if (miles != null) {
                    BasicDBObject Data = new BasicDBObject();
                    Data.put("Cost", String.valueOf(cost.getText()));
                    Data.put("Mile", String.valueOf(miles.getText()));
                    Data.put("Time", String.valueOf(now));

                    Walk.insert(Data);
                    client.close();

                    return "Submitted";
                } else {
                    client.close();
                    return "Not submitted";

                }
            }catch(UnknownHostException e) {
                return "Unknown Host Exception";
            }
        }

    }
}