package com.bosonit.formacion.block7crudvalidation;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class UnprocessableEntityException extends Exception {
    public UnprocessableEntityException(String message) {
        super(message);
    }
}