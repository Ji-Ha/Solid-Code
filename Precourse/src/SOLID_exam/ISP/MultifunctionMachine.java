package SOLID_exam.ISP;

public class MultifunctionMachine implements PrintDevice, CopyDevice, FaxDevice{
	public void Print(){
		System.out.println("프린트 해드릴게요");
	}
	public void Copy(){
		System.out.println("복사도 해드릴게요!");
	}
	public void Fax(){
		System.out.println("아.. 팩스는 고장났어요");
	}
}
