package project;

import java.util.HashMap;
import java.util.Map;

public class banNum {

    Map Mapo = new HashMap();


    void makeBan(String a, String b, String c) {
        String[] SchoolNames = {a, b, c};
        int[] banNums = {1, 4, 5};
        for (int i = 0; i < SchoolNames.length; i++) {
            Mapo.put(SchoolNames[i], banNums[i]);
        }
    }
}
