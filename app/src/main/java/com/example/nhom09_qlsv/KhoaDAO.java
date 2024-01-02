package com.example.nhom09_qlsv;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class KhoaDAO {
    KhoaHelper khoaHelper;

    public KhoaDAO(Context context)
    {
        khoaHelper = new KhoaHelper(context);
    }

    public List<Khoa> GetAll()
    {
        SQLiteDatabase db = khoaHelper.getWritableDatabase();
        List<Khoa> listProduct = new ArrayList<>();
        String query = "SELECT * FROM Khoa";
        Cursor c = db.rawQuery(query, null);
        while (c.moveToNext())
        {
            Khoa temp = new Khoa();
            temp.setMaso(c.getInt(0));
            temp.setTenkhoa(c.getString(1));
            listProduct.add(temp);
        }
        return listProduct;
    }

    public void Insert(Khoa p) {
        SQLiteDatabase db = khoaHelper.getWritableDatabase();
        //c1: sử dụng contentValues
        ContentValues values = new ContentValues();
        values.put("id", p.getMaso());
        values.put("ten_khoa", p.getTenkhoa());
        db.insert("khoa", null, values);
    }

    public void Delete(int productId) {
        SQLiteDatabase db = khoaHelper.getWritableDatabase();
        //c1: sử dụng delete
        db.delete("product", "id=?", new String[]{String.valueOf(productId)});
    }

}
