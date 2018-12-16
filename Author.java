public class Author {
	private String name;
	private String email;
	private boolean male;

	public Author() {}

	public Author(String name, String email, boolean male) {
		this.name = name;
		this.email = email;
		this.male = male;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}

	public boolean getMale() {
		return this.male;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		if(male == true) {
			return this.name + "- Male " + this.email;
		}
		else {
			return this.name + "- Female " + this.email;
		}
	}

}
