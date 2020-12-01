package enum_prac;

//쓰는 방법은 알겠는데, 뭔가
//우형 기술블로그처럼 써보자! 하고 쓰려고 하면 쉽지 않은 거 같다.
//익히고 연습해야할듯.

enum Season{
	봄, 여름, 가을, 겨울
}
public class People {
	public String name;
	public Season favoriteSeason;
	public static void main(String[] args) {
		People people = new People();

		people.name = "노지환";
		people.favoriteSeason = Season.봄;

		System.out.println("이름 : " +people.name);
		System.out.println("좋아하는 계절 : " + people.favoriteSeason);
	}
}
