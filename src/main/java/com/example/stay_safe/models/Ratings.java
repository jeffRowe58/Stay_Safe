package com.example.stay_safe.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ratings")
public class Ratings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "rating")
    private int rating;

    public Ratings() {
    }

    public Ratings(Hotel hotel, User user, int rating) {
        this.hotel = hotel;
        this.user = user;
        this.rating = rating;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
