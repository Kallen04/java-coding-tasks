package Week2_CodingTasks;

public class Instructors_Solutions {

    /*
    Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of
the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should
be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.



public static void solution(int N) {
String result = "";
for (int i = 1; i <= N; i++) {
if(i %2 ==0 && i%3 == 0 && i %5==0)
result += "CodilityTestCoders\n";
else if(i %2 ==0 && i%3 == 0)
result += "CodilityTest\n";
else if(i % 2==0 && i %5==0)
result += "CodilityCoders\n";
else if(i % 3 == 0 && i % 5 ==0)
result +="TestCoders\n";
else if(i % 2 ==0)
result += "Codility\n";
else if (i % 5 == 0)
result += "Coders\n";
else if (i % 3 == 0)
result += "Test\n";
else
result += i + "\n";
}

System.out.println(result);





*****************************************************************************************************************************

        Swap two variable' values without using a third variable

//Solution 1:


public static void swaptwonumbers1(int a, int b){


a = a +b;
b = a - b;
a = a - b;
 }



//Solution 2:
public static void swaptwonumbers2(int a, int b){

//here a and b should not be 0

a = a*b;
b = a/b;
a = a/b;


}



*****************************************************************************************************************************
Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
ex:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

Solution 1:
public static void main(String[] args) {
String divisibleBy15 ="";
String divisibleBy5 ="";
String divisibleBy3="";
int[] arr = new int[100];
for(int i=0; i < arr.length; i++)
arr[i] = i+1;

for(int each: arr) {
if(each %15==0 && each %3==0)
divisibleBy15+= each+" ";
if(each %5==0 && each % 15!=0)
divisibleBy5 += each+" ";
if(each%3==0 && each %15!=0)
divisibleBy3 += each+" ";
}
System.out.println("Divisible By 15: "+divisibleBy15);
System.out.println("Divisible By 5: "+divisibleBy5);
System.out.println("Divisible By 3: "+divisibleBy3);
}

Solution 2:
public static void main(String[] args) {
String divisibleBy15 ="";
String divisibleBy5 ="";
String divisibleBy3="";
List<Integer> list = new ArrayList<Integer>();
for(int i=0; i < 100; i++)
list.add(i+1);

for(int each: list) {
if(each %15==0 && each %3==0)
divisibleBy15+= each+" ";
if(each %5==0 && each % 15!=0)
divisibleBy5 += each+" ";
if(each%3==0 && each %15!=0)
divisibleBy3 += each+" ";
}
System.out.println("Divisible By 15: "+divisibleBy15);
System.out.println("Divisible By 5: "+divisibleBy5);
System.out.println("Divisible By 3: "+divisibleBy3);
}


     */
}
