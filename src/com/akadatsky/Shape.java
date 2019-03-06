package com.akadatsky;

import java.awt.image.DataBufferDouble;

public interface Shape {
    void move();
    void draw();
    double getDistance(double x, double y);
    double getX();
    double getY();
}
