package com.example.homework_books;

public class  Book {
    private String name;
    private String author;
    private String image;
    private String price;

    public Book(String name, String author, String image, String price) {
        this.name = name;
        this.author = author;
        this.image = image;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getImage() {
        return image;
    }

    public String getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
