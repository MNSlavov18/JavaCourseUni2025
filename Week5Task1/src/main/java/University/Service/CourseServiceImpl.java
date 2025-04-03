package University.Service;

import University.Data.Course;

import java.util.ArrayList;

public class CourseServiceImpl implements CourseService {
    @Override
    public int compareCoursesByCourseType(Course c1, Course c2)
    {
        return c1.getCourseType().compareTo(c2.getCourseType());
    }

    @Override
    public int totalCredits(ArrayList<Course> courses)
    {
        int totalCredits = 0;
        for(Course c : courses)
        {
            totalCredits += c.getCredits();
        }
        return totalCredits;
    }
}

