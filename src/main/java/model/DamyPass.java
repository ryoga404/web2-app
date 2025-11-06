package model;

import java.sql.Timestamp;

public class DamyPass {
	private int userId ;
	private String  damyPass;
	private Timestamp timestamp;
	
	// --- コンストラクタ ---
	public DamyPass() {} 
	public DamyPass(int userId, String damyPass, Timestamp timestamp) {
		this.userId = userId; 
		this.damyPass = damyPass; 
		this.timestamp = timestamp;
	}

	// --- ゲッター (Getter) メソッド ---
	public int getUserId() {return userId;}
	public String getDamyPass() {return damyPass;}
	public Timestamp getTimestamp() {return timestamp;}

	// --- セッター (Setter) メソッド ---
	public void setUserId(int userId) {this.userId = userId;}
	public void setDamyPass(String damyPass) {this.damyPass = damyPass;}
	public void setTimestamp(Timestamp timestamp) {this.timestamp = timestamp;}
	
}
