package com.example.fish;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class AllFishAdapter extends RecyclerView.Adapter<AllFishAdapter.AllFishHolder>{
    Activity activity;
    List<AllFishKecil> semuaFishnya;

    public AllFishAdapter(Activity activity, List<AllFishKecil> semuaFishnya) {
        this.activity = activity;
        this.semuaFishnya = semuaFishnya;
    }

    @NonNull
    @Override
    public AllFishHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(activity).inflate(R.layout.all_fish,parent,false);
        return new AllFishHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllFishHolder holder, int position) {
        holder.txtAllFish.setText(semuaFishnya.get(position).getSpeciesName());
        Picasso.with(activity).load(semuaFishnya.get(position).getFishPicture().getSrc()).into(holder.imgFishUtama);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namaIkan, namaIkanEdit;
                namaIkan=semuaFishnya.get(position).getSpeciesName();
                namaIkanEdit=namaIkan.replaceAll(" ", "-").toLowerCase();
                Intent kirim=new Intent(activity, DetailActivity.class);
                kirim.putExtra("paket",namaIkanEdit);
                v.getContext().startActivity(kirim);




            }
        });
    }

    @Override
    public int getItemCount() {
        return semuaFishnya.size();
    }

    static class AllFishHolder extends RecyclerView.ViewHolder{
        ImageView imgFishUtama;
        TextView txtAllFish;
       public AllFishHolder(@NonNull View itemView) {
           super(itemView);
           imgFishUtama=(ImageView)itemView.findViewById(R.id.img_fish);
           txtAllFish=(TextView)itemView.findViewById(R.id.txt_name_utama);
       }
   }
}
