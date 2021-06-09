package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int top) {
        int tmp = max(left, right);
        return tmp > top ? tmp : top;
    }

    public static int max(int left, int right, int top, int down) {
        int tmp = max(left, right, top);
        return tmp > down ? tmp : down;
    }
}