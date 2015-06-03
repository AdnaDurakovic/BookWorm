package com.example.adna.bookworm;

/**
 * Created by Adna on 03/06/2015.
 */
public class Book {
    int id;
    String title;
    String author;
    String isbn;
    String img;
    String release;
    int pages;
    String desc;

    public Book () {
    }

    public Book (String _title, String _author, String _isbn, String _img, String _release, int _pages, String _desc) {
        title = _title;
        author = _author;
        isbn = _isbn;
        img = _img;
        release = _release;
        pages = _pages;
        desc = _desc;
    }

    public Book (int _id, String _title, String _author, String _isbn, String _img, String _release, int _pages, String _desc) {
        id = _id;
        title = _title;
        author = _author;
        isbn = _isbn;
        img = _img;
        release = _release;
        pages = _pages;
        desc = _desc;
    }

    // setters
    public void setBookID(int bookid) { this.id = bookid; }
    public void setBookTitle(String tit) { this.title = tit;}
    public void setBookAuthor(String aut) { this.author = aut;}
    public void setBookISBN(String isbn) { this.isbn = isbn;}
    public void setBookCoverImage(String img) { this.img = img;}
    public void setBookReleaseDate(String releasedate) { this.release = releasedate;}
    public void setBookPages(int pgs) { this.pages = pgs;}
    public void setBookDEscription(String desc) { this.desc = desc;}

    // getters
    public int getBookID() { return this.id; }
    public String getBookTitle() { return this.title;}
    public String getBookAuthor() { return this.author;}
    public String getBookISBN() { return this.isbn;}
    public String getBookCoverImage() { return this.img;}
    public String getBookReleaseDate() { return this.release;}
    public int getBookPages() { return this.pages;}
    public String getBookDEscription() { return this.desc = desc;}

}




