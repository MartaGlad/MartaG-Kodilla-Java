package com.kodilla.good.patterns.srp.rental;

public class RentalDTO {

    private User user;
    private boolean isRented;

    public RentalDTO(final User user, final boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public User getUser() {
        return user;
    }

    public boolean isRented() {
        return isRented;
    }
}
