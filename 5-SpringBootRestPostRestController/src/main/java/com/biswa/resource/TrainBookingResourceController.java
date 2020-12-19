package com.biswa.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biswa.requestt.PassengerInfo;
import com.biswa.response.Ticket;

@RestController
//@RequestMapping("/get")
public class TrainBookingResourceController {

	// @PostMapping(value="/book",produces = "application/json")

	@PostMapping(value = "/bookticket", produces = { "application/xml", "application/json" }, consumes = {
			"application/json", "application/xml" })
	public Ticket bookTicket(@RequestBody PassengerInfo info) {
		Ticket ticket = new Ticket();

		ticket.setPassengerFirstName(info.getFirstName());
		ticket.setPassengerLastName(info.getLastName());
		ticket.setFrom(info.getFrom());
		ticket.setTo(info.getTo());
		ticket.setTicketId("utk15422");
		ticket.setTicketPrice("456");
		ticket.setTicketStatus("confirm");
		ticket.setTrainNo("17562");

		return ticket;
	}
}
