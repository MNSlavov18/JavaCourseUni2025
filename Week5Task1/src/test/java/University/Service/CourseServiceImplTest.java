package University.Service;

import University.Data.Course;
import University.Data.CourseType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceImplTest {

    CourseService courseService;
    Course c1 = new Course(1,"C++",6, CourseType.REQUIRED);
    @BeforeEach
    void setUp() {
        courseService = new CourseServiceImpl();

    }

    @Test
    void whenCourseTypesAreRequired_thenReturnZero()
    {
        //given
        Course c2 = new Course(2,"Java",6, CourseType.REQUIRED);
        CourseService courseService = new CourseServiceImpl();
        //when
        // int actual =;
        //then
        //int expected =0;
        assertEquals(0,  courseService.compareCoursesByCourseType(c1, c2));
    }

    @Test
    void whenFirstCourseTypeISRequiredTheSecondIsElective_thenReturnOne()
    {
        //given
        Course c2 = new Course(2,"Java",6, CourseType.ELECTIVE);
        CourseService courseService = new CourseServiceImpl();
        //when
        // int actual =;
        //then
        //int expected =0;
        assertEquals(1,  courseService.compareCoursesByCourseType(c1, c2));
    }

    @Test

    void whenFirstCourseIsWith6CreditsAndSecondWith10Credits_thenReturn16()
    {
        Course c2 = new Course(1,"C++",10, CourseType.REQUIRED);
        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(c1);
        courses.add(c2);

        assertEquals(16,  courseService.totalCredits(courses));
    }
}