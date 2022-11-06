package Lamda;

import java.util.function.Consumer;

public class LamdaEx6 {
    public static void main(String[] args) {

        Consumer<String > c1 = name -> System.out.println("제 이름은 "+name+"입니다.");
        c1.accept("엄준식");
    }
}
