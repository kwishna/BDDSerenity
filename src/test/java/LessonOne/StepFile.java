package LessonOne;

import net.thucydides.core.annotations.Step;

public class StepFile{
	
	User user = new User();
	String MrModi = "Narendra Modi";
	
	@Step("#MrModi First Step")
	public void FirstStep() {
	
		user.wakesUpInTheMorning();
	}
	
	@Step("#MrModi Second Step")
	public void SecondStep() {
	
		user.brushingTeeth();
	}
	
	@Step("#MrModi Third Step")
	public void ThirdStep() {
	
		user.bathing();
	}
	
	@Step("#MrModi Four Step")
	public void FourStep() {
	
		user.gettingPreparedForTheOffice();
	}
	
	@Step("#MrModi Fifth Step")
	public void FifthStep() {
	
		user.callingCab();
	}
	
	@Step("#MrModi Sixth Step")
	public void SixthStep() {
	
		user.reachedOffice();
	}
	
	@Step("#MrModi Seventh Step")
	public void SeventhStep() {
	
		user.writingCodes();
	}

}
