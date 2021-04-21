package com.haibasoft.jobber.entities;
// Generated 01-Sep-2020 05:26:07 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Recruiter generated by hbm2java
 */
@Entity
@Table(name = "recruiter")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Recruiter implements java.io.Serializable {

	private String id;
	private Company company;
	private Recruiter recruiter;
	private String firstName;
	private String lastName;
	private Integer tel;
	private String email;
	private String password;
	private String role;
	private Set<Joboffer> joboffers = new HashSet<Joboffer>(0);
	private Set<Recruiter> recruiters = new HashSet<Recruiter>(0);
	private Set<Operation> operations = new HashSet<Operation>(0);

	public Recruiter() {
	}

	public Recruiter(String id, Company company) {
		this.id = id;
		this.company = company;
	}

	public Recruiter(String id, Company company, Recruiter recruiter, String firstName, String lastName, Integer tel,
			String email, String password, String role, Set<Joboffer> joboffers, Set<Recruiter> recruiters,
			Set<Operation> operations) {
		this.id = id;
		this.company = company;
		this.recruiter = recruiter;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tel = tel;
		this.email = email;
		this.password = password;
		this.role = role;
		this.joboffers = joboffers;
		this.recruiters = recruiters;
		this.operations = operations;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Company_id", nullable = false)
	@JsonBackReference(value = "companyrecruiter")
	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Recruiter_id")
	public Recruiter getRecruiter() {
		return this.recruiter;
	}

	public void setRecruiter(Recruiter recruiter) {
		this.recruiter = recruiter;
	}

	@Column(name = "firstName", length = 254)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "lastName", length = 254)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "tel")
	public Integer getTel() {
		return this.tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	@Column(name = "email", length = 254)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", length = 254)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "role", length = 254)
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "recruiter")
	@JsonManagedReference(value = "recruiterjoboffer")
	public Set<Joboffer> getJoboffers() {
		return this.joboffers;
	}

	public void setJoboffers(Set<Joboffer> joboffers) {
		this.joboffers = joboffers;
	}

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "recruiter")
	@JsonIgnore
	public Set<Recruiter> getRecruiters() {
		return this.recruiters;
	}

	public void setRecruiters(Set<Recruiter> recruiters) {
		this.recruiters = recruiters;
	}

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "recruiter")
	@JsonManagedReference(value = "recruiteroperation")
	public Set<Operation> getOperations() {
		return this.operations;
	}

	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
	}

}