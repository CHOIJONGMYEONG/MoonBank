package Bank7version;

public class Bank_v3 {

	@Override
	public String toString() {
		return "Bank_v3 [id=" + id + ", pass=" + pass + ", balance=" + balance + "]";
	}
	public Bank_v3() {
		super();
	}
	private String id;
	private String pass;
	private double balance;
	static String Company = "()주회사";
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static String getCompany() {
		return Company;
	}
	public static void setCompany(String company) {
		Company = company;
	}
	
}
