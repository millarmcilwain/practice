/**
 * 
 */
package threadolympic;

/**
 * @author Millar McIlwain
 *
 */
public class Runner implements Runnable {

	long timeInMilliseconds, finishTime;
	String racerName;

	/**
	 * @param timeInMilliseconds
	 * @param finishTime
	 */
	public Runner(String racerName, long finishTime) {
		this.racerName=racerName;

		this.finishTime = finishTime;
	}


	/**
	 * @return the racerName
	 */
	public String getRacerName() {
		return racerName;
	}



	/**
	 * @param racerName the racerName to set
	 */
	public void setRacerName(String racerName) {
		this.racerName = racerName;
	}



	/**
	 * @return the timeInMilliseconds
	 */
	public long getTimeInMilliseconds() {
		return timeInMilliseconds;
	}




	/**
	 * @param timeInMilliseconds the timeInMilliseconds to set
	 */
	public void setTimeInMilliseconds(long timeInMilliseconds) {
		this.timeInMilliseconds = timeInMilliseconds;
	}




	/**
	 * @return the finishTime
	 */
	public long getFinishTime() {
		return finishTime;
	}




	/**
	 * @param finishTime the finishTime to set
	 */
	public void setFinishTime(long finishTime) {
		this.finishTime = finishTime;
	}




	@Override
	public void run() {
		
		try {
			Thread.sleep(this.getFinishTime()*1000);
			System.out.println(this.getRacerName() +" " +this.getFinishTime());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
