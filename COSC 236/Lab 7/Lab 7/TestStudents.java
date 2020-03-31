//Ted Smith III   Cosc 236 Section 003
//  Lab 7 Problem 1

public class TestStudents{
  public static void main (String [] args){
    
    
    
   
  
    UndergraduateStudent taiyon = new UndergraduateStudent ("Taiyon", 5);
    System.out.println(taiyon.getName());
    System.out.println(taiyon.getYear());
    System.out.println(taiyon.getAge());
    taiyon.setAge(7);
    System.out.println(taiyon.getAge());
    System.out.println(taiyon.getYear());
  }
}