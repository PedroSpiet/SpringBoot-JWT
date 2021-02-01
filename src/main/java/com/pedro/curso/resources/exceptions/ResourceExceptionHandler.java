package com.pedro.curso.resources.exceptions;

import com.pedro.curso.services.exception.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
    @ExceptionHandler(value = ObjectNotFoundException.class)
    public ResponseEntity<StandardError> ObjectNotFound(ObjectNotFoundException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError error = new StandardError(System.currentTimeMillis(), status.value(), "Not found Exception", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(error);
    }
}
