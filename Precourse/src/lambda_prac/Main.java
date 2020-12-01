package lambda_prac;

@FunctionalInterface
interface TestInterface{
	public int plusAandB(int a, int b);
}

class TestIntefaceImp1 implements TestInterface{
	@Override
	public int plusAandB(int a, int b){
		return a+b;
	}
}

public class Main{
	public static void main(String[] args) {
		TestInterface t1 = new TestIntefaceImp1();
		System.out.println(t1.plusAandB(10, 5));
	}
}
