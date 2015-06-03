package com.example.adna.bookworm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.example.adna.bookworm.DataBaseHelper;

/**
 * Created by Adna on 02/06/2015.
 */
public class LoginActivity extends Activity implements View.OnClickListener
{
    // Database Helper
    DataBaseHelper db;
    EditText tbx_USERNAME;
    EditText tbx_USERPASS;
    Button batn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tbx_USERNAME = (EditText) findViewById(R.id.tbxUsername);
        tbx_USERPASS = (EditText) findViewById(R.id.tbxPassword);
        batn = (Button) findViewById(R.id.btnLogin);
        batn.setOnClickListener(this);

        db = new DataBaseHelper(getApplicationContext());

        // Creating tags
        User usr1 = new User("admin", "admin");

        // Inserting tags in db
        long usr1_id = db.createUser(usr1);

        // Getting all Todos
        Log.d("Get Users", "Getting All Userss");

        // Don't forget to close database connection
        db.closeDB();

    }

    private  void btnLoginClick()
    {
        boolean login_status = false;
        String usr_name = tbx_USERNAME.getText().toString();
        String usr_pass = tbx_USERPASS.getText().toString();



        List<User> allUsers = db.getAllUsers();
        for (User usr : allUsers) {
            if(usr.username.equals(usr_name) && usr.pass.equals(usr_pass))
                login_status = true;
        }


        if (login_status == true)
        {
            startActivity(new Intent("com.example.adna.bookworm.MainActivity"));
            finish();
        }
        else
        {
            Toast.makeText(getBaseContext(), "Login Failed", Toast.LENGTH_LONG).show();
            finish();
        }
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btnLogin:
                btnLoginClick();
                break;
        }
    }
    /*
    Button batn;
    EditText USRNAME, USRPASS;
    String username, userpass;
    Context CTX = this;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        USRNAME = (EditText) findViewById(R.id.tbxUsername);
        USRPASS = (EditText) findViewById(R.id.tbxPassword);
        batn = (Button)findViewById(R.id.btnLogin);
        batn.setOnClickListener(this);
    }

    private  void btnLoginClick() throws SQLException {

        DataBaseHelper myDbHelper;
        myDbHelper = new DataBaseHelper(CTX);

        try {
            myDbHelper.createDataBase();

        } catch (IOException ioe) {
            throw new Error("Unable to create database");
        }

        try {
            myDbHelper.openDataBase();


        }catch(SQLException sqle){
            Toast.makeText(getBaseContext(), "Unable to open database", Toast.LENGTH_LONG).show();
            throw sqle;

        }

        username = USRNAME.getText().toString();
        userpass = USRPASS.getText().toString();


        Cursor CR = myDbHelper.getInformation(myDbHelper);
        CR.moveToFirst();

        boolean login_status = false;
        String NAME = "";
        do {
            if (username.equals(CR.getString(1)) && userpass.equals(CR.getString(2))) {
                login_status = true;
                NAME = CR.getString(1);
            }
        } while (CR.moveToNext());

        if (login_status)
        {
            startActivity(new Intent("com.example.adna.bookworm.MainActivity"));
            finish();
        }
        else
        {
            Toast.makeText(getBaseContext(), "Login Failed---- ", Toast.LENGTH_LONG).show();
            finish();
        }

    }
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnLogin:
                try {
                    btnLoginClick();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
    */
}
