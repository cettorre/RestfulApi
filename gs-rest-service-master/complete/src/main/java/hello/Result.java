package hello;

import com.google.gson.annotations.Expose;

public class Result {
	@Expose
	int option0;
	@Expose
	int option1;
	@Expose
	int option2;
	@Expose
	int option3;
	@Expose
	int option4;
	@Expose
	int option5;
	@Expose
	int option6;
	@Expose
	int option7;
	@Expose
	int option8;
	@Expose
	int option9;
	@Expose
	int option10;
	
	public int getOption0() {
		return option0;
	}
	public void setOption0(int option0) {
		this.option0 = option0;
	}
	public int getOption1() {
		return option1;
	}
	public void setOption1(int option1) {
		this.option1 = option1;
	}
	public int getOption2() {
		return option2;
	}
	public void setOption2(int option2) {
		this.option2 = option2;
	}
	public int getOption3() {
		return option3;
	}
	public void setOption3(int option3) {
		this.option3 = option3;
	}
	public int getOption4() {
		return option4;
	}
	public void setOption4(int option4) {
		this.option4 = option4;
	}
	public int getOption5() {
		return option5;
	}
	public void setOption5(int option5) {
		this.option5 = option5;
	}
	public int getOption6() {
		return option6;
	}
	public void setOption6(int option6) {
		this.option6 = option6;
	}
	public int getOption7() {
		return option7;
	}
	public void setOption7(int option7) {
		this.option7 = option7;
	}
	public int getOption8() {
		return option8;
	}
	public void setOption8(int option8) {
		this.option8 = option8;
	}
	public int getOption9() {
		return option9;
	}
	public void setOption9(int option9) {
		this.option9 = option9;
	}
	public int getOption10() {
		return option10;
	}
	public void setOption10(int option10) {
		this.option10 = option10;
	}
	
	public void addVoteToResult(int optionSelected) {
		switch(optionSelected) {
		case(0):option0++  ;break;
		case(1):option1++  ;break;
		case(2):option2++  ;break;
		case(3):option3++  ;break;
		case(4):option4++  ;break;
		case(5):option5++  ;break;
		case(6):option6++  ;break;
		case(7):option7++  ;break;
		case(8):option8++  ;break;
		case(9):option9++  ;break;
		case(10):option10++  ;break;
		}
	}
	@Override
	public String toString() {
		return "Result [option0=" + option0 + ", option1=" + option1 + ", option2=" + option2 + ", option3=" + option3
				+ ", option4=" + option4 + ", option5=" + option5 + ", option6=" + option6 + ", option7=" + option7
				+ ", option8=" + option8 + ", option9=" + option9 + ", option10=" + option10 + "]";
	}
	
	
	

}
