package net.sf.kerner.utils.math.point;

import net.sf.kerner.utils.View;

public class ViewPoint2DX implements View<Point2D, Double> {

    public Double transform(Point2D element) {
        if (element == null) {
            return null;
        }
        return element.getX();
    }

}
