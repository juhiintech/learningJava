// class FirstClass {
//     public static void main(String args[]) {
//         System.out.println("hello world");
//     }
// }

// class FirstClass {
//     public static void main(String args[]) {
//         System.out.println("hello world with java");
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         System.out.println("*");
//         System.out.println("**");
//         System.out.println("***");
//         System.out.println("****");
//     }
// } 

// public class Main {
//     public static void main(String[] args) {
//         String name = "tony stark";
//         int age = 48;
//         double price = 25.25;
//         int a = 25;
//         int b = 18;
//     }

// }

// public class Main {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 25;
//         int sum = a+b;
//         // System.out.println(sum);
//         int diff = b - a;
//         // System.out.println(diff);
//         int mul = a*b;
//         System.out.println(mul);

//     }
// }

// package com.apnacollege;

// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }

// import java.util.*;

// public class Conditions {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if(age > 18) {
//             System.out.println("adult");
//         } else {
//             System.out.println("not Adult") ;
//         }
//     }
// }

// -------- IF ELSE -------------------

// import java.util.*;
// public static void main(String args []){
//     Scanner sc =new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();

//     if(a == b) {
//         System.out.println("Equal");
//     } else if(a>b) {

//             System.out.println("a is greater");
//         } else {
//             System.out.println("a is lesser");
//         }
//     }

//------------for Loops-------------
// loop matlab kisi chijko repeat krna bar bar.
// maanlo hame 100 bar hello world print karna hai to hame loop ka jarurt parta hai.

// public class Loops {
//     public static void main(String args[]) {
//         for(int counter = 0; counter < 100; counter = counter + 1) {
//             System.out.println("hello world");
//         }
//     }
// }

// public class Loops {
//     public static void main(String args []){
//         for(int counter = 0; counter < 11; counter++) {
//             // System.out.println(counter);
//         }
//     }
// }

// -------------- WHILE LOOP ---------------------------------
// public class Loops {
//     public static void main(String args []){
//         int i = 0;
//         while(i < 11) {
//             System.out.println(i);
//             i = i + 1;
//         }
//     }
// }

// ------------do while loop --------------------------
// public class Loops {
//     public static void main(String args []){
//         int i = 0;
//         do {
//             System.out.println(i);
//             i = i + 1;
//         } while(i < 11);
//     }
// }

// ------------function and method--------------------------
// camel case matlb printMyName

// import java.util.Scanner;

// public class Functions {
//     public static int calculationSum(int a,int b) {
//         int Sum = a + b;

//         return Sum;

//     }   
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int Sum = calculationSum(a,b);
//         System.out.println("Sum of 2 number is :"+ Sum);

//     }
// }

//---------------------------------- time and space complexity-----------------------------------
//  time and space jitna kam code utna acha hota hai.
// Arrays is a type of primitive data type.
import java.util.*;

// public class Arrays {
//     public static void main(String args[]) {
//         int[] marks = new int[3];
//         marks[0] = 97; 
//         marks[1] = 98;
//         marks[2] = 95;
//         System.out.println(marks [0]);
//         System.out.println(marks[1]);
//         System.out.println(marks[2]);
//     }
// }

// java full course 19 hours
// java ko bnaya gaya tha 1991 me.java ko sabse jyda use kiya jata hai.java ko bnaya the james gosling .java platform independent hota hai.
// public static void main(String[] args) {
//     // write your code here
//     System.out.println("Hello world");

// }

// import java.util.Scanner;

// public class Arrays {
//     public static void main(String[] args) {
//         System.out.println("taking Input From the user");
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number 2");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println("The sum of these number is");
//         System.out.println(sum);
//     }
// }

