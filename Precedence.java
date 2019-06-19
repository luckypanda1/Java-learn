package operators;

public class Precedence {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int x = 1, y = 2, z = 3;
		int a = x + y - 2/2 + z;
		int b = x + (y - 2)/(2 + z);
		System.out.println("a = " + a + " b = "+ b);
	}

}/* Output:
a = 5 b = 1
*///
