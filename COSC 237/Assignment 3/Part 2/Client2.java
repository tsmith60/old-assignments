//Part 2 of Program Assignment 3
//Client2 tests the merge method in the OrderedArrayList class
import java.util.*;
import java.io.*;
public class Client2 {
  public static void main(String [] args){
    int i = 0;
    int j = 0;
    int key;
    Scanner input = new Scanner(System.in);
    
    Scanner console2 = null;
    OrderedArrayList list_1 = new OrderedArrayList();
    OrderedArrayList list_2 = new OrderedArrayList();
    OrderedArrayList result = new OrderedArrayList();
    System.out.println("Please input the name of the file to be opened for first list: ");
    while(i < 1){//gets the name for the 1st text file 
      try{
        Scanner console1 = new Scanner(new File(input.next()));
        while(console1.hasNext()){//makes the list from the 1st text file
          if(!console1.hasNextInt()){
            console1.next();
          }
          else{
            list_1.insert(console1.nextInt());
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
            list_2.insert(console2.nextInt());
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
    result.merge(list_1, list_2);
    result.print();
    System.out.println("Enter key for split: ");
    key = getInt(input);
    result.split(list_1,list_2,key);
    System.out.println("The first list is: ");
    list_1.print();
    System.out.println("The second list is: ");
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
