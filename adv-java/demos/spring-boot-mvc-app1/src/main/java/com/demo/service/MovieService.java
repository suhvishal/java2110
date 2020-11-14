package com.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Movie;
import com.demo.repositories.MovieRepository;

@Service
@Transactional
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;

	
	public Movie save(Movie m) {
		
		Movie movie = null;
		
		if(m.get_id() == null) {
			movie = movieRepository.save(m);
		}else {
			movie = getMovie(m.get_id());
			if(movie!=null) {
				movie.setDailyRentalRate(m.getDailyRentalRate());
				movie.setGenre(m.getGenre());
				movie.setNumberInStock(m.getNumberInStock());
				movie.setTitle(m.getTitle());
			}
		}
		
		return movie;
		
		
	}
	
	public List<Movie> getAllMovies(){
		return movieRepository.findAll();
	}
	
	public Movie getMovie(Long id) {
		Optional<Movie> optMovie =  movieRepository.findById(id);
		Movie m = null;
		if(optMovie.isPresent())
			m = optMovie.get();
		
		return m;
	}
	
	public Movie remove(Long id) {
		Movie m = getMovie(id);
		if(m!=null) {
			movieRepository.delete(m);
		}
		return m;
	}
}









