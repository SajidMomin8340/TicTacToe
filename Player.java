package TicTac.model;


public class Player {
	private String name;
	private String email;
	private CharType charType;

	public Player(String name, String email, CharType charType) {
		super();
		this.name = name;
		this.email = email;
		this.charType = charType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CharType getCharType() {
		return charType;
	}

	


}
