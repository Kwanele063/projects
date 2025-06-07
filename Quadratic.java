import java.util.Scanner;
public class Quadratic {

    public static void main(String[] args) {
        double a;
        double b;
         double c;
        Scanner root=new Scanner(System.in);
         System.out.print("Enter the value of a:");
      a=root.nextDouble();
     System.out.print("Enter the value of b:");
      b=root.nextDouble();
        System.out.print("Enter the value of c:");
      c=root.nextDouble();
      
      double y;
      double x1; 
      double x2;
      double base=b;
      double exponent=2;
      double k;
      k=Math.pow(base,exponent);
    y= Math.sqrt((k)-4*a*c);
    x1=(-(b)+y)/(2*a);
    x2=(-(b)-(y))/(2*a);
    System.out.println("x1="+x1);
    System.out.println("x2="+x2);

    }
              }
