package part6;

import java.util.Arrays;

public class MergeTwoSortedArr {

	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4};
		int[] b= {5,6,7,8};
		int[] res=merge(a,b);
		Arrays.toString(res);
		System.out.println(Arrays.toString(res));
		
	}

	private static int[] merge(int[] a, int[] b) {
		int[] c=new int[a.length+b.length];
		for(int i=0,m=0,n=a.length-1,j=c.length-1;i<c.length;i++) {
			if(m<a.length) {
				c[i]=a[m++];
			}
			else {
				c[j--]=b[n--];
			}
		}
		return c;
	}

}
