package com.repository.model.data;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Flight {
    private int id;
    private String departureIATA;
    private String destinationIATA;
    private String departureTime;
    private String arrivalTime;
    private String ticketPrice;
    private String currency;
    private String flightClass;

}
