package com.example.o.listviewsimple;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by o on 14/02/2015.
 */
public class Second extends Activity{

    private ArrayList<String> arrayList;
    private ListView listView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_second);

        listView2=(ListView)findViewById(R.id.list2);

        arrayList=new ArrayList<>();

        Midwife mw3=new Midwife("a","b",26);
        Midwife mw4=new Midwife("c","d",25);

        arrayList.add(mw3.toString());
        arrayList.add(mw4.toString());

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.layout_second, R.id.editText, arrayList);

        listView2.setAdapter(adapter);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            //override onClick

        public void onItemClick(
                    AdapterView<?> arg0,View arg1,int arg2,long arg3){
                Toast.makeText(getApplicationContext(),arrayList.get(arg2),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
