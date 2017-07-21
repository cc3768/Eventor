package com.example.ds121.eventor;

        import android.content.Context;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {
    final static String Table = " ";
    final static String Id = " ";
    final static String KeyName = " ";
    final static String Name = " ";
    final static String KeyAddress = " ";
    // Database Version
    private static final int DATABASE_VERSION = 1;
    // Database Name
    private static final String DATABASE_NAME = Name;
    // Contacts table name
    private static final String TABLE_ACCOUNT = Table;
    // Shops Table Columns names
    private static final String KEY_ID = Id;
    private static final String KEY_NAME = KeyName;
    private static final String KEY_SH_ADDR = KeyAddress;
    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_ACCOUNT + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT," + KEY_SH_ADDR + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
// Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ACCOUNT);
// Creating tables again
        onCreate(db);
    }
}