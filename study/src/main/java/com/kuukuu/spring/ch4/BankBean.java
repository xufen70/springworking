package com.kuukuu.spring.ch4;

public class BankBean {
	 private long id;
	 private String bankName;
	 private String englishName;
	 private String fullName;
	 private String bankIcon;
	 private String bigIcon;
	 private String servicePhone;
	 private String note;
	public BankBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getEnglishName() {
		return englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getBankIcon() {
		return bankIcon;
	}
	public void setBankIcon(String bankIcon) {
		this.bankIcon = bankIcon;
	}
	public String getBigIcon() {
		return bigIcon;
	}
	public void setBigIcon(String bigIcon) {
		this.bigIcon = bigIcon;
	}
	public String getServicePhone() {
		return servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "BankDao [id=" + id + ", bankName=" + bankName + ", englishName=" + englishName + ", fullName="
				+ fullName + ", bankIcon=" + bankIcon + ", bigIcon=" + bigIcon + ", servicePhone=" + servicePhone
				+ ", note=" + note + "]";
	}
}
