/**
 *
 */
package com.greatlearning.GradedAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Building {

	Stack<Integer> stack = new Stack<>();
	Queue<List<Integer>> queue = new LinkedList<>();
	
	int ht;
	
	void construction(int[] arr ) {
	System.out.println("The order of construction is as follows\n");
	for (int i = 0; i < arr.length; i++) {
		
		if (ht == arr[i]) {
			
			System.out.println("\nDay:"+(i+1));
			System.out.print(arr[i]+" ");
			ht--;
			
			while(!stack.isEmpty() && stack.peek() == ht)
			{			   
				   ht--;
				   System.out.print(stack.pop()+" ");				
		       
			}		    
	
		}
		else {
			stack.push(arr[i]);
			System.out.print("\nDay:"+(i+1));
			System.out.println("");
		
		}
	}

}
	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Building building = new Building();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total no of floors in the building:");
		int size = sc.nextInt();
		building.ht = size;
		int array[] = new int[size];
		
		for (int i=0; i<building.ht; i++) {
			System.out.println("Enter the floor size given on day :" + (i+1));
			array[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(array));
		
		building.construction(array);
	
	}

}