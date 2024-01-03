package ArrayPack;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		//use scanner to accept values from keyboard
		Scanner sc= new Scanner(System.in);
		
		//Accept rows and columns of matrix
		System.out.println("Enter rows and columns:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		//create an array with size [r][c]
		int arr[][]=new int[r][c];
		
		//accept matrix values from keyboard
		System.out.println("Enter the elements are:");
		
		for(int i=0;i<r;i++)
			for (int j=0;j<c;j++)
				arr[i][j]=sc.nextInt();
		
		System.out.println("The transpose matrix is:");
		
		for(int i=0;i<c;i++) {
			
			for(int j=0;j<r;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			
			System.out.print("\n");
		}
		
		

	}

}
