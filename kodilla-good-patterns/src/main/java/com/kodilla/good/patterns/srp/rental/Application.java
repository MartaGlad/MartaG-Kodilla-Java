package com.kodilla.good.patterns.srp.rental;

public class Application {

    public static void main(String[] args) {

        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(new MailService(),
                                          new CarRentalService(), new CarRentalRepository());

        rentalProcessor.process(rentRequest);

        /*CarRentalService carRentalService = new CarRentalService();

        boolean isRented = carRentalService.rent(user, rentFrom, rentTo);
        MailService mailService = new MailService();
        CarRentalRepository carRentalRepository = new CarRentalRepository();

        if (isRented) {
            mailService.sendEmail(user);
            carRentalRepository.createCarRental(user, rentFrom, rentTo);

        } else {
            System.out.println("Car rent has been rejected!");

        }*/
    }

}
