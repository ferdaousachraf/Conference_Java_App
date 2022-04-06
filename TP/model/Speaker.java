package model;

import enums.SexTypeEnum;

public class Speaker extends Member {

	private String speakerTitle;
	private int indemnity;
	
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param sex
	 * @param cardID
	 * @param profession
	 * @param adress
	 * @param phoneNumber
	 */
	public Speaker(String id, String firstName, String lastName, SexTypeEnum sex, String cardID, String profession,
			String adress, String phoneNumber,String speakerTitle,int indemnity) {
		
		super(id, firstName, lastName, sex, cardID, profession, adress, phoneNumber);
		
		this.indemnity = indemnity;
		this.speakerTitle = speakerTitle;
	}

	public Speaker() {
		super();
	}

	/**
	 * @return the speakerTitle
	 */
	public String getSpeakerTitle() {
		return speakerTitle;
	}

	/**
	 * @param speakerTitle the speakerTitle to set
	 */
	public void setSpeakerTitle(String speakerTitle) {
		this.speakerTitle = speakerTitle;
	}

	/**
	 * @return the indemnity
	 */
	public int getIndemnity() {
		return indemnity;
	}

	/**
	 * @param indemnity the indemnity to set
	 */
	public void setIndemnity(int indemnity) {
		this.indemnity = indemnity;
	}

	
	
	
	

}