package lambda_prac;

public class 익명구현객체_이용 {
	public static void main(String[] args) {
		TestInterface t2 = new TestInterface() {
			@Override
			public int plusAandB(int a, int b) {
				return a+b;
			}
		};
		System.out.println(t2.plusAandB(11, 15));
	}
}
