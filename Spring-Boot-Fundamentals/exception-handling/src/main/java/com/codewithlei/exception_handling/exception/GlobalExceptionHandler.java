package com.codewithlei.exception_handling.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.time.LocalDateTime;

/* I put @RestControllerAdvice and @ExceptionHandler to
   tell Spring to intercept exceptions from all controllers.
*/
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<?> handleProductNotFound(ProductNotFoundException e){
        ErrorResponse error = new ErrorResponse(LocalDateTime.now() , 404 , e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(error);
    }
}
