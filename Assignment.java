package operators;
class Tank{
	int level;
}
public class Assignment {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 47;
		System.out.println("1: t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1.level = t2.level;
		System.out.println("2: t1.level: " + t1.level + ", t2.level: " + t2.level);
		t1.level = 27;
		System.out.println("3: t1.level: " + t1.level + ", t2.level: " + t2.level);
	}

}/*out:
1: t1.level: 9, t2.level: 47
2: t1.level: 47, t2.level: 47
3: t1.level: 27, t2.level: 47
*///
