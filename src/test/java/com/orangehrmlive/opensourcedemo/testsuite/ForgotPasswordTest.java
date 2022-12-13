package com.orangehrmlive.opensourcedemo.testsuite;

import com.orangehrmlive.opensourcedemo.customlisteners.CustomListeners;
import com.orangehrmlive.opensourcedemo.pages.ForgotPassword;
import com.orangehrmlive.opensourcedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class ForgotPasswordTest extends BaseTest {

    ForgotPassword forgotPassword;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        forgotPassword = new ForgotPassword();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        forgotPassword.clickOnForgotPasswordLink();
        String expectedMessage = "Reset Password";
        Assert.assertEquals(forgotPassword.getResetPasswordMessage(), expectedMessage, "Not matching message");
    }
}
