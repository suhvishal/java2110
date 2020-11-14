package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entities.Movie;
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
	public Movie createMovie(@RequestBody Movie movie) {
		return this.movieService.save(movie);
	}
	
	@DeleteMapping(path = "/{movieId}")
	public Movie delete(@PathVariable("movieId") Long id) {
		return this.movieService.remove(id);
	}
	
	@PutMapping(path = "/{movieId}")
	public Movie updateMovie(@PathVariable("movieId") Long id,  @RequestBody Movie movie) {
		
		Movie m = this.movieService.getMovie(id);
		
		if(m!=null)
			m =  this.movieService.save(movie);
		
		return m;
	}

}
