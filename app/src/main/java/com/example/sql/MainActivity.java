package com.example.sql;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,Address,Phone,PhoneHome,nameDad,phoneDad,nameMom,phoneMom;
    SQLiteDatabase db;
    HelperDB hlp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.eTName);
        Address = findViewById(R.id.eTAdress);
        Phone = findViewById(R.id.eTPhone);
        PhoneHome = findViewById(R.id.eTPhone2);
        nameDad = findViewById(R.id.eTdad);
        phoneDad = findViewById(R.id.eTPhonedad);
        nameMom = findViewById(R.id.eTmom);
        phoneMom = findViewById(R.id.eTPhoneMom);

        hlp = new HelperDB(this);
        db = hlp.getWritableDatabase();
        db.close();
    }

}