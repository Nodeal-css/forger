package ph.com.alliance.jpa.functions.ticket.model;

import java.util.Date;

public class TicketModel {
	
	private Integer ticket_id;
	private Integer hr_id;
	private Integer employee_id;
	private String category;
	private String description;
	private String date_request;
	private String status;
	
	public Integer getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(Integer ticket_id) {
		this.ticket_id = ticket_id;
	}
	public Integer getHr_id() {
		return hr_id;
	}
	public void setHr_id(Integer hr_id) {
		this.hr_id = hr_id;
	}
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate_request() {
		return date_request;
	}
	public void setDate_request(String date_request) {
		this.date_request = date_request;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
