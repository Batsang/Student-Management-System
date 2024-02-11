package student_management_system.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import student_management_system.entity.Course;
import student_management_system.repository.CourseRepository;
import student_management_system.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

    CourseRepository courseRepository;
    

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course getCourseByCrn(Long crn) {
        return courseRepository.findById(crn).get();
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourseByCrn(Long crn) {
        courseRepository.deleteById(crn);
    }

    
    
    
}
