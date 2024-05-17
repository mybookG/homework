import java.util.*;

public class H2_Array {

}

class Student {
    private String name;
    private Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    Integer getAge() {
        return age;
    }
}

class ArrLst_Std {
    private ArrayList<Student> als;

    ArrLst_Std() {
        als = new ArrayList<>();
    }

    void addStd(String name, Integer age) {
        als.add(new Student(name, age));
    }

    void srtStd() {
        int data[], maxi;
        Student st, stmx;
        String str, strmx;
        for (int i = 0; i < als.size() - 1; i++) {
            maxi = i;
            for (int j = i + 1; j < als.size(); j++) {
                st = als.get(j);
                stmx = als.get(i);
                str = st.getName();
                strmx = stmx.getName();
                if (str < strmx) {
                    maxi = j;
                }
            }
            if (maxi > i) {
                t = data[i];
                data[i] = data[maxi];
                data[maxi] = t;
            }
        }
    }

    void prtStd() {
        for (Student st : als) {
            System.out.println(st.getName() + " " + st.getAge());
        }
    }
}
