package com.example.act_er.form;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;



//private String screenName;

@Data
@Component
public class UserSettingForm {

	/** 画面名 */
	private List<String> errorMessage;
	public List<String> getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(List<String> errorMessage) {
		this.errorMessage = errorMessage;
	}

	private String screenName="利用者設定画面";
	private String userName ="山田";
	private String teamName = "flexble";
	private Integer fromEmploymentYears;
	private Integer toEmploymentYears;
	private List<String> searchResultList;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Integer getFromEmploymentYears() {
		return fromEmploymentYears;
	}
	public void setFromEmploymentYears(Integer fromEmploymentYears) {
		this.fromEmploymentYears = fromEmploymentYears;
	}
	public Integer getToEmploymentYears() {
		return toEmploymentYears;
	}
	public void setToEmploymentYears(Integer toEmploymentYears) {
		this.toEmploymentYears = toEmploymentYears;
	}
	public List<String> getSearchResultList() {
		return searchResultList;
	}
	public void setSearchResultList(List<String> searchResultList) {
		this.searchResultList = searchResultList;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

}
