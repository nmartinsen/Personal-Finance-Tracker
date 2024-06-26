package com.example.personal_finance_tracker;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.personal_finance_tracker.DB.AppDataBase;

@Entity(tableName = AppDataBase.USER_LOGIN_TABLE)
public class User {
    @PrimaryKey(autoGenerate = true)
    private int userID;
    private boolean isAdmin;

    private String email;
    private String username;
    private String password;

    private int budget;

    public User(String email, String username, String password, int budget) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.budget = budget;
    }
    @Ignore
    public User(String email, String username, String password, boolean isAdmin) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
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

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}