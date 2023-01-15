package org.example;

public class Main {
    public static void main(String[] args) {
        //  Сложность этого алгоритма равна O(N)
        System.out.println(findFibonachi(10));
    }

    public static int findFibLast(int n1, int n2, int n, int nall) {
        if (n == nall - 1) {
            return n2;
        } else {
            return findFibLast(n2, n1 + n2, ++n, nall);
        }
    }

    public static int findFibonachi(int n) {
        return findFibLast(1, 1, 1, n);
    }
}
