package Part2;

public class PrintUpperAlpha {

	public static void main(String[] args) {
		
//		for(char i='A';i<='Z';i++) {
//			System.out.println(i);
//		}
		for(char i=65;i<=122;i++) {
			if(i>90 && i<97)
				continue;
			System.out.println(i);
		}
	}

}
