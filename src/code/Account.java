package code;

public class Account {
	private String login, pass, fio;
	private boolean online;
	private int age;
	

	public Account(String fio, String login, String pass, int age, boolean online) {
		super();
		this.login = login;
		this.pass = pass;
		this.fio = fio;
		this.online = online;
		this.age = age;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getFio() {
		return fio;
	}
	public void setFio(String fio) {
		this.fio = fio;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
