//Ted Smith III   Cosc 236 Section 003
//  Program Assignment 2 Problem 1


import java.io.*;
import java.util.*;
import java.awt.*;

public class Midterms {
  public static void main (String [] args)  
    throws FileNotFoundException{
   
    Scanner input = new Scanner(new File("midterm.txt"));
    
    int [] score = new int [20];
    int [] count = new int [20];
    String [] name = new String [20];
    int sum = 0; int min = 999999999; int max = 0;
    int [] xcol = new int[6];
    Color ted = new Color(40,255,80);
    Color ted1 = new Color(0,156,255);
    for (int i = 0; i < 20; i++){
      count [i] = input.nextInt();
      name [i] = input.next();
      score [i] = input.nextInt();
      
      if (score[i] < min){
        min = score[i];
      }
      else{
      }
      if(score[i]>max){
        max = score[i];
      }
      else{
      }
      sum += score[i];
      System.out.print(" " + count[i] + " " + name[i]+ "");
      System.out.println(score[i]);
    } 
    System.out.println("Avg :"+ ((double)sum/20));
    System.out.println("Max :" +max);
    System.out.println("Min :" +min);
   DrawingPanel panel = new DrawingPanel(800,800);
   Graphics t = panel.getGraphics();
   panel.setBackground(ted1);
   for(int i =0; i <= 6; i++){
     for (int k = 0; k <1; k++){
   t.drawLine(40,80+(i*80),500,80+(i*80));// makes the graph lines
   t.drawString(" "+(6-i),25,85+(i*80));// labels the numbers on y axis
   t.drawLine(50+(i*75),560,50+(i*75),570); // I made the x axis
   
     }
     
   }
   for (int i = 0; i < 20; i++){
   if ((score[i]<=100) && (score[i]>=96)){
     xcol[5]++;
   }
   if((score[i]<=95)&& (score[i]>=91)){
     xcol[4]++;
   }
   if((score[i]<=90)&& (score[i]>=86)){
     xcol[3]++;
   }
   if((score[i]<=85)&& (score[i]>=81)){
     xcol[2]++;
   }
   if((score[i]<=80)&& (score[i]>=76)){
     xcol[1]++;
   }
   if((score[i]<=75)&&(score[i]>=71)){
     xcol[0]++;
   }
   else{
   }
   }
   System.out.print(Arrays.toString(xcol));
   System.out.print(Arrays.toString(score));
   t.drawLine(50,80,50,570);// makes the actual vertical axis
   for (int i = 0; i<6; i++){
     t.setColor(ted);
     t.fillRect(60+(i*75),560-(80*xcol[i]),50,(xcol[i]*80));
     
   }
   t.setColor(Color.BLACK);
   t.drawString("71 ~ 75",60, 580);
   t.drawString("76 ~ 80",135, 580);
   t.drawString("81 ~ 85",210, 580);
   t.drawString("86 ~ 90",285, 580);
   t.drawString("91 ~ 95", 360, 580);
   t.drawString("96 ~ 100", 435, 580);
   t.drawString("Sum:  " + sum,530,430);
   t.drawString("Avg:  " + ((double)sum/20),530, 450);
   t.drawString("Max:  " + max,530, 470);
   t.drawString("Min:  " + min,530, 490);
  }
  
}