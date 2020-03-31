//Ted Smith III   Cosc 236 Section 003
//  Lab 7 Problem 1
public class UndergraduateStudent extends Student {

   private int year; 
   private int age;
   private String name;
   
   public UndergraduateStudent(String name,int age){
  super( name,  age);
  this.name = name;
  this.age = age;
  this.year = 0;
   }
   public String getName(){
     return this.name;
   }
   public int getYear(){
     return this.year;
   }
   public int getAge(){
     return this.age;
   }
   public void setAge(int age){
     this.age = age;
     this.year++;
   
   }
}