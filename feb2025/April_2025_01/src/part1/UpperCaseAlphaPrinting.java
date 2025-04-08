package part1;

public class UpperCaseAlphaPrinting {

	public static void main(String[] args) {
		for(char i='A';i<='z';i++) {
			if(i==91||i==92||i==93|i==94||i==95||i==96) {
				continue;
			}
			System.out.println(i);
		}

	}

}
