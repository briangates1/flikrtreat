package net.cloudnative.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.cloudnative.movie.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
