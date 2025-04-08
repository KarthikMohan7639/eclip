package multiDimensionalArray;

import java.util.Arrays;

public class CreateAndStoreMDA {

	public static void main(String[] args) {
//		int[][] arr=new int[3][3];//declaration and initialization of MDA
//		
//		//assign random values to MDA
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=(int) (Math.random()*10);
//			}
//		}
//		
//		//Printing MDA using normal for loop
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		//printing values using enhanced for loop
//		for(int[] i:arr) {
//			for(int j:i) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//		
//		int[][] copyArr=new int[arr.length][arr.length];
//		for(int i=0;i<copyArr.length;i++) {
//			for(int j=0;j<copyArr[i].length;j++) {
//				copyArr[i][j]=arr[i][j];
//			}
//		}
//		
//		System.out.println("Copy Array:");
//		for(int[] n:copyArr) {
//			for(int m:n) {
//				System.out.print(m+" ");
//			}
//			System.out.println();
//		}
		
		System.out.println("3D array");
		int[][][] tDA=new int[3][3][3];
		for(int i=0;i<tDA.length;i++) {
			for(int j=0;j<tDA[i].length;j++) {
				for(int k=0;k<tDA[j].length;k++) {
					tDA[i][j][k]=(int)(Math.random()*100);
				}
			}
		}
		for(int i=0;i<tDA.length;i++) {
			for(int j=0;j<tDA[i].length;j++) {
				for(int k=0;k<tDA[j].length;k++) {
					System.out.print(tDA[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
