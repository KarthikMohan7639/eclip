package part4;

public class DecToBin {

	public static void main(String[] args) {
		int num=1101;
		int sum=0;
		int power=0;
		while(num>0) {
			int lastDig=num%10;
			sum+=lastDig*Math.pow(2, power);
			num/=10;
			power++;
		}
		System.out.println(sum);
	}

}
