package edu.georgiasouthern.cr04956.architecturelab9;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        quoteFile = new File(Environment.getExternalStorageDirectory(), "Quote");
    }

    public void writeFile() {
        //TODO: implement writing

    }

    public String readFile() {
        String fileContents = "";
        //TODO: implement reading


        return fileContents;
    }

    public boolean quoteFileExists() {
        boolean exists = false;
        //TODO: implement checking

        return exists;
    }

}
