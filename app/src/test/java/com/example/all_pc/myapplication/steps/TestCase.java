public class TestSteps {
    private int steps;

    @Given("^I have a test$")
    public void I_have_a_test() {
        assertThat(1, is(++steps));
    }

    @When("^I test$")
    public void I_test() {
        assertThat(2, is(++steps));
    }

    @Then("^I succeed$")
    public void I_succeed() {
        assertThat(3, is(++steps));
    }

}