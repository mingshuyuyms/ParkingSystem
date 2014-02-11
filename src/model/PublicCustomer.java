package model;

import java.math.BigDecimal;
import java.util.Date;

public class PublicCustomer {

	private String id;
	private String motoNo;
	private Date enterDate;
	private Date exitDate;
	private boolean isPaid;
	private Integer spaceNo;
	private BigDecimal bill;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMotoNo() {
		return motoNo;
	}

	public void setMotoNo(String motoNo) {
		this.motoNo = motoNo;
	}

	public Date getEnterDate() {
		return enterDate;
	}

	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}

	public Date getExitDate() {
		return exitDate;
	}

	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}

	public BigDecimal getBill() {
		return bill;
	}

	public void setBill(BigDecimal bill) {
		this.bill = bill;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public Integer getSpaceNo() {
		return spaceNo;
	}

	public void setSpaceNo(Integer spaceNo) {
		this.spaceNo = spaceNo;
	}

}
