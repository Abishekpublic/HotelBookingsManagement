package com.entity;

import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name="transaction")
public class ITransaction {

	@Id
	@NotBlank(message="Transaction id is mandatory")
	private int tId;
    @NotBlank(message="amount is mandatory")
    private double amount;

	@OneToOne
	@JoinColumn(name="tId",unique=true)
	@JsonBackReference
	private IPayment p;
	
	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

	public IPayment getP() {
		return p;
	}

	public void setP(IPayment p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "ITransaction [tId=" + tId + ", amount=" + amount + ", p=" + p + "]";
	}

	
}
