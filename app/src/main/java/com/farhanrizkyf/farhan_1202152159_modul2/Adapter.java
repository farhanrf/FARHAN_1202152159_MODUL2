package com.farhanrizkyf.farhan_1202152159_modul2;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView Name,Cost,id;
        private ImageView Pict;
        public ViewHolder(View itemView){
            super(itemView);
            id = (TextView)itemView.findViewById(R.id.id);
            Name = (TextView)itemView.findViewById(R.id.Name);
            Cost = (TextView)itemView.findViewById(R.id.Cost);
            Pict = (ImageView)itemView.findViewById(R.id.Pict);
        }
    }
    private ArrayList<Model> dataList;
    public Adapter(ArrayList<Model>list){
        this.dataList = list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.activity_recyclereview, parent, false);
    return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
    holder.Name.setText(dataList.get(position).getName());
    holder.id.setText(""+position);
    holder.Cost.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in","ID")).format(dataList.get(position).getCost()));
    holder.Pict.setImageResource(dataList.get(position).getPict());
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String index = holder.id.getText().toString();
            Toast.makeText(v.getContext(),"Menu Yang Di Pilih "+dataList.get(Integer.parseInt(index)).getName()+"",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(v.getContext().getApplicationContext(),MenuDetail.class);
            intent.putExtra("MenuId",index);
            v.getContext().startActivity(intent);
            Log.d("Isi Index",""+index);
        }
    });
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

}
