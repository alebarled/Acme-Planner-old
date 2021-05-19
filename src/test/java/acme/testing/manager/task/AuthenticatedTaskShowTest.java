package acme.testing.manager.task;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import acme.testing.AcmePlannerTest;

public class AuthenticatedTaskShowTest extends AcmePlannerTest{
	
	// Test cases -------------------------------------------------------------
	
	/* 
	 * This test navigates into a private task as the authorized manager that owns it.
	 * It also verificates that all the parameters of the task are correct.
	 */
	@ParameterizedTest
	@CsvFileSource(resources = "/manager/task/show-positive.csv", encoding = "utf-8", numLinesToSkip = 1)
	@Order(10)
	public void showPositive(final int index, final String title,
		final String executionStart, final String executionEnd,
		final String workload, final String description, final String link) {	
		
		super.signIn("manager1", "manag3r");
		super.navigate("manager/task/show", "id=16");
		
		super.checkInputBoxHasValue("title", title);
		super.checkInputBoxHasValue("executionStart", executionStart);
		super.checkInputBoxHasValue("executionEnd", executionEnd);
		super.checkInputBoxHasValue("workload", workload);
		super.checkInputBoxHasValue("description", description);
		super.checkInputBoxHasValue("link", link);

		
	}
	
	/*
	 * This test navigates into a private task of other manager.
	 * An error must rise, telling the user that has no permission to show the task 10 info.
	 */
	@Test
	@Order(20)
	public void showNegative() {		
		super.navigate("manager/task/show", "id=10");
		super.checkErrorsExist();

		
	}

}