public class Arrays {
    public static void main(String[] args) {
        // question 1
        // int a = 4;
        // int b = 7;
        // int c = 6;
        // int sum = a + b + c;System.out.println(sum);

        // question 2
        // float subject1 = 45;
        // float subject2 = 95;
        // float subject3 = 48;
        // float cgpa = (subject1 + subject2 + subject3)/30;
        // System.out.println(cgpa);

        // question 3
        // System.out.println("What is your name") ;
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println("Hello" + name +"have a good day");

        // int a = 4;
        // int b = 6 - a;
        // System.out.println(b);

        // int b = 7;
        // b*= 3;
        // System.out.println(b);

        // System.out.println(6==6);
        // System.out.println(7==8);
        // System.out.println(60<4);
        // System.out.println(64>5 && 69>8);
        // System.out.println(82>5 || 8>82);

        // quick quiz
        // int x = 6;
        // int y = 1;
        // int k = x*y/2;
        // System.out.println(k);

        // int b = 7;
        // int c = 6;
        // int a = 9;
        // int k = b*b - (4*a*c) / (2*a);
        // System.out.println(k);

        // int a = 654 + 6;
        // int b = a + 7;
        // System.out.println(b);

        // increment and decrement operators
        // int i = 56;
        // int b = i++;
        // System.out.println(i++);
        // System.out.println(i);
        // System.out.println(++i);
        // System.out.println(i);

        // float a = 7/4 * 9/2;
        // System.out.println(a);

        // String name = "harry";
        // System.out.println("juhi is very beautiful girl");

        // String name = "juhi";
        // System.out.println(name.substring(1,4));
        // System.out.println(name.startsWith("har"));

        // problem 1
        // String name = "jack parker";
        // name = name.toLowerCase();
        // System.out.println(name);

        // problem 2
        // String letter = "Dear <|name|> , thanks a lot!";
        // letter = letter.replace("<|name|>" , "sachin");
        // System.out.println(letter);

        // int age = 36;
        // if (age > 18){
        // System.out.println("yes boy you can drive!");
        // }
        // else{
        // System.out.println("no boy you cannot drive yet!");
        // }

        // relational and logical operator
        // boolean a = true;
        // boolean b = true;
        // boolean c = true;
        // if (a && b) {
        // System.out.println("y");

        // }
        // else{
        // System.out.println("n");
        // }

        // switch case
        // int age = 56;
        // if (age>56) {
        // System.out.println("you are experienced!");

        // }
        // else if(age>46) {
        // System.out.println("you are semi experienced");
        // }
        // else if(age >36) {
        // System.out.println("you are semi semi experienced");
        // }
        // else{
        // System.out.println("you are not experienced");
        // }

        // int age;
        // System.out.println("enter your age");
        // Scanner sc = new Scanner(System.in);
        // age = sc.nextInt();

        // switch (age) {
        // case 18:
        // System.out.println("you are going to become an ADULT");
        // break;
        // case 23:
        // System.out.println("you are going to join a job!");
        // break;
        // case 60:
        // System.out.println("you are going to get retried!");
        // break;
        // default:
        // System.out.println("enjoy your life!");
        // }

        // ------------- WHILE LOOP -------------------
        // int i = 1;
        // while (i <= 3) {
        // System.out.println(i);
        // i++;
        // }

        // while (true) {
        // System.out.println("i am an infinite loop");
        // }

        // -------------- do while loop ---------------
        // int a = 0;
        // while (a <= 1200) {
        // System.out.println(a);
        // a++;

        // }

        // int b = 0;
        // do {
        // System.out.println(b);
        // b++;
        // } while (b < 5);

        // ---------- for loop ----------------------
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i);
        // }

        // int n = 5;
        // for (int i = 0; i < 5; i++) {
        // System.out.println(2 * i + 1);
        // }

        // break and continue statement.
        // for (int i = 0; i < 5; i++) {
        // System.out.println(i);
        // System.out.println("java is great");
        // if (i == 2) {
        // System.out.println("ending the loop");
        // break;
        // }

        // }

        // practice problem 1
        // int n = 4;
        // for (int i = 0; i < n; i--) {
        // System.out.print("*");
        // }

        // Arrays in java
        // int[] marks = new int[5];
        // marks[0] = 100;
        // marks[1] = 60;
        // marks[2] = 70;
        // marks[3] = 90;
        // marks[4] = 86;
        // System.out.println(marks[4]);

        // for each loop in java
        // int[] marks = { 98, 45, 79, 99, 80 };
        // System.out.println(marks.length);

        // Displaying the array (for loops)
        // for(int i = 0;i<marks.length;i++){
        // System.out.println(marks[i]);

        // multidimensional arrays
        // float[] marks = { 45.7f, 67.8f, 63.4f, 99.2f, 100.0f };
        // float sum = 0;
        // for (float element : marks) {
        // sum = sum + element;
        // }
        // System.out.println("the value of sum is" + sum);

        // java method
        // int a = 5;
        // int b = 7;
        // int c = (a + b) * 5;
        // System.out.println(c);

        // int a = 10;
        // int b = 5;
        // int c;
        // {
        // if (a > b) {
        // c = a + b;
        // } else {
        // c = (a + b) * 5;
        // System.out.println(c);
        // }
        // }

        // int[] marks = { 52, 73, 77, 89, 98, 94 };
        // int x = 45;
        // change(x);
        // System.out.println("the value of x after running change is: " + x);

        // method overloading
        // System.out.println("welcome to varargs tutorial");

        // Recursion in java
        // factorial(n) = n* n-1*....1
        // factorial(5) = 5*4*3*2*1 = 120

        // introduction to object oriented programming
        // dry matlb do not repeat yourself

        // oops terminology
        // 1.abstraction = hiding internal details[show only essential info!] only kaam
        // ki baat aam khao ghutliya mt gino
        // 2.encapsulation = the act of putting various components together(in a
        // capsule)
        // 3.inheritance = the act of driving new things from existing things.
        // 4.polymorphism = one entity many forms.

        // our first custom class
        System.out.println("this is our custom class");

        // int temp;
        // int c = 30;
        // int d = 40;
        // temp = c;
        // c = d;
        // d = temp;
        // System.out.println("c =" + c + "and d =" + d);

        // int temp;
        // int p = 100;
        // int q = 200;
        // temp = p;
        // p = q;
        // q = temp;
        // System.out.println("p =" + p + "and q =" + q);

        // java programming to swap two numbers
        // Example:
        // Before swapping
        // first number = 17
        // second number = 18

        // after swapping
        // first number = 18
        // second number = 17

        int a, b, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        a = sc.nextInt();
        System.out.println("\nEnter second number : ");
        b = sc.nextInt();

        temp = a;
        a = b;
        b = temp;
        System.out.println("\nfirst number =" + a);
        System.out.println("second number =" + b);

    }
}
