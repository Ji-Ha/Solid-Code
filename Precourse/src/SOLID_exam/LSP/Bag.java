package SOLID_exam.LSP;
//LSP는 자식클래스는 부모클래스에서 가능한 행위를 수행할 수 있어야하기 때문에 이런식으로 만들어봤다.
public class Bag {
	private double price;

	Bag(double price){
		this.price = price;
	}

	public Bag() {
	}

	public double getPrice(){
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
