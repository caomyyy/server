package com.example.myticket;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.RequestBody;


public class DangKyActivity extends AppCompatActivity implements View.OnFocusChangeListener {
     EditText edtNgaySinh, edtSDT, edtHoTen, edtCMT,edtMatKhau ;
     RadioGroup rgGioiTinh;
     Button btnOKDK,  btnDangNhapDK;

    String TenND, SDT, CMT,NgaySinh,GioiTinh, MatKhau;
    String realpath = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.layout_dangky);

        edtNgaySinh =(EditText) findViewById (R.id.edtNgaySinh);
        edtCMT =(EditText) findViewById (R.id.edtCMT);
        edtHoTen =(EditText) findViewById (R.id.edtHoTen);
        edtSDT =(EditText) findViewById (R.id.edtSDT);
        edtMatKhau =(EditText) findViewById (R.id.edtMatKhau);
        rgGioiTinh = (RadioGroup) findViewById (R.id.rgGioiTinh);
        btnOKDK = (Button) findViewById (R.id.btnOKDK);
        btnDangNhapDK = (Button) findViewById (R.id.btnDangNhapDK);


        edtNgaySinh.setOnFocusChangeListener (this);
        btnDangNhapDK.setOnClickListener (new View.OnClickListener ( ) {


            @Override
            public void onClick(View v) {

                Intent intent = new Intent (DangKyActivity.this , DangNhapActivity.class);
                startActivity (intent);
            }
        });


        btnOKDK.setOnClickListener(new View.OnClickListener (){
            @Override
            public void onClick(View v) {
                TenND = edtHoTen.getText ().toString ();
                SDT = edtSDT.getText ().toString ();
                CMT = edtCMT.getText ().toString ();
                NgaySinh = edtNgaySinh.getText ().toString ();

                switch (rgGioiTinh.getCheckedRadioButtonId()){
                    case R.id.rdNam:
                        GioiTinh = "Nam"; break;
                    case R.id.rdNu:
                        GioiTinh ="Nữ"; break;
                    case R.id.rdKhac:
                        GioiTinh ="Khác"; break;
                };
                MatKhau = edtMatKhau.getText ().toString ();
                if (TenND.length () >0 && SDT.length () >0 && CMT.length () >0 && NgaySinh.length () >0 && GioiTinh.length () >0 && MatKhau.length () >0){

                    /*File file = new File (realpath);
                    String file_path = file.getAbsolutePath ();
                    String[] mangtenfile = file_path.split ("\\.");
                    file_path = mangtenfile[0] + System.currentTimeMillis () + "." + mangtenfile[1];
                    RequestBody requestBody = RequestBody.create (MediaType.parse ("mulltipart/form-data"),file);
*/

                }else {
                    Toast.makeText (DangNhapActivity.this, "Hãy nhập đủ thông tin");
                }



            }
        });


    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        int id  = v.getId ();
        switch (id) {
            case R.id.edtNgaySinh :
                if(hasFocus){
                    DatePickerFragment datePickerFragment = new DatePickerFragment ();
                    datePickerFragment.show(getSupportFragmentManager (),"Ngày Sinh");
                }
        }
        }
   /* public String getRealPathFromURI (Uri contentUri) {
        String path = null;
        String[] proj = { MediaStore.MediaColumns.DATA };
        Cursor cursor = getContentResolver().query(contentUri, proj, null, null, null);
        if (cursor.moveToFirst()) {
            int column_index = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.DATA);
            path = cursor.getString(column_index);
        }
        cursor.close();
        return path;
    }*/
    }


