// Ted Smith III   Cosc 236 Section 003
//  Lab 5 Problem 5


public class TestIsSorted {
    public static void main(String[] args) {
        double[] a1 = {16.1, 25.3, 12.2, 44.4};
        double[] a2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
        double[] a3 = {42.0};
        System.out.println(isSorted(a1));  // false
        System.out.println(isSorted(a2));  // true
        System.out.println(isSorted(a3));  // true
    }
    public static boolean isSorted(double [] test){
      int count = 0;
      for (int i = 0; i <= test.length-2; i++){
        int k = i+1;
          
          if (test[i]<test[k]) count++;
        }
      
      if (count == test.length-1 || test.length == 1) {
        
        return true;
       
      }
      else {
       
        return false;
      }
 }
}