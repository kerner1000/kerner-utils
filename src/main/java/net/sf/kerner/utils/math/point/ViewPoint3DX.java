package net.sf.kerner.utils.math.point;

import net.sf.kerner.utils.Transformer;

public class ViewPoint3DX implements Transformer<Point3D, Double> {

    public Double transform(final Point3D element) {
        if (element == null) {
            return null;
        }
        return element.getX();
    }

}
