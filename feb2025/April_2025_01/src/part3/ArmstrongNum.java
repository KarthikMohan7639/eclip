package part3;

public class ArmstrongNum {
	/*
	 * ARMSTRONG NUMBER
	 * ===============
	 * i/p=153
	 * o/p=true
	 * exp:
	 *  3  3  3
	 * 1 +5 +3 =1+125+27=153
	 */
	static boolean isArmStrong(int num){
		int originalNum=num;
		int sum=0;
		int n=String.valueOf(originalNum).length();
		while(num>0) {
			int dig=num%10;
			sum+=Math.pow(dig, n);
			num/=10;
		}
		return (originalNum==sum);
		
	}

	public static void main(String[] args) {
		int num=9474;
		String s=""+num;
		int sum=0;
		int len=s.length();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			String dig=""+c;
			int x=Integer.valueOf(dig);
			sum+=Math.pow(x, len);
		}
//		System.out.println((sum==num)?"armstrong":"not armstrong");
		System.out.println(isArmStrong(num)?"armstrong":"not armstrong");
	}

}
