package Lamda;

public class LamdaFunctionEx {
    public static void main(String[] args) {
        InterfaceEx ie = (int x,int y, int z) -> 2*x+2*y;

        ie.sum(3,6,5);
        System.out.println(ie.sum(3,6,5));
    }
}


@FunctionalInterface
interface InterfaceEx {
    public int sum(int x, int y, int z);
}