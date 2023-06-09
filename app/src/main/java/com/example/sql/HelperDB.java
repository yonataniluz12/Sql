package com.example.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class HelperDB extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "dbexam.db";
    private static final int DATABASE_VERSION = 1;
    String strCreate, strDelete;
    public HelperDB(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        strCreate = "CREATE TABLE " + student.TABLE_USERS;
        strCreate += " (" + student.KEY_ID + " INTEGER PRIMARY KEY,";
        strCreate += " " + student.NAME + " TEXT,";
        strCreate += " " + student.ACTIVE + " TEXT,";
        strCreate += " " + student.ADDRESS + " TEXT,";
        strCreate += " " + student.PHONE_NUMBER + " TEXT,";
        strCreate += " " + student.HOME_PHONE + " TEXT,";
        strCreate += " " + student.MOM + " TEXT,";
        strCreate += " " + student.DAD + " TEXT,";
        strCreate += " " + student.MOM_PHONE + " TEXT,";
        strCreate += " " + student.DAD_PHONE + " TEXT";
        strCreate += ");";

        sqLiteDatabase.execSQL(strCreate);
        strCreate = "CREATE TABLE " + Grade.TABLE_GRADES;
        strCreate += " (" + student.KEY_ID + " INTEGER PRIMARY KEY,";
        strCreate += " " + student.NAME + " TEXT,";
        strCreate += " " + Grade.SUBJECT + " TEXT,";
        strCreate += " " + Grade.Grade_1 + " INTEGER,";
        strCreate += " " + Grade.Grade_2 + " INTEGER,";
        strCreate += " " + Grade.Grade_3 + " INTEGER,";
        strCreate += " " + Grade.Grade_4 + " INTEGER";
        strCreate += ");";
        sqLiteDatabase.execSQL(strCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        strDelete="DROP TABLE IF EXISTS "+student.TABLE_USERS;
        sqLiteDatabase.execSQL(strDelete);
        strDelete="DROP TABLE IF EXISTS "+Grade.TABLE_GRADES;
        sqLiteDatabase.execSQL(strDelete);

        onCreate(sqLiteDatabase);
    }

    private class Student {
    }
}
