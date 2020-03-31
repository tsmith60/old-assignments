// Program Assignment 4 
// Double Linked List
// Ted Smith III COSC 237-003
import java.util.*;
public class DoubleLinkedList<T> implements DoubleLinkedListADT<T> { 
  //Double linked list node class 
  public class DoubleLinkedListNode<T>  { 
    T info; 
    DoubleLinkedListNode<T> next; 
    DoubleLinkedListNode<T> back;
    
    public DoubleLinkedListNode() { 
      info = null; 
      next = null; 
      back = null; 
    }
    
    public String toString() { 
      return info.toString(); 
    } 
  }
  
  protected int count;  //number of nodes 
  protected DoubleLinkedListNode<T> first; //reference to first node 
  protected DoubleLinkedListNode<T> last;  //reference to last node 
  
  public void initializeList() { 
    first = null; 
    last = null; 
    count = 0; 
  }
  public boolean isEmptyList(){
    return first==null;
  }
  public T front(){
    return first.info;
  }
  
  public T back(){
    return last.info;
  }
  public int length(){
    return count;
  }
  public void print(){
    if(isEmptyList()){
      
    }
    else{
      System.out.print(" [head]");
      DoubleLinkedListNode<T> current =  first;
      while(current!=null){
        System.out.print(" - "+ current.info);
        current = current.next;
      }
      System.out.println(" - [tail] ");
    }
  }
  public void reversePrint(){
    
    if(isEmptyList()){
      
    }
    else{
      System.out.print(" [tail]");
      DoubleLinkedListNode<T> current =  last;
      while(current!=null){
        System.out.print(" - "+ current.info);
        current = current.back;
      }
    }
    System.out.println(" - [head] ");
  }
  public boolean search(T searchItem){
    DoubleLinkedListNode<T> current =  first;
    while(current!=null){
      if (current.info.equals(searchItem)) 
        return true; 
      else 
        current = current.next; 
    }
    return false; 
  }
  
  public void insertNode(T insertItem){
    DoubleLinkedListNode<T> current;
    DoubleLinkedListNode<T> trailCurrent = null;
    DoubleLinkedListNode<T> newNode = new DoubleLinkedListNode();;
    newNode.info = insertItem;
    newNode.next = null;
    newNode.back = null;
    boolean found;
    
    if(first == null){// checks if the list empty and assigns the value to 1st and last
      
      first=newNode;
      last = newNode;
      
    }
    else{// I used the textbook to help with this method from here and I understand all of it. 
      found=false;
      current=first;
      
      while(current!=null&!found){//searches the list for a position to put newNode
        Comparable<T> temp = (Comparable<T>) current.info;
        if(temp.compareTo(insertItem)>=0) found = true;
        else{
          trailCurrent = current;
          current = current.next;
        }
      }
      if(current==first){// the while loop would have stopped after the first loop to land here
        first.back = newNode;
        newNode.next = first;
        first =newNode;
        count++;
      }
      else{//inserts the Node in between the current node and previous node
        if(current!=null){
          trailCurrent.next = newNode;
          newNode.back = trailCurrent;
          newNode.next = current;
          current.back=newNode;
          
        }
        else{//inserts the Node at the end
          trailCurrent.next = newNode;
          newNode.back = trailCurrent;
          last = newNode;
        }
      }
    }
    
    count++;
  }
  
