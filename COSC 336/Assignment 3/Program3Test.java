//============================================================== 
//   Program 3 – Sorting Program 
//============================================================== 
// Ted Smith III
// COSC 336-001
// 11/7/2014
//-------------------------------------------------------------- 


import java.util.*;

public class Program3Test {
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Random ranGen = new Random();
    System.out.println("Start of the sorting! ");
    
    System.out.println("Start of fill with numbers from 1 - 1000.///////////////////////////////////////////\n");
    System.out.println("Sorts for 100 elements!\n");
    // //////////////////////////////////Selection Sort for 100 elements
    int[] list = new int[100];
    fill1000(list, ranGen);
    
    long startTime = System.currentTimeMillis();
    selectionSort(list);
    long stopTime = System.currentTimeMillis();
    
    
    System.out.println("\nElapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort for 100 elements
    fill1000(list, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list);
    stopTime = System.currentTimeMillis();
    
    System.out.println("\nElapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort for 100 elements
    
    fill1000(list, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort for 100 elements
    fill1000(list, ranGen);
    
    startTime = System.currentTimeMillis();
    bubbleSort(list);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick Sort for 100 elements
    fill1000(list, ranGen);
    
    startTime = System.currentTimeMillis();
    quickSort(list, 0, list.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    
    System.out.println("Sorts for 1000 elements! \n");
    // //////////////////////////////////Selection Sort for 1000 elements
    
    int[] list2 = new int[1000];
    fill1000(list2, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list2);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort for 1000  elements
    fill1000(list2, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list2);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort for 1000  elements
    
    fill1000(list2, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list2);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort for 1000 elements
    fill1000(list2, ranGen);
    
    
    startTime = System.currentTimeMillis();
    bubbleSort(list2);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick Sort for 1000  elements
    fill1000(list2, ranGen);
    
    startTime = System.currentTimeMillis();
    quickSort(list2, 0, list2.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    
    System.out.println("Sorts for 10000 elements! \n");
    // //////////////////////////////////Selection Sort for 10000  elements
    
    int[] list3 = new int[10000];
    fill1000(list3, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list3);
    stopTime = System.currentTimeMillis();
    
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort for 10000 elements
    fill1000(list3, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list3);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort for 10000 elements
    
    fill1000(list3, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list3);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort for 10000  elements
    fill1000(list3, ranGen);
    
    
    startTime = System.currentTimeMillis();
    bubbleSort(list3);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick Sort for 10000  elements
    fill1000(list3, ranGen);
    
    
    startTime = System.currentTimeMillis();
    quickSort(list3, 0, list3.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    
    
    
    System.out.println("Sorts for 100000 elements! \n");
    // //////////////////////////////////Selection Sort for 100000
    
    int[] list4 = new int[100000];
    fill1000(list4, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list4);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort
    fill1000(list4, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list4);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort
    
    fill1000(list4, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list4);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort
    fill1000(list4, ranGen);
    
    
    startTime = System.currentTimeMillis();
    bubbleSort(list4);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick SOrt
    fill1000(list4, ranGen);
    
    
    startTime = System.currentTimeMillis();
    quickSort(list4, 0, list4.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    
    System.out.println("Sorts for 1000000 elements! \n");
    // //////////////////////////////////Selection Sort for 1000000 elements
    
    int[] list5 = new int[1000000];
    fill1000(list5, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list5);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort for 1000000  elements
    fill1000(list5, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list5);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    ////////////////////////////////////// Insertion Sort for 1000000 elements
    
    fill1000(list5, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list5);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort for 1000000 elements
    fill1000(list5, ranGen);
    
    startTime = System.currentTimeMillis();
    bubbleSort(list5);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick Sort for 1000000  elements
    fill1000(list5, ranGen);
    
    startTime = System.currentTimeMillis();
    quickSort(list5, 0, list5.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    System.out.println("End of fill with numbers from 1 - 1000");
    //End of fill1000
    // /////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
    
    
    System.out.println("Start of fill with numbers from 1 - 1000000./////////////////////////////////////\n");
    System.out.println("Sorts for 100 elements!\n");
    // //////////////////////////////////Selection Sort for 100
    int[] list6 = new int[100];
    fill1000000(list6, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list6);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort for 100
    fill1000000(list6, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list6);
    stopTime = System.currentTimeMillis();
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort for 100
    
    fill1000000(list6, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list6);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort for 100
    fill1000000(list6, ranGen);
    
    startTime = System.currentTimeMillis();
    bubbleSort(list6);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick Sort for 100
    fill1000000(list6, ranGen);
    
    
    startTime = System.currentTimeMillis();
    quickSort(list6, 0, list6.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    
    System.out.println("Sorts for 1000 elements! \n");
    // //////////////////////////////////Selection Sort for 1000
    
    int[] list7 = new int[1000];
    fill1000000(list7, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list7);
    stopTime = System.currentTimeMillis();
    
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort
    fill1000000(list7, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list7);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort
    
    fill1000000(list7, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list7);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort
    fill1000000(list7, ranGen);
    
    startTime = System.currentTimeMillis();
    bubbleSort(list7);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick SOrt
    fill1000000(list7, ranGen);
    
    
    startTime = System.currentTimeMillis();
    quickSort(list7, 0, list7.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    
    System.out.println("Sorts for 10000 elements! \n");
    // //////////////////////////////////Selection Sort for 10000
    
    int[] list8 = new int[10000];
    fill1000000(list8, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list8);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort
    fill1000000(list8, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list8);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort
    
    fill1000000(list8, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list8);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort
    fill1000000(list8, ranGen);
    
    startTime = System.currentTimeMillis();
    bubbleSort(list8);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick SOrt
    fill1000000(list8, ranGen);
    
    startTime = System.currentTimeMillis();
    quickSort(list8, 0, list8.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    
    System.out.println("Sorts for 100000 elements! \n");
    // //////////////////////////////////Selection Sort for 100000
    
    int[] list9 = new int[100000];
    fill1000000(list9, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list9);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort
    fill1000000(list9, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list9);
    stopTime = System.currentTimeMillis();
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort
    
    fill1000000(list9, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list9);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort
    fill1000000(list9, ranGen);
    
    startTime = System.currentTimeMillis();
    bubbleSort(list9);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick SOrt
    fill1000000(list9, ranGen);
    
    startTime = System.currentTimeMillis();
    quickSort(list9, 0, list9.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    
    System.out.println("Sorts for 1000000 elements! \n");
    // //////////////////////////////////Selection Sort for 1000000
    
    int[] list10 = new int[1000000];
    fill1000000(list10, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list10);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort
    fill1000000(list10, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list10);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort
    
    fill1000000(list10, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list10);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort
    fill1000000(list10, ranGen);
    
    startTime = System.currentTimeMillis();
    bubbleSort(list10);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick SOrt
    fill1000000(list10, ranGen);
    
    startTime = System.currentTimeMillis();
    quickSort(list10, 0, list10.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // End of fill 1000000
    // /////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    System.out.println("Start of fill with numbers from 1 - 1000000000.//////////////////////////////////////////\n");
    System.out.println("Sorts for 100 elements! \n");
    // //////////////////////////////////Selection Sort for 100
    long[] list11 = new long[100];
    fill1000000000(list11, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list11);
    stopTime = System.currentTimeMillis();
    
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort for 100
    fill1000000000(list11, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list11);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort for 100
    
    fill1000000000(list11, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list11);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort for 100
    fill1000000000(list11, ranGen);
    
    
    startTime = System.currentTimeMillis();
    bubbleSort(list11);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick Sort for 100
    fill1000000000(list11, ranGen);
    
    
    startTime = System.currentTimeMillis();
    quickSort(list11, 0, list11.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    
    System.out.println("Sorts for 1000 elements! \n");
    // //////////////////////////////////Selection Sort for 1000
    
    long[] list12 = new long[1000];
    fill1000000000(list12, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list12);
    stopTime = System.currentTimeMillis();
    
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort
    fill1000000000(list12, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list12);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort
    
    fill1000000000(list12, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list12);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort
    fill1000000000(list12, ranGen);
    
    
    startTime = System.currentTimeMillis();
    bubbleSort(list12);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick SOrt
    fill1000000000(list12, ranGen);
    
    
    startTime = System.currentTimeMillis();
    quickSort(list12, 0, list12.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    
    System.out.println("Sorts for 10000 elements! \n");
    // //////////////////////////////////Selection Sort for 10000
    
    long[] list13 = new long[10000];
    fill1000000000(list13, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list13);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort
    fill1000000000(list13, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list13);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort
    
    fill1000000000(list13, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list13);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort
    fill1000000000(list13, ranGen);
    
    startTime = System.currentTimeMillis();
    bubbleSort(list13);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick SOrt
    fill1000000000(list13, ranGen);
    
    startTime = System.currentTimeMillis();
    quickSort(list13, 0, list13.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    
    System.out.println("Sorts for 100000 elements! \n");
    // //////////////////////////////////Selection Sort for 100000
    
    long[] list14 = new long[100000];
    fill1000000000(list14, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list14);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort
    fill1000000000(list14, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list14);
    stopTime = System.currentTimeMillis();
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort
    
    fill1000000000(list14, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list14);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort
    fill1000000000(list14, ranGen);
    
    startTime = System.currentTimeMillis();
    bubbleSort(list14);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick SOrt
    fill1000000000(list14, ranGen);
    
    startTime = System.currentTimeMillis();
    quickSort(list14, 0, list14.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    
    System.out.println("Sorts for 1000000 elements! \n");
    // //////////////////////////////////Selection Sort for 1000000
    
    long[] list15 = new long[1000000];
    fill1000000000(list15, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list15);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort
    fill1000000000(list15, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list15);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort
    
    fill1000000000(list15, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list15);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort
    fill1000000000(list15, ranGen);
    
    startTime = System.currentTimeMillis();
    bubbleSort(list15);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick SOrt
    fill1000000000(list15, ranGen);
    
    startTime = System.currentTimeMillis();
    quickSort(list15, 0, list15.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // End of fill 1000000000
    // /////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    
    
    
    System.out.println("Start of fill with numbers from 1 - 1000000000000./////////////////////////////////////////\n");
    System.out.println("Sorts for 100 elements!\n");
    // //////////////////////////////////Selection Sort for 100
    long[] list16 = new long[100];
    fill1000000000000(list16, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list16);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort for 100
    fill1000000000000(list16, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list16);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort for 100
    
    fill1000000000000(list16, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list16);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort for 100
    fill1000000000000(list16, ranGen);
    
    startTime = System.currentTimeMillis();
    bubbleSort(list16);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick Sort for 100
    fill1000000000000(list16, ranGen);
    
    
    startTime = System.currentTimeMillis();
    quickSort(list16, 0, list16.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    
    System.out.println("Sorts for 1000 elements! \n");
    // //////////////////////////////////Selection Sort for 1000
    
    long[] list17 = new long[1000];
    fill1000000000000(list17, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list17);
    stopTime = System.currentTimeMillis();
    
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort
    fill1000000000000(list17, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list17);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort
    
    fill1000000000000(list17, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list17);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort
    fill1000000000000(list17, ranGen);
    
    
    startTime = System.currentTimeMillis();
    bubbleSort(list17);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick SOrt
    fill1000000000000(list17, ranGen);
    
    
    startTime = System.currentTimeMillis();
    quickSort(list17, 0, list17.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    
    System.out.println("Sorts for 10000 elements! \n");
    // //////////////////////////////////Selection Sort for 10000
    
    long[] list18 = new long[10000];
    fill1000000000000(list18, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list18);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort
    fill1000000000000(list18, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list18);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort
    
    fill1000000000000(list18, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list18);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort
    fill1000000000000(list18, ranGen);
    
    startTime = System.currentTimeMillis();
    bubbleSort(list18);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick SOrt
    fill1000000000000(list18, ranGen);
    
    startTime = System.currentTimeMillis();
    quickSort(list18, 0, list18.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    
    System.out.println("Sorts for 100000 elements! \n");
    // //////////////////////////////////Selection Sort for 100000
    
    long[] list19 = new long[100000];
    fill1000000000000(list19, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list19);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort
    fill1000000000000(list19, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list19);
    stopTime = System.currentTimeMillis();
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort
    
    fill1000000000000(list19, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list19);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort
    fill1000000000000(list19, ranGen);
    
    startTime = System.currentTimeMillis();
    bubbleSort(list19);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick SOrt
    fill1000000000000(list19, ranGen);
    
    startTime = System.currentTimeMillis();
    quickSort(list19, 0, list19.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    
    System.out.println("Sorts for 1000000 elements! \n");
    // //////////////////////////////////Selection Sort for 1000000
    
    long[] list20 = new long[1000000];
    fill1000000000000(list20, ranGen);
    
    startTime = System.currentTimeMillis();
    selectionSort(list20);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for selection sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // /////////////////////////////////// Merge Sort
    fill1000000000000(list20, ranGen);
    
    startTime = System.currentTimeMillis();
    mergeSort(list20);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for merge sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Insertion Sort
    
    fill1000000000000(list20, ranGen);
    
    startTime = System.currentTimeMillis();
    insertionSort(list20);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for insertion sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // //////////////////////////////////// Bubble Sort
    fill1000000000000(list20, ranGen);
    
    startTime = System.currentTimeMillis();
    bubbleSort(list20);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for bubble sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // ///////////////////////////////////// Quick SOrt
    fill1000000000000(list20, ranGen);
    
    startTime = System.currentTimeMillis();
    quickSort(list20, 0, list20.length - 1);
    stopTime = System.currentTimeMillis();
    
    System.out.println("Elapsed time for quick sort was "
                         + (stopTime - startTime) + " miliseconds.\n");
    // End of fill 1000000000000
    // /////////////////////////////////////////////////////////////////////////////////////////
  }
  
  // Insertion SOrt method-------------------
  public static void insertionSort(int[] a) {
    for (int i = 1; i < a.length; i++) {
      int temp = a[i];
      int j;
      for (j = i - 1; j >= 0 && temp < a[j]; j--)
        a[j + 1] = a[j];
      a[j + 1] = temp;
    }
    
  }
  
  // Bubble sort method---------------------
  
  public static void bubbleSort(int[] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if (a[i] > a[j]) {
          swapElem(a, i, j);
        }
      }
    }
  }
  
  // Merge Sort----------------------------------------
  public static void merge(int[] result, int[] left, int[] right) {
    int i1 = 0; // index into left array
    int i2 = 0; // index into right array
    
    for (int i = 0; i < result.length; i++) {
      if (i2 >= right.length
            || (i1 < left.length && left[i1] <= right[i2])) {
        result[i] = left[i1]; // take from left
        i1++;
      } else {
        result[i] = right[i2]; // take from right
        i2++;
      }
    }
  }
  
  public static void mergeSort(int[] a) {
    if (a.length >= 2) {
      // split array into two halves
      int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
      int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
      
      // sort the two halves
      mergeSort(left);
      mergeSort(right);
      
      // merge the sorted halves into a sorted whole
      merge(a, left, right);
    }
  }
  
  // findMin method----------------------------------------
  public static int findMin(int[] a) {
    
    int min = a[0];
    for (int i = 0; i < a.length; i++) {
      
      if (a[i] < min)
        min = a[i];
    }
    return min;
    
  }
  
  // findMax method---------------------------
  public static int findMax(int[] a) {
    
    int max = a[0];
    for (int i = 0; i < a.length; i++) {
      
      if (a[i] > max)
        max = a[i];
    }
    return max;
    
  }
  
  // selectionSort method------------------------------
  public static void selectionSort(int[] a) {
    int[] newA = new int[a.length];
    for (int i = 0; i < newA.length; i++) {
      
      newA[i] = findMin(a);
      minReplace(newA[i], a);
      
    }
    for (int i = 0; i < newA.length; i++) {
      
      a[i] = newA[i];
      
    }
    
  }
  
  // minReplace method-------------------------------------
  public static void minReplace(int item, int[] a) {
    
    for (int i = 0; i < a.length; i++) {
      
      if (a[i] == item) {
        
        a[i] = findMax(a);
        i = a.length;
      }
      
    }
  }
  
  // fill1000 method--------------------------------------------
  public static void fill1000(int[] a, Random ranGen) {
    for (int i = 0; i < a.length; i++) {
      a[i] = ranGen.nextInt(1000) + 1;
    }
    
  }
  
  public static void fill1000000(int[] a, Random ranGen) {
    for (int i = 0; i < a.length; i++) {
      a[i] = ranGen.nextInt(1000000) + 1;
    }
    
  }
  
  public static void fill1000000000(long[] a, Random ranGen) {
    for (int i = 0; i < a.length; i++) {
      a[i] = ranGen.nextInt(1000000000) + 1;
    }
    
  }
  
  public static void fill1000000000000(long[] a, Random ranGen) {
    for (int i = 0; i < a.length; i++) {
      a[i] = ranGen.nextInt(1000000000) + ranGen.nextInt(1000000000) + 1;
    }
    
  }
  
  public static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
  }
  
  private static void quickSort(int[] list, int lower, int upper) {
    if (list == null || list.length == 0)
      ;
    else {
      int i = lower;
      int j = upper;
      
      int pivot = list[(lower + upper) / 2];
      
      while (i <= j) {
        
        while (list[i] < pivot) {
          i++;
        }
        while (list[j] > pivot) {
          j--;
        }
        if (i <= j) {
          
          swapElem(list, i, j);
          
          i++;
          j--;
        }
      }
      
      if (lower < j)
        quickSort(list, lower, j);
      if (i < upper)
        quickSort(list, i, upper);
    }
  }
  
  public static void swapElem(int[] list, int i, int j) {
    
    int temp = list[i];
    list[i] = list[j];
    list[j] = temp;
  }
  
  
  
  ///////////////////////////////////////////// long methods
  
  // Insertion SOrt method-------------------
  public static void insertionSort(long[] a) {
    for (int i = 1; i < a.length; i++) {
      long temp = a[i];
      int j;
      for (j = i - 1; j >= 0 && temp < a[j]; j--)
        a[j + 1] = a[j];
      a[j + 1] = temp;
    }
    
  }
  
  // Bubble sort method---------------------
  
  public static void bubbleSort(long[] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if (a[i] > a[j]) {
          swapElem(a, i, j);
        }
      }
    }
  }
  
  // Merge Sort----------------------------------------
  public static void merge(long[] result, long[] left, long[] right) {
    int i1 = 0; // index into left array
    int i2 = 0; // index into right array
    
    for (int i = 0; i < result.length; i++) {
      if (i2 >= right.length
            || (i1 < left.length && left[i1] <= right[i2])) {
        result[i] = left[i1]; // take from left
        i1++;
      } else {
        result[i] = right[i2]; // take from right
        i2++;
      }
    }
  }
  
  public static void mergeSort(long[] a) {
    if (a.length >= 2) {
      // split array into two halves
      long[] left = Arrays.copyOfRange(a, 0, a.length / 2);
      long[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
      
      // sort the two halves
      mergeSort(left);
      mergeSort(right);
      
      // merge the sorted halves into a sorted whole
      merge(a, left, right);
    }
  }
  
  // findMin method----------------------------------------
  public static long findMin(long[] a) {
    
    long min = a[0];
    for (int i = 0; i < a.length; i++) {
      
      if (a[i] < min)
        min = a[i];
    }
    return min;
    
  }
  
  // findMax method---------------------------
  public static long findMax(long[] a) {
    
    long max = a[0];
    for (int i = 0; i < a.length; i++) {
      
      if (a[i] > max)
        max = a[i];
    }
    return max;
    
  }
  
  // selectionSort method------------------------------
  public static void selectionSort(long[] a) {
    long[] newA = new long[a.length];
    for (int i = 0; i < newA.length; i++) {
      
      newA[i] = findMin(a);
      minReplace(newA[i], a);
      
    }
    for (int i = 0; i < newA.length; i++) {
      
      a[i] = newA[i];
      
    }
    
  }
  
  // minReplace method-------------------------------------
  public static void minReplace(long item, long[] a) {
    
    for (int i = 0; i < a.length; i++) {
      
      if (a[i] == item) {
        
        a[i] = findMax(a);
        i = a.length;
      }
      
    }
  }
  
  
  
  
  private static void quickSort(long[] list, int lower, int upper) {
    if (list == null || list.length == 0)
      ;
    else {
      int i = lower;
      int j = upper;
      
      long pivot = list[(lower + upper) / 2];
      
      while (i <= j) {
        
        while (list[i] < pivot) {
          i++;
        }
        while (list[j] > pivot) {
          j--;
        }
        if (i <= j) {
          
          swapElem(list, i, j);
          
          i++;
          j--;
        }
      }
      
      if (lower < j)
        quickSort(list, lower, j);
      if (i < upper)
        quickSort(list, i, upper);
    }
  }
  
  public static void swapElem(long[] list, int i, int j) {
    
    long temp = list[i];
    list[i] = list[j];
    list[j] = temp;
  }
}