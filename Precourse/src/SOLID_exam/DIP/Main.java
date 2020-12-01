package SOLID_exam.DIP;
//추상클래스나 인터페이스 사용을 통하여
//Lego라는 구체적인 클래스 보다는 Toy라는 추상클래스에 의존하여 코딩을 짜보았다.
//어떻게보면, DIP(의존 역전 원칙)과 OCP(개방-폐쇄 원칙)을 동시에 만족시켰다고 볼 수 있다.

public class Main {
	public static void main(String[] args) {
		Kid kid = new Kid();
		kid.setToy(new Lego());
		kid.play();
	}
}
