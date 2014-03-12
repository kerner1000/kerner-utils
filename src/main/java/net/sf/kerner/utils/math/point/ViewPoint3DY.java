package net.sf.kerner.utils.math.point;

import net.sf.kerner.utils.transformer.Transformer;

public class ViewPoint3DY implements Transformer<Point3D, Double> {

    public Double transform(final Point3D element) {
        if (element == null) {
            return null;
        }
        return element.getY();
    }

}
