package com.company;

public class Picture {

    private final VerticalParabola verticalParabola1;
    private final VerticalParabola verticalParabola2;
    private final Circle circle;

    public Picture(VerticalParabola verticalParabola1, VerticalParabola verticalParabola2, Circle circle) {
        this.verticalParabola1 = verticalParabola1;
        this.verticalParabola2 = verticalParabola2;
        this.circle = circle;
    }

    public SimpleColor getColor(double x, double y) {
        if (verticalParabola1.isPointAboveParabola(x, y)) {
            return SimpleColor.ORANGE;
        } else if (!verticalParabola2.isPointAboveParabola(x, y) && !circle.isPointInCircle(x, y)
                && !verticalParabola1.isPointAboveParabola(x, y)) {
            return SimpleColor.YELLOW;
        } else if (!verticalParabola2.isPointAboveParabola(x, y) && circle.isPointInCircle(x, y)) {
            return SimpleColor.ORANGE;
        } else if (!circle.isPointInCircle(x, y) && verticalParabola2.isPointAboveParabola(x, y) && x<0) {
            return SimpleColor.ORANGE;
        } else if (circle.isPointInCircle(x, y)) {
            return SimpleColor.YELLOW;
        } else {
            return SimpleColor.GREEN;
        }
    }
}

