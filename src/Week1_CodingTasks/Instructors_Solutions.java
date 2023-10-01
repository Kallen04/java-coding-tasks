package Week1_CodingTasks;

public class Instructors_Solutions {

    /*
    public static void main(String[] args) {
        //Write  a method which can identifies given number is even or odd

        identifyOddEven(5);
        identifyOddEven(6);


    }

 /*   public  static  String  identifyOddEven1( int  n ) { //ternary operator
        return  n%2==0 ? "Even" : "odd" ;
    }*/



  /*  public  static  void  identifyOddEven( int  n ) {
        if(n%2==0){
            System.out.println("even");}
        else{
            System.out.println("odd");}

    }

*******************************************************************************************************************************************



    public static void main(String[] args) {
        //Write a method that can divide two numbers without using division operator

        divides(6,3);
        divides(4,2);
        divides(3,0);
        divides(0,2);

    }

    public static void divides(int num1, int num2) {
        if(num2==0) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.print(num1 +" divided by "+num2 +" is: ");
        int count =0;
        while(num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count+" and remainder is "+num1);
    }
/*This simulates the process of long division, where you repeatedly subtract the divisor (num2)
from the dividend (num1) until the dividend becomes less than the divisor.*/

/*


*****************************************************************************************************************************


public static void main(String[] args) {
        //Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
        //print "FIN" instead of the number and
        //for numbers which are a multiple of 5, print "RA" instead of the number.
        //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

        FINRA();
        }

public static void FINRA() {
        String result = "";
        for (int i = 1; i <= 30; i++) { //iterate from 1 to 30
        if (i % 5 == 0 && i % 3 == 0) //multiple of both 3 and 5, print "FINRA" instead of the number.
        result += "FINRA ";
        else if (i % 5 == 0) //multiple of 5, print "RA" instead of the number.
        result += "RA ";
        else if (i % 3 == 0)
        result += "FIN ";  //multiple of 3, print "FIN" instead of the number.
        else
        result += i + " ";
        }
        System.out.println(result);
        }

    /*
 public static void FINRA() {
     String result = "";
     for(int i=1; i <= 30; i++) {
         result += (i % 5 ==0 && i %3 ==0)? "FINRA " : (i%5 == 0) ? "RA " : (i%3 == 0) ? "FIN " : i+" ";
     }
     System.out.println(result);
 }
 */

}
