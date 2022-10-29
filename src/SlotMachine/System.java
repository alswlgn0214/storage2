package SlotMachine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class System {

    compareResults ab = new compareResults();

    int coin = 10;

    int insertedCoin;

    String[] Emoji = {"A", "B", "C", "D", "E", "F", "G", "H"};
    String[][] result = new String[3][3];

    void slot() {
        java.lang.System.out.println("코인 갯수");
        Scanner sc = new Scanner(java.lang.System.in);
        insertedCoin = sc.nextInt();
        coin = coin - insertedCoin;
    }

    void startMachine() {
        if (coin > 0) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int a = (int) (Math.random() * 7);
                    result[i][j] = Emoji[a];
                }
            }
            ab.compareResults(Emoji, result, 1, 0);
            ab.compareResults(Emoji, result, 1, 1);
            ab.compareResults(Emoji, result, 1, 2);
            ab.compareResults(Emoji, result, 1, 3);
            ab.compareResults(Emoji, result, 1, 4);
            ab.compareResults(Emoji, result, 1, 5);
            ab.compareResults(Emoji, result, 1, 6);
            ab.compareResults(Emoji, result, 1, 7);
            ab.compareResults(Emoji, result, 2, 0);
            ab.compareResults(Emoji, result, 2, 1);
            ab.compareResults(Emoji, result, 2, 2);
            ab.compareResults(Emoji, result, 2, 3);
            ab.compareResults(Emoji, result, 2, 4);
            ab.compareResults(Emoji, result, 2, 5);
            ab.compareResults(Emoji, result, 2, 6);
            ab.compareResults(Emoji, result, 2, 7);
            ab.compareResults(Emoji, result, 0, 0);
            ab.compareResults(Emoji, result, 0, 1);
            ab.compareResults(Emoji, result, 0, 2);
            ab.compareResults(Emoji, result, 0, 3);
            ab.compareResults(Emoji, result, 0, 4);
            ab.compareResults(Emoji, result, 0, 5);
            ab.compareResults(Emoji, result, 0, 6);
            ab.compareResults(Emoji, result, 0, 7);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    java.lang.System.out.print(result[i][j]);
                }
                java.lang.System.out.println();
            }
        }
    }
}
