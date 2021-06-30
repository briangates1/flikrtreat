package net.cloudnative.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.cloudnative.movie.model.Movie;
import net.cloudnative.movie.model.MovieReview;
import net.cloudnative.movie.service.MovieReviewService;
import net.cloudnative.movie.service.MovieService;

@Controller
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private MovieReviewService movieReviewService;

	
	// -------------------------------------- For the home page ---------------------------------------------------
	// display list of movies
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listMovies", movieService.getAllMovies());
		return "index";
	}
	
	
	// -------------------------------------- For the admin page---------------------------------------------------
	@GetMapping("/showNewMovieForm")
	public String showNewMovieForm(Model model) {
		Movie movie = new Movie();
		model.addAttribute("movie", movie);
		return "new_movie";
		
	}
	
	@PostMapping("/saveMovie")
	public String saveMovie(@ModelAttribute("movie") Movie movie) {
		//save movie to database
		movieService.saveMovie(movie);
		return "redirect:/";
	}
	
	
	// -------------------------------------- For the movie profile page ---------------------------------------------------
	@GetMapping("/movieProfile")
	public String viewMovieProfilePage(Model model) {
		model.addAttribute("listMovieReviews", movieReviewService.getAllMovieReviews());
		return "movie_review";
	}
	
	@GetMapping("/showNewMovieReviewForm")
	public String showNewMovieReviewForm(Model model) {
		MovieReview movieReview = new MovieReview();
		model.addAttribute("movieReview", movieReview);
		return "new_movie_review";
		
	}
	
	@PostMapping("/saveMovieReview")
	public String saveMovieReview(@ModelAttribute("movieReview") MovieReview movieReview) {
		//save movie review to database
		movieReviewService.saveMovieReview(movieReview);
		return "movie_review";
	}
	
}
