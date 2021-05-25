package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int resultx = x2 - x1;
        int resulty = y2 - y1;
        double xPow = Math.pow(resultx, 2);
        double yPow = Math.pow(resulty, 2);
        double rsl = Math.sqrt(xPow + yPow);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
