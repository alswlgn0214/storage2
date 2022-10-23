package teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MyArea {
    public static void main(String[] args) {
        HashMap stricts = new HashMap();
        List mapo = new ArrayList();
        List jungu = new ArrayList();
        List west_door = new ArrayList();

        stricts.put("mapo",mapo);
        stricts.put("jungu",jungu);
        stricts.put("west_door",west_door);

        HashMap seoulDesign = new HashMap();
        seoulDesign.put(1,8);
        seoulDesign.put(2,6);
        seoulDesign.put(3,7);

        mapo.add(seoulDesign);
        HashMap sangarm = new HashMap();
        sangarm.put(1,5);
        sangarm.put(2,7);
        sangarm.put(3,8);

        mapo.add(sangarm);

        HashMap lira = new HashMap();
        lira.put(1,8);
        lira.put(2,6);
        lira.put(3,7);

        jungu.add(lira);
        HashMap hanyang = new HashMap();
        hanyang.put(1,8);
        hanyang.put(2,6);
        hanyang.put(3,7);

        jungu.add(hanyang);

        Scanner sc = new Scanner(System.in);
        String findStricts = sc.nextLine();
        List schools = (List) stricts.get(findStricts);
        HashMap targetHM = (HashMap) schools.get(1);
        int targetClass = sc.nextInt();
        System.out.println(targetHM.get(targetClass));


    }
}
