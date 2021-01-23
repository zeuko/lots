package com.amadeus;

import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.FlightOfferSearch;
import com.amadeus.resources.Traveler;

public interface CreateOrder {

    String createFlightOrder(Traveler[] travelers, FlightOfferSearch flightOfferSearch) throws ResponseException;

}
