package demo.com;

public class Run {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append("Nguyen");
		stringBuffer.append(" ");
		stringBuffer.append("Van");
		stringBuffer.append(" ");
		stringBuffer.append("Long");
		System.out.println("Sau khi append: " + stringBuffer.toString());
		
		stringBuffer.insert(3, "TTT");
		System.out.println("Sau khi insert: " + stringBuffer);
		
		stringBuffer.replace(3, 6, "BBB");
		System.out.println("Sau khi replace: " + stringBuffer);
		
		stringBuffer.delete(3, 6);
		System.out.println("Sau khi delete: " + stringBuffer);
		
		stringBuffer.reverse();
		System.out.println("Sau khi reverse: " + stringBuffer);
	}
	
}
