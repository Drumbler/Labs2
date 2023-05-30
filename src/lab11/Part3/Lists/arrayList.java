package lab11.Part3.Lists;

import java.util.ArrayList;
import java.util.List;
public class arrayList {
    public static void print () {
        List<Long> arrayList = new ArrayList<>();
        int i = 20;
        addElements(arrayList, i);
        System.out.println("Время выполнения операции добавления arrayList  в начале списка = " + addElementsFerst(arrayList, i));
        System.out.println("Время выполнения операции добавления arrayList  в середине списка = " + insertList(arrayList, i));
        System.out.println("Время выполнения операции добавления arrayList  в конце списка = " + addElementsLast(arrayList));

        System.out.println("Время выполнения операции удаления arrayList  в начале списка = " + removeElementsFerst(arrayList));
        System.out.println("Время выполнения операции удаления arrayList  в середине списка = " + removeInsertList(arrayList, i));
        System.out.println("Время выполнения операции удаления arrayList  в конце списка = " + removeElementsLast(arrayList));

        System.out.println("Время выполнения операции получения элимента arrayList по индексу = " + SearchElements(arrayList, i));
    }

    private static void addElements(List<Long> list, int i) {

        for (long k = 0; k < i * 1_000_000_0L; k++) {
            list.add(k);
        }

    }
    private static long addElementsFerst(List<Long> list, int i) {


        long start = System.currentTimeMillis();

        list.add(0, 30L);


        long end = System.currentTimeMillis();


        return end - start;

    }

    private static long insertList (List<Long> list, int i) {

        long start = System.currentTimeMillis();


        list.add(i, 234L);

        long end = System.currentTimeMillis();


        return end - start;

    }

    private static long addElementsLast (List<Long> list) {

        long start = System.currentTimeMillis();



        for (long i = 0; i < 1_000_0; i++ ){
            list.add(list.size()-1, i);
        }

        long end = System.currentTimeMillis();


        return end - start;

    }

    private static long removeElementsFerst(List<Long> list) {

        long start = System.currentTimeMillis();

        list.remove(0);


        long end = System.currentTimeMillis();


        return end - start;

    }

    private static long removeInsertList (List<Long> list, int i) {

        long start = System.currentTimeMillis();


        list.remove(i);

        long end = System.currentTimeMillis();


        return end - start;

    }

    private static long removeElementsLast (List<Long> list) {

        long start = System.currentTimeMillis();


        for (long i = 0; i < 1_000_0; i++ ){
            list.remove(list.size()-1);
        }
        long end = System.currentTimeMillis();

        return end - start;

    }

    private static long SearchElements (List<Long> list, int i) {

        long start = System.currentTimeMillis();


        System.out.println( list.get(i));
        System.out.println(list.size());

        long end = System.currentTimeMillis();


        return end - start;

    }
}
