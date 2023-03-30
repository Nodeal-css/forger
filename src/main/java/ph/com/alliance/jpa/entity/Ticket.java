package ph.com.alliance.jpa.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "testing")
public class Ticket {
	
	@Id
	Integer ticket_id;
	
	@Column(name = "hr_id")
	Integer hr_id;
	
	@Column(name = "employee_id")
	Integer employee_id;
	
	@Column(name = "category")
	String category;
	
	@Column(name = "description")
	String description;
	
	@Column(name = "date_request")
	String date_request;
	
	@Column(name = "status")
	String status;

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
