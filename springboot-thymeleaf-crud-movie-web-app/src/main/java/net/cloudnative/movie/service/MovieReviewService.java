package net.cloudnative.movie.service;

import java.util.List;

import net.cloudnative.movie.model.Movie;
import net.cloudnative.movie.model.MovieReview;

public interface MovieReviewService {
	List<MovieReview> getAllMovieReviews();
	MovieReview getMovieReview(int userId, long moveId);
	void saveMovieReview(MovieReview movieReview);
}