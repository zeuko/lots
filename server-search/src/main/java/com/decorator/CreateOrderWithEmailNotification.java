package com.decorator;

import com.amadeus.CreateOrder;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.Traveler;
import com.decorator.notifier.EmailNotifier;


// DECORATOR
public class CreateOrderWithEmailNotification implements CreateOrder {

    private final EmailNotifier emailNotifier = new EmailNotifier();
    private final CreateOrder createOrder;

    public CreateOrderWithEmailNotification(CreateOrder createOrder) {
        this.createOrder = createOrder;
    }

    @Override
    public String createFlightOrder(Traveler[] travelers, FlightOfferSearch flightOfferSearch) throws ResponseException {
        String flightOrder = createOrder.createFlightOrder(travelers, flightOfferSearch);
        if (flightOrder != null) {
            String emailAddress = ""; // NOT IMPLEMENTED - should extract traveler email address
            emailNotifier.sendNotification(emailAddress);
        }

        return flightOrder;
    }
}
