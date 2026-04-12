public class Productbilling { // create a class named 
    void bill(int product1) { // create a method named bill which takes one parameter product1 of int tpye

        System.out.println("the bill for " + 1 + " products is:" + (product1));
    }

    void bill(int product1, int product2) { // create a method named bill which takes two 
    // parameters product1 and product2 of int tpye
    
        System.out.println("the bill for " + 2 + " products is:" + (product1 + product2));
    }

    void bill(int product1, int product2, int product3) { // create a method named bill which takes three
        // parameters product1, product2 and product3 of int type 
        System.out.println("the bill for " + 3 + " products is:" + (product1 + product2 + product3));
    }

    public static void main(String[] args) {
        Productbilling pb = new Productbilling();// here i create an object of the class productbilling
        pb.bill(20); // here polymorphism is used to call the method bill with different number of
                     // parameters
        pb.bill(40, 89);//
        pb.bill(90, 78, 43);

    }
}
