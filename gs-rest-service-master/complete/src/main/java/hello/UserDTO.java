package hello;

import com.google.gson.annotations.Expose;

public class UserDTO {
	@Expose
	private String name;
	@Expose
	private String lastname;
	
	public UserDTO(String name, String lastname) {
		this.name = name;
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}
	
}
