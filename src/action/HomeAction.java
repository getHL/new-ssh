package action;

import bean.UserInfo;
import dao.UserInfoDAO;

public class HomeAction {

	/**
	 * 
	 */

	UserInfoDAO userInfoDAO;
	UserInfo userInfo;
	String username;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	String password;
	String email;
	
	public String register(){
		
		userInfo= new UserInfo();
		userInfo.setUsername(username);
		userInfo.setEmail(email);
		userInfo.setPassword(password);
		
		userInfoDAO.save(userInfo);
		
		return "registersuccess";
		
	}
	
	public String getUsername() {
		return username;
	}


	public UserInfoDAO getUserInfoDAO() {
		return userInfoDAO;
	}


	public void setUserInfoDAO(UserInfoDAO userInfoDAO) {
		this.userInfoDAO = userInfoDAO;
	}


	public void setUsername(String username) {
		this.username = username;
	}

}
