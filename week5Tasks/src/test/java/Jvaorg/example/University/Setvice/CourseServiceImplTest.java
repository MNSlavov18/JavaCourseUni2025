package Jvaorg.example.University.Setvice;

import Jvaorg.example.University.CourseType;
import Jvaorg.example.University.Data.Course;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseServiceImplTest {

    @Test
    void whenCourseTypesAreRequired_thenReturnZero()
    {
        //given
        Course c1 = new Course(1,"C++",6, CourseType.REQUIRED);
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
        Course c1 = new Course(1,"C++",6, CourseType.REQUIRED);
        Course c2 = new Course(2,"Java",6, CourseType.ELECTIVE);
        CourseService courseService = new CourseServiceImpl();
        //when
        // int actual =;
        //then
        //int expected =0;
        assertEquals(1,  courseService.compareCoursesByCourseType(c1, c2));
    }
}