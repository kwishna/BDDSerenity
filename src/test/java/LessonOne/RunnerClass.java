package LessonOne;

import org.junit.Test;

import net.thucydides.core.annotations.Steps;

/**
 *  This Class Is Executed As Run As : Junit. It Won't Generate Any Reprot At All.
 * @author AB D
 *
 */

public class RunnerClass {
	
	@Steps
	StepFile file = new StepFile();
	
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

}
