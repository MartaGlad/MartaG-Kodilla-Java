package com.kodilla.good.patterns.challenges.aviation;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class FlightSearchEngine {

    private Set<Flight> flights;

    public FlightSearchEngine(Set<Flight> flights) {
        this.flights = flights;
    }

    public Set<Flight> findFlightsFrom(String departureAirport) {
        return flights.stream().filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findFlightsTo(String arrivalAirport) {
        return flights.stream().filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findDirectFlightsFromTo(String departureAirport, String arrivalAirport) {
        return findFlightsFrom(departureAirport).stream()
                .filter(flight -> findFlightsTo(arrivalAirport).contains(flight)).collect(Collectors.toSet());

    }

    public Set<Flight> findFlightsFromToWithChange (String departureAirport, String arrivalAirport) {
        Set<Flight> flightsPart1 = flights.stream()
                .filter(flight -> findFlightsFrom(departureAirport).contains(flight)).collect(Collectors.toSet());

        Set<Flight> flightsPart2 = flights.stream()
                .filter(flight -> findFlightsTo(arrivalAirport).contains(flight)).collect(Collectors.toSet());


        Set<Flight> flightsConsidered = new HashSet<>();
        flightsConsidered.addAll(flightsPart1);
        flightsConsidered.addAll(flightsPart2);

        Set<Flight> matchingFlightsWithChange = new LinkedHashSet<>();

        for (Flight flight1 : flightsConsidered) {
            for (Flight flight2 : flightsConsidered) {
                if (flight1.hashCode() != flight2.hashCode()) {
                    if ((flight1.getArrivalAirport().equals(flight2.getDepartureAirport()))
                            && (flight2.getDepartureTime().isAfter(flight1.getArrivalTime().plusMinutes(60)))
                            && (flight2.getDepartureTime().isBefore(flight1.getArrivalTime().plusMinutes(120)))) {

                            matchingFlightsWithChange.add(flight1);
                            matchingFlightsWithChange.add(flight2);
                        }
                    }

            }
        }
        return matchingFlightsWithChange;
    }
}



