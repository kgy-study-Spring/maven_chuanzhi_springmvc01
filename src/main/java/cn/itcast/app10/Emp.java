package cn.itcast.app10;

import java.util.Date;

/**
 * 员工
 * 
 * @author AdminTC
 */
public class Emp {

	private String username;//姓名
	private String gender;//性别
	private Date hiredate;//入职时间

	public Emp() {}

	public Emp(String username, String gender, Date hiredate) {
		this.username = username;
		this.gender = gender;
		this.hiredate = hiredate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

}
