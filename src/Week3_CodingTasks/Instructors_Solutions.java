package Week3_CodingTasks;

public class Instructors_Solutions {

    /*
    public class reverseNegative {
    public static void main(String[] args) {
        reverse1(-83);
    }
    private static void reverse1(int num) {

        String result = "";
        String s = String.valueOf(num);

        for (int i = s.length()-1; i >=0 ; i--) {
            result += s.charAt(i);

        }
        String s1 = "-" + result.substring(0,result.length()-1);

        System.out.println(Integer.valueOf(s1));

    }
}

public class reverseNegativeNumber {
    //Write a return method that can reverse negative number and return it as int

    public static void main(String[] args) {

        System.out.println(reverseNum(-5367));
    }

    public static int reverseNum(int  num) {

        String str = new StringBuilder(""+num).reverse().toString();

        if(num < 0) {
            str = "-"+str.substring(0, str.length()-1);
        }

        return Integer.valueOf(str);
    }
}



Solution:
public static boolean primeNumber(int num) {

   if(num <= 1){
       return false;
   }

   for(int i = 2; i < num; i++) {
       if(num % i == 0) {
           return false;
       }
   }

   return true;

}
     */
}
