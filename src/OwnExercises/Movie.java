package OwnExercises;

public class Movie {
    private String title;
    private String director;
    private int year;
    private double rating;

    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        String output = title + " (" + year + ")," + " directed by " + director + " - " +
                "Rating: " + rating + "★";
        if (rating < 5.0) {
            return title + " is not recommended.";
        }
        if (rating >= 9.0) {
            return output + " MASTERPIECE!";
        } else {
            return output;
        }
    }

}
