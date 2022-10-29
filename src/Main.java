import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List studentList = new ArrayList();
        studentList.add("한찬수");
        studentList.add(123);
        studentList.get(0);

        List<String> GenericStudentList = new ArrayList<String>();
        GenericStudentList.add("123");
        GenericStudentList.get(0);

    }
}