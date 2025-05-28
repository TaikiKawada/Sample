package jp.ssie.ocjp.条件分岐演習;

public class Practice0507_14 {
	public static void main(String[] args) {

		// ===== ケース1 =====
		int a = 20, b = 50, c = 30;

		if (a < b) {
			a = a + b;
			b = a - b;
			a = a - b;
		}
		if (a < c) {
			a = a + c;
			c = a - c;
			a = a - c;
		}
		if (b < c) {
			b = b + c;
			c = b - c;
			b = b - c;
		}

		System.out.println("---- ケース1: a=20, b=50, c=30 ----");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// ===== ケース2 =====
		int x = 30, y = 20, z = 50;

		if (x < y) {
			x = x + y;
			y = x - y;
			x = x - y;
		}
		if (x < z) {
			x = x + z;
			z = x - z;
			x = x - z;
		}
		if (y < z) {
			y = y + z;
			z = y - z;
			y = y - z;
		}

		System.out.println("---- ケース2: a=30, b=20, c=50 ----");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}