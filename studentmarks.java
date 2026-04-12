import java.util.Scanner;
public class studentmarks {
    int[] marks = {80,78,87,70,90};
    public static void main(String[] args) {
        studentmarks m = new studentmarks();
        for(int i=0; i<5; i++) {
            System.out.println("Marks of student " + (i+1) + ": " + m.marks[i]);
        }
    }
}