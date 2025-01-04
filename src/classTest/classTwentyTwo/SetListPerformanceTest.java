package classTest.classTwentyTwo;


import java.util.*;

public class SetListPerformanceTest {

    static final int N = 50000;

    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<>();

        for (int i = 0; i<N; i++){
            list.add(i);
            Collections.shuffle(list);
        }

        Collection<Integer> set1 =  new HashSet<>();
        System.out.println();
    }

    public static long getTestTime(Collection<Integer> c){

        long startTime = System.currentTimeMillis();

        for (int i = 0; i<N; i++){
            c.contains((int) (Math.random()*2*N));
        }
        return System.currentTimeMillis() - startTime;
    }

    public static long getRemoveTime(Collection<Integer> c){

        long startTime =  System.currentTimeMillis();

        for (int i = 0; i<N; i++){
            c.remove(i);
        }
        return System.currentTimeMillis() - startTime;
    }
}
