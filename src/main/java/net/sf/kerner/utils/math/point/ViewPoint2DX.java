package net.sf.kerner.utils.math.point;

import net.sf.kerner.utils.transformer.Transformer;

public class ViewPoint2DX implements Transformer<Point2D, Double> {

    public Double transform(final Point2D element) {
        if (element == null) {
            return null;
        }
        return element.getX();
    }

}
