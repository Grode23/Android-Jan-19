package com.example.jan19;

public class Movie {

    private String title;
    private String prototypeTitle;
    private String description;
    private String date;
    private double score;
    private String posterUrl;

    public Movie(String title, String prototypeTitle, String description, String date, double score, String posterUrl) {
        this.title = title;
        this.prototypeTitle = prototypeTitle;
        this.description = description;
        this.date = date;
        this.score = score;
        this.posterUrl = posterUrl;
    }

    public Movie(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrototypeTitle() {
        return prototypeTitle;
    }

    public void setPrototypeTitle(String prototypeTitle) {
        this.prototypeTitle = prototypeTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }
}
