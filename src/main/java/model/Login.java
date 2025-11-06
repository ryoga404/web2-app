package model;

public class Login {
	private String userId;
	private String password;
	
	// --- コンストラクタ ---
	public Login() {}
	
	public Login(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
	
	// --- ゲッター (Getter) メソッド ---
	public String getUserId() {return userId;}
	public String getPassword() {return password;}

	// --- セッター (Setter) メソッド ---
	public void setUserId(String userId) {this.userId = userId;}
	public void setPassword(String password) {this.password = password;}
}
