package com.example.adna.bookworm;

/**
 * Created by Adna on 03/06/2015.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adna on 03/06/2015.
 */

public class DataBaseHelper extends SQLiteOpenHelper {

    // Logcat tag
    private static final String LOG = "DatabaseHelper";

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "bookworm_database.db";

    // Table Names
    private static final String TABLE_USER = "user";
    private static final String TABLE_BOOK = "book";
    private static final String TABLE_LIBRARY = "library";

    // Common column names
    private static final String KEY_ID = "id";

    // USER Table - column nmaes
    private static final String USERNAME = "username";
    private static final String USERPASS = "password";

    // BOOK Table - column names
    private static final String TITLE = "title";
    private static final String AUTHOR = "author";
    private static final String ISBN = "isbn";
    private static final String COVER = "cover_img";
    private static final String RELEASE = "release_date";
    private static final String PAGES = "pages";
    private static final String DESCR = "description";

    // LIBRARY Table - column names
    private static final String USER_ID = "user_id";
    private static final String BOOK_ID = "book_id";
    private static final String STATUS = "status";

    // Table Create Statements
    // USER table create statement
    private static final String CREATE_TABLE_USER = "CREATE TABLE "
            + TABLE_USER + "(" + KEY_ID + " INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, "
            + USERNAME + " TEXT NOT NULL UNIQUE, " + USERPASS + " TEXT NOT NULL);";

    // BOOK table create statement
    private static final String CREATE_TABLE_BOOK = "CREATE TABLE " + TABLE_BOOK
            + "(" + KEY_ID + " INTEGER PRIMARY KEY," + TITLE + " TEXT,"
            + AUTHOR + " TEXT," + ISBN + " TEXT," + COVER + " TEXT,"
            + RELEASE + " DATE," + PAGES + " INTEGER," + DESCR + " TEXT);";

    // LIBRARY table create statement
    /*
    private static final String CREATE_TABLE_TODO_TAG = "CREATE TABLE "
            + TABLE_TODO_TAG + "(" + KEY_ID + " INTEGER PRIMARY KEY,"
            + KEY_TODO_ID + " INTEGER," + KEY_TAG_ID + " INTEGER,"
            + KEY_CREATED_AT + " DATETIME" + ")"; */

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // creating required tables
        db.execSQL(CREATE_TABLE_USER);
        db.execSQL(CREATE_TABLE_BOOK);
        //db.execSQL(CREATE_TABLE_TODO_TAG);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // on upgrade drop older tables
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_BOOK);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_LIBRARY);

        // create new tables
        onCreate(db);
    }

    /*
    * Creating an user
    */
    public long createUser(User usr) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(USERNAME, usr.getUsername());
        values.put(USERPASS, usr.getUserPass());

        // insert row
        long usr_id = db.insert(TABLE_USER, null, values);

        return usr_id;
    }

    /**
     * getting all users
     * */
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        String selectQuery = "SELECT  * FROM " + TABLE_USER;

        Log.e(LOG, selectQuery);

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                User td = new User();
                td.setUserID(c.getInt(c.getColumnIndex(KEY_ID)));
                td.setUserName(c.getString((c.getColumnIndex(USERNAME))));
                td.setUserPass(c.getString((c.getColumnIndex(USERPASS))));

                // adding to users list
                users.add(td);
            } while (c.moveToNext());
        }

        return users;
    }


    /*
    * Creating a book
    */
    public long createBook(Book book) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(TITLE, book.getBookTitle());
        values.put(AUTHOR, book.getBookAuthor());
        values.put(ISBN, book.getBookISBN());
        values.put(COVER, book.getBookCoverImage());
        values.put(RELEASE, book.getBookReleaseDate());
        values.put(PAGES, book.getBookPages());
        values.put(DESCR, book.getBookDEscription());

        // insert row
        long book_id = db.insert(TABLE_BOOK, null, values);

        return book_id;
    }

    /**
     * getting all books
     * */
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<Book>();
        String selectQuery = "SELECT  * FROM " + TABLE_BOOK;

        Log.e(LOG, selectQuery);

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                Book b = new Book();
                b.setBookID(c.getInt(c.getColumnIndex(KEY_ID)));
                b.setBookTitle(c.getString(c.getColumnIndex(TITLE)));
                b.setBookAuthor(c.getString(c.getColumnIndex(AUTHOR)));
                b.setBookISBN(c.getString(c.getColumnIndex(ISBN)));
                b.setBookCoverImage(c.getString(c.getColumnIndex(COVER)));
                b.setBookReleaseDate(c.getString(c.getColumnIndex(RELEASE)));
                b.setBookPages(c.getInt(c.getColumnIndex(PAGES)));
                b.setBookDEscription(c.getString(c.getColumnIndex(DESCR)));

                // adding to books list
                books.add(b);
            } while (c.moveToNext());
        }

        return books;
    }

    // closing database
    public void closeDB() {
        SQLiteDatabase db = this.getReadableDatabase();
        if (db != null && db.isOpen())
            db.close();
    }
}