  public void deleteNode(T deleteItem) { 
    DoubleLinkedListNode<T> current; //variable to traverse the list 
    DoubleLinkedListNode<T> trailCurrent; //variable just before current 
    DoubleLinkedListNode<T> currentb;
    DoubleLinkedListNode<T> trailCurrentb;
    boolean found1;
    boolean found2;
    //Case 1; the list is empty 
    if ( first == null) 
      System.err.println("Cannot delete from an empty list."); 
    else { 
      //Case 2: the node to be deleted is first 
      if (first.info.equals(deleteItem)) { 
        first = first.next; 
        if (first == null)  //the list had only one node 
          last = null; 
        count--; 
      } 
      else {  //search the list for the given info 
        found1 = false; 
        found2 = false;
        trailCurrent = first; //trailCurrent points to first node 
        current = first.next; //current points to second node 
        trailCurrentb = last;
        currentb = last.back;
        while (current != null && !found1) { 
          if (current.info.equals(deleteItem)) 
            found1 = true; 
          else { 
            trailCurrent = current; 
            current = current.next; 
          }
          
        } 
        while(currentb !=null && !found2){
          if (currentb.info.equals(deleteItem)) 
            found2 = true; 
          else { 
            trailCurrentb = currentb; 
            currentb = currentb.back; 
          }
        }
        //Case 3; if found, delete the node 
        if (found1) { 
          count--; 
          trailCurrent.next = current.next; 
          if (last == current)  //node to be deleted was the last node 
            last = trailCurrent; 
        } 
        else 
          System.out.println("Item to be deleted is not in the list."); 
        if (found2) {  
          trailCurrentb.back = current.back; 
          
        } 
        
      } 
    } 
  } 
  
  public String toString(){
    DoubleLinkedListNode<T> current = first;
    String sum = " [head] - ";
    while(current!=null){
      sum += current.info + " - ";
      current = current.next;
    }
    sum+= " [tail]";
    return sum;
  }
  public String recursiveToString(){
    DoubleLinkedList<T> temp = new DoubleLinkedList<T>();
    
    String hold=" ";
    
    if(first==null){
      return "[tail]";
    }
    else{
      hold += first.info+" ";
      temp.first = first.next;
      
      
      return hold+" - "+ temp.recursiveToString();
    }
  }
  public String backwardsString(){
    DoubleLinkedListNode<T> current = last;
    String sum = " [tail] - ";
    while(current!=null){
      sum += current.info + " - ";
      current = current.back;
    }
    sum+= "[head] ";
    return sum;
  }
  public String recursiveBackwardsString(){
    DoubleLinkedList<T> temp = new DoubleLinkedList<T>();
    
    String hold=" ";
    
    if(last==first){
      return last.info + " - [head] ";
    }
    else{
      hold += last.info+" - ";
      temp.last = last.back;
      temp.first = first;
      
      return  hold+ temp.recursiveBackwardsString();
    }
  }
  public boolean equals(Object o){
    if(o instanceof DoubleLinkedList){
      DoubleLinkedList<T> dl = (DoubleLinkedList<T>) o;
      return first == dl.first;
    }
    else{
      return false;
    }
  }
  
  public void copy(DoubleLinkedList<T> otherList){
    DoubleLinkedListNode<T> current = otherList.first;
    while(current!=null){
      insertNode(current.info);
      
      current = current.next;
      count++;
    }
    first=otherList.first;
    last=otherList.last;
  }
  public void insertLast(T newItem){
    DoubleLinkedListNode newNode; //variable to create the new node 
    //create newNode 
    newNode = new DoubleLinkedListNode<T>(); 
    newNode.info = newItem;
    newNode.next = null;
    newNode.back = null;
    if (first == null) { 
      first = newNode; 
      last = newNode; 
    } 
    else { 
      last.next = newNode; 
      last = newNode;
      
    } 
    count++; 
  }
  public void reversedCopy(DoubleLinkedList<T> otherList){// Work on this more
    initializeList();
    insertNode(otherList.last.info);
    
    DoubleLinkedListNode<T> otherListtrace = otherList.last.back;
    
    while(!otherListtrace.info.equals(otherList.first.info)){
      DoubleLinkedListNode newNode= new DoubleLinkedListNode<T>();
      
      newNode.info = otherListtrace.info;
      
      if (first == null) { 
        first = newNode; 
        last = newNode; 
      } 
      else { 
        last.next = newNode; 
        newNode.back = last;
        last = newNode;
        
      } 
      count++; 
      
      otherListtrace = otherListtrace.back;
      
      
      
      
    }
    DoubleLinkedListNode newNode = new DoubleLinkedListNode<T>(); 
    
    newNode.info = otherListtrace.info;
    last.next = newNode; 
    newNode.back = last;
    last = newNode;
    count++; 
    //insertLast(otherListtrace.info);
    
    
  }
}



