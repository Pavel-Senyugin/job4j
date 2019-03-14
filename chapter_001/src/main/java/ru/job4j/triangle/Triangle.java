package ru.job4j.triangle;
import java.awt.*;

/**
 * Class Triangle.
 * @author Senyugin Pavel (mister.senyugin@yandex.ru)
 * @since 14.03.2019
 */

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     *
     * @param ab  Длина от точки a до точки b.
     * @param ac  Длина от точки a до точки b.
     * @param bc  Длина от точки a до точки b.
     */
    private boolean exist(double ab, double ac, double bc) {
        return (((ab + bc) > ac) && ((bc + ac) > ab) && ((ab + ac) > bc));
    }

    public double area() {
        double areaTriangle = -1;
        double ab = a.distance(b);
        double ac = a.distance(c);
        double bc = b.distance(c);
        double p = period(ab, ac, bc);
        if (exist(ab, ac, bc)) {
            areaTriangle = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return areaTriangle;
    }
}