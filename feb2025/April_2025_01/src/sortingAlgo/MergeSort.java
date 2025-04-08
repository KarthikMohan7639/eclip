package sortingAlgo;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr= {2,1,4,7,5,9,8};
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		mergeSort(arr,0,arr.length-1);
		
		
		
		System.out.println("after Sorting: "+Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr, int l, int r) {
		if(l<r) {
			int mid=(l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			merge(arr,l,mid,r);
		}
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int n1=mid-l+1;//size of left arr
		int n2=r-mid;//size of right arr
		int[] lArr=new int[n1];
		int[] rArr=new int[n2];
		//copy of values from original array
		for(int x=0;x<n1;x++) {
			lArr[x]=arr[l+x];
		}
		for(int x=0;x<n2;x++) {
			rArr[x]=arr[mid+1+x];
		}
		
		//intialize pointers
		int i=0,j=0,k=l;
		
		//comparing two arrs and merging comparing values and sorting
		while(i<n1&&j<n2) {
			if(lArr[i]<=rArr[j]) {
				arr[k]=lArr[i];
				i++;
			}
			else {
				arr[k]=rArr[j];
				j++;
			}
			k++;
		}
		
		//copy remaining values from the array
		while(i<n1) {
			arr[k]=lArr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rArr[j];
			j++;
			k++;
		}
	}

}
