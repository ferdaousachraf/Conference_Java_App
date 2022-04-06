package model;

import enums.SexTypeEnum;

public class Member {

	private String id;

	private String firstName;

	private String lastName;

	private SexTypeEnum sex;

	private String cardID;

	private String profession;

	private String adress;

	private String phoneNumber;
	
	public Member() {
		
	}

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
	public Member(String id, String firstName, String lastName, SexTypeEnum sex, String cardID, String profession,
			String adress, String phoneNumber) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.cardID = cardID;
		this.profession = profession;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the sex
	 */
	public SexTypeEnum getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(SexTypeEnum sex) {
		this.sex = sex;
	}

	/**
	 * @return the cardID
	 */
	public String getCardID() {
		return cardID;
	}

	/**
	 * @param cardID the cardID to set
	 */
	public void setCardID(String cardID) {
		this.cardID = cardID;
	}

	/**
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}

	/**
	 * @param profession the profession to set
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}

	/**
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * @param adress the adress to set
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}