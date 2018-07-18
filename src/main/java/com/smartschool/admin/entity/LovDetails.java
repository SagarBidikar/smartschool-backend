package com.smartschool.admin.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "s_lov_details")
public class LovDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lovd_auto_code")
	private long lovdCode;

	@Column(name = "lovd_type")
	private String lovdType;

	@Column(name = "lovd_list")
	private String lovdList;

	@Column(name = "lovd_sequence_no")
	private Integer lovdSequence;

	@Column(name = "lovd_attribute_1")
	private String lovdAttr1;

	@Column(name = "lovd_attribute_2")
	private String lovdAttr2;

	@Column(name = "lovd_attribute_3")
	private String lovdAttr3;

	@Column(name = "lovd_attribute_4")
	private String lovdAttr4;

	@Column(name = "lovd_attribute_5")
	private String lovdAttr5;

	@Column(name = "table_module_id")
	private Integer moduleId;

	@Column(name = "created_user")
	private String createdUser;

	/**
	 * Created date of this user. Value is auto generated whenever the user is
	 * created. Non-nullable and Non-updatable field
	 */
	@Column(name = "created_date", nullable = false, updatable = false)
	@CreationTimestamp
	private Date createdDate;

	@Column(name = "modified_user")
	private String modifiedUser;

	/**
	 * Latest modified date of this user. Value is auto generated when the User
	 * is updated. Non-nullable field
	 */
	@Column(name = "modified_date", nullable = false)
	@UpdateTimestamp
	private Date modifiedDate;


	@Column(name = "deleted_user")
	private String deletedUser;

	@Column(name = "deleted_date")
	private Date deletedDate;

	@Column(name = "active")
	private Character isActive;

	public long getLovdCode() {
		return lovdCode;
	}

	public void setLovdCode(long lovdCode) {
		this.lovdCode = lovdCode;
	}

	public String getLovdType() {
		return lovdType;
	}

	public void setLovdType(String lovdType) {
		this.lovdType = lovdType;
	}

	public String getLovdList() {
		return lovdList;
	}

	public void setLovdList(String lovdList) {
		this.lovdList = lovdList;
	}

	public Integer getLovdSequence() {
		return lovdSequence;
	}

	public void setLovdSequence(Integer lovdSequence) {
		this.lovdSequence = lovdSequence;
	}

	public String getLovdAttr1() {
		return lovdAttr1;
	}

	public void setLovdAttr1(String lovdAttr1) {
		this.lovdAttr1 = lovdAttr1;
	}

	public String getLovdAttr2() {
		return lovdAttr2;
	}

	public void setLovdAttr2(String lovdAttr2) {
		this.lovdAttr2 = lovdAttr2;
	}

	public String getLovdAttr3() {
		return lovdAttr3;
	}

	public void setLovdAttr3(String lovdAttr3) {
		this.lovdAttr3 = lovdAttr3;
	}

	public String getLovdAttr4() {
		return lovdAttr4;
	}

	public void setLovdAttr4(String lovdAttr4) {
		this.lovdAttr4 = lovdAttr4;
	}

	public String getLovdAttr5() {
		return lovdAttr5;
	}

	public void setLovdAttr5(String lovdAttr5) {
		this.lovdAttr5 = lovdAttr5;
	}

	public Integer getModuleId() {
		return moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedUser() {
		return modifiedUser;
	}

	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getDeletedUser() {
		return deletedUser;
	}

	public void setDeletedUser(String deletedUser) {
		this.deletedUser = deletedUser;
	}

	public Date getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(Date deletedDate) {
		this.deletedDate = deletedDate;
	}

	public Character getIsActive() {
		return isActive;
	}

	public void setIsActive(Character isActive) {
		this.isActive = isActive;
	}

	
}
