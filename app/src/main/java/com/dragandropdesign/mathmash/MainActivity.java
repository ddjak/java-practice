package com.dragandropdesign.mathmash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void login(View view){
        EditText nameField = (EditText) findViewById(R.id.editText);
        EditText passField = (EditText) findViewById(R.id.editText2);

        Toast.makeText(MainActivity.this, nameField.getText().toString(), Toast.LENGTH_SHORT).show();

        Log.i("Info", nameField.getText().toString());
        Log.i("Info", passField.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
