package model;

import java.util.Date;

import enums.SexTypeEnum;

public class Attendee extends Member {
	
	private Date registrationDate;
	private String paymentStatus ;
	
	
	public Attendee() {
		super();
	}
	

	public Attendee(String id, String firstName, String lastName, SexTypeEnum sex, String cardID, String profession,
			String adress, String phoneNumber, Date registrationDate, String paymentStatus ) {
		
		super(id, firstName, lastName, sex, cardID, profession, adress, phoneNumber);
		
		this.registrationDate = registrationDate;
		this.paymentStatus = paymentStatus;
		
	}

	/**
	 * @return the registrationDate
	 */
	public Date getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	/**
	 * @return the paymentStatus
	 */
	public String getPaymentStatus() {
		return paymentStatus;
	}

	/**
	 * @param paymentStatus the paymentStatus to set
	 */
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	

}
