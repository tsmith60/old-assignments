public class Lab2Ass1 {
  public static void main(String[]args){
 System.out.println("Number 2 a-t");
 System.out.println( 2 + 3 * 4 - 6 + "  a."); 
 System.out.println(14 / 7 * 2 + 30 / 5 + 1 + "  b."); 
 System.out.println((12 + 3) / 4 * 2 + "  c.");
 System.out.println((238 % 10 + 3) % 7 + "  d.");
 System.out.println((18 - 7) * (43 % 10) + "  e.");
 System.out.println(2 + 19 % 5 - (11 * (5 / 2)) + "  f.");
 System.out.println(813 % 100 / 3 + 2.4 + "  g.");
 System.out.println(26 % 10 % 4 * 3 + "  h.");
 System.out.println(22 + 4 * 2 + "  i.");
 System.out.println(23 % 8 % 3 + "  j.");
 System.out.println(12 - 2 - 3 + "  k.");
 System.out.println (6/2 + 7/3 + "  l.");
 System.out.println(6 * 7 % 4 + "  m.");
 System.out.println(3 * 4 + 2 * 3 + "  n.");
 System.out.println(177 % 100 % 10 / 2 + "  o.");
 System.out.println(89 % (5 + 5) % 5 + "  p.");
 System.out.println(392 / 10 % 10 / 2 + "  q.");
 System.out.println(8 * 2 - 7 / 4 + "  r.");
 System.out.println(37 % 20 % 3 * 4 + "  s.");
 System.out.println(17 % 10 / 4 + "  t.");
 System.out.println();
// #2

 System.out.println("Number 4 a-m");
 System.out.println( 2 + 2 + 3 + 4 + "  a."); 
 System.out.println("2 + 2" + 3 + 4 + "  b."); 
 System.out.println(2 + " 2 + 3 " + 4 +"   c."); 
 System.out.println(3 + 4 + " 2 + 2" + "  d."); 
 System.out.println("2 + 2 " + (3 + 4) + "  e."); 
 System.out.println("(2 + 2) " + (3 + 4) + "  f."); 
 System.out.println("hello 34 " + 2 * 4 + "  g.");
 System.out.println(2 + "(int) 2.0" + 2 * 2 + 2 + "  h."); 
 System.out.println(4 + 1 + 9 + "." + (-3 + 10) + 11 / 3 + "  i." );
 System.out.println(8 + 6 * -2 + 4 + "0" + (2 + 5) + "  j");
 System.out.println(1 + 1 + "8 Ð 2" + (8 - 2) + 1 + 1 + "  k" ); 
 System.out.println(5 + 2 + "(1 + 1)" + 4 + 2 * 3 + "  l");
 System.out.println("1" + 2 + 3 + "4" + 5 * 6 + "7" + (8 + 9) + "  m." );
 System.out.println();
 // #4
 //#9 is in Lab2Ass1Prob9.java
 int first = 8; 
int second = 19; 
first = first + second; // 8 = 8 + 19 = 27
second = first - second;// 19 = 27 - 19 = 8
first = first - second;// 27 - 8 = 19
System.out.println("first is now " +first + " and second is now " +second);
System.out.println();
// The net effect of the code statements in these codes are to switch the values of first and second
// #12


int third = 8;
int fourth = 19;
third += fourth;// 8 + 19 = 27
fourth = third - fourth;// 27-19 = 8
third -= fourth;// 27 - 8 = 19
System.out.println("third is now " + third + " and fourth is now " +fourth);
System.out.println(); 
// #13 Rewrite the code from the previous exercise to be shorter, by declaring the variables together and by using the special 
//assignment operators (e.g., += ,Ð=, *=, and /=) as appropriate.
 
  double y;
  int x;
  x=2;
y=(x*(x*(x*(12.3 * x - 9.1) + 19.3) -4.6) + 34.2);

 System.out.println(y);
 System.out.println();
// 16. Suppose you have a real number variable x. Write a Java expression that computes the following value y while using 
//the * operator only four times:

 
 //18 is on Lab2Ass1Prob18.java
 
 
    for (int i = 1; i <= 2; i++) { 
         for (int j = 1; j <= 3; j++) { 
            for (int k = 1; k <= 4; k++) { System.out.print("*"); 
} 

} 
System.out.print("!"); 
System.out.println(); 
}

//29 What is the output of the following sequence of loops? Notice that the code is the same as that in the previous exercise, 
//   except that the placement of the braces has changed. 
 

 // The ouput is  :   ************!
//                :   ************!

// 34 is on Lab2Ass1Prob34.java 

    
  }
}