package multiDimensionalArray.traversal;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversal {

	public static void main(String[] args) {
		int[][]a= {
				{10,20,30,40},
				{50,60,70,80},
				{90,100,110,120},
				{130,140,150,160}
		};
		int n=4;
		int m=4;
		int top=0,bottom=n-1,left=0,right=m-1;
		List<Integer> res=new ArrayList<>();
		while(left<=right && top<=bottom) {
			//left to right
			for(int i=left;i<=right;i++) {
				
				res.add(a[top][i]);
			}
			top++;
			
			//top to bottom
			for(int i=top;i<=bottom;i++) {
				
				res.add(a[i][right]);
			}
			right--;
			
			//right to left
			for(int i=right;i>=left;i--) {
				
				res.add(a[bottom][i]);
			}
			bottom--;
			
			//bottom to top
			for(int i=bottom;i>=top;i--) {
				
				res.add(a[i][left]);
			}
			left++;
	
		}
		System.out.println(res);
	}
	

}
