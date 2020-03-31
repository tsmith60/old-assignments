//Ted Smith III   Cosc 236 Section 003
//  Lab 6 Problem 2

public class Rectangle {
  int x;
  int y;
  int width;
  int height;
  
  public Rectangle(int x1, int y1, int width1,int height1){
    
    x = x1;
    y = y1;
    width = width1;
    height = height1;
    
    
    
  }
  
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
  public  int getWidth(){
    return width;
  }
  public int getHeight(){
    return height;
  }
  public String toString() {
    return "Rectangle[x="+x+",y ="+y+",width ="+width+", height = " +height + "]";
    
  }
 
  public Rectangle getIntersect(Rectangle rect){//here is where my question start
    if ((rect.x < x)&&(rect.y < y)){
      int z = rect.x + rect.width;
      width = z - x;
      int a = rect.y + rect.height;
      height = a-y;
      
      
      
      return this;
    }
    if ((rect.x==x)&(rect.y==y)&&(width == rect.width)&&(height == rect.height)){
      return this;
    }
    if ((x<rect.x)&&(y<rect.y)){
      int z = x + width;
      width = z-rect.x;
      height = rect.height;
      x = rect.x;
      y = rect.y;
      return this;
    }
    else{
      x = 0;
      y = 0;
      width = 0;
      height = 0;
      return this;
    }
      
  }
  public boolean equals(Rectangle rect2){
    if ((rect2.x == x)&&(rect2.y==y)&& (rect2.width==width)&&(rect2.height==height)){
      return true;
    }
    else{
      return false;
    }
   }
   public boolean contains(int x2, int y2){
    if ((x2<x)&&(y2<y)) {
      return true;}
    else{
      return false;}
  
  }
}