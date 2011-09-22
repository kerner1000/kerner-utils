package net.sf.kerner.utils;
import net.sf.kerner.utils.math.LongUnit;


public interface MemoryMonitor {
	
	static LongUnit DEFAULT_UNIT = LongUnit.UNIT;
	
	LongUnit getUnit();
	
	long getCurrentUsage();
	
	long getCurrentUsage(LongUnit unit);
	
	long getMaxUsage();
	
	long getMaxUsage(LongUnit unit);
	
	long getAverageUsage();
	
	long getAverageUsage(LongUnit unit);
	
	void start();
	
	long stop();

}
