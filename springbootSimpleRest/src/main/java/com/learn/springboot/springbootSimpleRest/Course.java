package com.learn.springboot.springbootSimpleRest;

public class Course {
private int id;
private String course;
private String author;
public Course(int id, String course, String author) {
	super();
	this.id = id;
	this.course = course;
	this.author = author;
}
public int getId() {
	return id;
}
public String getCourse() {
	return course;
}
public String getAuthor() {
	return author;
}
@Override
public String toString() {
	return "Course [id=" + id + ", course=" + course + ", author=" + author + "]";
}


}
