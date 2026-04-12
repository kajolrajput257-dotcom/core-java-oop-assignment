  class institute { // class name
    String name;// variable declaration
    int id;
    static String institutename = "GNC INSTITUTE OF TECHNOLOGY";// static variable declaration

    institute(String name, int id) { // constructor declaration
        this.name = name;
        this.id = id;
    }
    void display() {// method declaration
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Institute Name: " + institutename);
        System.out.println("-----------------------------");// for separation of output
    }
}

public class main {// main class
    public static void main(String[] args) {// main method
        institute s1 = new institute("kajol", 101);// creating an object of the class institute and passing values to
         // the constructor
        institute s2 = new institute("riya", 102);
        s1.display();// calling the display method using the object s1
        s2.display();// calling the display method using the object s2
    }
}
