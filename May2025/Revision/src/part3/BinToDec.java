package part3;

public class BinToDec {

	public static void main(String[] args) {
		int num=1001;
		int sum=0;
		int pow=0;
		while(num>0) {
			int lastDig=num%10;
			sum+=lastDig*Math.pow(2, pow);
			num/=10;
			pow++;
		}
		System.out.println(sum);
	}

}
