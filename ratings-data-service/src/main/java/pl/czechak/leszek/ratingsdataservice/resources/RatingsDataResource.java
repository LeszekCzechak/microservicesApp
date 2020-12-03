package pl.czechak.leszek.ratingsdataservice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.czechak.leszek.ratingsdataservice.models.Rating;
import pl.czechak.leszek.ratingsdataservice.models.UserRating;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {

    @GetMapping("/{movieId}")
    public Rating getRating(String movieId) {
        return new Rating(movieId,4);
    }

    @GetMapping("/users/{userId}")
    public UserRating getRatingByUserId(@PathVariable String userId){
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("567", 3),
                new Rating("890", 6)
        );
        UserRating userRating = new UserRating();
        userRating.setRatings(ratings);
        return userRating;
    }
}
