package org.kurdi.lpa.model;

import java.util.Date;

public class Agent {
	//Agent Id
	private String agentId;
	//Agent Name
	private String agentName;
	//Agent Login Password
	private String password;
	//Agent Email Id for communication
	private String agentEmailId;
	//Agent Mobile Number
	private Long agentMobile;
	//Agent's Date of Joining
	private Date doj;
	//Status of the Agent
	private Boolean status;
	
	public String getUserId() {
		return agentId;
	}

	public void setUserId(String userId) {
		this.agentId = userId;
	}

	public String getUserName() {
		return agentName;
	}

	public void setUserName(String userName) {
		this.agentName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserEmailId() {
		return agentEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.agentEmailId = userEmailId;
	}

	public Long getUserMobile() {
		return agentMobile;
	}

	public void setUserMobile(Long userMobile) {
		this.agentMobile = userMobile;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", agentName=" + agentName
				+ ", password=" + password + ", agentEmailId=" + agentEmailId
				+ ", agentMobile=" + agentMobile + ", doj=" + doj + ", status="
				+ status + "]";
	}
		
}
