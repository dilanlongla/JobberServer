package com.haibasoft.jobber.entities;
// Generated 01-Sep-2020 05:26:07 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Category generated by hbm2java
 */
@Entity
@Table(name = "category")
public class Category implements java.io.Serializable {

	private int id;
	private String name;
	private Set<Joboffer> joboffers = new HashSet<Joboffer>(0);

	public Category() {
	}

	public Category(int id) {
		this.id = id;
	}

	public Category(int id, String name, Set<Joboffer> joboffers) {
		this.id = id;
		this.name = name;
		this.joboffers = joboffers;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", length = 254)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "offercategory", joinColumns = {
			@JoinColumn(name = "Category_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "JobOffer_id", nullable = false, updatable = false) })
	@JsonIgnore
	public Set<Joboffer> getJoboffers() {
		return this.joboffers;
	}

	public void setJoboffers(Set<Joboffer> joboffers) {
		this.joboffers = joboffers;
	}

}
