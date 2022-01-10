package demo.string;

public class Run {

	public static void main(String[] args) {
		char abc = 'c';
		String bien = "abc";
		System.out.println(bien);
		
		System.out.println("Do dai cua bien: " + bien.length());
		
		// So sanh equals va ==.
		// String pool
		String bien1 = "xyz";
		String bien2 = "xyz";
		String bien3 = new String("xyz");
		System.out.println("Equal biet1 va bien2: " + bien1.equals(bien2));
		System.out.println("== biet1 va bien2: " + (bien1 == bien2));
		System.out.println("== biet1 va bien3: " + (bien1 == bien3));
		
		String bien4 = "XYz";
		System.out.println("Equal ignore case: " + bien1.equalsIgnoreCase(bien4));
		System.out.println("Equal binh thuong: " + bien1.equals(bien4));
		
		String bien5 = "";
		System.out.println("Bien5 co rong khong: " + bien5.isEmpty());
		
		System.out.println("noi bien1 va bien4: " + bien1.concat(bien4));
		
		String bien6 = "Nguyen Van Van B";
		System.out.println("Replace bien6: " + bien6.replace("Van", "Thi"));
		
		System.out.println("Substring bien6: " + bien6.substring(7, 10));
		System.out.println("Substring bien6: " + bien6.substring(7));
		
		String bien7 = "   		abcxyz  	 ";
		System.out.println("Trim bien7: " + bien7.trim());
		
		int bien8 = 123;
		String bien8Str = String.valueOf(bien8);
		System.out.println("valueOf bien8: " + bien8Str);
	}

}
