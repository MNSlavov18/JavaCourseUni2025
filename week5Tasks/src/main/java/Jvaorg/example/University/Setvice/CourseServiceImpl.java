package Jvaorg.example.University.Setvice;

import Jvaorg.example.University.Data.Course;

public class CourseServiceImpl implements CourseService {
    @Override
    public int compareCoursesByCourseType(Course c1, Course c2)
    {
        return c1.getCourseType().compareTo(c2.getCourseType());
    }
}
