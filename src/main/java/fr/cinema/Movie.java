package fr.cinema;

import java.util.List;

class Movie {

    private int id;
    private String title;
    private int years;
    private double price;
    private String times;

    public Movie() {
    }

    public Movie(int id, String title, int years, double price, String times) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.times = times;
        this.years = years;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return this.getId() + " " +
                this.getTitle() + " est sorti en " +
                this.getYears() + " coûte " +
                this.getPrice() + "€ sur les horaires " +
                this.getTimes();
    }

}
