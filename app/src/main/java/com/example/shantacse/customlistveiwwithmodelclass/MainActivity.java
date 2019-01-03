package com.example.shantacse.customlistveiwwithmodelclass;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    private ListView listView;
    private ArrayList<AndroidPOJO> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView =findViewById(R.id.customListView);
        list = new ArrayList<>();

        adddata();

         final CustomAdapter adapter =new CustomAdapter(getApplicationContext(),list);
         listView.setAdapter(adapter);


         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // AndroidPOJO pojo1 =(AndroidPOJO)adapter.getItem(position);
               //  Snackbar.make(view,pojo1.getName().toString()+"you clicked on",Snackbar.LENGTH_INDEFINITE).show();




                 Toast.makeText(getApplicationContext(),"you click on "+parent.getItemAtPosition(position),Toast.LENGTH_LONG ).show();

             }
         });

    }

    private void adddata()
    {

        list.add(new AndroidPOJO("1.0","Alpha","2008"));
        list.add(new AndroidPOJO("1.1","Beta","2009"));
        list.add(new AndroidPOJO("1.5","cupCake","2009"));
        list.add(new AndroidPOJO("1.6","Donut","2009"));
        list.add(new AndroidPOJO("2.0 -2.1","Eclair","2009"));
        list.add(new AndroidPOJO("2.2 -2.2.3","Froyo","2010"));
        list.add(new AndroidPOJO("2.3-2.3.7","GinerBread","2010"));
        list.add(new AndroidPOJO("3.0-3.2.6","HoneyComb","2011"));
        list.add(new AndroidPOJO("4.0-4.0.4","Ice Cream","2011"));
        list.add(new AndroidPOJO("4.1-4.3.1","Jelly Bean","2012"));
        list.add(new AndroidPOJO("4.4-4.4.4","KitKat","2013"));
        list.add(new AndroidPOJO("5.0-5.1.1","Lollipop","2014"));
    }
}
