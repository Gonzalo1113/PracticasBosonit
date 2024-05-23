package com.bosonit.formacion.block7crud;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException2  extends RuntimeException {
    public NotFoundException2(String message) {
        super(message);
    }
}