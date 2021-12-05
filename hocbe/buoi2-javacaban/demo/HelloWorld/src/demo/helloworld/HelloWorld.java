package demo.helloworld;

public class HelloWorld {
	
	// Access modifier: pham vi truy cap cua bien
	public String ten;
	private String tuoi;
	protected String lop;
	String diem;

	public static void main(String[] args) {
		
		// Bien nguyen thuy
		var bienVar = "";
		boolean bienBoolean = true; // mac dinh false
		char bienChar = 'n'; // mac dinh rong~
		
		byte bienByte = 10; // mac dinh 0
		short bienShort = 100; // mac dinh 0
		int bienInt = 1000; // mac dinh 0
		long bienLong = 10000; // mac dinh 0
		
		float bienFloat = 14.0f; // mac dinh 0.0f
		double bienDouble = 55.32; // mac dinh 0.0d
		
		// Kieu du lieu Object. Mac dinh gia tri deu la null
		Boolean booleanObject = true; // mac dinh false
		Boolean booleanObject1 = new Boolean(false);
		
		String bienString = "toi la toi";
		String bienString1 = new String("toi la toi1");
		
		Byte byteObject = 10;
		Byte byteObject1 = new Byte((byte)1000);
		
		Short shortObject = 100;
		Short shortObject1 = new Short((short)100);
		
		Integer integerObject = 1000;
		Integer integerObject1 = new Integer(1000);
		
		Long longObject = (long)10000;
		Long longObject1 = new Long(10000);
		
		Float floatObject = 10.2f;
		Float floatObject1 = new Float(20.3f);
		
		Double doubleObject = 43.34d;
		Double doubleObject1 = new Double(23.65d);
		
		System.out.println("Hello world " + bienString1);
	}
	
}