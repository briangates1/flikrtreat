package net.cloudnative.movie.service;

import java.util.List;

import net.cloudnative.movie.model.Movie;

public interface MovieService {
	List<Movie> getAllMovies();
	void saveMovie(Movie movie);
}