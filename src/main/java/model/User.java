package model;

import java.io.Serializable;
import java.sql.Timestamp;

public class User implements Serializable {
	private int userId ;
	private String userName;
	private String mailAddress;
	private String hasedPass;
	private int flag;
	private String displayName;
	private String address;
	private Timestamp timestamp;
	
	// --- コンストラクタ ---
	public User() {} // デフォルトコンストラクタ

	public User(int userId, String userName, String mailAddress, String hasedPass, int flag, String displayName, String address, Timestamp timestamp) {
		this.userId = userId; 
		this.userName = userName; 
		this.mailAddress = mailAddress; 
		this.hasedPass = hasedPass; 
		this.flag = flag; 
		this.displayName = displayName; 
		this.address = address; 
		this.timestamp = timestamp;
	}

	// --- ゲッター (Getter) メソッド ---
	public int getUserId() {return userId;}
	public String getUserName() {return userName;}
	public String getMailAddress() {return mailAddress;}
	public String getHasedPass() {return hasedPass;}
	public int getFlag() {return flag;}
	public String getDisplayName() {return displayName;}
	public String getAddress() {return address;}
	public Timestamp getTimestamp() {return timestamp;}

		// --- セッター (Setter) メソッド ---
	public void setUserId(int userId) {this.userId = userId;}
	public void setUserName(String userName) {this.userName = userName;}
	public void setMailAddress(String mailAddress) {this.mailAddress = mailAddress;}
	public void setHasedPass(String hasedPass) {this.hasedPass = hasedPass;}
	public void setFlag(int flag) {this.flag = flag;}
	public void setDisplayName(String displayName) {this.displayName = displayName;}
	public void setAddress(String address) {this.address = address;}
	public void setTimestamp(Timestamp timestamp) {this.timestamp = timestamp;}
}
