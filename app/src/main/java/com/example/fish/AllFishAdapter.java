package com.example.fish;

import android.app.Activity;
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
    List<AllFish> semuaFishnya;

    public AllFishAdapter(Activity activity, List<AllFish> semuaFishnya) {
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
