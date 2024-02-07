package model;

public class Book {
    //---------------ATTRIBUTES------------
    private int pages;
    private String genre;
    private String language;
    private String writer;
    private int ageRestrictions;

    //---------------GETTERS/SETTERS----------


    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getAgeRestrictions() {
        return ageRestrictions;
    }

    public void setAgeRestrictions(int ageRestrictions) {
        this.ageRestrictions = ageRestrictions;
    }
}
