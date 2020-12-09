package precourse2test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class InputNameTest {
    private Scanner scanner = new Scanner(System.in);
    private InputName inputName = new InputName(scanner);

    @Test
    @DisplayName("사람 이름 길이가 길면 예외")
    void inputPlayerName() {
        inputName.checkLength("노지환");
        inputName.checkLength("노스트라디다무스");
    }
    @Test
    @DisplayName("선수 인원 예외")
    //만약 오류가 아닌 2를 입력시, 예외가 나와야되는데 안나온다고 말한다
    //예외를 테스트하는 방식이기 때문에 그런 듯 하다.
    void exceptionTesting(){
        Exception exception = assertThrows(UserInputPlayerNumberException.class,
                ()->inputName.checkPersonnel(2));
        assertEquals("[ERROR] 경기할 선수가 2명 미만입니다. 경기를 진행할 수 없습니다!", exception.getMessage());
    }
}