package com.hsk.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	
	// naming of the method has to be by convention for JPA to work without implementation
	//public List<Course> findByTopic(String topicId);
	// this won't work as the field on course entity is a class not a string
	// hence method name has to mention topicId
	public List<Course> findByTopicId(String topicId);
}
