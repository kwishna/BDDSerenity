package LessonOne;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

/**
 *  This Class Is Executed As Run As : Junit. It Will Generate Any Reprot At All.
 * @author AB D
 *
 */
@RunWith(SerenityRunner.class)
public class Runner2 {
	
	@Steps
	StepFile file;
	
	@Test
	public void firstTestCase() {
	
		file.FirstStep();
		file.SecondStep();
		file.ThirdStep();
	}
	
	@Test
	public void SecondTestCase() {
	
		file.FourStep();
		file.FifthStep();
		file.SixthStep();
		file.SeventhStep();
	}
	
	@Pending
	public void SecondTestThree() {
	
	}
}
