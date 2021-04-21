package com.haibasoft.jobber.entities;
// Generated 01-Sep-2020 05:26:07 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OfferseekerId generated by hbm2java
 */
@Embeddable
public class OfferseekerId implements java.io.Serializable {

	private String jobSeekerId;
	private int jobOfferId;

	public OfferseekerId() {
	}

	public OfferseekerId(String jobSeekerId, int jobOfferId) {
		this.jobSeekerId = jobSeekerId;
		this.jobOfferId = jobOfferId;
	}

	@Column(name = "JobSeeker_id", nullable = false, length = 64)
	public String getJobSeekerId() {
		return this.jobSeekerId;
	}

	public void setJobSeekerId(String jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}

	@Column(name = "JobOffer_id", nullable = false)
	public int getJobOfferId() {
		return this.jobOfferId;
	}

	public void setJobOfferId(int jobOfferId) {
		this.jobOfferId = jobOfferId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OfferseekerId))
			return false;
		OfferseekerId castOther = (OfferseekerId) other;

		return ((this.getJobSeekerId() == castOther.getJobSeekerId()) || (this.getJobSeekerId() != null
				&& castOther.getJobSeekerId() != null && this.getJobSeekerId().equals(castOther.getJobSeekerId())))
				&& (this.getJobOfferId() == castOther.getJobOfferId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getJobSeekerId() == null ? 0 : this.getJobSeekerId().hashCode());
		result = 37 * result + this.getJobOfferId();
		return result;
	}

}
