package com.azizbakri.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
