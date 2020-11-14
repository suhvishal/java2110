package com.demo.exceptions;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.ValidationException;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ControllerExceptionHandler {

	@ResponseBody
	@ExceptionHandler(ValidationException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ErrorMessage exceptionHandler(ValidationException ex) {

		return new ErrorMessage("400", ex.getMessage());

	}
	
	
	@ResponseBody
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public List<FieldErrorMessage>  exceptionHandler(MethodArgumentNotValidException ex) {
		
	    List<FieldError> fieldErrors =	ex.getBindingResult().getFieldErrors();
	    List<FieldErrorMessage> list= new ArrayList<>();
	    
	    for(FieldError error : fieldErrors) {
	    	list.add(new FieldErrorMessage(error.getField(), error.getDefaultMessage()));
	    }
	    
	    return list;
		
	}

}
