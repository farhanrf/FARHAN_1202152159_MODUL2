package com.farhanrizkyf.farhan_1202152159_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DineIn extends AppCompatActivity {
    private Spinner meja;
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
       meja = (Spinner)findViewById(R.id.spiner);
       ArrayList<String> list = datameja();
       ArrayAdapter<String> adapter = new ArrayAdapter<String>
               (this,android.R.layout.simple_spinner_item,list);
       adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       meja.setAdapter(adapter);
       Button submit = (Button)findViewById(R.id.button2);
       submit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String mejaa=String.valueOf(meja.getSelectedItem());
               TextView name = (TextView)findViewById(R.id.editText);
               Toast.makeText(getApplicationContext(),mejaa+" "+"Dengan Nama"
                       +name.getText().toString(), Toast.LENGTH_LONG).show();
               startActivity(new Intent(DineIn.this,ListMenu.class));
           }
       });
    }
    public ArrayList<String> datameja(){
        ArrayList<String>isi=new ArrayList<>();
        for(int i=1;i<=10;i++){
            isi.add("Table"+i);}
        return isi;
    }
}
