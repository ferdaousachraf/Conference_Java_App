package model;

import java.util.Date;
import java.util.List;

public class Presentation {

	private String id;
	
	private String title;

	private String description;

	private Date startAt;

	private Date endAt;

	private Speaker speaker;

	private Room room;

	private List<Attendee> attendeesList;

	private List<Review> reviewsList;
	
	

	/**
	 * constructor
	 */
	public Presentation() {
		super();
	}
	
	/**
	 * @param title
	 * @param description
	 * @param startAt
	 * @param endAt
	 * @param speaker
	 * @param room
	 * @param attendeesList
	 */
	public Presentation(String id,String title, String description, Date startAt, Date endAt, Speaker speaker, Room room,
			List<Attendee> attendeesList) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.startAt = startAt;
		this.endAt = endAt;
		this.speaker = speaker;
		this.room = room;
		this.attendeesList = attendeesList;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the startAt
	 */
	public Date getStartAt() {
		return startAt;
	}

	/**
	 * @param startAt the startAt to set
	 */
	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}

	/**
	 * @return the endAt
	 */
	public Date getEndAt() {
		return endAt;
	}

	/**
	 * @param endAt the endAt to set
	 */
	public void setEndAt(Date endAt) {
		this.endAt = endAt;
	}

	/**
	 * @return the speaker
	 */
	public Speaker getSpeaker() {
		return speaker;
	}

	/**
	 * @param speaker the speaker to set
	 */
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	/**
	 * @return the room
	 */
	public Room getRoom() {
		return room;
	}

	/**
	 * @param room the room to set
	 */
	public void setRoom(Room room) {
		this.room = room;
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
	
	
	

}
