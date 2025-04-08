package multiDimensionalArray;

import java.util.Arrays;

public class AddTwoMatrix {

	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		System.out.println("array1:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=(int)(Math.random()*10);
			}
		}
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
		System.out.println();
		
		int[][] arr1=new int[3][3];
		System.out.println("array2:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j]=(int)(Math.random()*10);
			}
		}
		System.out.println(Arrays.toString(arr1[0]));
		System.out.println(Arrays.toString(arr1[1]));
		System.out.println(Arrays.toString(arr1[2]));
		
		System.out.println();
		
		int[][] totArr=new int[3][3];
		System.out.println("Result Array after declaration:");
//		for(int i=0;i<totArr.length;i++) {
//			for(int j=0;j<totArr[i].length;j++) {
//				totArr[i][j]=(int)(Math.random()*10);
//			}
//		}
		System.out.println(Arrays.toString(totArr[0]));
		System.out.println(Arrays.toString(totArr[1]));
		System.out.println(Arrays.toString(totArr[2]));
		
		System.out.println();
		for(int i=0;i<totArr.length;i++) {
			for(int j=0;j<totArr[i].length;j++) {
				totArr[i][j]=arr[i][j]+arr1[i][j];
			}
		}
		
		System.out.println("Result arr after addition:");
		System.out.println(Arrays.toString(arr[0])+"+"+Arrays.toString(arr1[0])+"="+Arrays.toString(totArr[0]));
		System.out.println(Arrays.toString(arr[1])+"+"+Arrays.toString(arr1[1])+"="+Arrays.toString(totArr[1]));
		System.out.println(Arrays.toString(arr[2])+"+"+Arrays.toString(arr1[2])+"="+Arrays.toString(totArr[2]));
		
	}

}
