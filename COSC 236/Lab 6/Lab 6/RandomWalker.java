//Ted Smith III   Cosc 236 Section 003
//  Lab 6 Problem 1
import java.util.*;


public class RandomWalker {
  
private int x;
private int y;
private int steps;

public RandomWalker(){
  x = 0;
  y = 0;
}
public  RandomWalker(int initialX, int initialY){
  x = initialX;
  y = initialY;
  
}

public int getX(){
  return x;
}
public int getY(){
  return y;
}

public void move() {
  Random rand = new Random();
  
  int numDir = rand.nextInt(4);
  
  
  if (numDir == 0) {// go to the right
    x += 1;
  }
  else if (numDir == 1){ //go to the left
    x-=1;
  }
  else if (numDir == 2) {// gp up
    y += 1;
  }
  else{
    y-= 1; // go down
  }
  steps++;
  
}

public int getSteps(){
  return steps;
}
}