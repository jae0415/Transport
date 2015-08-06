package com.example.edwards2james.transportationanalysis_app;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.GroupCommand;
import com.mongodb.Cursor;
import com.mongodb.AggregationOptions;

import java.net.UnknownHostException;

import static java.lang.String.valueOf;


public class data extends Activity {

    protected TextView querycost;
    protected TextView querymiles;
    protected TextView querypermile;

    public String passcost;
    public String passmiles;
    public String passpermile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_data);

        querycost = (TextView) findViewById(R.id.cost_query);
        querymiles = (TextView) findViewById(R.id.mile_query);
        querypermile = (TextView) findViewById(R.id.permile_query);

    }

    public void onBackClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_data, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onAirDataClick (View view){
        QueryAirData queryairdata = new QueryAirData();
        queryairdata.execute();
        Toast.makeText(getApplicationContext(),"Here is your data" , Toast.LENGTH_SHORT).show();
    }

    private class QueryAirData extends AsyncTask <Void, Void, String> {
        protected String doInBackground (Void... voids){
            try {
                MongoClientURI uri = new MongoClientURI("mongodb://jae0415:trista511@ds033429.mongolab.com:33429/location");
                MongoClient client = new MongoClient(uri);
                DB db = client.getDB(uri.getDatabase());

                DBCollection Air = db.getCollection("air");
                DBObject cursor = Air.findOne();


                passcost = valueOf(cursor.get("Cost"));
                passmiles = valueOf(cursor.get("Mile"));

                client.close();

                return "Here is your data";
            } catch (UnknownHostException e) {
                return "Unknown Host Exception";
            }
        }

        @Override
        protected  void onPostExecute (String status) {

            querycost.setText(passcost);
            querymiles.setText(passmiles);
            Double cost = Double.parseDouble(querycost.getText().toString());
            Double mile = Double.parseDouble(querymiles.getText().toString());
            Double per = (cost/mile);
            querypermile.setText(per.toString());
        }
    }

    public void onBikeDataClick (View view){
        QueryBikeData querybikedata = new QueryBikeData();
        querybikedata.execute();
        Toast.makeText(getApplicationContext(),"Here is your data" , Toast.LENGTH_SHORT).show();
    }

    private class QueryBikeData extends AsyncTask <Void, Void, String> {
        protected String doInBackground (Void... voids){
            try {
                MongoClientURI uri = new MongoClientURI("mongodb://jae0415:trista511@ds033429.mongolab.com:33429/location");
                MongoClient client = new MongoClient(uri);
                DB db = client.getDB(uri.getDatabase());

                DBCollection Bike = db.getCollection("bike");
                DBObject cursor = Bike.findOne();


                passcost = valueOf(cursor.get("Cost"));
                passmiles = valueOf(cursor.get("Mile"));

                client.close();

                return "Here is your data";
            } catch (UnknownHostException e) {
                return "Unknown Host Exception";
            }
        }

        @Override
        protected  void onPostExecute (String status) {

            querycost.setText(passcost);
            querymiles.setText(passmiles);

            Double cost = Double.parseDouble(querycost.getText().toString());
            Double mile = Double.parseDouble(querymiles.getText().toString());
            Double per = (cost/mile);
            querypermile.setText(per.toString());
        }
    }

    public void onBoatDataClick (View view){
        QueryBoatData queryboatdata = new QueryBoatData();
        queryboatdata.execute();
        Toast.makeText(getApplicationContext(),"Here is your data" , Toast.LENGTH_SHORT).show();
    }

    private class QueryBoatData extends AsyncTask <Void, Void, String> {
        protected String doInBackground (Void... voids){
            try {
                MongoClientURI uri = new MongoClientURI("mongodb://jae0415:trista511@ds033429.mongolab.com:33429/location");
                MongoClient client = new MongoClient(uri);
                DB db = client.getDB(uri.getDatabase());

                DBCollection Boat = db.getCollection("boat");
                DBObject cursor = Boat.findOne();


                passcost = valueOf(cursor.get("Cost"));
                passmiles = valueOf(cursor.get("Mile"));

                client.close();

                return "Here is your data";
            } catch (UnknownHostException e) {
                return "Unknown Host Exception";
            }
        }

        @Override
        protected  void onPostExecute (String status) {

            querycost.setText(passcost);;
            querymiles.setText(passmiles);
            Double cost = Double.parseDouble(querycost.getText().toString());
            Double mile = Double.parseDouble(querymiles.getText().toString());
            Double per = (cost/mile);
            querypermile.setText(per.toString());
        }
    }

    public void onBusDataClick (View view){
        QueryBusData querybusdata = new QueryBusData();
        querybusdata.execute();
        Toast.makeText(getApplicationContext(),"Here is your data" , Toast.LENGTH_SHORT).show();
    }

    private class QueryBusData extends AsyncTask <Void, Void, String> {
        protected String doInBackground (Void... voids){
            try {
                MongoClientURI uri = new MongoClientURI("mongodb://jae0415:trista511@ds033429.mongolab.com:33429/location");
                MongoClient client = new MongoClient(uri);
                DB db = client.getDB(uri.getDatabase());

                DBCollection Bus = db.getCollection("bus");
                DBObject cursor = Bus.findOne();


                passcost = valueOf(cursor.get("Cost"));
                passmiles = valueOf(cursor.get("Mile"));

                client.close();

                return "Here is your data";
            } catch (UnknownHostException e) {
                return "Unknown Host Exception";
            }
        }

        @Override
        protected  void onPostExecute (String status) {

            querycost.setText(passcost);;
            querymiles.setText(passmiles);
            Double cost = Double.parseDouble(querycost.getText().toString());
            Double mile = Double.parseDouble(querymiles.getText().toString());
            Double per = (cost/mile);
            querypermile.setText(per.toString());
        }
    }

    public void onCarDataClick (View view){
        QueryCarData querycardata = new QueryCarData();
        querycardata.execute();
        Toast.makeText(getApplicationContext(),"Here is your data" , Toast.LENGTH_SHORT).show();
    }

    private class QueryCarData extends AsyncTask <Void, Void, String> {
        protected String doInBackground (Void... voids){
            try {
                MongoClientURI uri = new MongoClientURI("mongodb://jae0415:trista511@ds033429.mongolab.com:33429/location");
                MongoClient client = new MongoClient(uri);
                DB db = client.getDB(uri.getDatabase());

                DBCollection Car = db.getCollection("car");
                DBObject cursor = Car.findOne();


                passcost = valueOf(cursor.get("Cost"));
                passmiles = valueOf(cursor.get("Mile"));

                client.close();

                return "Here is your data";
            } catch (UnknownHostException e) {
                return "Unknown Host Exception";
            }
        }

        @Override
        protected  void onPostExecute (String status) {

            querycost.setText(passcost);;
            querymiles.setText(passmiles);
            Double cost = Double.parseDouble(querycost.getText().toString());
            Double mile = Double.parseDouble(querymiles.getText().toString());
            Double per = (cost/mile);
            querypermile.setText(per.toString());
        }
    }

    public void onMotoDataClick (View view){
        QueryMotoData querymotodata = new QueryMotoData();
        querymotodata.execute();
        Toast.makeText(getApplicationContext(),"Here is your data" , Toast.LENGTH_SHORT).show();
    }

    private class QueryMotoData extends AsyncTask <Void, Void, String> {
        protected String doInBackground (Void... voids){
            try {
                MongoClientURI uri = new MongoClientURI("mongodb://jae0415:trista511@ds033429.mongolab.com:33429/location");
                MongoClient client = new MongoClient(uri);
                DB db = client.getDB(uri.getDatabase());

                DBCollection Moto = db.getCollection("moto");
                DBObject cursor = Moto.findOne();


                passcost = valueOf(cursor.get("Cost"));
                passmiles = valueOf(cursor.get("Mile"));

                client.close();

                return "Here is your data";
            } catch (UnknownHostException e) {
                return "Unknown Host Exception";
            }
        }

        @Override
        protected  void onPostExecute (String status) {

            querycost.setText(passcost);;
            querymiles.setText(passmiles);
            Double cost = Double.parseDouble(querycost.getText().toString());
            Double mile = Double.parseDouble(querymiles.getText().toString());
            Double per = (cost/mile);
            querypermile.setText(per.toString());
        }
    }

    public void onTrainDataClick (View view){
        QueryTrainData querytraindata = new QueryTrainData();
        querytraindata.execute();
        Toast.makeText(getApplicationContext(),"Here is your data" , Toast.LENGTH_SHORT).show();
    }

    private class QueryTrainData extends AsyncTask <Void, Void, String> {
        protected String doInBackground (Void... voids){
            try {
                MongoClientURI uri = new MongoClientURI("mongodb://jae0415:trista511@ds033429.mongolab.com:33429/location");
                MongoClient client = new MongoClient(uri);
                DB db = client.getDB(uri.getDatabase());

                DBCollection Train = db.getCollection("train");
                DBObject cursor = Train.findOne();


                passcost = valueOf(cursor.get("Cost"));
                passmiles = valueOf(cursor.get("Mile"));

                client.close();

                return "Here is your data";
            } catch (UnknownHostException e) {
                return "Unknown Host Exception";
            }
        }

        @Override
        protected  void onPostExecute (String status) {

            querycost.setText(passcost);;
            querymiles.setText(passmiles);
            Double cost = Double.parseDouble(querycost.getText().toString());
            Double mile = Double.parseDouble(querymiles.getText().toString());
            Double per = (cost/mile);
            querypermile.setText(per.toString());
        }
    }

    public void onWalkDataClick (View view){
        QueryWalkData querywalkdata = new QueryWalkData();
        querywalkdata.execute();
        Toast.makeText(getApplicationContext(),"Here is your data" , Toast.LENGTH_SHORT).show();
    }

    private class QueryWalkData extends AsyncTask <Void, Void, String> {
        protected String doInBackground (Void... voids){
            try {
                MongoClientURI uri = new MongoClientURI("mongodb://jae0415:trista511@ds033429.mongolab.com:33429/location");
                MongoClient client = new MongoClient(uri);
                DB db = client.getDB(uri.getDatabase());

                DBCollection Walk = db.getCollection("walk");
                DBObject cursor = Walk.findOne();


                passcost = valueOf(cursor.get("Cost"));
                passmiles = valueOf(cursor.get("Mile"));

                client.close();

                return "Here is your data";
            } catch (UnknownHostException e) {
                return "Unknown Host Exception";
            }
        }

        @Override
        protected  void onPostExecute (String status) {

            querycost.setText(passcost);;
            querymiles.setText(passmiles);
            Double cost = Double.parseDouble(querycost.getText().toString());
            Double mile = Double.parseDouble(querymiles.getText().toString());
            Double per = (cost/mile);
            querypermile.setText(per.toString());
        }
    }
}
