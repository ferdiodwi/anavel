package com.kelompok2.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.kelompok2.anavel.R;

public class ListMHSActivity extends AppCompatActivity implements AdapterView.OnClickListener, AdapterView.OnItemClickListener{
    ListView listView;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mhsactivity);


        listView = (ListView) findViewById(R.id.listView);
        adapter = ArrayAdapter.createFromResource(this, R.array.nama_mhs, android.R.layout.simple_list_item_1);
//      adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }


    public boolean onCreateOptionsMenu (Menu menu) {
    getMenuInflater().inflate(R. menu.list, menu);
        return true;
    }



    @Override
    public void onClick(View view) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, adapter.getItem(position), Toast.LENGTH_SHORT).show();
    }
}