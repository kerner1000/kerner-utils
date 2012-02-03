package net.sf.kerner.utils.math;

public interface PrefixableDouble {

	double toPicos(double units);

	double toNanos(double units);

	double toMicros(double units);

	double toMillis(double units);

	double toUnits(double units);

	double toKilos(double units);

	double toMegas(double units);

	double toGigas(double units);

	double toTeras(double units);

}
