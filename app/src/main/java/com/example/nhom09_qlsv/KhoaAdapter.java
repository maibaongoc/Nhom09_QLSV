package com.example.nhom09_qlsv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class KhoaAdapter extends RecyclerView.Adapter<KhoaAdapter.ViewHolder> {
    private List<Khoa>lstKhoa;

    public KhoaAdapter(List<Khoa> lstKhoa)
    {
        this.lstKhoa=lstKhoa;
    }
    public KhoaAdapter(){

    }

    @NonNull
    @Override
    public KhoaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View khoaView = inflater.inflate(R.layout.item_khoa,parent,false);
        ViewHolder viewHolder = new ViewHolder(khoaView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KhoaAdapter.ViewHolder holder, int position) {
        Khoa temp = lstKhoa.get(position);
        holder.tv.setText(temp.getTenkhoa());
    }

    @Override
    public int getItemCount() {

        return lstKhoa.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            tv=(TextView)itemView.findViewById(R.id.tvkhoa);
        }

    }



}
