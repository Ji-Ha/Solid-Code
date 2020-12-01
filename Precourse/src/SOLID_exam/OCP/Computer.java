package SOLID_exam.OCP;
//Interface를 활용하므로써, OCP를 적용시켜보았다.
//Interface를 안써봐서 좀 생소하긴 한데, 재밌는 거 같다. 코드도 간단해지고
//규격을 활용하고, 단순화시키면서 하는 방식이 맘에 든다.
//어차피 쓸거지만 이해하면서 쓰면 좋으니까ㅋㅋ
public class Computer implements Messenger{
	private Messenger messenger;

	Computer(Messenger messenger){
		this.messenger = messenger;
	}

	public void boot(){
		messenger.boot();
	}

	public static void main(String[] args) {
		Computer computer = new Computer(new LineMessenger());
		computer.boot();
	}
}

