package University.Service;

import University.Data.Course;

import java.util.ArrayList;

public interface CourseService {
    int compareCoursesByCourseType(Course c1, Course c2);

    int totalCredits(ArrayList<Course> courses);
}
