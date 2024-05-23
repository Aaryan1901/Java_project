package Assignment_1;

public class TypeCast {

	public static void main(String[] args) {
		
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		float f = 22.14f;
		double d = f;
		System.out.println(d);
		
		
		char ch = 'A';
		int i3 = ch;
		System.out.println(i3);
		
		
		char varl ='\u00a7';
		int i4 = varl;
		System.out.println(i4);
		
		
		// narrowing/explicit type casting
		
		double f1=10.52f;
		long l=(long)f1;
		System.out.println(l);
		
		
		long ll=923333456;
		int i2=(int) ll;
		System.out.println(i2);
		
		
		float £2 = 34.56f;
		int il = (int) £2;
		System.out.println(il);
		byte b1 = 90;
		char ch1 = (char) b1;
		System.out.println(ch1);
		// TODO Auto-generated method stub

	}

}
