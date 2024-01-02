package com.example.nhom09_qlsv;

import java.util.ArrayList;
import java.util.List;

public class Khoa {


    public Khoa(int maso, String tenkhoa) {
        this.maso = maso;
        this.tenkhoa = tenkhoa;
    }

    public Khoa(){

    }

    private int maso;
    private String tenkhoa;

    public int getMaso() {
        return maso;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }

    public String getTenkhoa() {
        return tenkhoa;
    }

    public void setTenkhoa(String tenkhoa) {
        this.tenkhoa = tenkhoa;
    }



    public static List<Khoa> getListKhoa(){
        List<Khoa> lsKhoa = new ArrayList<>();
        return lsKhoa;
    }



}
