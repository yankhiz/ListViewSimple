package com.example.o.listviewsimple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.widget.Toast.makeText;
import static com.example.o.listviewsimple.R.id.edit;

/**
 * Created by o on 12/02/2015.
 */
public class ListViewActivity extends Activity {
    private ArrayList<String> midwifeArr = new ArrayList<>();
    private TextView textView;
    private Midwife mw1,mw2;
    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);



       // textView = (TextView) findViewById(edit);
        listView=(ListView)findViewById(R.id.list);


        mw1 = new Midwife("mary","black",55);
        mw2 = new Midwife("ann","white",44);


        midwifeArr.add(mw1.toString());
        midwifeArr.add(mw2.toString());




        /* instantiate ArrayAdapter */

        arrayAdapter = new ArrayAdapter<>(this,
                R.layout.list_layout, R.id.edit,midwifeArr);
    /* set Adapter of ListView to ArrayAdapter Instance */
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new ItemListener());

    }
    private class ItemListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            System.out.println("Position " + position + " was pressed!");

            Toast.makeText(getApplicationContext(), midwifeArr.get(position), Toast.LENGTH_SHORT).show();
            Intent n = new Intent(ListViewActivity.this, Second.class);
            startActivity(n);
        }
    }
 }


