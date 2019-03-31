package com.slokam.first.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="personaldetails")
public class PersonalDetailsEntity {
	@Id
	@GeneratedValue
	private Integer id;
	@ManyToOne
	@JoinColumn(name="tid")
	private TitleEntity title;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public TitleEntity getTitle() {
		return title;
	}
	public void setTitle(TitleEntity title) {
		this.title = title;
	}
	public HHStatusEntity getHhstatus() {
		return hhstatus;
	}
	public void setHhstatus(HHStatusEntity hhstatus) {
		this.hhstatus = hhstatus;
	}
	public GenderEntity getGender() {
		return gender;
	}
	public void setGender(GenderEntity gender) {
		this.gender = gender;
	}
	public NationalityEntity getNationality() {
		return nationality;
	}
	public void setNationality(NationalityEntity nationality) {
		this.nationality = nationality;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	@ManyToOne
	@JoinColumn(name="ssid")
	private HHStatusEntity hhstatus;
	@OneToOne
	@JoinColumn(name="gid")
	private GenderEntity gender;
	@OneToOne
	@JoinColumn(name="nid")
	private NationalityEntity nationality;
	private String firstName;
	private String lastName;
	private String spouseName;
	
	

}
