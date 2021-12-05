package demo.vonglap;

public class VongLap {

	public static void main(String[] args) {
		// Vong lap for
		for (int i = 0; i < 10; i++) {
			System.out.println("for index: " + i);
		}
		
		// Vong lap while
		int i = 0;
		while(i < 10) {
			System.out.println("while index: " + i);
			i++;
		}
		
		// Vong lap do while
		int j = 0;
		do {
			System.out.println("do while index: " + j);
			j++;
		} while(j < 10);
	}

}
