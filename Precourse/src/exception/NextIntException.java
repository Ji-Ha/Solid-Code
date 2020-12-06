package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//nextInt에 문자를 입력하면, NextIntException이 발생. -- > 배웠다.
//NextIntException이 발생했을 때는 InputMismatchException을 던지면 예외를 받아올 수 있다.
//또한, Scanner를 재할당해주지 않으면, catch문에서 벗어나지 않는다.
//이미 있는 예외를 만드는 것보다는 그냥 사용하는 게 낫다고 판단하여 UserNextIntException은 사용하지않았다.
public class NextIntException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = 0;
		while(true) {
			try {
				test = scanner.nextInt();
				break;
			} catch (InputMismatchException i) {
				scanner = new Scanner(System.in);
				System.out.println("숫자를 입력해!");
			}
		}
		System.out.println(test);
	}
}
