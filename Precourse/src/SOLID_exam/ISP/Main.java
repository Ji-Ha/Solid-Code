package SOLID_exam.ISP;

public class Main {
	public static void main(String[] args) {
		MultifunctionMachine machine = new MultifunctionMachine();
		machine.Copy();
		machine.Fax();
		machine.Print();
	}
}
