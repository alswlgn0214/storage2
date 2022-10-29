package SlotMachine;

public class compareResults {

    String[] arrString;
    String[][] arrString1;


    void compareResults(String[] a,String[][] b,int c,int d) {
        if (b[c][0].equals(a[d]) && b[c][0].equals(b[c][1]) && b[c][0].equals(b[c][2])){
            java.lang.System.out.println((d-1)+"배!");
            for(int i = 0; i < 2; i++){
                for(int j = 0; j<2; j++){
                    java.lang.System.out.print(" [ "+b[2][2]+" ] ");
            }
        }
        }


    }
}
