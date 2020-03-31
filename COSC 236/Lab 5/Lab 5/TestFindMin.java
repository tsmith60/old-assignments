// Ted Smith III   Cosc 236 Section 003
//  Lab 5 Problem 3

public class TestFindMin {
    public static void main(String[] args) {
        int[] a1 = {16, 12, 25, 44};
        
        int[] a2 = {587, 23, 8975, 19};
        
        int[] a3 = {42};
        System.out.println(findMin(a1));  // 12
        System.out.println(findMin(a2));  // 19
        System.out.println(findMin(a3));  // 42
    }
    public static int findMin(int[] list){
      int minVal = 999999;
        for (int i = 0; i <list.length; i++){
        if (minVal > list[i]) {
          
          minVal = list[i];
          
        }
      }
    return minVal;
    }
}

