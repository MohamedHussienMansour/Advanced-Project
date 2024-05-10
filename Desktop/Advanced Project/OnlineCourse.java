package Course;

import java.util.ArrayList;

public class OnlineCourse extends Course implements Payable{
	
	private String coursePlatform;

	private String paymentMethod;
	

	OnlineCourse(String name,String courseId, String descrription, ArrayList<Quiz> quizes, ArrayList<Instructor> instructors,ArrayList<Student> students,
			ArrayList<String> content, ArrayList<String> weeklyDate, String coursePeriod,double price,String coursePlatform,String paymentMethod) {
		super(name,courseId,descrription, quizes, instructors,students, content, weeklyDate, coursePeriod,price);
		// TODO Auto-generated constructor stub
		
		setCoursePlatform(coursePlatform);
		
	}
	

	void setPaymentMethod(String paymentMethod) {
	    if (paymentMethod == null || paymentMethod.isEmpty()) {
	        throw new IllegalArgumentException("Payment Method cannot be null or empty.");
	    }
	    this.paymentMethod = paymentMethod;
		
	}


	String getCoursePlatform() {
		return coursePlatform;
	}

	void setCoursePlatform(String coursePlatform) throws IllegalArgumentException {
	    if (coursePlatform == null || coursePlatform.isEmpty()) {
	        throw new IllegalArgumentException("Course platform cannot be null or empty.");
	    }
	    this.coursePlatform = coursePlatform;
	}

	public void setPrice(double price) throws IllegalArgumentException{
	    if (price < 0) {
	        throw new IllegalArgumentException("Price cannot be negative.");
	    }
	    this.price = price;
	}


    @Override
    public String toString() {
        return "OnlineCourse{" +
                "name='" + name + '\'' +
                ", course id='"+courseId+'\''+
                ", description='" + descrription + '\'' +
                ", quizzes=" + quizes +
                ", students=" + students +
                ", instructors=" + instructors +
                ", content=" + content +
                ", weeklyData=" + weeklyDate +
                ", coursePeriod=" + coursePeriod +
                ", price=" + price +
                ", coursePlatform='" + coursePlatform + '\'' +
                '}';
    }


	public String getPaymentMethod() {
	       return paymentMethod;
		}


	
}
