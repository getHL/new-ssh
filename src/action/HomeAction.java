package action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import bean.UserInfo;
import dao.UserInfoDAO;


@Configuration
@ComponentScan
public class HomeAction {

	/**
	 * 
	 */

	@Autowired
	UserInfoDAO userInfoDAO;
	
	@Autowired
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

		userInfo.setUsername(username);
		userInfo.setEmail(email);
		userInfo.setPassword(password);
		
		userInfoDAO.save(userInfo);
		
		return "registersuccess";
		
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
