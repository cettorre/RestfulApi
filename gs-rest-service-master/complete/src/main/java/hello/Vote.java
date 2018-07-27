package hello;

import com.google.gson.annotations.Expose;

public class Vote {
	@Expose
	int userId;
	@Expose
	int optionSelected;

	public Vote(int userId, int optionSelected) {
		super();
		this.userId = userId;
		this.optionSelected = optionSelected;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getOptionSelected() {
		return optionSelected;
	}

	public void setOptionSelected(int optionSelected) {
		this.optionSelected = optionSelected;
	}
	
	
	

}
