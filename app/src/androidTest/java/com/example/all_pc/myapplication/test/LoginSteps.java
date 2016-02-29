package com.example.all_pc.myapplication.test;

import android.test.ActivityInstrumentationTestCase2;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.example.all_pc.myapplication.Login;
import com.example.all_pc.myapplication.R;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@CucumberOptions(features = "features")
public class LoginSteps extends ActivityInstrumentationTestCase2<Login>{

    private Login login;

    public LoginSteps(SomeDependency dependency) {
        super(Login.class);
        assertNotNull(dependency);
    }

    @Given("^I have a Login$")
    public void I_have_a_Login() {
        login = new Login();
        assertNotNull(getActivity());
    }

    @When("Given(/^I set (\\S+) and (\\S+)/) do")
    public void I_set_user_and_pass(final String user, final String pass) {
        onView(withId(R.id.tUsuario)).perform(typeText(user));
        onView(withId(R.id.tPass)).perform(typeText(pass));
    }

    @When("^I clicked on Login$")
    public void I_clicked_on_Login() {
        onView(withId(R.id.bLogin)).perform(click());
    }

    @Then("^I should see (\\S+) message$")
    public Boolean I_should_see_s_message(final String s) {
        Boolean estado = false;
        switch (s){
            case "failture":
                estado = false;
                break;
            case "success":
               estado = true;
                break;
        }

        return login.status == estado;
        //onView(withId(R.id.txt_calc_display)).check(matches(withText(s)));
    }

}
