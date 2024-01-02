package com.example.nhom09_qlsv;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;


public class Khoa_Fragment extends Fragment {

    FloatingActionButton floatingActionButton1;

    RecyclerView recyclerView;






    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater,container,savedInstanceState);
        View view= inflater.inflate(R.layout.fragment_khoa,container,false);

        floatingActionButton1=view.findViewById(R.id.floatingActionButton);
        CustomeAlertDialog customeAlertDialog= new CustomeAlertDialog(getActivity());
        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customeAlertDialog.show();
            }
        });
        recyclerView=view.findViewById(R.id.rcvkhoa);
        //hàm lấy danh sách product
        KhoaDAO productDAO = new KhoaDAO(getActivity());
        List<Khoa> khoaList= productDAO.GetAll();
        //đổ dữ liệu lên productAdapter
        KhoaAdapter productAdapter = new KhoaAdapter(khoaList);
        //gán dữ liệu vào RecyclerView
        recyclerView.setAdapter(productAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }







}