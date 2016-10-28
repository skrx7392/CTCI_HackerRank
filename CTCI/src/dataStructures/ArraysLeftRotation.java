package dataStructures;

import java.util.*;

public class ArraysLeftRotation {
	
	public void arraysLeftRotation() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[2*n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			arr[n+i] = arr[i];
		}
		sc.close();
		for(int i=0; i<n; i++) {
			System.out.print(arr[i+d] + " ");
		}
	}

}
