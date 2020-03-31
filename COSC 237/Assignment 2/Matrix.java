//    Assignment2 Question 2 Class Matrix 
//        Ted Smith III   COSC 237-003


import java.util.Random;
public class Matrix { 
    public static final int MAX = 20;

    private int size; 
    private int[][] table = new int[MAX][MAX];

    public Matrix() {
         size = 0;
    } 
    public Matrix(int s) {
         size =  s;
    } 
    public int getSize() {
         return size;
    } 
    public int getElement(int r, int c) {
         return table[r][c];
    } 
    public void setElement(int r, int c, int value) {
         table[r][c] = value;
    } 
    public void init(int low, int up) {
         Random rand = new Random();
        
         for (int i = 0; i <= size-1; i++){
           for (int j = 0; j <= size-1; j++){
             table[i][j] = rand.nextInt(up-low+1)+low;
            
           }
          
         }
    } 
    public void print() {
         for (int i = 0; i <= size-1; i++){
           for (int j = 0; j <= size-1; j++){
             System.out.printf("%4d",table[i][j]);
           }
           System.out.println();
         }
    } 
    public Matrix add(Matrix a){
         Matrix sum = new Matrix(size);
         for (int i = 0; i <= size-1; i++){
           for (int j = 0; j <= size-1; j++){
             sum.table[i][j] = table[i][j] + a.table[i][j]; 
             
           }
           
         }
         return sum;
    } 
    public Matrix subtract(Matrix a) {
         Matrix diff = new Matrix(size);
         for (int i = 0; i <= size-1; i++){
           for (int j = 0; j <= size-1; j++){
             diff.table[i][j] = table[i][j] - a.table[i][j]; 
             
           }
           
         }
         return diff;
    } 
    public Matrix multiply(Matrix a) {
         Matrix prod = new Matrix(size);
         for (int i = 0; i < size; i++){
           for (int j = 0; j < size; j++){
             
             prod.table[i][j] = 0;
             
             for (int k = 0; k < size; k++){
               
               prod.table[i][j] += table[i][k] * a.table[k][j]; 
               
             }
           }
         }
         return prod;
    } 
    public Matrix multiplyConst(int whatConst) {
         Matrix prodc = new Matrix(size);
         for (int i = 0; i < size; i++){
           for (int j = 0; j < size; j++){
             prodc.table[i][j] = table[i][j] * whatConst; 
           }
         }
         return prodc;
    } 
    public Matrix transpose() {
         Matrix trans = new Matrix(size);
         for (int i = 0; i < size; i++){
           for (int j = 0; j < size; j++){
             trans.table[i][j] = table[j][i]; 
             
           }
         }
         return trans;
    } 
    public int trace() {
         int sum = 0;
        
         for (int i = 0; i <= size-1; i++){
          
           sum += table[i][i];
         }
         return sum;
    } 
    public boolean equals(Matrix a){
         for (int i = 0; i < size; i++){
           for (int j = 0; j < size; j++){
             
             if( table[i][j]!=a.table[i][j]) return false; 
           
           }
         }
         return true;
    } 
    public void copy(Matrix a) {
         for (int i = 0; i < size; i++){
           for (int j = 0; j < size; j++){
             
             table[i][j] = a.table[i][j]; 
           
           }
         }
    } 
    public Matrix getCopy() {
         Matrix copy = new Matrix(size);
         for (int i = 0; i < size; i++){
           for (int j = 0; j < size; j++){
             copy.table[i][j] = table[i][j]; 
            
           }
         }
         return copy;
    } 
}
////////////////////End of the Source Code for the Matrix Class