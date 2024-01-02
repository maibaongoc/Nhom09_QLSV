package com.example.nhom09_qlsv;

import java.util.ArrayList;
import java.util.List;

public class Khoa {
    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getTenkhoa() {
        return tenkhoa;
    }

    public void setTenkhoa(String tenkhoa) {
        this.tenkhoa = tenkhoa;
    }

    private String maso;
    private String tenkhoa;

    public static List<Khoa> getListKhoa(){
        List<Khoa> lsKhoa = new ArrayList<>();
        return lsKhoa;
    }



}
