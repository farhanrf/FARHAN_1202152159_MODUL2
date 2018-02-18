package com.farhanrizkyf.farhan_1202152159_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class MenuDetail extends AppCompatActivity {
    private ArrayList<Model>Menu;
    private String idMenu;
    private TextView Name,Cost,Description;
    private ImageView Pict;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_detail);

        Name =(TextView)findViewById(R.id.lblDetailName);
        Cost = (TextView)findViewById(R.id.lblDetailCost);
        Description = (TextView)findViewById(R.id.lblDetailDescription);
        Pict = (ImageView)findViewById(R.id.lblDetailPict);

        Menu = ListMenu.menuList;
        Intent intent = getIntent();
        idMenu = intent.getStringExtra("MenuId");
        Model makanan = Menu.get(Integer.parseInt(idMenu));
        Name.setText(makanan.getName());
        setTitle(makanan.getName());
        Cost.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in","ID")).format(makanan.getCost()));
        Description.setText(makanan.getDescription());
        Pict.setImageResource(makanan.getPict());

    }
}
