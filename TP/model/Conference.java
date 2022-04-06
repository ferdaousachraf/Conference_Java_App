package model;

import java.util.Date;
import java.util.List;

public class Conference {

private String id;
	
	private String title;
	
	private String 	subject;
	
	private String program;
	
	private Date startDate;
	
	private Date endDate;
	
	private int fee;
	
	private String 	location;

	
	private List<Room> roomsList;

	private List<Speaker> speakersList;
	
	private List<Attendee> attendeesList;
	
	private List<Presentation> presentationsList;
	
	private List<Review> reviewsList;


	
	
	
	/**
	 * 
	 */
	public Conference() {
		super();
	}


	/**
	 * @param id
	 * @param title
	 * @param subject
	 * @param program
	 * @param startDate
	 * @param endDate
	 * @param fee
	 * @param room
	 * @param speaker
	 */
	public Conference(String id, String title, String subject, String program, Date startDate, Date endDate, int fee,String location) {
		super();
		this.id = id;
		this.title = title;
		this.subject = subject;
		this.program = program;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fee = fee;
		this.setLocation(location);
	
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}


	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}


	/**
	 * @return the program
	 */
	public String getDescription() {
		return program;
	}


	/**
	 * @param program the program to set
	 */
	public void setDescription(String program) {
		this.program = program;
	}


	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}


	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}


	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	/**
	 * @return the fee
	 */
	public int getFee() {
		return fee;
	}


	/**
	 * @param fee the fee to set
	 */
	public void setFee(int fee) {
		this.fee = fee;
	}

	/**
	 * @return the attendeesList
	 */
	public List<Attendee> getAttendeesList() {
		return attendeesList;
	}


	/**
	 * @param attendeesList the attendeesList to set
	 */
	public void setAttendeesList(List<Attendee> attendeesList) {
		this.attendeesList = attendeesList;
	}


	/**
	 * @return the reviewsList
	 */
	public List<Review> getReviewsList() {
		return reviewsList;
	}


	/**
	 * @param reviewsList the reviewsList to set
	 */
	public void setReviewsList(List<Review> reviewsList) {
		this.reviewsList = reviewsList;
	}



	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	/**
	 * @return the roomsList
	 */
	public List<Room> getRoomsList() {
		return roomsList;
	}


	/**
	 * @param roomsList the roomsList to set
	 */
	public void setRoomsList(List<Room> roomsList) {
		this.roomsList = roomsList;
	}


	/**
	 * @return the speakersList
	 */
	public List<Speaker> getSpeakersList() {
		return speakersList;
	}


	/**
	 * @param speakersList the speakersList to set
	 */
	public void setSpeakersList(List<Speaker> speakersList) {
		this.speakersList = speakersList;
	}


	@Override
	public String toString() {
		return "Conference [id=" + id + ", title=" + title + ", subject=" + subject + ", program=" + program
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", fee=" + fee + ", location=" + location + "]";
	}
	
	
	
	
	
	
	
	
}
