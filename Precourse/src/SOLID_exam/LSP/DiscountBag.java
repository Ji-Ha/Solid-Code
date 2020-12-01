package SOLID_exam.LSP;

public class DiscountBag extends Bag{
	private double discountRate;
	DiscountBag(double rate) {
		discountRate = rate;
	}
	public void applyDiscount(int price) {
		super.setPrice(price- (int)(discountRate * price));
	}
}
