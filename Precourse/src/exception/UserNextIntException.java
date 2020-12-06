package exception;

import java.util.InputMismatchException;

public class UserNextIntException extends InputMismatchException {
	static private String inputValue;
	public UserNextIntException(String inputValue){
		this.inputValue = inputValue;
	}
	@Override
	public String getMessage() {
		return "틀렸어요";
	}
}
