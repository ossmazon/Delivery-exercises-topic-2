package DemoPackages;

public class Tester {


    public static void Iva(double a){
        double total=+a+(a*.16);
        System.out.println("The original price is "+a+" with taxes is "+total);
    }

    public static void main(String[] args) {

            Iva(28.5);


    }
}
