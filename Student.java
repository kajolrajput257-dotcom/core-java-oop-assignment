 //create a class
public class Student { 
  //declare the variable
    int rollno;
    String name;
    double marks;
 // create a method named
    void studentdetails() { 
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
       //create an object 
       Student s1 = new Student();
        s1.rollno = 101;
        s1.name = "kajol";
        s1.marks = 89;
        s1.studentdetails();
    }
}

