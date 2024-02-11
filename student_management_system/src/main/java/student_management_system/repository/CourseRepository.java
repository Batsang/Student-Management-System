package student_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import student_management_system.entity.Course;

public interface CourseRepository extends JpaRepository<Course,Long>{

    
}