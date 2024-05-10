package Course;

import java.util.ArrayList;

public abstract class Course implements Comparable<Course> {
	protected String name;
	protected String courseId;
	protected String descrription; 
	protected ArrayList<Quiz> quizes;
	protected ArrayList<Instructor> instructors;
	protected ArrayList<String> content;
	protected ArrayList<String> weeklyDate;
	protected String coursePeriod;
	protected ArrayList<Student> students;
	protected double price;
	// Array of Courses
	
	protected static int no_Courses;
	public Course(String name,String courseId,String descrription,ArrayList<Quiz> quizes,ArrayList<Instructor> instructors,ArrayList<Student> students,ArrayList<String> content,ArrayList<String> weeklyDate,String coursePeriod,double price){
		setName(name);
		setDescription(descrription);
		setQuizzes(quizes);
		setInstructors(instructors);
		setContent(content);
		setWeeklyDate(weeklyDate);
		setCoursePeriod(coursePeriod);
		setCourseId(courseId);
		setStudents(students);
		setPrice(price);
		no_Courses++;
	}
	
	double getPrice() {
		return price;
	}
	public void setPrice(double price) throws IllegalArgumentException{
	    if (price < 0) {
	        throw new IllegalArgumentException("Price cannot be negative.");
	    }
	    this.price = price;
	}





	String getName() {
		return name;
	}
	String getCourseId() {
		return courseId;
	}
	String getDescrription() {
		return descrription;
	}
	ArrayList<Quiz> getQuizes() {
		return quizes;
	}
	ArrayList<Instructor> getInstructor() {
		return instructors;
	}
	ArrayList<Student> getstudents() {
		return students;
	}
	ArrayList<String> getContent() {
		return content;
	}
	
	ArrayList<String> getWeeklyDate() {
		return weeklyDate;
	}
	String getCoursePeriod() {
		return coursePeriod;
	}
	void setCourseId(String courseId) throws IllegalArgumentException {
	    if (courseId == null || courseId.isEmpty()) {
	        throw new IllegalArgumentException("Name cannot be null or empty.");
	    }
	    this.courseId = courseId;
	}
	void setName(String name) throws IllegalArgumentException {
	    if (name == null || name.isEmpty()) {
	        throw new IllegalArgumentException("Name cannot be null or empty.");
	    }
	    this.name = name;
	}

	void setDescription(String description) throws IllegalArgumentException {
	    if (description == null || description.isEmpty()) {
	        throw new IllegalArgumentException("Description cannot be null or empty.");
	    }
	    this.descrription = description;
	}

	void setQuizzes(ArrayList<Quiz> quizzes) throws IllegalArgumentException {
	    if (quizzes == null) {
	        throw new IllegalArgumentException("Quizzes ArrayList cannot be null.");
	    }
	    this.quizes = new ArrayList<>(quizzes);
	}

	void setStudents(ArrayList<Student> students) throws IllegalArgumentException {
	    if (students == null) {
	        throw new IllegalArgumentException("Instructors ArrayList cannot be null.");
	    }
	    this.students = new ArrayList<>(students);
	}
	void setInstructors(ArrayList<Instructor> instructors)  throws IllegalArgumentException{
	    if (instructors == null) {
	        throw new IllegalArgumentException("Instructors ArrayList cannot be null.");
	    }
	    this.instructors = new ArrayList<>(instructors);
	}

	void setContent(ArrayList<String> content) throws IllegalArgumentException{
	    if (content == null) {
	        throw new IllegalArgumentException("Content ArrayList cannot be null.");
	    }
	    this.content = new ArrayList<>(content);
	}

	void setWeeklyDate(ArrayList<String> weeklyDate)throws IllegalArgumentException {
	    if (weeklyDate == null) {
	        throw new IllegalArgumentException("WeeklyData ArrayList cannot be null.");
	    }
	    this.weeklyDate = new ArrayList<>(weeklyDate);
	}

	void setCoursePeriod(String coursePeriod)throws IllegalArgumentException {
	    if (coursePeriod == null) {
	        throw new IllegalArgumentException("CoursePeriods ArrayList cannot be null.");
	    }
	    this.coursePeriod = coursePeriod;
	}
	public void changeWeeklyPeriod(ArrayList<String> newWeeklyPeriod) throws IllegalArgumentException{
	    if (newWeeklyPeriod == null) {
	        throw new IllegalArgumentException("New weekly period cannot be null.");
	    }
	    this.weeklyDate = new ArrayList<>(newWeeklyPeriod);
	}
	public void addChapterToContent(String newChapter) throws IllegalArgumentException {
	    if (newChapter == null || newChapter.isEmpty()) {
	        throw new IllegalArgumentException("New chapter cannot be null or empty.");
	    }
	    if (content == null) {
	        content = new ArrayList<>();
	    }
	    content.add(newChapter);
	}
	public void removeChapterFromContent(String chapterToRemove) throws IllegalArgumentException {
	    if (chapterToRemove == null || chapterToRemove.isEmpty()) {
	        throw new IllegalArgumentException("Chapter to remove cannot be null or empty.");
	    }
	    if (content != null) {
	        content.remove(chapterToRemove);
	    }
	   
	}
	public int getChapterNumber(String chapterName) throws IllegalArgumentException {
	    if (chapterName == null || chapterName.isEmpty()) {
	        throw new IllegalArgumentException("Chapter name cannot be null or empty.");
	    }
	    if (content != null) {
	        for (int i = 0; i < content.size(); i++) {
	            if (content.get(i).equals(chapterName)) {
	                return i + 1; // Chapter numbers start from 1
	            }
	        }
	    }
	    throw new IllegalArgumentException("Chapter name not found in the content.");
	}
	@Override
	public int compareTo(Course o) {
		// TODO Auto-generated method stub
		if (this.price==o.getPrice())
			return 0;
		else if(this.price>=o.getPrice())
			return 1;
		else 
			return -1;
		
	}




	public abstract String toString();
	
	
	
	
	
	
	

}
