package splProbs;

public class PerfectCube {

	public static void main(String[] args) {
		int n=125;
		System.out.println(isPerfectCube(n));
	}

	private static boolean isPerfectCube(int n) {
		int cuberoot=(int) Math.cbrt(n);
		if((cuberoot*cuberoot*cuberoot)==n )
			return true;
		else
			return false;
	}

}
