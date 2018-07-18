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
@Table(name = "s_lov_master")
public class LovMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lovm_auto_code")
	private long lovmCode;

	@Column(name = "lovm_type")
	private String lovmType;

	@Column(name = "lovm_description")
	private String lovmDescription;

	@Column(name = "lovm_sequence_no")
	private Integer lovmSequence;

	@Column(name = "lovm_attribute_1_decription")
	private String lovmAttr1;
	
	@Column(name = "lovm_attribute_1_type")
	private String lovmAttr1Type;
	
	@Column(name = "lovm_attribute_1_yn")
	private Character isActiveLovmAttr1;
	
	@Column(name = "lovm_attribute_2_decription")
	private String lovmAttr2;
	
	@Column(name = "lovm_attribute_2_type")
	private String lovmAttr2Type;
	
	@Column(name = "lovm_attribute_2_yn")
	private Character isActiveLovmAttr2;
	
	@Column(name = "lovm_attribute_3_decription")
	private String lovmAttr3;
	
	@Column(name = "lovm_attribute_3_type")
	private String lovmAttr3Type;
	
	@Column(name = "lovm_attribute_3_yn")
	private Character isActiveLovmAttr3;

	@Column(name = "lovm_attribute_4_decription")
	private String lovmAttr4;
	
	@Column(name = "lovm_attribute_4_type")
	private String lovmAttr4Type;
	
	@Column(name = "lovm_attribute_4_yn")
	private Character isActiveLovmAttr4;
	
	@Column(name = "lovm_attribute_5_decription")
	private String lovmAttr5;
	
	@Column(name = "lovm_attribute_5_type")
	private String lovmAttr5Type;
	
	@Column(name = "lovm_attribute_5_yn")
	private Character isActiveLovmAttr5;

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

	public long getLovmCode() {
		return lovmCode;
	}

	public void setLovmCode(long lovmCode) {
		this.lovmCode = lovmCode;
	}

	public String getLovmType() {
		return lovmType;
	}

	public void setLovmType(String lovmType) {
		this.lovmType = lovmType;
	}

	public String getLovmDescription() {
		return lovmDescription;
	}

	public void setLovmDescription(String lovmDescription) {
		this.lovmDescription = lovmDescription;
	}

	public Integer getLovmSequence() {
		return lovmSequence;
	}

	public void setLovmSequence(Integer lovmSequence) {
		this.lovmSequence = lovmSequence;
	}

	public String getLovmAttr1() {
		return lovmAttr1;
	}

	public void setLovmAttr1(String lovmAttr1) {
		this.lovmAttr1 = lovmAttr1;
	}

	public String getLovmAttr1Type() {
		return lovmAttr1Type;
	}

	public void setLovmAttr1Type(String lovmAttr1Type) {
		this.lovmAttr1Type = lovmAttr1Type;
	}

	public Character getIsActiveLovmAttr1() {
		return isActiveLovmAttr1;
	}

	public void setIsActiveLovmAttr1(Character isActiveLovmAttr1) {
		this.isActiveLovmAttr1 = isActiveLovmAttr1;
	}

	public String getLovmAttr2() {
		return lovmAttr2;
	}

	public void setLovmAttr2(String lovmAttr2) {
		this.lovmAttr2 = lovmAttr2;
	}

	public String getLovmAttr2Type() {
		return lovmAttr2Type;
	}

	public void setLovmAttr2Type(String lovmAttr2Type) {
		this.lovmAttr2Type = lovmAttr2Type;
	}

	public Character getIsActiveLovmAttr2() {
		return isActiveLovmAttr2;
	}

	public void setIsActiveLovmAttr2(Character isActiveLovmAttr2) {
		this.isActiveLovmAttr2 = isActiveLovmAttr2;
	}

	public String getLovmAttr3() {
		return lovmAttr3;
	}

	public void setLovmAttr3(String lovmAttr3) {
		this.lovmAttr3 = lovmAttr3;
	}

	public String getLovmAttr3Type() {
		return lovmAttr3Type;
	}

	public void setLovmAttr3Type(String lovmAttr3Type) {
		this.lovmAttr3Type = lovmAttr3Type;
	}

	public Character getIsActiveLovmAttr3() {
		return isActiveLovmAttr3;
	}

	public void setIsActiveLovmAttr3(Character isActiveLovmAttr3) {
		this.isActiveLovmAttr3 = isActiveLovmAttr3;
	}

	public String getLovmAttr4() {
		return lovmAttr4;
	}

	public void setLovmAttr4(String lovmAttr4) {
		this.lovmAttr4 = lovmAttr4;
	}

	public String getLovmAttr4Type() {
		return lovmAttr4Type;
	}

	public void setLovmAttr4Type(String lovmAttr4Type) {
		this.lovmAttr4Type = lovmAttr4Type;
	}

	public Character getIsActiveLovmAttr4() {
		return isActiveLovmAttr4;
	}

	public void setIsActiveLovmAttr4(Character isActiveLovmAttr4) {
		this.isActiveLovmAttr4 = isActiveLovmAttr4;
	}

	public String getLovmAttr5() {
		return lovmAttr5;
	}

	public void setLovmAttr5(String lovmAttr5) {
		this.lovmAttr5 = lovmAttr5;
	}

	public String getLovmAttr5Type() {
		return lovmAttr5Type;
	}

	public void setLovmAttr5Type(String lovmAttr5Type) {
		this.lovmAttr5Type = lovmAttr5Type;
	}

	public Character getIsActiveLovmAttr5() {
		return isActiveLovmAttr5;
	}

	public void setIsActiveLovmAttr5(Character isActiveLovmAttr5) {
		this.isActiveLovmAttr5 = isActiveLovmAttr5;
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
