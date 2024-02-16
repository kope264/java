import java.util.Scanner;

public class project {
    public static void integrateSinFunction(int a, int b) {
                // Indefinite integration of sin(ax + b) with respect to x
                // Result: -1/a * cos(ax + b) + C, where C is the constant of integration
        
                // Display the result without decimal points
                System.out.println("The indefinite integral of sin(" + a + "x + " + b + ") with respect to x is:");
                System.out.println("-1/" + a + " * cos(" + a + "x + " + b + ") + C");
            }

     public static void integrateCosFunction(int a, int b) {
                // Indefinite integration of cos(ax + b) with respect to x
                // Result: 1/a * sin(ax + b) + C, where C is the constant of integration
                // Display the result
                System.out.println("The indefinite integral of cos(" + a + "x + " + b + ") with respect to x is: ");
                System.out.println("(1/"+a+")*sin("+a+"x+"+b+") + C");
                    }
          
        public static void integrateTanFunction(int a, int b) {
                // Indefinite integration of tan(ax + b) with respect to x
                // Result: (1/a) * log|sec(ax + b)| + C, where C is the constant of integration

                 // Display the result   
                System.out.println("The indefinite integral of tan("+a+"x+"+b+") with respect to x is:");
                System.out.println("(1/"+a+")*log|sec(" + a +"x +" + b + ")|+ C");
    }


        public static void integrateCotFunction(int a, int b) {
              // Indefinite integration of cot(ax + b) with respect to x
              // Result: (1/a) * log|sin(ax + b)| + C, where C is the constant of integration

              // Display the result
                System.out.println("The indefinite integral of cot(" + a + "x + " + b + ") with respect to x is:");
                System.out.println("(1/" + a + ") * log|sin(" + a + "x + " + b + ")| + C");
    }



    public static void integrateSecFunction(int a, int b) {
                // Indefinite integration of sec(ax + b) with respect to x
                // Result: (1/a) * log|sec(ax + b) + tan(ax + b)| + C, where C is the constant of integration
        
                // Display the result
                System.out.println("The indefinite integral of sec(" + a + "x + " + b + ") with respect to x is:");
                System.out.println("(1/" + a + ") * log|sec(" + a + "x + " + b + ") + tan(" + a + "x + " + b + ")| + C");
            }
     
            
    public static void integrateCosecFunction(int a, int b) {
                // Indefinite integration of cosec(ax + b) with respect to x
                // Result: (-1/a) * log|cosec(ax + b) + cot(ax + b)| + C, where C is the constant of integration     
                // Display the result
                 System.out.println("The indefinite integral of cosec(" + a + "x + " + b + ") with respect to x is:");
                 System.out.println("(-1/" + a + ") * log|cosec(" + a + "x + " + b + ") + cot(" + a + "x + " + b + ")| + C");
                    }        


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        System.out.println("select the type of trignomentri ratio");
        System.out.println("1.sin(ax+b)");
        System.out.println("2.cos(ax+b)");
        System.out.println("3.tan(ax+b)");
        System.out.println("4.sec(ax+b)");
        System.out.println("5.cosec(ax+b)");
        System.out.println("6.cot(ax+b)");


              // Get the values of a and b from the user
              System.out.print("Enter the value of a: ");
              int a = sc.nextInt();
      
              System.out.print("Enter the value of b: ");
              int b = sc.nextInt();

        System.out.println("enter your choice=");
        int choice= sc.nextInt();
        switch (choice){
            case 1 :
            integrateSinFunction(a, b);
            break;
        
            case 2 :
            integrateCosFunction(a, b);
            break;

            case 3 :
            integrateTanFunction(a, b);
            break;

            case 4 :
            integrateSecFunction(a,b);
            break;

            case 5 :
            integrateCosecFunction(a, b);
            break;

            case 6 :
            integrateCotFunction(a, b);
            break;

            default :
            System.out.println("choice not available");

        }
    }
}    
