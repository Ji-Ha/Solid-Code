package exception;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SplitException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(Arrays.toString(scanner.next().split(",| , ")));

	}
}
