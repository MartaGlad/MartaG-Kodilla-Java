package com.kodilla.good.patterns.challenges.aviation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public final class Flight {
    private final int number;
    private final String departureAirport;
    private final String arrivalAirport;
    private final LocalDateTime departureTime;
    private final LocalDateTime arrivalTime;

    public Flight(final int number, final String departureAirport, final String arrivalAirport,
                  final LocalDateTime departureTime, final LocalDateTime arrivalTime) {
        this.number = number;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public int getNumber() {
        return number;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return number == flight.number
                && Objects.equals(departureAirport, flight.departureAirport)
                && Objects.equals(arrivalAirport, flight.arrivalAirport)
                && Objects.equals(departureTime, flight.departureTime)
                && Objects.equals(arrivalTime, flight.arrivalTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, departureAirport, arrivalAirport, departureTime, arrivalTime);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        return "Flight{" +
                "number: " + number +
                ", departureAirport: '" + departureAirport + '\'' +
                ", arrivalAirport: '" + arrivalAirport + '\'' +
                ", departureTime: " + departureTime.format(formatter) +
                ", arrivalTime: " + arrivalTime.format(formatter) +
                '}';
    }
}
