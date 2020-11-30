package enum_prac;

import java.time.temporal.Temporal;

enum Color{
	Red, Blue, Green
}
/*
위의 enum은 내부적으로는 아래의 코드로 전환된다.
하지만 enum을 썼을 때, 보기가 매우 좋기 때문에 쓰는 것 같다.
Class Color{
	public static final Color Red = new Color();
	public static final Color Blue = new Color();
	public static final Color Green = new Color();
}
내부적으로는 final로 설정되어 있기 때문에, 자식 enum을 만들 수가 없다!
 */

public class enum01 {
	Color color;
	public enum01(Color color){this.color = color;}

	public void colorIsLike(){
		switch (color){
			case Red:
				System.out.println("원숭이 엉덩이는 빨개요");
				break;
			case Blue:
				System.out.println("겁에 질리면 얼굴은 파래져요.");
				break;
			case Green:
				System.out.println("초록색을 보면 눈이 좋아져요.");
				break;
		}
	}

	public static void main(String[] args) {
		String str = "Red";
		//valueOf == 상수 문자값 반환.
		enum01 num01 = new enum01(Color.valueOf(str));
		num01.colorIsLike();

		for(Color c : Color.values()){
			System.out.println(c);
		}

	}
}
