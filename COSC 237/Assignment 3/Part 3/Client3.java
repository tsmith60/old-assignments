// The client of Part 3 of Program Assignment 3
// Client3 tests the merge and split methods for ArrayList<Integer>
import java.util.*;
import java.io.*;

public class Client3 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int yes = 0;
    int key;
    ArrayList<Integer> ai1 = new ArrayList<Integer>();
    ArrayList<Integer> ai2 = new ArrayList<Integer>();
    ArrayList<Integer> ai3 = new ArrayList<Integer>();
    System.out.println("Please input the name of the first file to be opened for first list: ");
    while(yes < 1){//assigns the first list to the ArrayList ai1
      try{
        Scanner console=new Scanner(new File(input.next()));
        while(console.hasNext()){
          if(!console.hasNextInt()){
            console.next();
          }
          else{
            ai1.add(console.nextInt());
          }
        }
        yes=2;
        
      }
      catch(FileNotFoundException e){
        System.out.println("The file was not found. Try entering another file name.");
      }
      
    }
    yes=0;
    System.out.println("Please input the name of the second file to be opened for second list: ");
    while(yes < 1){//assigns the second list to the ArrayList ai2
      try{
        Scanner console=new Scanner(new File(input.next()));
        while(console.hasNext()){
          if(!console.hasNextInt()){
            console.next();
          }
          else{
            ai2.add(console.nextInt());
          }
        }
        yes=2;
        
      }
      catch(FileNotFoundException e){
        System.out.println("The file was not found. Try entering another file name.");
      }
      
    }
    System.out.println("The first list is: "+ ai1);
    System.out.println("The second file is: "+ai2);
    merge(ai1,ai2,ai3);
    System.out.println("The merged list is: " +ai3);
    bubblesort(ai3);
    System.out.println("The merged list sorted is: " +ai3);
    
    System.out.println("Enter key for split: ");
    key = getInt(input);
    split(ai1,ai2,ai3,key);
    System.out.println("The first list after split is: "+ai1);
    System.out.println("The second list after split is: "+ai2);
  }
  public static void merge(ArrayList<Integer> a1,ArrayList<Integer> a2,ArrayList<Integer> a3){
    int i =0;
    
    while(i<a1.size()){
      a3.add(a1.get(i));
      i++;
    }
    i=0;
    while(i<a2.size()){
      a3.add(a2.get(i));
      i++;
    }
  }
  
  public static void bubblesort(ArrayList<Integer> a){
    for(int i = 0; i<a.size();i++){
      for(int j=0; j<a.size();j++){
        
        if(j<a.size()-1&&a.get(j)>a.get(j+1)){
          int x = a.get(j);
          a.set(j, a.get(j+1));
          a.set(j+1,x);
        }
      }
    }
  }
  
  public static void split(ArrayList<Integer> a1,ArrayList<Integer> a2,ArrayList<Integer> a3, int key){
    a1.clear();
    a2.clear();
    int i = 0;
    while(a3.get(i)<=key){
      a1.add(a3.get(i));
      i++;
    }
    while(i<a3.size()){
      a2.add(a3.get(i));
      i++;
    }
  }
  public static int getInt(Scanner input){
    while(!input.hasNextInt()){
      input.next();
      System.out.println("The value you entered was not an integer. Try again!");
    }
    return input.nextInt();
  }
}
