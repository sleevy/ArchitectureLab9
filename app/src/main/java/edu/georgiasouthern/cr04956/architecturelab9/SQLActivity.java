package edu.georgiasouthern.cr04956.architecturelab9;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.util.ArrayList;

import static edu.georgiasouthern.cr04956.architecturelab9.TuringAwardContract.AwardEntry;

public class SQLActivity extends AppCompatActivity {

    TuringAwardDbHelper helper;
    TextView outputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql);

        helper = new TuringAwardDbHelper(this);
        helper.dropTable(helper.getWritableDatabase());
        helper.recreateTable(helper.getWritableDatabase());
        addEntriesToDatabase();

        outputView = (TextView) findViewById(R.id.txtOutput);

        Button allButton = (Button) findViewById(R.id.btnAll);
        allButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAllEntries();
            }
        });

        Button aliveButton = (Button) findViewById(R.id.btnAlive);
        aliveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAliveEntries();
            }
        });

        //TODO: ensure creation of database

        //TODO: add data into database

    }

    public void addEntriesToDatabase() {
        SQLiteDatabase db = helper.getWritableDatabase();
        Toast.makeText(this, "Adding entries", Toast.LENGTH_SHORT).show();
        for(AwardWinner winner : AwardWinner.values()) {

            ContentValues values = new ContentValues();

            values.put(AwardEntry.COLUMN_NAME_ALIVE, winner.isAlive() ? 1:0);
            values.put(AwardEntry.COLUMN_NAME_CITATION, winner.getCitation());
            values.put(AwardEntry.COLUMN_NAME_SCHOOL, winner.getSchool());
            values.put(AwardEntry.COLUMN_NAME_YEAR, winner.getYear());
            values.put(AwardEntry.COLUMN_NANE_NAME, winner.getName());

            long newRowId = db.insert(AwardEntry.TABLE_NAME, null, values);
        }
        Toast.makeText(this, "Entries added", Toast.LENGTH_SHORT).show();

    }

    public void getAliveEntries() {
        SQLiteDatabase db = helper.getReadableDatabase();
        String[] projection = {
                AwardEntry.COLUMN_NAME_CITATION,
                AwardEntry.COLUMN_NAME_SCHOOL,
                AwardEntry.COLUMN_NANE_NAME,
                AwardEntry.COLUMN_NAME_YEAR
        };
        String selection = AwardEntry.COLUMN_NAME_ALIVE + " = ?";
        String[] selectionArgs = { "1" };
        String sortOrder = AwardEntry.COLUMN_NAME_YEAR + " DESC";

        Cursor cursor = db.query(
                AwardEntry.TABLE_NAME,
                projection,
                selection,
                selectionArgs,
                null,
                null,
                sortOrder
                );

        StringBuilder builder = new StringBuilder();
        while(cursor.moveToNext()) {
            String name = cursor.getString(cursor.getColumnIndexOrThrow(AwardEntry.COLUMN_NANE_NAME));
            builder.append("Name: ");
            builder.append(name); //name
            builder.append(", ");

            int year = cursor.getInt(cursor.getColumnIndexOrThrow(AwardEntry.COLUMN_NAME_YEAR));
            builder.append("Year: ");
            builder.append(year); //year
            builder.append(", ");

//            int aliveInt = cursor.getInt(cursor.getColumnIndexOrThrow(AwardEntry.COLUMN_NAME_ALIVE));
//            boolean isAlive = (aliveInt == 1);
//            builder.append("Is Alive: ");
//            builder.append(isAlive ? "Yes":"No"); //alive is 0 or 1
//            builder.append(" ");

            String school = cursor.getString(cursor.getColumnIndexOrThrow(AwardEntry.COLUMN_NAME_SCHOOL));
            builder.append("School: ");
            builder.append(school); //school
            builder.append(", ");

            String citation = cursor.getString(cursor.getColumnIndexOrThrow(AwardEntry.COLUMN_NAME_CITATION));
            builder.append("Citation: ");
            builder.append(citation); //citation

            builder.append("\n"); //newline
        }

        outputView.setText(builder.toString());
        cursor.close();
    }

    public void getAllEntries() {
        SQLiteDatabase db = helper.getReadableDatabase();
        String[] projection = {
                AwardEntry.COLUMN_NAME_CITATION,
                AwardEntry.COLUMN_NAME_SCHOOL,
                AwardEntry.COLUMN_NANE_NAME,
                AwardEntry.COLUMN_NAME_ALIVE,
                AwardEntry.COLUMN_NAME_YEAR
        };
//        String selection = AwardEntry.COLUMN_NAME_ALIVE + " = ?";
//        String[] selectionArgs = { "1" };
        String sortOrder = AwardEntry.COLUMN_NAME_YEAR + " DESC";

        Cursor cursor = db.query(
                AwardEntry.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                sortOrder
        );

        StringBuilder builder = new StringBuilder();
        while(cursor.moveToNext()) {
            String name = cursor.getString(cursor.getColumnIndexOrThrow(AwardEntry.COLUMN_NANE_NAME));
            builder.append("Name: ");
            builder.append(name); //name
            builder.append(", ");

            int year = cursor.getInt(cursor.getColumnIndexOrThrow(AwardEntry.COLUMN_NAME_YEAR));
            builder.append("Year: ");
            builder.append(year); //year
            builder.append(", ");

            int aliveInt = cursor.getInt(cursor.getColumnIndexOrThrow(AwardEntry.COLUMN_NAME_ALIVE));
            boolean isAlive = (aliveInt == 1);
            builder.append("Is Alive: ");
            builder.append(isAlive ? "Yes":"No"); //alive is 0 or 1
            builder.append(", ");

            String school = cursor.getString(cursor.getColumnIndexOrThrow(AwardEntry.COLUMN_NAME_SCHOOL));
            builder.append("School: ");
            builder.append(school); //school
            builder.append(", ");

            String citation = cursor.getString(cursor.getColumnIndexOrThrow(AwardEntry.COLUMN_NAME_CITATION));
            builder.append("Citation: ");
            builder.append(citation); //citation

            builder.append("\n"); //newline
        }

        outputView.setText(builder.toString());
        cursor.close();
    }

}
