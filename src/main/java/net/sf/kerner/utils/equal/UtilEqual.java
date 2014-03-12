package net.sf.kerner.utils.equal;

public class UtilEqual {

    static public boolean areEqual(final boolean aThis, final boolean aThat) {
        return aThis == aThat;
    }

    static public boolean areEqual(final char aThis, final char aThat) {
        return aThis == aThat;
    }

    static public boolean areEqual(final double aThis, final double aThat) {
        final boolean result = Double.doubleToLongBits(aThis) == Double.doubleToLongBits(aThat);
        return result;
    }

    static public boolean areEqual(final float aThis, final float aThat) {
        return Float.floatToIntBits(aThis) == Float.floatToIntBits(aThat);
    }

    static public boolean areEqual(final long aThis, final long aThat) {
        return aThis == aThat;
    }

    static public boolean areEqual(final Object aThis, final Object aThat) {
        return aThis == null ? aThat == null : aThis.equals(aThat);
    }

    private UtilEqual() {

    }
}
