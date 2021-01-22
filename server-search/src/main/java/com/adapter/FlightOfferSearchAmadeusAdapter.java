package com.adapter;

import com.amadeus.resources.FlightOfferSearch;
import com.repository.model.data.Flight;

public class FlightOfferSearchAmadeusAdapter extends Flight {
    private final FlightOfferSearch flightOfferSearch;

    public FlightOfferSearchAmadeusAdapter(FlightOfferSearch flightOfferSearch) {
        this.flightOfferSearch = flightOfferSearch;
    }




}
