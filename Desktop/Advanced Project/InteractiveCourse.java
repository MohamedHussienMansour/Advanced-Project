package Course;

import java.util.ArrayList;

public class InteractiveCourse extends Course implements Payable{
	private double price;
	private String Place;
	private int seatsAvailable;
	private ArrayList<String> toolsNeeded;
	private String paymentMethod;



	

InteractiveCourse(String name, String courseId, String description, ArrayList<Quiz> quizes, ArrayList<Instructor> instructors, ArrayList<Student> students,
            ArrayList<String> content, ArrayList<String> weeklyDate, String coursePeriod, double price, String place, int seatsAvailable, ArrayList<String> toolsNeeded,String paymentMethod) {
			super(name, courseId, description, quizes, instructors, students, content, weeklyDate, coursePeriod,price);
	
			setPlace(place);
			setSeatsAvailable(seatsAvailable);
			setToolsNeeded(toolsNeeded);
			setpaymentMethod(paymentMethod);
			
}

	String getpaymentMethod() {
		return paymentMethod;
	}
    void setpaymentMethod(String paymentMethod) throws IllegalArgumentException {
	    if (Place == null || Place.isEmpty()) {
	        throw new IllegalArgumentException("Course platform cannot be null or empty.");
	    }
    	this.paymentMethod=paymentMethod;
    	
    }
	String getPlace() {
		return Place;
	}

	public int getSeatsAvailable() {
	    return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) throws IllegalArgumentException {
	    if (seatsAvailable < 0) {
	        throw new IllegalArgumentException("Price cannot be negative.");
	    }
	    this.seatsAvailable = seatsAvailable;
	}

	public ArrayList<String> getToolsNeeded() {
	    return toolsNeeded;
	}

	public void setToolsNeeded(ArrayList<String> toolsNeeded) throws IllegalArgumentException {
	    if (toolsNeeded == null) {
	        throw new IllegalArgumentException("Quizzes ArrayList cannot be null.");
	    }
	    this.toolsNeeded = new ArrayList<>(toolsNeeded);
	}
	void setPlace(String Place) throws IllegalArgumentException {
	    if (Place == null || Place.isEmpty()) {
	        throw new IllegalArgumentException("Course platform cannot be null or empty.");
	    }
	    this.Place = Place;
	}


	void setPaymentMethod(String paymentMethod) {
	    if (paymentMethod == null || paymentMethod.isEmpty()) {
	        throw new IllegalArgumentException("Payment Method cannot be null or empty.");
	    }
	    this.paymentMethod = paymentMethod;
		
	}


    @Override
    public String toString() {
        return "OnlineCourse{" +
                "name='" + name + '\'' +
                ", description='" + descrription + '\'' +
                ", quizzes=" + quizes +
                ", instructors=" + instructors +
                ", content=" + content +
                ", weeklyData=" + weeklyDate +
                ", coursePeriod=" + coursePeriod +
                ", price=" + price +
                ", Place='" + Place + '\'' +
                ", seatsAvailable='" + seatsAvailable + '\'' +
                ", toolsNeeded='" + toolsNeeded + '\''+ 
                
                '}';
    }


	public String getPaymentMethod() {
       return paymentMethod;
	}

	
}
