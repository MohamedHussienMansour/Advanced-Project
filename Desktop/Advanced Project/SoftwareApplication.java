/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworld;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

 


/**
 *
 * @author 20111
 */
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
public class SoftwareApplication extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

         try {
            // Creating five Student objects
            Student student1 = new Student("John Doe", "12345", "123 Main St", "Male", "Canada", "S123", "rich");
            Student student2 = new Student("Alice Smith", "54321", "456 Elm St", "Female", "Canada", "S456", "middle");
            Student student3 = new Student("Bob Johnson", "98765", "789 Oak St", "Male", "Canada", "S789", "poor");
            Student student4 = new Student("Emily Brown", "13579", "246 Pine St", "Female", "Canada", "S246", "middle");
            Student student5 = new Student("Michael Lee", "24680", "135 Cedar St", "Male", "Canada", "S135", "poor");

            // Creating an ArrayList of students
            ArrayList<Student> students = new ArrayList<>();
            students.add(student1);
            students.add(student2);
            students.add(student3);
            students.add(student4);
            students.add(student5);

            // Creating an ArrayList of courses
            ArrayList<OnlineCourse> courses = new ArrayList<>();
            courses.add(new OnlineCourse("Introduction to Programming", "CSE101", "Learn the basics of programming", new ArrayList<>(), new ArrayList<>(),
                                         new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), "Spring 2024", 99.99, "Udemy", "Credit Card"));
            courses.add(new OnlineCourse("Data Structures and Algorithms", "CSE201", "Explore advanced data structures and algorithms", new ArrayList<>(), new ArrayList<>(),
                                         new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), "Fall 2024", 129.99, "Coursera", "PayPal"));
            courses.add(new OnlineCourse("Machine Learning", "CSE301", "Dive into the world of machine learning", new ArrayList<>(), new ArrayList<>(),
                                         new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), "Summer 2024", 149.99, "edX", "Credit Card"));
            courses.add(new OnlineCourse("Web Development", "CSE401", "Master the art of web development", new ArrayList<>(), new ArrayList<>(),
                                         new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), "Winter 2024", 79.99, "Codecademy", "Stripe"));
            courses.add(new OnlineCourse("Cybersecurity Fundamentals", "CSE501", "Learn essential cybersecurity concepts", new ArrayList<>(), new ArrayList<>(),
                                         new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), "Spring 2025", 109.99, "LinkedIn Learning", "Credit Card"));

            // Creating some InteractiveCourse objects
            InteractiveCourse interactiveCourse1 = new InteractiveCourse("Java Programming", "CSE601", "Learn Java programming interactively", new ArrayList<>(), new ArrayList<>(),
                                                                         students, new ArrayList<>(), new ArrayList<>(), "Spring 2024", 149.99, "Online Platform A", 100,
                                                                         new ArrayList<>(), "Credit Card");
            InteractiveCourse interactiveCourse2 = new InteractiveCourse("Python Programming", "CSE602", "Learn Python programming interactively", new ArrayList<>(), new ArrayList<>(),
                                                                         students, new ArrayList<>(), new ArrayList<>(), "Fall 2024", 129.99, "Online Platform B", 150,
                                                                         new ArrayList<>(), "PayPal");
            InteractiveCourse interactiveCourse3 = new InteractiveCourse("Web Development Fundamentals", "CSE603", "Master the basics of web development interactively", new ArrayList<>(), new ArrayList<>(),
                                                                         students, new ArrayList<>(), new ArrayList<>(), "Summer 2024", 79.99, "Online Platform C", 80,
                                                                         new ArrayList<>(), "Stripe");
            ArrayList<Course> ListsOfCourses = new ArrayList<Course>(10);
            ListsOfCourses.add(interactiveCourse3);
            ListsOfCourses.add(courses.get(0));
            ListsOfCourses.add(interactiveCourse2);
            ListsOfCourses.add(courses.get(3));

            for (Course course : ListsOfCourses) {
                System.out.println(course.getName()+ " - Price: " + course.getPrice());
            }
            // Sorting the ListsOfCourses ArrayList
            Collections.sort(ListsOfCourses);
            System.out.println("#############################################################################");
            // Printing the sorted list
            for (Course course : ListsOfCourses) {
                System.out.println(course.getName()+ " - Price: " + course.getPrice());
            }
           
            // Adding a random course to each student
            Random random = new Random();
            for (Student student : students) {
                int index = random.nextInt(courses.size());
                student.addCourse(courses.get(index));

            }
            ArrayList<Chapter> Chapters=new ArrayList<Chapter>(3);
            Chapters.add(new Chapter());
            Chapters.add(new Chapter());
            Chapters.add(new Chapter());
            Quiz quiz1 = new Quiz(LocalDate.now(), Chapters, 10, true);
            Quiz quiz2 = new Quiz(LocalDate.of(2024, 5, 12), Chapters, 15, false);
            Quiz quiz3 = new Quiz(LocalDate.of(2023, 8, 20), Chapters, 20, true);
            Quiz quiz4 = new Quiz(LocalDate.of(2024, 2, 28),Chapters, 25, false);
            Quiz quiz5 = new Quiz(LocalDate.of(2025, 1, 15), Chapters, 30, true);
          ArrayList<Quiz> Quizes=new ArrayList<Quiz>(10);
          Quizes.add(quiz5);
          Quizes.add(quiz3);
          Quizes.add(quiz2);
         courses.get(0).setQuizzes(Quizes);
         System.out.println(courses.get(0).toString());

            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        launch();
    }


    @Override
    public void start(Stage primaryStage) {

        
       ArrayList<Student> Students = new ArrayList<>();
//////////////////////////////////////Student Stage///////////////////////////////////////////
    
        Stage LoginStage =new Stage();


        // Create the main pane
        VBox lv = new VBox();
        

        // Create the first HBox with background color
        HBox lh1 = new HBox();
        lh1.setBackground(new Background(new BackgroundFill(Color.rgb(255,255,255),new CornerRadii(0),new Insets(0))));
        Text StudentT=new Text("");
        StudentT.setFont(new Font(18));
        StudentT.setFill(Color.GREEN);
        StackPane lsp=new StackPane();
        lsp.getChildren().add(StudentT);
//         Optional: Add content to the first HBox
        Label lDescription=new Label("Student Part");
        lDescription.setFont(new Font(18));
        lDescription.setTextFill(Color.rgb(58, 108, 244));
         lh1.getChildren().addAll(lDescription);
         lh1.setPadding(new Insets(10,50,10,50));

        // Create the second HBox (you can add content here)
        Text lName=new Text("Name: ");
        TextField lNameField=new TextField();
        Text lId=new Text("Id: ");
        Text lIdText=new Text("");
        Text nationality=new Text("nationality: ");
        TextField nationalityField=new TextField();
        Text address=new Text("address: ");
        TextField addressField=new TextField();
        Text gender=new Text("gender: ");
        TextField genderField=new TextField();
        Text studentStatus=new Text("student Status: ");
        TextField studentStatusField=new TextField();
        
        lName.setFont(new Font(18));
        lIdText.setFont(new Font(18));
        lId.setFont(new Font(18));
        gender.setFont(new Font(18));
        nationality.setFont(new Font(18));
        address.setFont(new Font(18));
        studentStatus.setFont(new Font(18));

 



        GridPane lgridpane=new GridPane();
        Button StudentInfo=new Button("Info");
        Button SaveInfo=new Button("Save");
        Button ViewCourses =new Button("View Courses");
        Button ViewregistratedCourses =new Button("View registrated Courses");
        
        lgridpane.add(lId, 0, 0);
        lgridpane.add(lName, 0, 1);
        lgridpane.add(gender, 0, 2);
        lgridpane.add(nationality, 0, 3);
        lgridpane.add(address, 0, 4);
        lgridpane.add(studentStatus, 0, 5);

        lgridpane.add(lIdText, 1, 0);
        lgridpane.add(lNameField, 1, 1);
        lgridpane.add(genderField, 1, 2);
        lgridpane.add(nationalityField, 1, 3);
        lgridpane.add(addressField, 1, 4);
        lgridpane.add(studentStatusField, 1, 5);
        
        lgridpane.add(SaveInfo, 0, 6);
        lgridpane.add(StudentInfo, 1, 6);
        lgridpane.add(ViewCourses,0,7);
        lgridpane.add(ViewregistratedCourses,1,7);
        

        lgridpane.setVgap(20);
        lgridpane.setHgap(20);
        lgridpane.setPadding(new Insets(50));
        lgridpane.setBackground(new Background(new BackgroundFill(Color.CYAN,new CornerRadii(0),new Insets(0))));
        

        // Add both HBoxes to the VBox
        lv.getChildren().addAll(lh1, lgridpane,lsp);
//        p.getChildren().addAll(v);

        // Set the scene and stage
        Scene ls = new Scene(lv,500,800);
        LoginStage.setScene(ls);
        LoginStage.setTitle("Course Application");
//////////////////////////////////////Student Stage///////////////////////////////////////////
//////////////////////////////////////Instructor Stage///////////////////////////////////////////
        Stage InstructorStage =new Stage();


        // Create the main pane
        VBox iv = new VBox();
        

        // Create the first HBox with background color
        HBox ih1 = new HBox();
        ih1.setBackground(new Background(new BackgroundFill(Color.rgb(255,255,255),new CornerRadii(0),new Insets(0))));

//         Optional: Add content to the first HBox
        Label iDescription=new Label("Instructor Part");
        iDescription.setFont(new Font(18));
        iDescription.setTextFill(Color.rgb(58, 108, 244));
         ih1.getChildren().addAll(iDescription);
         ih1.setPadding(new Insets(10,50,10,50));

        // Create the second HBox (you can add content here)
        Text iFirstName=new Text("Name: ");
        
        Text iMI=new Text("Id: ");
        iFirstName.setFont(new Font(18));
        iMI.setFont(new Font(18));



        GridPane igridpane=new GridPane();

        igridpane.add(iFirstName, 0, 0);

        igridpane.add(iMI, 0, 1);


        igridpane.setVgap(20);
        igridpane.setHgap(20);
        igridpane.setPadding(new Insets(50));
        igridpane.setBackground(new Background(new BackgroundFill(Color.CRIMSON,new CornerRadii(0),new Insets(0))));
        

        // Add both HBoxes to the VBox
        iv.getChildren().addAll(ih1, igridpane);
//        p.getChildren().addAll(v);

        // Set the scene and stage
        Scene is = new Scene(iv,500,500);
        InstructorStage.setScene(is);
        InstructorStage.setTitle("Course Application");

//////////////////////////////////////Instructor Stage///////////////////////////////////////////
//////////////////////////////////////Courses Stage///////////////////////////////////////////
          ArrayList<OnlineCourse> OnlineCourses = new ArrayList<>();
            OnlineCourses.add(new OnlineCourse("Introduction to Programming", "CSE101", "Learn the basics of programming", new ArrayList<>(), new ArrayList<>(),
                                         new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), "Spring 2024", 99.99, "Udemy", "Credit Card"));
            OnlineCourses.add(new OnlineCourse("Data Structures and Algorithms", "CSE201", "Explore advanced data structures and algorithms", new ArrayList<>(), new ArrayList<>(),
                                         new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), "Fall 2024", 129.99, "edX", "PayPal"));
            OnlineCourses.add(new OnlineCourse("Machine Learning", "CSE301", "Dive into the world of machine learning", new ArrayList<>(), new ArrayList<>(),
                                         new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), "Summer 2024", 149.99, "Coursera", "Credit Card"));
        Stage CourseStage =new Stage();
        ArrayList<InteractiveCourse> InteractiveCourses = new ArrayList<>();
            InteractiveCourses.add(new InteractiveCourse("Java Programming", "CSE601", "Learn Java programming interactively", new ArrayList<>(), new ArrayList<>(),
                                                                         new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), "Spring 2024", 149.99, "Online Platform A", 100,
                                                                         new ArrayList<>(), "Credit Card"));
            InteractiveCourses.add(new InteractiveCourse("Python Programming", "CSE602", "Learn Python programming interactively", new ArrayList<>(), new ArrayList<>(),
                                                                         new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), "Fall 2024", 129.99, "Online Platform B", 150,
                                                                         new ArrayList<>(), "PayPal"));
            InteractiveCourses.add(new InteractiveCourse("Web Development Fundamentals", "CSE603", "Master the basics of web development interactively", new ArrayList<>(), new ArrayList<>(),
                                                                         new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), "Summer 2024", 79.99, "Online Platform C", 80,
                                                                         new ArrayList<>(), "Stripe"));


        // Create the main pane
        VBox cv = new VBox();
        
        

        // Create the first HBox with background color
        FlowPane ch1 = new FlowPane(Orientation.HORIZONTAL);
        FlowPane ch2 = new FlowPane(Orientation.HORIZONTAL);
        FlowPane ch3 = new FlowPane(Orientation.HORIZONTAL);
        ch1.setHgap(20);
        ch2.setHgap(20);
        ch3.setHgap(20);
        
                // Load the image
        Image image1 = new Image("data:image/png;base64,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"); // Replace "background.jpg" with your image path
                // Create an ImageView and set its image
        ImageView imageView1 = new ImageView(image1);
        
        // Set the desired dimensions
        double width = 100; // Width of the resized image
        double height = 120; // Height of the resized image
        
        // Resize the image
        imageView1.setFitWidth(width);
        imageView1.setFitHeight(height);
        // Set the position of the ImageView within a Pane
        double x = 100; // X-coordinate
        double y = 50;  // Y-coordinate
        imageView1.setLayoutX(x);
        imageView1.setLayoutY(y);
        
        // Create a Pane and add the ImageView to it
        Pane root1 = new Pane();
        root1.getChildren().add(imageView1);

                        // Load the image
        Image image2 =new Image("https://msatechnosoft.in/blog/wp-content/uploads/2018/09/DSA-MSA-Technosoft.png");
        ImageView imageView2 = new ImageView(image2);
        

        
        // Resize the image
        imageView2.setFitWidth(width);
        imageView2.setFitHeight(height);

        imageView2.setLayoutX(x);
        imageView2.setLayoutY(y);
        
        // Create a Pane and add the ImageView to it
        Pane root2 = new Pane();
        root2.getChildren().add(imageView2);

                        // Load the image
        Image image3=new Image("data:image/jpeg;base64,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");
        ImageView imageView3 = new ImageView(image3);
        

        
        // Resize the image
        imageView3.setFitWidth(width);
        imageView3.setFitHeight(height);
        // Set the position of the ImageView within a Pane

        imageView3.setLayoutX(x);
        imageView3.setLayoutY(y);
        
        // Create a Pane and add the ImageView to it
        Pane root3 = new Pane();
        root3.getChildren().add(imageView3);
        
        
        ch1.setBackground(new Background(new BackgroundFill(Color.rgb(255,255,255),new CornerRadii(0),new Insets(0))));
        ch2.setBackground(new Background(new BackgroundFill(Color.rgb(255,255,255),new CornerRadii(0),new Insets(0))));
        ch3.setBackground(new Background(new BackgroundFill(Color.rgb(255,255,255),new CornerRadii(0),new Insets(0))));
        ch1.setPadding(new Insets(20));
        ch2.setPadding(new Insets(20));
        ch3.setPadding(new Insets(20));
        Text Textch2_1=new Text("Name of Course: "+OnlineCourses.get(1).getName());
        Text Textch2_2=new Text("Course id: "+OnlineCourses.get(1).getCourseId());
        Text Textch2_3=new Text("Course Description:"+OnlineCourses.get(1).getDescrription());
        Text Textch2_4=new Text("Course Platform:"+OnlineCourses.get(1).getCoursePlatform());
        Text Textch2_5=new Text("Course Session:"+OnlineCourses.get(1).getDescrription());
        Text Textch2_6=new Text("Type: Online Course");
        Text Textch2_7=new Text("Course Price"+String.valueOf(OnlineCourses.get(1).getPrice()));
        
        
        Text Textch1_1=new Text("Name of Course: "+InteractiveCourses.get(0).getName());
        Text Textch1_2=new Text("Course id: "+InteractiveCourses.get(0).getCourseId());
        Text Textch1_3=new Text("Course Description:"+InteractiveCourses.get(0).getDescrription());
        Text Textch1_4=new Text("Course Platform:"+InteractiveCourses.get(0).getPlace());
        Text Textch1_5=new Text("Course Session:"+InteractiveCourses.get(0).getDescrription());
        Text Textch1_6=new Text("Type: Interactive Course");
        Text Textch1_7=new Text("Course Price"+String.valueOf((char) InteractiveCourses.get(0).getPrice()));
        
        
        Font font=new Font(17);
        Color color = Color.RED;
        
        Textch1_1.setFont(font);
        Textch1_1.setFill(color);
        
        Textch1_2.setFont(font);
        Textch1_2.setFill(color);
        
        Textch1_3.setFont(font);
        Textch1_3.setFill(color);
        
        Textch1_4.setFont(font);
        Textch1_4.setFill(color);
        Textch1_5.setFont(font);
        Textch1_5.setFill(color);
        Textch1_6.setFont(font);
        Textch1_6.setFill(color);
        Textch1_7.setFont(font);
        Textch1_7.setFill(color);
        
        
        Text Textch3_1=new Text("Name of Course: "+OnlineCourses.get(2).getName());
        Text Textch3_2=new Text("Course id: "+OnlineCourses.get(2).getCourseId());
        Text Textch3_3=new Text("Course Description:"+OnlineCourses.get(2).getDescrription());
        Text Textch3_4=new Text("Course Platform:"+OnlineCourses.get(2).getCoursePlatform());
        Text Textch3_5=new Text("Course Session:"+OnlineCourses.get(2).getDescrription());
        Text Textch3_6=new Text("Type: Online Course");
        Text Textch3_7=new Text("Course Price"+String.valueOf(OnlineCourses.get(2).getPrice()));
        
        Button ba1 =new Button("Add Course");
        Button ba2 =new Button("Add Course");
        Button ba3 =new Button("Add Course");
        Button br1 =new Button("Remove Course");
        Button br2 =new Button("Remove Course");
        Button br3 =new Button("Remove Course");
        
        ch1.getChildren().addAll(Textch1_1,Textch1_2,Textch1_3,Textch1_4,Textch1_5,Textch1_6,Textch1_7,root1,ba1,br1);
        ch2.getChildren().addAll(Textch2_1,Textch2_2,Textch2_3,Textch2_4,Textch2_5,Textch2_6,Textch2_7,root2,ba2,br2);
        ch3.getChildren().addAll(Textch3_1,Textch3_2,Textch3_3,Textch3_4,Textch3_5,Textch3_6,Textch2_7,root3,ba3,br3);
        
        ch1.setVgap(20);
        ch2.setVgap(20);
        ch3.setVgap(20);
        
        Textch2_1.setFont(font);
        Textch2_1.setFill(color);
        
        Textch2_2.setFont(font);
        Textch2_2.setFill(color);
        
        Textch2_3.setFont(font);
        Textch2_3.setFill(color);
        
        Textch2_4.setFont(font);
        Textch2_4.setFill(color);
        Textch2_5.setFont(font);
        Textch2_5.setFill(color);
        Textch2_6.setFont(font);
        Textch2_6.setFill(color);
        Textch2_7.setFont(font);
        Textch2_7.setFill(color);
        
                Textch3_1.setFont(font);
        Textch3_1.setFill(color);
        
        Textch3_2.setFont(font);
        Textch3_2.setFill(color);
        
        Textch3_3.setFont(font);
        Textch3_3.setFill(color);
        
        Textch3_4.setFont(font);
        Textch3_4.setFill(color);
        Textch3_5.setFont(font);
        Textch3_5.setFill(color);
        Textch3_6.setFont(font);
        Textch3_6.setFill(color);
        Textch3_7.setFont(font);
        Textch3_7.setFill(color);
        
                
        
        
