package junitpractice;

//오 겁나 신기함ㅋㅋㅋ
//그리고 편하네 test하기
//다시 사용해보면서 복습하자.
//추가적으로 메소드 공부랑 프리코스2에서 했던 것들을 추가해서 해보자
import static org.junit.jupiter.api.Assertions.*;

class MultiplierTest {

    @org.junit.jupiter.api.Test
    void multiply() {
        Multiplier multiplier = new Multiplier();
        assertEquals(multiplier.Multiply(8, 9), 72);
    }

    @org.junit.jupiter.api.Test
    void testMultiply() {
        Multiplier multiplier = new Multiplier();
        assertEquals(multiplier.Multiply(2, 3, 4), 28);
    }
}