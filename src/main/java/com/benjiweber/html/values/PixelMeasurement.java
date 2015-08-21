package com.benjiweber.html.values;

public class PixelMeasurement {
    public final int numberOfPixels;

    public PixelMeasurement(int numberOfPixels) {
        this.numberOfPixels = numberOfPixels;
    }

    public static PixelMeasurement px(int num) { return new PixelMeasurement(num); }

    @Override
    public String toString() {
        return "" + numberOfPixels;
    }
}
