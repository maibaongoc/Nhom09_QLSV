package com.example.nhom09_qlsv;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class KhoaHelper extends SQLiteOpenHelper {

    public KhoaHelper(@Nullable Context context)
    {
        super(context, "QLKhoa", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = String.format("CREATE TABLE %s (" + "%s INTEGER PRIMARY KEY AUTOINCREMENT, " + "%s TEXT)", "Khoa", "id", "khoa_name");
        db.execSQL(query);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        if (oldVersion != newVersion) {
            //drop
            String query = "DROP TABLE Khoa";
            db.execSQL(query);
            //create again
            onCreate(db);
        }

    }
}
