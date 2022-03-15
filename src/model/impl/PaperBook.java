package model.impl;

import model.Book;

public class PaperBook implements Book {


    /**
          *  Book title
          *
     */
    private String BookTitle;

    /*//     Author fullname*/
    private String author;

    //    number of pages
    private Integer pages;

   /* type of the cover: hard or soft*/
    private String coverType;


    public PaperBook() {
    }

    public PaperBook(String name,
                     String author,
                     Integer pages,
                     String coverType) {
        this.BookTitle = name;
        this.author = author;
        this.pages = pages;
        this.coverType = coverType;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public void setBookTitle(String bookTitle) {

        this.BookTitle = bookTitle;
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

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {

        this.coverType = coverType;
    }
}
