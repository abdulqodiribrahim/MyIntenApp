package com.example.myintenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_Move, btn_MoveData, btn_Call, btn_Browsing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Move=findViewById(R.id.btnMove);
        btn_Move.setOnClickListener(this);

        btn_MoveData=findViewById(R.id.btnMoveData);
        btn_MoveData.setOnClickListener(this);

        btn_Browsing=findViewById(R.id.btnBrowsing);
        btn_Browsing.setOnClickListener(this);

        btn_Call=findViewById(R.id.btnCall);
        btn_Call.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnMove:
                Intent moveActivity = new Intent(this, MoveActivity.class);
                startActivity(moveActivity);
                break;
            case R.id.btnMoveData:
                Intent moveDataIntent = new Intent(this, MoveDataActivity.class);
                moveDataIntent.putExtra(MoveDataActivity.EXTRA_NAME,"Abdul Qodir Ibraim");
                moveDataIntent.putExtra(MoveDataActivity.EXTRA_AGE, 20);
                startActivity(moveDataIntent);
                break;
            case R.id.btnCall:
                String phoneNumber = "081220877182";
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(callIntent);
                break;
            case R.id.btnBrowsing:
                String urlBrowser = "https://www.instagram.com/";
                Intent BrowserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse(urlBrowser));
                startActivity(BrowserIntent);
                break;

        }
    }
}
