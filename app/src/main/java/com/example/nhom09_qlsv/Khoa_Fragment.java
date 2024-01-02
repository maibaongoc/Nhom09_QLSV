package com.example.nhom09_qlsv;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Khoa_Fragment extends Fragment {

    private

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater,container,savedInstanceState);
        View view= inflater.inflate(R.layout.fragment_khoa,container,false);
        return view;
    }

    //Ham swipe xoa khoa

    public void addScreen(View view)
    {
        Intent intent = new Intent(this, addKhoa.class);
        getActivity().startActivity(intent);

    }



}