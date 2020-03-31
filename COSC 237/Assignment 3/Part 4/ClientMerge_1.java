//Program Assignment 3 Part 4 
// ClientMerge_1 tests the 1st merge method
import java.util.*; 
public class ClientMerge_1 { 
    static Scanner input = new Scanner(System.in); 
    public static void main(String[] args) { 
      UnorderedLinkedListInt list1 = new UnorderedLinkedListInt(); 
      UnorderedLinkedListInt list2 = new UnorderedLinkedListInt(); 
      UnorderedLinkedListInt list3 = new UnorderedLinkedListInt(); 
      int num; 
      System.out.println("Enter integers for the first list(999 to stop)"); 
      num = getInt(input); 
      while (num != 999) { 
        list1.insertLast((Integer) num); 
        num = getInt(input); 
      } 
      System.out.println("Enter integers for the second list(999 to stop)"); 
      num = getInt(input); 
      while (num != 999) { 
        list2.insertLast((Integer) num); 
        num = getInt(input); 
      } 
      System.out.print("\nThe first list is: "); 
      list1.print(); 
      System.out.println("\nThe length of the first list is: " + list1.length()); 
      if (!list1.isEmptyList()) { 
        System.out.println("First element/list1: " + list1.front()); 
        System.out.println("Last element/list1: "  + list1.back()); 
        
      } 
      System.out.print("\nThe second list is: "); 
      list2.print(); 
      System.out.println("\nThe length of the second list is: " + list2.length()); 
      if (!list2.isEmptyList()) { 
        System.out.println("First element/list2: " + list2.front()); 
        System.out.println("Last element/list2: "  + list2.back()); 
      } 
      list1.merge1(list2); 
      System.out.print("\nAfter concatenating the 2 lists, the merged list1 is: "); 
      list1.print(); 
      System.out.println("\nThe length of the merged list is: " + list1.length()); 
      if (!list1.isEmptyList()) { 
        System.out.println("First element/merged list: " + list1.front()); 
        System.out.println("Last element/merged list: "  + list1.back()); 
      } 
      
    } 
    public static int getInt(Scanner input){
      while(!input.hasNextInt()){
        input.next();
        System.out.println("You didn't enter an integer. Try again!! ");
      }
      return input.nextInt();
    }
}