package junitpractice;

import org.junit.jupiter.api.Test;


class MainScreenTest {

    @Test
    void setSelectedScreen() {
        new MainScreen().setSelectedScreen("7");
    }

    @Test
    void checkFunctionButton() {
        new MainScreen().setSelectedScreen("7");
    }
}