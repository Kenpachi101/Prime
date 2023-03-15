/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayoperations;
import java.util.Scanner;
/**
 *
 * @author Students
 */
public class Arrayoperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        
        // Part a: input 15 values from the user and store them in an array
        int[] arr = new int[15];
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The values stored in the array are:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        // Part b: check if a user-entered number is present in the array
        System.out.println("Enter a number to search for:");
        int searchNum = input.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchNum) {
                System.out.println("The number " + searchNum + " was found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array");
        }
        
        // Part c: create a new array with the elements in reverse order
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[arr.length - i - 1] = arr[i];
        }
        System.out.println("The values stored in the reversed array are:");
        for (int value : reversedArr) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        // Part d: calculate the sum and product of the array elements
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("The sum of the array elements is: " + sum);
        System.out.println("The product of the array elements is: " + product);
    }
    
}
