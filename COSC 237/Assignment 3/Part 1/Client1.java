// Client for Part One of Program Assignment 3
//   Ted Smith III
import java.util.*;
import java.io.*;
public class Client1 {
  public static void main(String[] args){
    int i = 0;
    int j = 0;
    int key;
    Scanner input = new Scanner(System.in);
    
    Scanner console2 = null;
    UnorderedArrayList list_1 = new UnorderedArrayList();
    UnorderedArrayList list_2 = new UnorderedArrayList();
    UnorderedArrayList result = new UnorderedArrayList();
    System.out.println("Please input the name of the file to be opened for first list: ");
    while(i < 1){//gets the name for the 1st text file 
      try{
        Scanner console1 = new Scanner(new File(input.next()));
        while(console1.hasNext()){//makes the list from the 1st text file
          if(!console1.hasNextInt()){
            console1.next();
          }
          else{
            list_1.insertAt(j,console1.nextInt());
            j++;
          }
          
          i=2;
        }
      }
      catch(FileNotFoundException e){
        System.out.println("The file name you entered could not be found. Try again.");
        i =0;
      }
    }
    
    i=0;
    j=0;
    
    System.out.println("Please input the name of the file to be opened for second list:");
    while(i < 1){//gets the name for the 2nd text file 
      try{
        console2 = new Scanner(new File(input.next()));
        while(console2.hasNext()){//makes the list from the 2nd text file
          if(!console2.hasNextInt()){
            console2.next();
          }
          else{
            list_2.insertAt(j,console2.nextInt());
            j++;
          }
        }
        i=2;
      }
      catch(FileNotFoundException e){
        System.out.println("The file name you entered could not be found. Try again.");
        i =0;
      }
    }
    System.out.println("The first list is: ");
    list_1.print();
    System.out.println("The second list is: ");
    list_2.print();
    System.out.println("The merged list is: ");
    
    result.merge(list_1,list_2);
    result.print();
    
    System.out.println("Enter key for split: ");
    key = getInt(input);
    result.split(list_1,list_2,key);
    System.out.println("The first list after split is: ");
    list_1.print();
    System.out.println("The second list after split is: ");
    list_2.print();
    
  }
  
  public static int getInt(Scanner input){
    while(!input.hasNextInt()){
      input.next();
      System.out.println("You didn't enter an integer. Try again!! ");
    }
    return input.nextInt();
  }
}
