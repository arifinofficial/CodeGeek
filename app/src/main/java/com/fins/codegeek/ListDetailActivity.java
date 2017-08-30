package com.fins.codegeek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_detail);

        ImageView ImgDetail = (ImageView) findViewById(R.id.ImgDetail);
//        TextView TextDetail = (TextView) findViewById(R.id.TextDetail);
        TextView desc       = (TextView) findViewById(R.id.Desc);

//        String nama = getIntent().getExtras().getString("nama");
        int icon    = getIntent().getExtras().getInt("icon");
        String descString = getIntent().getExtras().getString("desc");

        ImgDetail.setImageResource(icon);
//        TextDetail.setText(nama);
        desc.setText(descString);

    }
}
