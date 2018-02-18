package com.farhanrizkyf.farhan_1202152159_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListMenu extends AppCompatActivity {
    private RecyclerView recycle;
    private Adapter adaptermenu;

    public static ArrayList<Model>menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        menuList = menuisi();
        recycle = (RecyclerView)findViewById(R.id.recyclerView);
        adaptermenu = new Adapter(menuList);
        recycle.setAdapter(adaptermenu);
        recycle.setLayoutManager(new LinearLayoutManager(this));

    }

    private ArrayList<Model> menuisi() {
        ArrayList<Model> isi = new ArrayList<>();
        isi.add(new Model("Nasi Goreng",18000,R.drawable.warkop_nasgor,"Nasi Dengan Suir Ayam, Telur Goreng, Irisin Bakso, Sayur, Irisan Cabai, Kecap Manis, dan Kerupuk"));
        isi.add(new Model("Mie Goreng",15000,R.drawable.warkop_miegor,"Mie Dengan Suir Ayam, Telur Goreng, Irisin Bakso, Sayur, Irisan Cabai, Kecap Manis, dan Kerupuk"));
        isi.add(new Model("Mie Rebus",17000,R.drawable.warkop_miebus,"Mie Dengan Suir Ayam, Telur Rebus, Irisin Bakso, Sayur, Irisan Cabai, dan Kuah Kaldu Ayam"));
        isi.add(new Model("Roti Bakar",14000,R.drawable.warkop_rotbak,"Roti Yang Dibakar Diisi Dengan Macam - Macam Selai, Meses, Keju Parut, Bubuk Oreo, dan Susu"));
        isi.add(new Model("Pisang Bakar",13000,R.drawable.warkop_piskar,"Pisang Yang Dibakar Diisi Dengan Meses, Keju Parut, Bubuk Oreo, dan Susu"));
        isi.add(new Model("Kopi",20000,R.drawable.warkop_kopi,"Kopi Dengan Jenis Kopi Robusta"));
        isi.add(new Model("Cappucino",25000,R.drawable.warkop_cappucino,"Kopi Dengan Campura Susu"));
        isi.add(new Model("Milkshake",23000,R.drawable.warkop_milkshake,"Susu Yang Diblender Dengan Es dan Tambahan Topping"));
        return  isi;
    }
}
