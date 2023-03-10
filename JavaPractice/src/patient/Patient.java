/**
 * 
 */
package patient;

import java.time.Duration;
import java.time.LocalTime;

/**
 * class to do thing
 * 
 * @author Millar McIlwain
 *
 */
public class Patient {

	String firstName, lastName, severityLevel;
	int age;
	long waitTime;
	boolean triage;

	/**
	 * @param firstName
	 * @param lastName
	 * @param severityLevel
	 * @param waitTime
	 * @param triage
	 */
	public Patient(String firstName, String lastName, int age, String waitTime, String severityLevel, boolean triage) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.setAge(age);
		this.setSeverityLevel(severityLevel);
		this.setWaitTime(waitTime);
		this.triage = triage;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the severityLevel
	 */
	public String getSeverityLevel() {
		return severityLevel;
	}

	/**
	 * @param severityLevel the severityLevel to set
	 */
	public void setSeverityLevel(String severityLevel) {

		this.severityLevel = severityLevel.substring(0, 3).toUpperCase();
	}

	/**
	 * @return the waitTime
	 */
	public long getWaitTime() {
		return waitTime;
	}

	/**
	 * @param waitTime the waitTime to set
	 */
	public void setWaitTime(String waitTime) {

		LocalTime logonTime = LocalTime.parse(waitTime);
		LocalTime logoffTime = LocalTime.of(10, 00, 00);

		Duration duration = Duration.between(logonTime, logoffTime);

		long diffInMinutes = duration.toMinutes();
		this.waitTime = diffInMinutes;
	}

	/**
	 * @return the triage
	 */
	public boolean isTriage() {
		return triage;
	}

	/**
	 * @param triage the triage to set
	 */
	public void setTriage(boolean triage) {
		this.triage = triage;
	}

	@Override
	public String toString() {
		return "First Name : " + firstName + "\nLast Name : " + lastName + "\nAge : " + age + "\nWait Time : "
				+ waitTime + "mins" + "\nSeverity Level : " + severityLevel + "\nTriaged:" + triage;
	}

}
