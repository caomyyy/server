package com.example.myticket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class DangNhapActivity extends AppCompatActivity {
    EditText edtSDTDN, edtMatKhauDN,
    Button btnDangKyDN, btnDangNhapDN;
    String SDT, MatKhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.layout_dangnhap);


        btnDangKyDN = (Button) findViewById (R.id.btnDangKyDN);
        btnDangNhapDN = (Button) findViewById (R.id.btnDangNhapDN);
        edtMatKhauDN = (EditText) findViewById (R.id.edtMatKhauDN) ;
        edtSDTDN = (EditText) findViewById (R.id.edtSDTDN) ;


       btnDangKyDN.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (DangNhapActivity.this, DangKyActivity.class);
                startActivity (intent);
            }
        });

       btnDangNhapDN.setOnClickListener (new View.OnClickListener ( ) {
           @Override
           public void onClick(View v) {
               SDT = edtSDTDN.getText ().toString ();
               MatKhau = edtMatKhauDN.getText ().toString ();


           }
       });
    }
}
