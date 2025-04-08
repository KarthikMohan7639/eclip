package part6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] a= {1,3,5,7,9};
		int[] b= {2,4,6,8,10};
		int[] c=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++) {
			c[k++]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[k++]=b[i];
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
	}

}
