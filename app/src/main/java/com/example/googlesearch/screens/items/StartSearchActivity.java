package com.example.googlesearch.screens.items;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.googlesearch.R;

public class StartSearchActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_search);
        editText = findViewById(R.id.editText);
    }

    public void onClickRequest(View view) {
        String textSearch = editText.getText().toString();
        Intent intent = new Intent(this, SearchActivity.class);
        intent.putExtra("textSearch", textSearch);
        startActivity(intent);
    }
}
