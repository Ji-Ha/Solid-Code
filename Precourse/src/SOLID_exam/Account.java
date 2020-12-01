package SOLID_exam;

// 지금은
//여기서 일급컬렉션을 적용하는건 잘못된건가?(price 값 변경이 필요하기 때문에?)
public class Account {
	private static final int MINIMUM_PRICE = 1000;
	private String name;
	private int price;

	public Account(String name, int price){
		this.name = name;
		this.price = price;
	}
	public void updatePrice(int price){
		validatePrice(price);
		this.price += price;
	}
	private void validatePrice(int price){
		if(price < MINIMUM_PRICE){
			throw new IllegalArgumentException(String.format("최소가격은 %d원 이상입니다.", MINIMUM_PRICE));
		}
	}
}

//값을 더하고 빼는 과정을 다른 클래스로 설정하면서 SRP를 실행하려 해보았다.
//값을 변경하는 저 updatePrice를 빼고는 싶은데, 이건 더 생각해보아야겠다.
class Calculator{
	public void sum(Account a, int price){
		a.updatePrice(price);
	}
	public void subtract(Account a, int price){
		a.updatePrice(-price);
	}
}