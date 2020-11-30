package enum_prac;
enum Type{
	WALKING("워킹화"), RUNNING("러닝화"), TRACKING("트래킹화"), HIKING("하이킹화");

	final private String name;

	private Type(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
}

public class enumLink {
	public static void main(String[] args) {
		for(Type type : Type.values()){
			System.out.println(type.getName());
		}
	}
}
