package org.example.Pojo;

import java.sql.Date;

public class BorrowingRecord {
    int id;
    int Book_ID;
    Date Borrow_Date;
    Date Return_Date;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int  getBook_ID() {
        return Book_ID;
    }

    public int  setBook_ID(int  book_ID) {
      return   Book_ID = book_ID;
    }

    public java.sql.Date getBorrow_Date() {
        return  Borrow_Date;
    }

    public void setBorrow_Date(Date borrow_Date) {
        Borrow_Date = borrow_Date;
    }

    public java.sql.Date getReturn_Date() {
        return (java.sql.Date) Return_Date;
    }

    public void setReturn_Date(Date return_Date) {
        Return_Date = return_Date;
    }


}
