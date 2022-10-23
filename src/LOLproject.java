import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LOLproject {

        line_champ top = new line_champ(new HashMap(),new ArrayList());
        line_champ jungle = new line_champ(new HashMap(),new ArrayList());
        line_champ mid = new line_champ(new HashMap(),new ArrayList());
        line_champ adc = new line_champ(new HashMap(),new ArrayList());
        line_champ spt = new line_champ(new HashMap(),new ArrayList());
        void addChamp(String a, String b){
                top.line.put("탑",top.champList);
                jungle.line.put("정글",jungle.champList);
                mid.line.put("미드",mid.champList);
                adc.line.put("원딜",adc.champList);
                spt.line.put("서폿",spt.champList);

                if (b.equals("탑")){
                        top.champList.add(a);
                        System.out.println(top.line);
                }
                if (b.equals("정글")){
                        jungle.champList.add(a);
                        System.out.println(jungle.line);
                }
                if (b.equals("미드")){
                        mid.champList.add(a);
                        System.out.println(mid.line);
                }
                if (b.equals("원딜")){
                        adc.champList.add(a);
                        System.out.println(adc.line);
                }
                if (b.equals("서폿")){
                        spt.champList.add(a);
                        System.out.println(spt.line);
                }
        }

        void showAllChamps(){
                System.out.println(top.line);
                System.out.println(jungle.line);
                System.out.println(mid.line);
                System.out.println(adc.line);
                System.out.println(spt.line);
        }


}
