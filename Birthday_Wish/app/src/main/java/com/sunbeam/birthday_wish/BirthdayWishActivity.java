package com.sunbeam.birthday_wish;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BirthdayWishActivity extends AppCompatActivity {
    TextView receviename;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_birthday_wish2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        receviename=findViewById(R.id.userrecevied);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        receviename.setText(name);

        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.birthdaywish);
        mediaPlayer.start();
    }

}