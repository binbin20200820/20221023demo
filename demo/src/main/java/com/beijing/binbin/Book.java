package com.beijing.binbin;

import java.util.Objects;

public class Book {
    String name;
    int year;
    String qa;

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setQa(String qa) {
        this.qa = qa;
    }

    public String getQa() {
        return qa;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(qa, book.qa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, qa);
    }


    public Book(String name, int year, String qa) {
        this.name = name;
        this.year = year;
        this.qa = qa;
    }


    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Book(String name, String qa) {
        this.name = name;
        this.qa = qa;
    }

    public Book(int year, String qa) {
        this.year = year;
        this.qa = qa;
    }

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public Book(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", qa='" + qa + '\'' +
                '}';
    }
}
