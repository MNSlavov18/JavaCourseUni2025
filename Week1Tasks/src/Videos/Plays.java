package Videos;

import Users.Author;

import java.time.LocalDate;

public class Plays {
    private final String code; //Файнал означава константа
    private String title;
    private double duration;
    private int likes;
    private boolean isChildAproved;
    private static double maxDurtation = 10;
    private LocalDate uploadDate;
    private Author author;

    public Plays(String code, String title, double duration, int likes, boolean isChildAproved) {
        this.code = code;
        this.title = title;
      setDuration(duration);
        this.likes = likes;
        this.isChildAproved = isChildAproved;
    }

    public Plays(String code, String title,double duration) {
        this.code = code;
        this.title = title;
        setDuration(duration);
    }

    public Plays(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        if (Plays.getMaxDurtation() < duration) {
            this.duration = Plays.getMaxDurtation();
        } else {
            this.duration = duration;
        }
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isChildAproved() {
        return isChildAproved;
    }

    public void setChildAproved(boolean childAproved) {
        isChildAproved = childAproved;
    }

    public static double getMaxDurtation() {
        return maxDurtation;
    }

    public static void setMaxDurtation(double maxDurtation) {
        Plays.maxDurtation = maxDurtation;
    }

    @Override
    public final String toString() { //Ако не иска да се Override се ползва final
        return "Plays{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", likes=" + likes +
                ", isChildAproved=" + isChildAproved +
                '}';
    }
}