//         Optional: Add content to the first HBox
        Label cDescription=new Label("Instructor Part");



        cv.getChildren().addAll(ch1,ch2,ch3);
        // Set the scene and stage
        Scene cs = new Scene(cv,1000,700);
        CourseStage.setScene(cs);
        CourseStage.setTitle("Course Application");


//////////////////////////////////////Courses Stage///////////////////////////////////////////
        
        
        // Create the main pane
        VBox v = new VBox();
        StackPane s=new StackPane();
        Text message=new Text("Enter Id and Your password");
        message.setFont(new Font(18));
        message.setFill(Color.GREEN);
        s.getChildren().add(message);
        // Create the first HBox with background color
        HBox h1 = new HBox();
        h1.setBackground(new Background(new BackgroundFill(Color.rgb(255,255,255),new CornerRadii(0),new Insets(0))));

//         Optional: Add content to the first HBox
        Label Description=new Label("Login Stage");
        Description.setFont(new Font(18));
        Description.setTextFill(Color.rgb(58, 108, 244));
         h1.getChildren().addAll(Description);
         h1.setPadding(new Insets(10,50,10,50));

        // Create the second HBox (you can add content here)
        Text FirstName=new Text("Name: ");
        TextField FirstNameField=new TextField();
        Text MI=new Text("Id: ");
        TextField MIField=new TextField();
        Text Password=new Text("Password: ");
        TextField PasswordField=new TextField();
        
        FirstName.setFont(new Font(18));
        MI.setFont(new Font(18));
        Password.setFont(new Font(18));

        Button Login=new Button("Add Student");
        Button  IHaveAccount=new Button("I Have Account");
 
        
        Login.setOnAction(e->{
            if (MIField.getText().isEmpty() || PasswordField.getText().isEmpty() || FirstNameField.getText().isEmpty()){
                System.out.println("You don't Enter all the fields needed");
                message.setFill(Color.RED);
                message.setText("You don't Enter all the fields needed");
                FirstNameField.clear();
                MIField.clear();
                PasswordField.clear();
                return;
            }
            boolean flag=true;
            String Id= MIField.getText();
            for (int i=0;i<Students.size();i++){
                if (Students.get(i).getId().equals(Id)){
                    System.out.println("This ID is reserved");
                    message.setFill(Color.RED);
                    message.setText("This ID is reserved");
                    flag=false;
                    break;
                }}
            if (flag){
                Students.add(new Student(FirstNameField.getText(),MIField.getText(),PasswordField.getText()));
                message.setFill(Color.GREEN);
                message.setText("Student Entered Successfully");
            }

            FirstNameField.clear();
            MIField.clear();
            PasswordField.clear();
//            Student student1 = new Student(Name, Id, "123 Main St", "Male", "Canada", "S123", "rich");
//            System.out.println(student1.getName());
//            System.out.println(student1.getNum());
        });
        int[] index={0}; 

        IHaveAccount.setOnAction(e->{
            if (MIField.getText().isEmpty() || PasswordField.getText().isEmpty()){
                System.out.println("You don't Enter all the fields needed");
                message.setFill(Color.RED);
                message.setText("You don't Enter all the fields needed");
                FirstNameField.clear();
                MIField.clear();
                PasswordField.clear();
                return;
            }
            boolean flag=true;
                
            String Id= MIField.getText();
            for (int i=0;i<Students.size();i++){
                if (Students.get(i).getId().equals(Id)){
                    flag=false;
                    if (!PasswordField.getText().equals(Students.get(i).getPassword())){
                        System.out.println("The Password is inValid Please try again");
                        message.setFill(Color.RED);
                        message.setText("The Password is inValid Please try again");
                           break;
                        
                    }
                    lIdText.setText(Students.get(i).getId());
                    LoginStage.show();
                    
                    index[0]=i;
                    break;
                }
            }
            if (flag){
                System.out.println("This Account Doesn't Exist Please try again");
                message.setFill(Color.RED);
                message.setText("This Account Doesn't Exist Please try again");}
            FirstNameField.clear();
            MIField.clear();
            PasswordField.clear();
           
            
        });
        Button IAmInstructor=new Button("I Am Instructor");
                

        IAmInstructor.setOnAction(e->{
            InstructorStage.show();
        });
        StudentInfo.setOnAction(e->{
            System.out.println(Students.get(index[0]).toString());
            StudentT.setText(Students.get(index[0]).toString());

        });
        ViewCourses.setOnAction(e->{
            CourseStage.show();
        });
        SaveInfo.setOnAction(e->{
//            try{
            if (!lNameField.getText().isEmpty()){
                Students.get(index[0]).setName(lNameField.getText());
                StudentT.setText("Data Saved");
            }
            if (!genderField.getText().isEmpty()){
                Students.get(index[0]).setGender(genderField.getText());
                StudentT.setText("Data Saved");
            }
            if(!addressField.getText().isEmpty()){
                Students.get(index[0]).setAddress(addressField.getText());
                StudentT.setText("Data Saved");
            }
            if (!nationalityField.getText().isEmpty()){
                Students.get(index[0]).setNationality(nationalityField.getText());
                StudentT.setText("Data Saved");
            }
            if(!studentStatusField.getText().isEmpty()){
                Students.get(index[0]).setStudentStatus(studentStatusField.getText());
                StudentT.setText("Data Saved");
            }
            
//            }catch (IllegalArgumentException e){
//                System.out.println("An error occurred: " + e.getMessage());
//            }
            
        });
        ba1.setOnAction(e->{
            Students.get(index[0]).addCourse(InteractiveCourses.get(0));
        });
        ba2.setOnAction(e->{
            Students.get(index[0]).addCourse(OnlineCourses.get(1));
        });
        ba3.setOnAction(e->{
            Students.get(index[0]).addCourse(OnlineCourses.get(2));
        });
        br1.setOnAction(e->{
//            try{
            Students.get(index[0]).removeCourse(InteractiveCourses.get(0));
//            }
//            catch(IllegalArgumentException e){
//StudentT.setFill(Color.RED);
//                StudentT.setText("you don't add this Course to Remove it");
//            }
        });
        br2.setOnAction(e->{
            Students.get(index[0]).removeCourse(OnlineCourses.get(1));
        });
        br3.setOnAction(e->{
            Students.get(index[0]).removeCourse(OnlineCourses.get(2));
        });
        
//        
        
        

//        HBox h2 = new HBox();
        GridPane gridpane=new GridPane();
        gridpane.add(FirstName, 0, 0);
        gridpane.add(FirstNameField, 1, 0);
        gridpane.add(MI, 0, 1);
        gridpane.add(MIField, 1, 1);
        gridpane.add(Password, 0, 2);
        gridpane.add(PasswordField, 1, 2);

        gridpane.add(Login, 1, 3);
        gridpane.add(IHaveAccount, 1, 4);
        gridpane.add(IAmInstructor, 2, 4);
        gridpane.setVgap(20);
        gridpane.setHgap(20);
        gridpane.setPadding(new Insets(50));
        gridpane.setBackground(new Background(new BackgroundFill(Color.rgb(10, 73, 246),new CornerRadii(0),new Insets(0))));
        
        
        // Add both HBoxes to the VBox
        v.getChildren().addAll(h1, gridpane,s);
//        p.getChildren().addAll(v);

        // Set the scene and stage
        Scene scene = new Scene(v,500,500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Course Application");
        primaryStage.show();
           

    }



    }   
    

