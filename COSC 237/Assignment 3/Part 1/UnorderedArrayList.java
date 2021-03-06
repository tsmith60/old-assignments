// UnorderedArraylist for Part One of Program Assignment
//   Ted Smith III

//Class: UnorderedArrayList extends 
//Super class: ArrayListClass 
public class UnorderedArrayList extends ArrayListClass { 
  
  public UnorderedArrayList() { 
    super(); 
  }
  
  public UnorderedArrayList(int size) { 
    super(size); 
  }
  public void insertAt(int location, int insertItem){
    
    if (location < 0 || location >= maxSize) 
      System.err.println("The position of the item to be inserted is out of range."); 
    else if (length >= maxSize) 
      System.err.println("Cannot insert in a full list."); 
    else { 
      for (int i = length; i > location; i--) 
        list[i] = list[i - 1];  //shift right 
      list[location] = insertItem; 
      length++; 
    } 
  }
  public void insertEnd(int insertItem){
    if (length >= maxSize) 
      System.err.println("Cannot insert in a full list."); 
    else { 
      list[length] = insertItem; 
      length++; 
    } 
  }
  
  public void replaceAt(int location, int repItem){
    list[location]=repItem;
  }
  public int search(int searchItem){
    for(int i = 0; i <= length; i++){
      if(list[i]==searchItem) return i;
      
    }
    return -1;
  }
  public void remove(int removeItem){
    int l = search(removeItem);
    for (int i = l; i < length; i--){
      list[i]=list[i+1];
    }
  }
  //Bubble Sort 
  public void bubbleSort() { 
    for (int pass = 0; pass < length - 1; pass++) { 
      for (int i = 0; i < length - 1; i++) { 
        if (list[i] > list[i + 1]) { 
          int temp = list[i]; 
          list[i] = list[i + 1]; 
          list[i + 1] = temp; 
        } 
      } 
    } 
  }
  
  public void merge(UnorderedArrayList ua1, UnorderedArrayList ua2){
    clearList();
    int tot = ua1.length+ua2.length;
    
    
    for(int i = 0; i < tot; i++){
      if(i< ua1.listSize())
        insertAt(i,ua1.list[i]);
      
      else{
        insertAt(i,ua2.list[(i-ua1.length)]);
        
      }
      
    }
    
  }
  
  public void split(UnorderedArrayList ua1,UnorderedArrayList ua2, int key){
    ua1.clearList();
    ua2.clearList();
    
    int k = 0;
    
    
    
    while(length!=k){
      if(list[k]<=key){
        
        ua1.insertEnd(list[k]);
      }
      else{
        
        ua2.insertEnd(list[k]);
        
      }
      k++;
    }
    
  }
}

