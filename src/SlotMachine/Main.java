package SlotMachine;

import java.util.Scanner;

public class Main {

    int num = 3;

    System a = new System();
    Scanner sc = new Scanner(java.lang.System.in);


        void StartProgram(){
            while (num != 0) {
            java.lang.System.out.println("0. 탈출하기");
            java.lang.System.out.println("1. 코인 넣기");
            java.lang.System.out.println("2. 슬롯머신 돌리기");
                num = sc.nextInt();
                switch (num) {
                    case 1:
                        a.slot();
                    case 2:
                        a.startMachine();
                        break;
                }
            }
            java.lang.System.out.println("바이바이");




        }



}


