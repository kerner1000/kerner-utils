package net.sf.kerner.utils.time;

public class StopWatch {
	
	public class AlreadyRunningException extends RuntimeException {

		private static final long serialVersionUID = -8543832250156761882L;
		
	}
	
	public class NotRunningException extends RuntimeException {

		private static final long serialVersionUID = 2016104424322122373L;
		
	}
	
	private long time = -1;
	
	public synchronized void start() throws AlreadyRunningException {
		if(time > 0) throw new AlreadyRunningException();
		time = System.currentTimeMillis();
	}
	
	public synchronized TimePeriod round() throws NotRunningException {
		if(time < 0) throw new NotRunningException();
		return new TimePeriod(time, System.currentTimeMillis());
	}
	
	public synchronized TimePeriod stop() throws NotRunningException {
		final long result = time;
		if(result < 0) throw new NotRunningException();
		time = -1;
		return new TimePeriod(result, System.currentTimeMillis());
	}

}
