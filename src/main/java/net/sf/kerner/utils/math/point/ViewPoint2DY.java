package net.sf.kerner.utils.math.point;

import net.sf.kerner.utils.Transformer;

public class ViewPoint2DY implements Transformer<Point2D, Double> {

    public Double transform(final Point2D element) {
        if (element == null) {
            return null;
        }
        return element.getY();
    }

}
