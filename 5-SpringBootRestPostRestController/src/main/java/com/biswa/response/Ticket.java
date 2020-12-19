package com.biswa.response;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Ticket {

	private String ticketId;
	private String ticketStatus;
	private String ticketPrice;
	private String passengerFirstName;
	private String passengerLastName;
	private String from;
	private String to;
	private String trainNo;
	
	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getPassengerFirstName() {
		return passengerFirstName;
	}

	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}

	public String getPassengerLastName() {
		return passengerLastName;
	}

	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
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

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	@Override
	public String toString() {
		return "TicketResponse [ticketId=" + ticketId + ", ticketStatus=" + ticketStatus + ", ticketPrice="
				+ ticketPrice + ", passengerFirstName=" + passengerFirstName + ", passengerLastName="
				+ passengerLastName + ", from=" + from + ", to=" + to + ", trainNo=" + trainNo + "]";
	}
	
}
