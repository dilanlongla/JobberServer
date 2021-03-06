package com.haibasoft.jobber.entities;
// Generated 01-Sep-2020 05:26:07 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Offerseeker generated by hbm2java
 */
@Entity
@Table(name = "offerseeker")
public class Offerseeker implements java.io.Serializable {

	private OfferseekerId id;
	private Joboffer joboffer;
	private Jobseeker jobseeker;
	private Boolean companyReview;
	private Boolean seekerReview;
	private Date interviewDate;

	public Offerseeker() {
	}

	public Offerseeker(OfferseekerId id, Joboffer joboffer, Jobseeker jobseeker) {
		this.id = id;
		this.joboffer = joboffer;
		this.jobseeker = jobseeker;
	}

	public Offerseeker(OfferseekerId id, Joboffer joboffer, Jobseeker jobseeker, Boolean companyReview,
			Boolean seekerReview, Date interviewDate) {
		this.id = id;
		this.joboffer = joboffer;
		this.jobseeker = jobseeker;
		this.companyReview = companyReview;
		this.seekerReview = seekerReview;
		this.interviewDate = interviewDate;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "jobSeekerId", column = @Column(name = "JobSeeker_id", nullable = false, length = 64)),
			@AttributeOverride(name = "jobOfferId", column = @Column(name = "JobOffer_id", nullable = false)) })
	public OfferseekerId getId() {
		return this.id;
	}

	public void setId(OfferseekerId id) {
		this.id = id;
	}

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JobOffer_id", nullable = false, insertable = false, updatable = false)
	@JsonBackReference(value = "offerseeker")
	public Joboffer getJoboffer() {
		return this.joboffer;
	}

	public void setJoboffer(Joboffer joboffer) {
		this.joboffer = joboffer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JobSeeker_id", nullable = false, insertable = false, updatable = false)
	@JsonBackReference
	public Jobseeker getJobseeker() {
		return this.jobseeker;
	}

	public void setJobseeker(Jobseeker jobseeker) {
		this.jobseeker = jobseeker;
	}

	@Column(name = "companyReview")
	public Boolean getCompanyReview() {
		return this.companyReview;
	}

	public void setCompanyReview(Boolean companyReview) {
		this.companyReview = companyReview;
	}

	@Column(name = "seekerReview")
	public Boolean getSeekerReview() {
		return this.seekerReview;
	}

	public void setSeekerReview(Boolean seekerReview) {
		this.seekerReview = seekerReview;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "interviewDate", length = 19)
	public Date getInterviewDate() {
		return this.interviewDate;
	}

	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}

}
