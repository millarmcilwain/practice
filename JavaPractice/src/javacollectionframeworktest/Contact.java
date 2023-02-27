package javacollectionframeworktest;

public class Contact {

	private String fName;
	private String lName;
	private String email;
	
	public Contact() {
		
	}
	
	public Contact(String fName, String lName, String  email) {
		this.fName = fName;
		this.lName = lName;
		this.email = email;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [fName=" + fName + ", lName=" + lName + ", email=" + email + "]";
	}
}
