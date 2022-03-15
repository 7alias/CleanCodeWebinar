package model.impl;

import model.Book;

public class DigitalBook implements Book {


    //      Book title
    private String bookTitle;

    //     Author fullname
    private String author;

    //    number of pages
    private Integer pages;
    private String fileFormat;

    public DigitalBook(String name,
                       String author,
                       Integer pages,
                       String fileFormat) {
        this.bookTitle = name;
        this.author = author;
        this.pages = pages;
        this.fileFormat = fileFormat;
    }

    public DigitalBook() {
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }
}
