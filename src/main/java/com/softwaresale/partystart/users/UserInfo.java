package com.softwaresale.partystart.users;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserInfo {
	private String sub;
	private String name;
	@JsonProperty("given_name")
	private String givenName;
	@JsonProperty("family_name")
	private String familyName;
	@JsonProperty("middle_name")
	private String middleName;
	private String nickname;
	@JsonProperty("preferred_username")
	private String preferredUsername;
	private String profile;
	private String picture;
	private String website;
	private String email;
	@JsonProperty("email_verified")
	private Boolean emailVerified;
	private String gender;
	private String birthdate;
	private String zoneinfo;
	private String locale;
	@JsonProperty("phone_number")
	private String phoneNumber;
	@JsonProperty("phone_number_verified")
	private Boolean phoneNumberVerified;
	
	public UserInfo() {
		
	}
	
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPreferredUsername() {
		return preferredUsername;
	}
	public void setPreferredUsername(String preferredUsername) {
		this.preferredUsername = preferredUsername;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getEmail_verified() {
		return emailVerified;
	}
	public void setEmail_verified(Boolean email_verified) {
		this.emailVerified = email_verified;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getZoneinfo() {
		return zoneinfo;
	}
	public void setZoneinfo(String zoneinfo) {
		this.zoneinfo = zoneinfo;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Boolean getPhoneNumberVerified() {
		return phoneNumberVerified;
	}
	public void setPhoneNumberVerified(Boolean phoneNumberVerified) {
		this.phoneNumberVerified = phoneNumberVerified;
	}
}
