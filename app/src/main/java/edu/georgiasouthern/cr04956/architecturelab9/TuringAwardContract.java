package edu.georgiasouthern.cr04956.architecturelab9;

import android.provider.BaseColumns;

/**
 * Created by Cameron Rhodes on 4/18/2017.
 */

public final class TuringAwardContract {
    public TuringAwardContract(){}

    public static abstract class AwardEntry implements BaseColumns {
        public static final String TABLE_NAME = "ACM_TURING_AWARD";
        public static final String COLUMN_NAME_YEAR = "year";
        public static final String COLUMN_NANE_NAME = "name";
        public static final String COLUMN_NAME_SCHOOL = "school";
        public static final String COLUMN_NAME_ALIVE = "alive";
        public static final String COLUMN_NAME_CITATION = "citation";
    }
}
