package com.example.personal_finance_tracker;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.personal_finance_tracker.DB.AppDataBase;

@Entity(tableName = AppDataBase.USER_LOGIN_TABLE)
public class User {
    @PrimaryKey(autoGenerate = true)
    private int userID;

    private String email;

    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}