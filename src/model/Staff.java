package model;

import java.math.BigDecimal;

public class Staff {
	
	private String campusId;
	private String name;
	private String motoNo;
	private String motoType;
	private String color;
	private BigDecimal totalBill;
	public String getCampusId() {
		return campusId;
	}
	public void setCampusId(String campusId) {
		this.campusId = campusId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMotoNo() {
		return motoNo;
	}
	public void setMotoNo(String motoNo) {
		this.motoNo = motoNo;
	}
	public String getMotoType() {
		return motoType;
	}
	public void setMotoType(String motoType) {
		this.motoType = motoType;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public BigDecimal getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(BigDecimal totalBill) {
		this.totalBill = totalBill;
	}

}
