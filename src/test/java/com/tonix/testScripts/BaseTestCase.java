package com.tonix.testScripts;


import com.propertyfilereader.PropertyFileReader;
import com.utility.Utilities;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestCase {
    protected com.business.tonixPages.WelcomePage welcomePage;
    protected com.business.tonixPages.LoginPage loginPage;
    protected com.business.tonixPages.BasePage basePage;
    protected com.business.tonixPages.MainPage mainPage;
    protected com.business.tonixPages.Stash_StashHomePage stashHomePage;
    protected com.business.tonixPages.Stash_SetupYourStashPage stashSetupPage;
    protected com.business.tonixPages.Stash_StashClosePage stashClosePage;
    protected com.business.tonixPages.Stash_StartNewStashPage startNewStaShPage;
    protected com.business.tonixPages.Stash_SetInitialSavingPage setInitialSavingPage;
    protected com.business.tonixPages.Stash_ReviewStashDetailsPage reviewStashDetailsPage;
    protected com.business.tonixPages.Stash_SoloStashCreatedPage  soloStashCreatedPage;
    protected com.business.tonixPages.Stash_ManageStashPage manageStashPage;
    protected com.business.tonixPages.Stash_ModifyStashPage modifyStashPage;
    protected com.business.tonixPages.Stash_UpdatedYourStashPage updatedStashPage;
    protected com.business.tonixPages.Stash_WithdrawFromYourStashPage withdrawFromYourStashPage;
    protected com.business.tonixPages.Stash_ReviewWithdrawPage reviewWithdrawPage;
    protected com.business.tonixPages.Stash_WithdrawConfirmationPage withdrawConfirmationPage;
    protected com.business.tonixPages.Stash_AddToStashPage stashAddToStashPage;
    protected com.business.tonixPages.Stash_ConfirmTransferToStashPage stashConfirmTransferToStashPage;
    protected com.business.tonixPages.Stash_MoneyStashPage stashMoneyStashPage;
    protected com.business.tonixPages.Stash_StashDetailsPage stashDetailsPage;
    protected com.business.tonixPages.Stash_AchievedPage stashAchievedPage;
    protected com.business.tonixPages.Stash_CongratsGoalAchievedPage stashCongratsGoalAchievedPage;
    protected com.business.tonixPages.Stash_HowMuchWillYouInvestPage stashHowMuchWillYouInvestPage;
    protected com.business.tonixPages.Stash_YouBrokeTheStashPage stashYouBrokeTheStashPage;
    protected com.business.tonixPages.Stash_WithdrawTransactionDetailsPage withdrawTransactionDetailsPage;
    protected com.business.tonixPages.Stash_CreatedStashPage createdStashPage;
    protected com.business.tonixPages.Stash_SetUpTimeDepositPage stashSetupTimeDepositPage;
    protected com.business.tonixPages.Stash_WootWootPage stashWootWootPage;
    
    
    
    public static PropertyFileReader prop = new PropertyFileReader(".\\properties\\testdata.properties");

    Utilities util=new Utilities();
    @BeforeTest
    public void Before() throws InterruptedException, IOException {
        Utilities.relaunch = false;
      //  util.clearBackgroundApps();
        basePage = new com.business.tonixPages.BasePage("tonix");
        welcomePage = new com.business.tonixPages.WelcomePage();
        loginPage = new com.business.tonixPages.LoginPage();
        mainPage = new com.business.tonixPages.MainPage();
        stashHomePage=new com.business.tonixPages.Stash_StashHomePage();
        stashSetupPage=new com.business.tonixPages.Stash_SetupYourStashPage();
        stashClosePage=new com.business.tonixPages.Stash_StashClosePage();
        startNewStaShPage=new com.business.tonixPages.Stash_StartNewStashPage();
        setInitialSavingPage=new com.business.tonixPages.Stash_SetInitialSavingPage();
        reviewStashDetailsPage=new com.business.tonixPages.Stash_ReviewStashDetailsPage();
        soloStashCreatedPage=new com.business.tonixPages.Stash_SoloStashCreatedPage();
        manageStashPage=new com.business.tonixPages.Stash_ManageStashPage();
        modifyStashPage=new com.business.tonixPages.Stash_ModifyStashPage();
        updatedStashPage=new com.business.tonixPages.Stash_UpdatedYourStashPage();
        manageStashPage = new com.business.tonixPages.Stash_ManageStashPage();
        withdrawFromYourStashPage = new com.business.tonixPages.Stash_WithdrawFromYourStashPage();
        reviewWithdrawPage = new com.business.tonixPages.Stash_ReviewWithdrawPage();
        withdrawConfirmationPage = new com.business.tonixPages.Stash_WithdrawConfirmationPage();
        stashAddToStashPage=new com.business.tonixPages.Stash_AddToStashPage();
        stashConfirmTransferToStashPage=new com.business.tonixPages.Stash_ConfirmTransferToStashPage();
        stashMoneyStashPage=new com.business.tonixPages.Stash_MoneyStashPage();
        stashDetailsPage=new com.business.tonixPages.Stash_StashDetailsPage();
        stashAchievedPage=new com.business.tonixPages.Stash_AchievedPage();
        stashCongratsGoalAchievedPage=new com.business.tonixPages.Stash_CongratsGoalAchievedPage();
        stashHowMuchWillYouInvestPage=new com.business.tonixPages.Stash_HowMuchWillYouInvestPage();
        stashYouBrokeTheStashPage=new com.business.tonixPages.Stash_YouBrokeTheStashPage();
        withdrawTransactionDetailsPage = new com.business.tonixPages.Stash_WithdrawTransactionDetailsPage();
        createdStashPage=new com.business.tonixPages.Stash_CreatedStashPage();
        stashSetupTimeDepositPage=new com.business.tonixPages.Stash_SetUpTimeDepositPage();
        stashWootWootPage=new com.business.tonixPages.Stash_WootWootPage();
    }

  /*  @AfterTest
    public void tonixAppQuit() throws Exception{
        basePage.TearDown();
    }*/
}
