import java.util.Scanner;
@FunctionalInterface
interface calculator{
     int operate(int a,int b);
}
public class LFA1{
         public static void main(String [] args){
                        Scanner s= new Scanner(System.in);
                        calculator add= (a,b)-> a+b;
                        calculator sub= (a,b)-> a-b;
                        calculator multiply= (a,b)-> a*b;
                        calculator divide=(a,b)-> b!=0? a/b : 0;
                        calculator modulus=(a,b)-> b!=0? a%b : 0;
                        System.out.println("\nEnter first number: ");
                        int a= s.nextInt();
                        System.out.println("\nEnter second number: ");
                        int b= s.nextInt();
                        System.out.println("\nAddition : "+add.operate(a,b));
                        System.out.println("\nSubtraction : "+sub.operate(a,b));
                        System.out.println("\nMultiplication : "+multiply.operate(a,b));
                        System.out.println("\nDivision : "+divide.operate(a,b));
                        System.out.println("\nModulus : "+modulus.operate(a,b));
                        s.close();
         }
}
