package com.acciojob.BookMyShowMAY.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "tickets")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticketId; //auto generated

    private LocalDate showDate; //will be taken from show class

    private LocalTime showTime; //will be taken from show class

    private String movieName; //will be taken from movie class

    private String theaterName; //taken from theater class

    private Integer totalAmt;

    @JoinColumn
    @ManyToOne
    private Show show;  //many tickets for one show

//    @JoinColumn
//    @ManyToOne
//    private User user; //many tickets booked by one user

}
