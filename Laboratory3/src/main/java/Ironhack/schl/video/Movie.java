package Ironhack.schl.video;

public class Movie extends Video {
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nRating: " + rating;

    }

}