package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.xml.bind.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Movie;
import com.demo.exceptions.ErrorMessage;
import com.demo.exceptions.FieldErrorMessage;
import com.demo.service.MovieService;

//@Controller
//@ResponseBody
@RestController
@RequestMapping(path = "/api/movies")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping(path = "")
	public List<Movie> getAllMovies(){
		return this.movieService.getAllMovies();
	}
	
	@GetMapping(path = "/{movieId}")
	public Movie getMovie(@PathVariable("movieId") Long id) {
		return this.movieService.getMovie(id);
	}
	
	@PostMapping(path = "")
	public Movie createMovie(@Valid @RequestBody  Movie movie) {
		
		return this.movieService.save(movie);
		
//		if(movie.getTitle()!=null && movie.getDailyRentalRate()!=null && movie.getNumberInStock()!=null) {
//			return this.movieService.save(movie);
//		}else {
//			throw new ValidationException("Movie cannot be created...");
//		}
	}
	
	
//	
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
//	public List<FieldErrorMessage>  exceptionHandler(MethodArgumentNotValidException ex) {
//		
//	    List<FieldError> fieldErrors =	ex.getBindingResult().getFieldErrors();
//	    List<FieldErrorMessage> list= new ArrayList<>();
//	    
//	    for(FieldError error : fieldErrors) {
//	    	list.add(new FieldErrorMessage(error.getField(), error.getDefaultMessage()));
//	    }
//	    
//	    return list;
//		
//	}
	
	
//	@ExceptionHandler(ValidationException.class)
//	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
//	public ErrorMessage exceptionHandler(ValidationException ex) {
//		
//		return new ErrorMessage("400", ex.getMessage());
//		
//	}
//	
	
	
	
	
	@DeleteMapping(path = "/{movieId}")
	public Movie delete(@PathVariable("movieId") Long id) {
		return this.movieService.remove(id);
	}
	
	@PutMapping(path = "/{movieId}")
	public ResponseEntity<Movie> updateMovie(@PathVariable("movieId") Long id, @Valid @RequestBody Movie movie) throws ValidationException {
		
		Movie m = this.movieService.getMovie(id);
		
		if(m!=null) {
			m =  this.movieService.save(movie);
			return new ResponseEntity<Movie>(m, HttpStatus.OK);
		}
		else {
			throw new ValidationException("movieId not found");
		}

	}

}
