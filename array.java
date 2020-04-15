import java.util.ArrayList;
import java.util.Scanner;
public class array {
  public static void main(String[] args) { 
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the size of matrix");
    int n = s.nextInt();
    int arr[][] = new int[n + 1][n + 1];  //declaring array with extra column snd row
    for (int i = 0; i < n; i++) {  //generation of random array of '0' & '1'
      for (int j = 0; j < n; j++)
        arr[i][j] = (int) Math.round(Math.random());
    }
    for (int i = 0; i < n; i++) {  //print the obtained random matrix
      for (int j = 0; j < n; j++)
        System.out.print(arr[i][j] + " ");
      System.out.println();
    }
  largestRow(arr,n);  
  largestCol(arr,n);
  }
  static void largestRow(int[][] arr,int n) {  // function of finding largest in row
    ArrayList<Integer> arr1 = new ArrayList<Integer>();
         
       
    for (int i = 0; i < n; i++) {
      int count = 0; 
      for (int j = 0; j < n; j++) {
        if (arr[i][j] == 1)   //counting number of 1s in row
          count++;
      } 
      arr[i][n] = count;    //storing the count in last column
    }
    int row_max = arr[0][n];
    for (int i = 0; i < n; i++) {
      if (arr[i][n] > row_max) {  //if array element found greater than row max then clear array list 
        arr1.clear();
        row_max = arr[i][n];   //update the row max
      }
      if (arr[i][n] == row_max) //if row element is equal to row max store the index in array list
        arr1.add(i);
    }
    System.out.print("rows with max 1s: ");  
    for (int i = 0; i < arr1.size(); i++)   //print array list storing row index 
      System.out.print(arr1.get(i) + " ");
    System.out.println();
  }
  static void largestCol(int [][]arr,int n) {
    ArrayList<Integer> arr1 = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {     //will count all '1s' in the coloumn
      int count = 0;
      for (int j = 0; j < n; j++) {
     
   if (arr[j][i] == 1)
          count++;
      }
      arr[n][i] = count;              //will store it in the last row
    }
    int col_max = arr[n][0];
    for (int i = 0; i < n; i++) {
      if (arr[n][i] > col_max) {    //  compare all last row elemnt for max if found
        arr1.clear();            //clear the previous data
        col_max = arr[n][i];     //update column max 
      }
      if (arr[n][i] ==col_max)
   
        arr1.add(i);           //if array elemnt equal column max store the index in array list
    }
    System.out.print("columns with max 1s: ");
    for (int i = 0; i < arr1.size(); i++)   //printing the arraylist storing column index
      System.out.print(arr1.get(i) + " ");
  }
}
