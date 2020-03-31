
/*Lab 3 Problem 2
  Ted Smith III 
  COSC 236-003 */

public class printMatrix{
  public static void main (String[] args){
    
    Runner(2,6);
  }
  
  public static void  Runner (int down, int up){
    for (int i = 0; i <= down; i++) {
      for (int j = 1+i; j<=up+i; j++) {
        System.out.print(j + " "); }
      System.out.println(); }
  }
}
