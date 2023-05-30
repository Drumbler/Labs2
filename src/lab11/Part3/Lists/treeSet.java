package lab11.Part3.Lists;

import java.util.*;
public class treeSet {
    public static void print() {
        SortedSet<Long> theSet = new TreeSet<>();
        int i = 20;

        System.out.println("Время выполнения операции добавления theSet  в начале списка = " + addElementsFerst(theSet, i));
        System.out.println("Время выполнения операции добавления theSet  в конце списка = " + addElementsLast(theSet));
        System.out.println("Время выполнения операции добавления theSet  в середине списка = " + insertSet(theSet));
//
        System.out.println("Время выполнения операции удаления theSet  в начале списка = " + removeElementsFerst(theSet));
        System.out.println("Время выполнения операции удаления theSet  в середине списка = " + removeInsertSet(theSet, i));
        System.out.println("Время выполнения операции удаления theSet  в конце списка = " + removeElementsSet(theSet));
//
        System.out.println("Время выполнения операции получения элимента theSet по индексу = " + SearchElements(theSet));
    }

    private static long addElementsFerst(SortedSet<Long> set, long i) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (long k = 0; k < i * 1000_000L; k++) {
            set.add(k);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long addElementsLast(SortedSet<Long> set) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (long k = 2_2000_000L; k < 2_9000_000L; k++) {
            set.add(k);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long insertSet(SortedSet<Long> set) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (long k = 2_0000_000L; k < 2_2000_000L; k++) {
            set.add(k);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long removeElementsFerst(SortedSet<Long> set) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (long k = 0L; k < 400_000L; k++) {
            set.remove(set.first());
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long removeInsertSet(SortedSet<Long> set, int i) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (long k = 0L; k < 400_000L; k++) {
            set.tailSet((long) i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long removeElementsSet(SortedSet<Long> set) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (long k = 0L; k < 400_000L; k++) {
            set.remove(set.last());
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long SearchElements(SortedSet<Long> set) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (long k = 0L; k < 400_000L; k++) {
            set.subSet(5000L, 6000L);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }
}