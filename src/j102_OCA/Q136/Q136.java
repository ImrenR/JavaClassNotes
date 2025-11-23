package j102_OCA.Q136;

import java.util.ArrayList;
import java.util.List;

public class Q136 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Tech");
        arrayList.add("Expert");
        arrayList.set(0, "Java");
        arrayList.forEach(a -> a.concat("Forum"));
        System.out.println(arrayList);//Java,Expert
        for (int i = arrayList.size() - 1; i >= 0; i--) {
           arrayList.get(i).replaceAll(arrayList.get(i),"Java");

        }
        System.out.println(arrayList);
    }
}
/*
What is the result?
A. [JavaForum, ExpertForum]
B. [JavaGroup, ExpertGroup]
C. [JavaForumGroup, ExpertForumGroup]
D. [JavaGroup, TechGroup ExpertGroup]
Answer: B
*/