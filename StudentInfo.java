class StudentInfo { 
    String name = "Kajol";
    int id = 16;
    String dresscode = "Formal";

    void generalStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Dress Code: " + dresscode);
    }
}

// Child class inheriting from StudentInfo
class CollegeStudent extends StudentInfo {
    String degree = "B.Tech";

    void showCollegeDetails() {
        System.out.println("Degree Details: " + degree);
    }
}
public class StudentInfo {
    public static void main(String[] args) {
        // Child class object 
        CollegeStudent cs = new CollegeStudent();
        
        System.out.println("--- Calling from CollegeStudent object ---");
        // Inherited methods 
        cs.generalStudent(); 
        cs.showCollegeDetails();
        
        System.out.println("------------------------------------------");
        
        // Parent class object
        StudentInfo si = new StudentInfo();
        si.generalStudent();
    }
}