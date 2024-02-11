package student_management_system.service;

import java.util.List;

import student_management_system.entity.Course;

public interface CourseService {
    List<Course> getAllCourses();
    Course saveCourse(Course course);
    Course getCourseByCrn(Long crn);
    Course updateCourse(Course course);
    void deleteCourseByCrn(Long crn);
}
