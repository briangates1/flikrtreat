package net.cloudnative.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cloudnative.movie.model.Movie;
import net.cloudnative.movie.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();

	}

	@Override
	public void saveMovie(Movie movie) {
		this.movieRepository.save(movie);
		
	}



}
