package com.biswa.requestt;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "passenger-info")
public class PassengerInfo {

	private String firstName;
	private String lastName;
	private String from;
	private String to;
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "PassengerInfo [firstName=" + firstName + ", lastName=" + lastName + ", from=" + from + ", to=" + to
				+ "]";
	}

	
}
