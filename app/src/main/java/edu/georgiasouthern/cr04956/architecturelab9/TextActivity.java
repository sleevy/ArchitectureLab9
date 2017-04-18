package edu.georgiasouthern.cr04956.architecturelab9;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class TextActivity extends AppCompatActivity {
    private static final String QUOTE_TEXT =
            "By understanding a machine-oriented language, the programmer will tend to use a much more efficient method much closer to reality.\n" +
            "\n" +
            "An algorithm must be seen to be believed.\n" +
            "\n" +
            "People who are more than casually interested in computers should have at least some idea of what the underlying hardware is like. Otherwise the programs they write will be pretty weird.\n" +
            "\n" +
            "Random numbers should not be generated with a method chosen at random\n" +
            "\n" +
            "The sun comes up just about as often as it goes down, in the long run, but this doesn't make its motion random.\n" +
            "\n" +
            "Any inaccuracies may be explained by the fact that this text was generated with the help of a computer.\n" +
            "\n" +
            "Trees sprout up just about everywhere in computer science.";

    private File quoteFile;
//    private static final String QUOTE_DIRECTORY = "Quotes";
    private static final String QUOTE_FILE_NAME = "knuthQuotes.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

//        File quoteDirectory = new File(getExternalFilesDir(null), QUOTE_DIRECTORY);
//        if(!quoteDirectory.exists()) {
//            if(quoteDirectory.mkdirs()) {
//                Toast.makeText(this, "Directory Created", Toast.LENGTH_SHORT).show();
//            } else {
//                Toast.makeText(this, "Directory Creation Failed", Toast.LENGTH_SHORT).show();
//            }
//        }
        File quoteDirectory = getExternalFilesDir(null);
        quoteFile = new File(quoteDirectory, QUOTE_FILE_NAME);
        if(!quoteFile.exists()) {
            writeFile();
        }
        String text = readFile();
        TextView txtView = (TextView) findViewById(R.id.txtQuote);
        txtView.setText(text);
    }

    public void writeFile() {
//        if(quoteFileExists()) {
//            Toast.makeText(this, "File already exists.", Toast.LENGTH_SHORT).show();
//            return;
//        }

        try {
            FileWriter writer = new FileWriter(quoteFile, false);
            writer.write(QUOTE_TEXT);
            writer.flush();
            writer.close();
            Toast.makeText(this, "Quote file written successfully", Toast.LENGTH_SHORT).show();
        } catch(IOException ioe) {
            ioe.printStackTrace();
            Toast.makeText(this, "Error writing quote file", Toast.LENGTH_SHORT).show();
        }


    }

    public String readFile() {
//        if(!quoteFileExists()) {
//            writeFile();
//        }

        String fileContents = "";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(quoteFile)));
            StringBuilder builder = new StringBuilder();
            String content = "";
            while((content = reader.readLine()) != null) {
                builder.append(content);
                builder.append("\n");
            }
            fileContents = builder.toString();
            reader.close();
        }
        catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
            Toast.makeText(this, "File not found", Toast.LENGTH_SHORT).show();
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }


        return fileContents;
    }

//    public boolean quoteFileExists() {
//        boolean exists = false;
//
//
//        return exists;
//    }

}
