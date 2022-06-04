package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class contact_desc extends AppCompatActivity {
    ImageView img;
    TextView name,phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_desc);
        img = findViewById(R.id.dp);
        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone_number);
        Intent receive = getIntent();
        String name1 = receive.getStringExtra("name");
        String phone_number1 = receive.getStringExtra("phone");
        int img_id = Integer.parseInt(receive.getStringExtra("img"));
        name.append("\n"+ name1);
        phone.append("\n" + phone_number1);
        img.setImageResource(img_id);
    }
}