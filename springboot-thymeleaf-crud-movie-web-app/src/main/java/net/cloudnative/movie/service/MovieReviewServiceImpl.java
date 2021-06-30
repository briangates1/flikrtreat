package net.cloudnative.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cloudnative.movie.model.Movie;
import net.cloudnative.movie.model.MovieReview;
import net.cloudnative.movie.repository.MovieRepository;
import net.cloudnative.movie.repository.MovieReviewRepository;

@Service
public class MovieReviewServiceImpl implements MovieReviewService{
	
	@Autowired
	private MovieReviewRepository movieReviewRepository;
	
	@Override
	public List<MovieReview> getAllMovieReviews() {
		return movieReviewRepository.findAll();
	}

	@Override
	public MovieReview getMovieReview(int userId, long movieId) {
		
		return movieReviewRepository.findAll().stream()
			.findFirst()
			.get();
		
	}

	@Override
	public void saveMovieReview(MovieReview movieReview) {
		this.movieReviewRepository.save(movieReview);
	}

}
