package com.sharktank.entity;

// default package


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CompanyInvestor generated by hbm2java
 */
@Entity
@Table(name = "company_investor", catalog = "sharktank")
public class CompanyInvestor implements java.io.Serializable {

	private Integer id;
	private Company company;
	private Investor investor;
	private Double investment;
	private Date createdOn;
	private Date updatedOn;

	public CompanyInvestor() {
	}

	public CompanyInvestor(Company company, Investor investor) {
		this.company = company;
		this.investor = investor;
	}

	public CompanyInvestor(Company company, Investor investor, Double investment, Date createdOn, Date updatedOn) {
		this.company = company;
		this.investor = investor;
		this.investment = investment;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company_id", nullable = false)
	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "investor_id", nullable = false)
	public Investor getInvestor() {
		return this.investor;
	}

	public void setInvestor(Investor investor) {
		this.investor = investor;
	}

	@Column(name = "investment", precision = 22, scale = 0)
	public Double getInvestment() {
		return this.investment;
	}

	public void setInvestment(Double investment) {
		this.investment = investment;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on", length = 19)
	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_on", length = 19)
	public Date getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

}