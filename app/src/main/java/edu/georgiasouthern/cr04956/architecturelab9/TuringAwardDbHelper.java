package edu.georgiasouthern.cr04956.architecturelab9;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Cameron Rhodes on 4/18/2017.
 */

public class TuringAwardDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "TuringAward.db";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + TuringAwardContract.AwardEntry.TABLE_NAME + " (" +
                    TuringAwardContract.AwardEntry._ID + " INTEGER PRIMARY KEY," +
                    TuringAwardContract.AwardEntry.COLUMN_NAME_YEAR + " INTEGER," +
                    TuringAwardContract.AwardEntry.COLUMN_NANE_NAME + " TEXT," +
                    TuringAwardContract.AwardEntry.COLUMN_NAME_SCHOOL + " TEXT," +
                    TuringAwardContract.AwardEntry.COLUMN_NAME_ALIVE + " BOOLEAN," + //is an int [0,1]
                    TuringAwardContract.AwardEntry.COLUMN_NAME_CITATION + " TEXT)";
    private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + TuringAwardContract.AwardEntry.TABLE_NAME;



    public TuringAwardDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
