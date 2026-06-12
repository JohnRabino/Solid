package com.academy.shape;
public class Rect implements Shape {
    private int w, h;
    public Rect(int w, int h) { this.w = w; this.h = h; }
    public int area() { return w * h; }
}