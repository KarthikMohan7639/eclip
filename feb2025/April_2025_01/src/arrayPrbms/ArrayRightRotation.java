package arrayPrbms;
/*
 * Array Right Rotation
 * ====================
 * i/p: {10 20 30 40 50 } step=2;
 * o/p:
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayRightRotation {

	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50};
		int n=3;
		System.out.println("Before shift:"+Arrays.toString(arr));
		for(int i=0;i<n;i++) {
			int j,last;
			last=arr[arr.length-1];
			System.err.println(last);
			for(j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
				System.out.println(Arrays.toString(arr));
			}
			arr[0]=last;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("after shift:"+Arrays.toString(arr));
	}

}
