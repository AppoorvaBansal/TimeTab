package com.example.pc.timetab;

import android.content.DialogInterface;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Reminder2Activity extends AppCompatActivity implements View.OnClickListener {

    String title,description;
    TextView textViewTitle,textViewDescription;
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder2);
        //get the content from intent receiver
        title=this.getIntent().getExtras().getString("title");
        description=this.getIntent().getExtras().getString("description");

        textViewTitle=(TextView)this.findViewById(R.id.textViewTitle2);
        textViewDescription=(TextView)this.findViewById(R.id.textViewDescription2);
        fab=(FloatingActionButton)this.findViewById(R.id.fabDone);
        textViewTitle.setText(title+" :");
        textViewDescription.setText(description);
        fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
