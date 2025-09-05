package com.kodilla.good.patterns.challenges.aviation;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class ApplicationFlight {
    public static void main(String[] args) {
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight(1, "Warsaw", "Gdansk",
                LocalDateTime.of(2025,9,5, 4, 15 ),
                LocalDateTime.of(2025,9,5, 5, 10 )));

        flights.add(new Flight(2, "Cracow", "Gdansk",
                LocalDateTime.of(2025,9,5, 5, 15 ),
                LocalDateTime.of(2025,9,5, 6, 30 )));

        flights.add(new Flight(3, "Warsaw", "Cracow",
                LocalDateTime.of(2025,9,5, 7, 20 ),
                LocalDateTime.of(2025,9,5, 8, 10 )));

        flights.add(new Flight(4, "Cracow", "Warsaw",
                LocalDateTime.of(2025,9,5, 10, 15 ),
                LocalDateTime.of(2025,9,5, 11, 10 )));

        flights.add(new Flight(5, "Gdansk", "Cracow",
                LocalDateTime.of(2025,9,5, 3, 10 ),
                LocalDateTime.of(2025,9,5, 4, 05 )));

        flights.add(new Flight(6, "Gdansk", "Warsaw",
                LocalDateTime.of(2025,9,5, 12, 20 ),
                LocalDateTime.of(2025,9,5, 13, 10 )));

        flights.add(new Flight(7, "Warsaw", "Wroclaw",
                LocalDateTime.of(2025,9,5, 8, 30 ),
                LocalDateTime.of(2025,9,5, 9, 25 )));

        flights.add(new Flight(8, "Wroclaw", "Warsaw",
                LocalDateTime.of(2025,9,5, 4, 15 ),
                LocalDateTime.of(2025,9,5, 5, 10 )));

        flights.add(new Flight(9, "Gdansk", "Cracow",
                LocalDateTime.of(2025,9,5, 13, 30 ),
                LocalDateTime.of(2025,9,5, 14, 45 )));

        flights.add(new Flight(10, "Cracow", "Gdansk",
                LocalDateTime.of(2025,9,5, 9, 15 ),
                LocalDateTime.of(2025,9,5, 10, 30 )));

        flights.add(new Flight(11, "Warsaw", "Wroclaw",
                LocalDateTime.of(2025,9,5, 10, 15 ),
                LocalDateTime.of(2025,9,5, 11, 10 )));

        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flights);

        /*System.out.println("Flights from Warsaw: ");
        flightSearchEngine.findFlightsFrom("Warsaw").stream()
                .forEach(f -> System.out.println(f));

        System.out.println("\nFlights to Gdansk: ");
        flightSearchEngine.findFlightsTo("Gdansk").stream()
                .forEach(f -> System.out.println(f));

        System.out.println("\nFlights from Warsaw to Gdansk with change: ");
        flightSearchEngine.findFlightsFronToWithChange("Warsaw", "Gdansk").stream()
                .forEach(f -> System.out.println(f));*/

        /*System.out.println("Flights from Warsaw: ");
        flightSearchEngine.findFlightsFrom("Warsaw").stream()
                .forEach(f -> System.out.println(f));

        System.out.println("\nFlights to Cracow: ");
        flightSearchEngine.findFlightsTo("Cracow").stream()
                .forEach(f -> System.out.println(f));

        System.out.println("\nFlights from Warsaw to Cracow with change: ");
        flightSearchEngine.findFlightsFronToWithChange("Warsaw", "Cracow").stream()
                .forEach(f -> System.out.println(f)); */

        System.out.println("Flights from Cracow: ");
        flightSearchEngine.findFlightsFrom("Cracow").stream()
                .forEach(f -> System.out.println(f));

        System.out.println("\nFlights to Warsaw: ");
        flightSearchEngine.findFlightsTo("Warsaw").stream()
                .forEach(f -> System.out.println(f));

        System.out.println("\nDirect flights from Cracow to Warsaw: ");
        flightSearchEngine.findDirectFlightsFromTo("Cracow","Warsaw").stream()
                .forEach(f -> System.out.println(f));

        System.out.println("\nFlights from Cracow to Warsaw with change: ");
        flightSearchEngine.findFlightsFromToWithChange("Cracow", "Warsaw").stream()
                .forEach(f -> System.out.println(f));

    }
}
