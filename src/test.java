import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        LOLproject a = new LOLproject();
        Scanner sc = new Scanner(System.in);
        int system = 3;

        while(system != 0){
            System.out.println("1. 나의 챔프 리스트 보기");
            System.out.println("2. 나의 챔프 리스트 보기");
            system = sc.nextInt();
            switch (system){
                case 1: a.showAllChamps();break;
                case 2: {
                    System.out.print("이름: ");
                    String champ = new Scanner(System.in).nextLine();
                    System.out.print("라인: ");
                    String line = new Scanner(System.in).nextLine();
                    a.addChamp(champ,line);
                    break;
                }
            }
        }
        System.out.println("바이바이");

    }
}
