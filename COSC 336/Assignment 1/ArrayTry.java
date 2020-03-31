//==============================================================
//    Program 1 – Maze Problem Program
//==============================================================
// Ted Smith III
// COSC 336-001 
// 9/29/2014

import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ArrayTry {
 public static void main(String[] args) throws FileNotFoundException {

  int x, y;
  int startX;
  int startY;
  LinkedList pathWay = new LinkedList();
  boolean flag = true;
  Stack<Integer> backup = new Stack<Integer>();//

  Stack path = new Stack();
  Scanner input = new Scanner(new File("Maze.txt"));
  Scanner ask = new Scanner(System.in);
  
  String temp;

  char[][] location = new char[20][20];
  char[][] original = new char[20][20];
  y = 0;
  System.out.println("Take a look at this maze, and choose a starting position.");
  System.out.println();
  System.out.print("     ");

  while (input.hasNextLine()) {// This reads in the maze to a double
          // array.
   temp = input.nextLine();
   for (int i = 0; i < 20; i++) {
    location[y][i] = temp.charAt(i);
   }
   y++;

  }
  // // Prints the maze
  for (int j = 0; j < 20; j++) {
   System.out.print(((j < 10) ? "0" + j : j) + "  ");
  }
  System.out.println();

  for (int i = 0; i < 20; i++) {

   System.out.print(((i < 10) ? "0" + i : i) + "");
   for (int j = 0; j < 20; j++) {
    System.out.printf("%4c", location[i][j]);

   }
   System.out.println();
  }
  // /////////// end Printing the maze
  // / Start input validation
  do {
   System.out.println("Enter you starting position. Integers should be between 1-20");
   x = getInt(ask);
   y = getInt(ask);
   if (location[y][x] == '1')
    System.out.println("This position is unavailable. Try again! \n");
  } while (location[y][x] == '1');

  // /////////////////////// end Input validation

  startY = y; // Starting coordinates
  startX = x;

  // The nested for loop copies the double array I had read the maze to.
  for (int i = 0; i < 20; i++) {
   for (int j = 0; j < 20; j++) {
    original[i][j] = location[i][j];
   }
  }
  // End of the maze copy

  do {// This do while controls the directions that the person goes in.
   if (location[y][x] == 'E' || (x == 0 && y == 0)) {// Checks to see
                // if the user's
                // starting
                // position is
                // the exit.
  
    flag = false;
   } else if (canGoLeft(location, x, y)) {// Checks if you can go left
    if (canGoRight(location, x, y)) {// The nested if statements
             // check to see if you are
     // at an intersection. If you are, it will save the
     // coordinates in
     // a stack to help you go back to that spot if you become
     // stuck, so you
     // can go in another direction. The next three else if
     // statements do the same thing,
     // but they check in a different direction in the beginning.

     backup.push(x);
     backup.push(y);

    }
    if (canGoUp(location, x, y)) {

     
     backup.push(x);
     backup.push(y);

    }
    if (canGoDown(location, x, y)) {

     
     backup.push(x);
     backup.push(y);

    }
    

    x--;// Moves the user left
    pathWay.addLast(new Point(x, y));// Saves the movement to the
             // linked list.
    location[y][x] = '1'; // This marks off the position, that user
    // went to so the user does not go down the same path again.

   } else if (canGoUp(location, x, y)) {
    if (canGoDown(location, x, y)) {

     backup.push(x);
     backup.push(y);

    }
    if (canGoRight(location, x, y)) {

     backup.push(x);
     backup.push(y);

    }
    if (canGoLeft(location, x, y)) {

     backup.push(x);
     backup.push(y);

    }

    y--;// Moves the user up
    pathWay.addLast(new Point(x, y));
    location[y][x] = '1';

   } else if (canGoRight(location, x, y)) {// This else if checks to go
             // right.
    if (canGoLeft(location, x, y)) {

     backup.push(x);
     backup.push(y);

    }
    if (canGoDown(location, x, y)) {

     backup.push(x);
     backup.push(y);

    }
    if (canGoUp(location, x, y)) {

     backup.push(x);
     backup.push(y);

    }

    x++; // Moves the user right
    pathWay.addLast(new Point(x, y));
    location[y][x] = '1';

   } else if (canGoDown(location, x, y)) {// This else if case checks
             // to go down.
    if (canGoUp(location, x, y)) {

     backup.push(x);
     backup.push(y);

    }
    if (canGoLeft(location, x, y)) {

     backup.push(x);
     backup.push(y);

    }
    if (canGoRight(location, x, y)) {

     backup.push(x);
     backup.push(y);

    }

    y++; // Moves the user down
    pathWay.addLast(new Point(x, y));
    location[y][x] = '1';

   } else {// This condition will check to see if you are stuck, or
     // need to go back to an intersection.
    if (backup.isEmpty()) {// If you come to this case, you are
          // stuck.

     flag = false;
    } else {// If you come to this, you are about to go back to the
      // most recent intersection you passed.
      // This else case will use the difference between the
      // current x and y values,
      // and the backup x and y values, to figure out
      // how many places need to be removed from the linked
      // list.
     int originalX = x;
     int originalY = y;

     y = (int) backup.peek();
     backup.pop();
     x = (int) backup.peek();

     backup.pop();
     for (int i = 1; i <= Math.abs(x - originalX); i++) {
      pathWay.removeLast();
     }
     for (int i = 1; i <= Math.abs(y - originalY); i++) {
      pathWay.removeLast();
     }

    }
   }
  } while (flag && location[y][x] != 'E'
    && (!backup.isEmpty() || !pathWay.isEmpty()));

  if (location[y][x] == 'E' || x == 0 && y == 0) {//If you can reach the exit, this case will be satisfied.
   System.out.println("I am free!!!!");
   // //// Start showing path to the exit

   int max = pathWay.size();
   for (int i = 0; i < max; i++) {
    Point tempP = (Point) pathWay.peekFirst();


    original[(int) tempP.getY()][(int) tempP.getX()] = '+';

    pathWay.removeFirst();
   }
   original[startY][startX] = 'S';
   original[0][0] = 'E';

   // ///end showing path
   // /// start printing the maze with the escape path on it.
   System.out.print("    ");
   for (int j = 0; j < 20; j++) {
    System.out.print(((j < 10) ? "0" + j : j) + "  ");
   }
   System.out.println();

   for (int i = 0; i < 20; i++) {

    System.out.print(((i < 10) ? "0" + i : i) + "");
    for (int j = 0; j < 20; j++) {
     System.out.printf("%4c", original[i][j]);

    }
    System.out.println();
   }
   // end Print original
  } else
   System.out.println("Help, I am trapped!!");// If you are trapped, you will come here.

 }

 public static int getInt(Scanner input) {// integer input validation
  int x;
  do {
   while (!input.hasNextInt()) {
    input.next();
    System.out.println("Try again! You did not enter an integer!");

   }
   x = input.nextInt();

   if (x > 19 || x < 0)
    System.out.println("Your integer is out of range. Try again. ");
  } while (x > 19 || x < 0);

  return x;
 }

 public static boolean canGoRight(char[][] loc, int x, int y) {//Checks to see if you go right.
  if (x < 19 && loc[y][x + 1] != '1') {
   return true;
  } else {
   return false;
  }
 }

 public static boolean canGoLeft(char[][] loc, int x, int y) {//Checks to see if you go left.
  if (x > 0 && loc[y][x - 1] != '1') {
   return true;
  } else {
   return false;
  }
 }

 public static boolean canGoUp(char[][] loc, int x, int y) {//Checks to see if you go up.
  if (y > 0 && loc[y - 1][x] != '1') {
   return true;
  } else {
   return false;
  }
 }

 public static boolean canGoDown(char[][] loc, int x, int y) {//Checks to see if you go down
  if (y < 19 && loc[y + 1][x] != '1') {
   return true;
  } else {
   return false;
  }
 }

 
}
