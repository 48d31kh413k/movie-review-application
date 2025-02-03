package example.com.movies;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository MovieRepository;

    public List<Movie> AllMovies() {
        return MovieRepository.findAll();
    }


    public Optional<Movie> SingleMovie(String imdbId) {
        return MovieRepository.findMovieByImdbId(imdbId);
    }
    
}
