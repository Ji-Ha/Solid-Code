package SOLID_exam;

//현재는 SRP에 어긋나는 코드다.
//sum과 subtract는 변경을 관리하는 Production에 더하기 빼기 까지 있기 때문에 SRP에 어긋나는 코드.
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
		this.price = price;
	}
	private void validatePrice(int price){
		if(price < MINIMUM_PRICE){
			throw new IllegalArgumentException(String.format("최소가격은 %d원 이상입니다.", MINIMUM_PRICE));
		}
	}
	public void sum(int price){
		this.price+=price;
	}
	public void subtract(int price){
		this.price-=price;
	}
}