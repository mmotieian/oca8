package ch2;

public class DataTypes {
	static Double dd;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		double d = 33;
		int $i = (int)d;
		
		String s1= "jj";
		String s2 = "ii";
		String s3 = s1+s2;
		
		char c = 'a';
		System.out.println(++c);
		
		System.out.println(s3);
		
		
		
		int a = 10;
		a = a++ + a + a-- - a-- + ++a;
		System.out.println(a);
		
		a = 10;
		a = a++ * a;
		System.out.println(a);
		
		
		a = 10;
		a = ++a + a + --a - --a + a++;
		System.out.println(a);
		
		
		
		Integer ii = 2;
		Integer ii2 = ii; // new object created
		ii = 3;
		System.out.println(ii);
		System.out.println(ii2);
		
		char s = (char)ii;
		
	}

}
