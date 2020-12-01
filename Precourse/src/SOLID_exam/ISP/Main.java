package SOLID_exam.ISP;
//복합기를 예를 들어 코드를 짜보았다.
//복합기는 팩스, 프린트, 복사등 모든걸 다해야한다.
//범용적인 인터페이스 대신, 각 기능의 특화된 인터페이스를 만드는 게 ISP라고 할 수 있다.

public class Main {
	public static void main(String[] args) {
		MultifunctionMachine machine = new MultifunctionMachine();
		machine.Copy();
		machine.Fax();
		machine.Print();
	}
}
