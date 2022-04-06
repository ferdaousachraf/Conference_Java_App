package model;

import java.util.Date;

import enums.ReviewTypeEnum;

public class Review {
	
	private String id;
	
	private String reviewText;
	
	private Date reviewDate;
	
	private Presentation presentation;
	
	private Member reviewer;
	
	private ReviewTypeEnum reviewType;

	/**
	 * 
	 */
	public Review() {
		super();
	}

	/**
	 * @param reviewText
	 * @param reviewDate
	 * @param presentation
	 * @param reviewer
	 * @param reviewType
	 */
	public Review(String id, String reviewText, Date reviewDate, Presentation presentation, Member reviewer,
			ReviewTypeEnum reviewType) {
		super();
		this.id = id;
		this.reviewText = reviewText;
		this.reviewDate = reviewDate;
		this.presentation = presentation;
		this.reviewer = reviewer;
		this.reviewType = reviewType;
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
	 * @return the reviewText
	 */
	public String getReviewText() {
		return reviewText;
	}

	/**
	 * @param reviewText the reviewText to set
	 */
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	/**
	 * @return the reviewDate
	 */
	public Date getReviewDate() {
		return reviewDate;
	}

	/**
	 * @param reviewDate the reviewDate to set
	 */
	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	/**
	 * @return the presentation
	 */
	public Presentation getPresentation() {
		return presentation;
	}

	/**
	 * @param presentation the presentation to set
	 */
	public void setPresentation(Presentation presentation) {
		this.presentation = presentation;
	}

	/**
	 * @return the reviewer
	 */
	public Member getReviewer() {
		return reviewer;
	}

	/**
	 * @param reviewer the reviewer to set
	 */
	public void setReviewer(Member reviewer) {
		this.reviewer = reviewer;
	}

	/**
	 * @return the reviewType
	 */
	public ReviewTypeEnum getReviewType() {
		return reviewType;
	}

	/**
	 * @param reviewType the reviewType to set
	 */
	public void setReviewType(ReviewTypeEnum reviewType) {
		this.reviewType = reviewType;
	}
	
	
	
	
	
	
	

}
