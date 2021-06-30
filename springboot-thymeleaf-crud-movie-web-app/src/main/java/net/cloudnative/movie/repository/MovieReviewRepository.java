package net.cloudnative.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.cloudnative.movie.model.Movie;
import net.cloudnative.movie.model.MovieReview;

@Repository
public interface MovieReviewRepository extends JpaRepository<MovieReview, Long>{

}
