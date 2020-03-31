public class Lab2Ass3{
  public static void main (String[]args){
    
    Line();
    UpperPyr();
    LowerPyr();
    Line();
    LowerPyr();
    UpperPyr();
    Line();
      
  }
  public static void Line(){
    System.out.print("+");
    for (int i = 1; i <= 9;i++){
      System.out.print("-");
    }
    System.out.println("+");
    
  }
  
  public static void UpperPyr(){
    for( int line = 1; line <=4; line++){
      System.out.print("|");
        for (int space=1; space<=5-line;space++) {
          System.out.print(" ");}
        for(int slash = 1; slash<=line-1;slash++){
          System.out.print("/");}
        System.out.print("*");
        for (int bslash=1; bslash<=line-1;bslash++){
          System.out.print("\\");}
        for (int space=1;space<=5-line;space++) {
          System.out.print(" ");}
          System.out.println("|");
        
    }
  }
    public static void LowerPyr(){
      for( int line = 1; line <=4; line++){
      System.out.print("|");
        for (int space=1; space<=line;space++) {
          System.out.print(" ");}
        for(int slash = 1; slash<=4-line;slash++){
          System.out.print("\\");}
        System.out.print("*");
        for (int bslash=1; bslash<=4-line;bslash++){
          System.out.print("/");}
        for (int space=1;space<=line;space++) {
          System.out.print(" ");}
          System.out.println("|");
      }
}
}

// Lab 2 Assignment 3 Problem 3