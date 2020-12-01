package lambda_prac;
//와 람다식 너무 깔끔해짐.
//최곤데?
public class 람다식_활용 {
	public static void main(String[] args) {
		TestInterface t3 = (a, b) -> {return a+b;};
		System.out.println(t3.plusAandB(15, 25));
	}
}
