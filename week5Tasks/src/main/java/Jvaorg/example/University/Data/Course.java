package Jvaorg.example.University.Data;

import Jvaorg.example.University.CourseType;

public class Course {
    private long id;
    private String name;
    private int credits;
    private CourseType courseType;

    public Course(long id, String name, int credits, CourseType courseType) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.courseType = courseType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", courseType=" + courseType +
                '}';
    }
}
