
/*Lab 3 Problem 3
  Ted Smith III 
  COSC 236-003 */
public class isItEven{
  public static void main (String[] args){
    
    isBothEvenNumber(6,98);
  }
  
  public static void isBothEvenNumber(int number1, int number2){
    if ((number1%2==0)&&(number2%2==0)){
      System.out.println("true");}
    else{
      System.out.println("false");}
}
}