//    Assignment2 Question 1 Class ComplexNumber 
//        Ted Smith III   COSC 237-003

import java.util.*;
public class ComplexNumber {
    private double real;
    private double imagine;
 
    public ComplexNumber(){
         real = 0;
         imagine = 0;
    }
 
    public ComplexNumber(double a, double b){
         real = a;
         imagine = b;
    }
    public ComplexNumber read(Scanner input){
  
         System.out.print("Enter complex number (real imaginary): ");
     
         while (!input.hasNextDouble()){
       
           input.next();
           System.out.println("Not double! Try again!");
         }
     
         real = Math.abs(input.nextDouble());
         
         while (!input.hasNextDouble()){
           
           input.next();
           System.out.println("Not double! Try again!");
         }
         
         imagine =  Math.abs(input.nextDouble());
         
         ComplexNumber cn = new ComplexNumber(real,imagine);
         return cn;
  }
 
    public void print(){
         System.out.printf("(%.02f,%.02f)",real,imagine);
    }
    public double getReal(){
          return real;
    }
    public double getImaginary(){
         return imagine;
    }
    public boolean equals(ComplexNumber cn){
         return real==cn.real&&imagine ==cn.imagine;
    }
    public void copy(ComplexNumber cn){
         real=cn.real;
         imagine = cn.real;
    }
    public ComplexNumber getCopy(){
         ComplexNumber cn = new ComplexNumber(real,imagine);
         return cn;
    }
    public String toString(){
         return String.format("(%.02f, %.02f)",real,imagine);
    }
    public ComplexNumber add(ComplexNumber cn){
         double rr = real + cn.real;
         double ii = imagine + cn.imagine;
         return new ComplexNumber(rr,ii);
  
    }
    public ComplexNumber subtract(ComplexNumber cn){
          double rr = real - cn.real;
          double ii = imagine - cn.imagine;
          return new ComplexNumber(rr,ii);
    }
    public ComplexNumber multiply(ComplexNumber cn){
          double rr = real * cn.real - imagine * cn.imagine;
          double ii = real * cn.imagine + imagine*cn.real;
          return new ComplexNumber(rr,ii);
    }
    public ComplexNumber divide(ComplexNumber cn){
          double rr = (real * cn.real + imagine * cn.imagine)/(cn.real*cn.real + cn.imagine*cn.imagine);
          double ii = (imagine * cn.real - real * cn.imagine)/(cn.real*cn.real + cn.imagine*cn.imagine);
          return new ComplexNumber(rr,ii);
    }
    public double cAbs(){
          return Math.sqrt(real*real+imagine*imagine);
    }
 
}
////////////////////End of the Source Code for the ComplexNumber class