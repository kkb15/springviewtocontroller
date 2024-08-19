package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Dao class
@Entity
public class User {
//	this form variable match with your form data name
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String email ;
	private String Username;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", Username=" + Username + ", password=" + password + "]";
	}
	
	
	
	
	

}
