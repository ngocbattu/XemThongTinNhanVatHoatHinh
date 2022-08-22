package com.example.xemthongtinnhanvathoathinh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ThongTinNhanVatActivity extends AppCompatActivity {
    Toolbar toolbar;
    ImageView image_anh;
    TextView txt_ten , txt_tuoi , txt_mota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_nhan_vat);
        toolbar = findViewById(R.id.toolbar_thong_tin_ct_nhan_vat);
        image_anh = findViewById(R.id.image_anh_nv_ct);
        txt_ten = findViewById(R.id.txt_ten_nv_ct);
        txt_tuoi = findViewById(R.id.txt_tuoi_nv_ct);
        txt_mota = findViewById(R.id.txt_mo_ta_nv_ct);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.icon_back);
        getSupportActionBar().setTitle("");


        Intent i = getIntent();
        Glide.with(this).load(i.getIntExtra("_anh",0)).into(image_anh);
        txt_ten.setText(i.getStringExtra("_ten"));
        txt_tuoi.setText("Tuổi : "+i.getIntExtra("_tuoi",0)+"");
        txt_mota.setText("Mô tả :"  + i.getStringExtra("_mota"));
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;

            default:break;
        }

        return super.onOptionsItemSelected(item);
    }
}