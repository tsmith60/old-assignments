
//Part 2 of Program Assignment 3
//Class: OrderedArrayList extends 
//Super class: ArrayListClass 
public class OrderedArrayList extends ArrayListClass{ 
  
  public OrderedArrayList() { 
    super(); 
  }
  
  public OrderedArrayList(int size) { 
    super(size); 
  } 
  
  
  //implementation for abstract methods defined in ArrayListClass
  
  //ordered list --> binary search 
  public int search(int item) { 
    int first = 0; 
    int last = length - 1; 
    int middle = -1;
    
    while (first <= last)  { 
      middle = (first + last) / 2; 
      if (list[middle] == item) 
        return middle; 
      else 
        if (list[middle] > item) 
        last = middle - 1; 
      else 
        first = middle + 1; 
    } 
    return -1; 
  }
  
  public void insert(int item) { 
    int loc; 
    boolean found = false; 
    if (length == 0)            //list is empty 
      list[length++] = item;  //insert item and increment length 
    else if (length == maxSize) //list is full 
      System.err.println("Cannot insert in a full list."); 
    else { 
      for (loc = 0; loc < length; loc++) { 
        if (list[loc] >= item) { 
          found = true; 
          break; 
        } 
      } 
      //starting at the end, shift right 
      for (int i = length; i > loc; i--) 
        list[i] = list[i - 1]; 
      list[loc] = item; //insert in place
      length++; 
    } 
  }
  
  
  
  public void insertAt(int location, int item)  { 
    if (location < 0 || location >= maxSize) 
      System.err.println("The position of the item to be inserted is out of range."); 
    else if (length == maxSize)  //the list is full 
      System.err.println("Cannot insert in a full list."); 
    else { 
      System.out.println("Cannot do it, this is a sorted list. Doing insert in place (call to insert)."); 
      insert(item); 
    } 
  }
  
  public void insertEnd(int item) { 
    if (length == maxSize)  //the list is full 
      System.err.println("Cannot insert in a full list."); 
    else { 
      System.out.println("Cannot do it, this is a sorted list. Doing insert in place (call to insert)."); 
      insert(item); 
    } 
  }
  
  public void replaceAt(int location, int item) { 
    //the list is sorted! 
    //is actually removing the element at location and inserting item in place 
    if (location < 0 || location >= length) 
      System.err.println("The position of the item to be replaced is out of range."); 
    else { 
      removeAt(location);//method in ArrayListClass 
      insert(item); 
    } 
  }
  
  public void remove(int item) { 
    int loc; 
    if (length == 0) 
      System.err.println("Cannot delete from an empty list."); 
    else  { 
      loc = search(item); 
      if (loc != -1) 
        removeAt(loc);//method in ArrayListClass 
      else 
        System.out.println("The item to be deleted is not in the list."); 
    } 
  }
  public void merge(OrderedArrayList oa1, OrderedArrayList oa2){
    
    length = oa1.listSize()+oa2.listSize();
    
    int i = 0;
    int j = 0;
    int k = 0;
    
    while(k<length){//this while loop does all of the merging
      
      if(oa1.retrieveAt(i)<oa2.retrieveAt(j)){//if the element in oa1 is less than the element in oa2 assign it to the final list and increment i
        if(i==oa1.listSize()-1&&j!=oa2.listSize()-1){
          list[k] = oa2.retrieveAt(j);
          j++;
          while(j<oa2.length){
            k++;
            list[k]=oa2.retrieveAt(j);
            j++;
          }
        }
        if(i!=oa1.listSize()-1){
          list[k] = oa1.retrieveAt(i);
          i++;
        }
        
        
      }
      else{//else the element in oa2 is less than the element in oa1 so assign it to the final list and increment j
        if(j==oa2.listSize()-1 && i!=oa1.listSize()-1){
          list[k] = oa2.retrieveAt(j);
          while(i<oa1.length){
            k++;
            list[k]=oa1.retrieveAt(i);
            i++;
          }
        }
        if(j!=oa2.listSize()-1&&j<oa2.listSize()-1){
          list[k] = oa2.retrieveAt(j); 
          j++;
        }
        
      }
      k++;
      
    }
    
    
    
    
  }
  
  public void split(OrderedArrayList oa1,OrderedArrayList oa2, int key){
    oa1.clearList();
    oa2.clearList();
    
    int k = 0;
    
    
    
    while(length!=k){
      if(list[k]<=key){
        
        oa1.insert(list[k]);
      }
      else{
        
        oa2.insert(list[k]);
        
      }
      k++;
    }
    
  }
}