package net.cloudnative.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.cloudnative.movie.model.Movie;
import net.cloudnative.movie.service.MovieService;

@Controller
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	// display list of movies
	@GetMapping("/browseAll")
	public String viewHomePage(Model model) {
		model.addAttribute("listMovies", movieService.getAllMovies());
		return "tablepage";
	}
	
	/*Admin functionality
	@GetMapping("/showNewMovieForm")
	public String showNewMovieForm(Model model) {
		Movie movie = new Movie();
		model.addAttribute("movie", movie);
		return "new_movie";
	}*/
	
	@GetMapping("/movieProfile")
	public String getMovieProfile(Model model) {
		Movie movie = new Movie();
		model.addAttribute("movie", movie);
		return "movieprofile";
	}
	
	@GetMapping("/userProfile")
	public String getUserProfile() {
		return "userprofile";
	}
	
	@GetMapping("/home")
	public String getHome() {
		return "homepage";
	}
	
	/*Admin Functionality:
	@PostMapping("/saveMovie")
	public String saveMovie(@ModelAttribute("movie") Movie movie) {
		//save movie to database
		movieService.saveMovie(movie);
		return "redirect:/";
	}*/

}
