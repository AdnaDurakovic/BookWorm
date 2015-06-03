package com.example.adna.bookworm;

/**
 * Created by Adna on 03/06/2015.
 */
public class User {
    int id;
    String username;
    String pass;

    // constructors
    public User() {

    }

    public User(String usrname, String usrpass) {
        this.username = usrname;
        this.pass = usrpass;
    }

    public User(int id, String usrname, String usrpass) {
        this.id = id;
        this.username = usrname;
        this.pass = usrpass;
    }

    // setters
    public void setUserName(String usrname) { this.username = usrname; }
    public void setUserPass(String usrpass) { this.pass = usrpass; }
    public void setUserID(int usrid) { this.id = usrid; }

    // getters
    public int getId() {
        return this.id;
    }
    public String getUserPass() {
        return this.pass;
    }
    public String getUsername() { return this.username; }



}
