import java.util.Scanner;//importing the scanner class to take input from the user
public class studentname {
    public static void main(String[] args) {
        String name;
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);//creating an object of the scanner class
        name = sc.nextLine();//taking input from the user
        System.out.println("original name:" +name);
        System.out.println("name in uppercase:" +name.toUpperCase());//converting the name to uppercase
        System.out.println("name in lowercase:" +name.toLowerCase());//converting the name to lowercase
        System.out.println("length of the name:" +name.length());//finding the length of the name

        sc.close();//closing the scanner object
    }
}