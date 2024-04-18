package com.example.personal_finance_tracker.DB.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.personal_finance_tracker.DB.AppDataBase;

import java.util.Objects;

@Entity(tableName = AppDataBase.EXPENSE_LOG_TABLE)
public class ExpenseLog {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private int amount;

    public ExpenseLog(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExpenseLog that = (ExpenseLog) o;
        return id == that.id && amount == that.amount && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, amount);
    }
}