package Jvaorg.example;

import Jvaorg.example.University.CourseType;
import Jvaorg.example.University.Data.Course;
import Jvaorg.example.University.Setvice.CourseService;
import Jvaorg.example.University.Setvice.CourseServiceImpl;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course(1,"Java",3 ,CourseType.REQUIRED);
        Course c2 = new Course(2,"C++",6, CourseType.ELECTIVE);

        CourseService courseService = new CourseServiceImpl();

        System.out.println("Compare: " + courseService.compareCoursesByCourseType(c1, c2));
    }
}