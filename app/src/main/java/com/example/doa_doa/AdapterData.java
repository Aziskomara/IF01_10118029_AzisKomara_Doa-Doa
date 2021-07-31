package com.example.doa_doa;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterData extends RecyclerView.Adapter<AdapterData.HolderData> {
    List<DataModel> listdata;
    LayoutInflater inflater;
    Context context;

    public AdapterData(Context context, List<DataModel> listdata) {
        this.listdata = listdata;
        this.inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_data, parent, false);
        HolderData holderData = new HolderData(view);
        holderData.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("doa",listdata.get(holderData.getAdapterPosition()).getDoa());
                intent.putExtra("arab",listdata.get(holderData.getAdapterPosition()).getArab());
                intent.putExtra("latin",listdata.get(holderData.getAdapterPosition()).getLatin());
                intent.putExtra("arti",listdata.get(holderData.getAdapterPosition()).getArti());
                context.startActivity(intent);
            }
        });
        return holderData;
    }

    @Override
    public void onBindViewHolder(AdapterData.HolderData holder, int position) {
        holder.tv_doa.setText(listdata.get(position).getDoa());



    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class HolderData extends RecyclerView.ViewHolder{
        TextView tv_doa,tv_arab;
        LinearLayout linearLayout;

        public HolderData(View itemView) {
            super(itemView);

            tv_doa = itemView.findViewById(R.id.tv_doa);
            linearLayout = itemView.findViewById(R.id.main_layout);
        }
    }
}
