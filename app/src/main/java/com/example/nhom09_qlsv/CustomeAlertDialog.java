package com.example.nhom09_qlsv;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class CustomeAlertDialog extends Dialog {

    private KhoaDAO khoaDAO;

    EditText edtID, edtName_Khoa;

    Button btnsave;

    public CustomeAlertDialog(@NonNull Context context) {
        super(context);
        khoaDAO= new KhoaDAO(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_khoa);
        edtID = findViewById(R.id.txtInputId);
        edtName_Khoa = findViewById(R.id.txtInputNameSong);
        btnsave = findViewById(R.id.btnSave);
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (isDataValid()){
                    saveData();
                    Toast.makeText(getContext(), "Lưu thành công",
                            Toast.LENGTH_SHORT).show();
                    xoaThongTin();
                }
                else {
                    Toast.makeText(getContext(), "Chưa nhập đủ thông tin",
                            Toast.LENGTH_SHORT).show();
                }




            }
        });



    }

    private void xoaThongTin(){
        edtID.setText("");
        edtName_Khoa.setText("");
    }
    //hàm lưu thông tin xuống SQLite
    private void saveData(){
        String ID= edtID.getText().toString().trim();
        String Name= edtName_Khoa.getText().toString().trim();
        Khoa khoa = new Khoa(Integer.parseInt(ID), Name);
        khoaDAO.Insert(khoa);
    }
    //hàm kiểm tra xem người dùng đã nhập đủ thông tin chưa
    private boolean isDataValid(){
        String ID= edtID.getText().toString().trim();
        String Name= edtName_Khoa.getText().toString().trim();
        return !ID.isEmpty() && !Name.isEmpty();
    }


}
