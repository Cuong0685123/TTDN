package com.example.TsBooking_Model;

import java.util.List;

public class Customer {
    private int id;
    private String name;
    private String phone;
    private String email;
    private List<Booking> bookings;

   
    public Customer() {}

    public Customer(int id, String name, String phone, String email, List<Booking> bookings) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.bookings = bookings;
    }

    // Getters and Setters
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
