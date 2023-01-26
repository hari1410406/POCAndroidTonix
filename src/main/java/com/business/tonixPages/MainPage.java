package com.business.tonixPages;

import com.android.selectors.MainSelectors;

public class MainPage extends BasePage {

    public MainPage() throws InterruptedException {
        super();
    }

    /**
     * Click on Stash link -
     * Either on 'Stash' text or 'Total Stash balance' text or 'Put your stash in cash' text in main page
     */
    public void clickTotalStashBalance() throws Exception {
        extent.HeaderChildNode("Clicking Total Stash Balance in main page");

        if(waitForElementToBePresent(MainSelectors.txtYourTonikAccount, 120,"Your Tonix Account text")) {
            extent.extentLoggerPass("Your Tonix Account text", "Text 'Your Tonix Account' found in main page");
            waitTime(2000);
            Swipe("up", 1);

            if(ifElementPresent(MainSelectors.txtTotalStashBalance, "'Total Stash balance' text")) {
                waitForElementAndClickIfPresent(MainSelectors.txtTotalStashBalance, 20,"Click 'Total Stash balance' text in main page");
                extent.extentLoggerPass("Total Stash balance", "Clicked on 'Total Stash balance' text in main page");
            }
            else if(ifElementPresent(MainSelectors.txtStashes, "'Stashes' text")) {
                waitForElementAndClickIfPresent(MainSelectors.txtStashes, 20,"Click 'Stashes' text in main page");
                extent.extentLoggerPass("Total Stash balance", "Clicked on 'Stashes' text in main page");
            }
            else if(ifElementPresent(MainSelectors.txtPutYourStashInCash, "'Put your stash in cash' text")) {
                waitForElementAndClickIfPresent(MainSelectors.txtPutYourStashInCash, 20,"Click 'Put your stash in cash' text in main page");
                extent.extentLoggerPass("Total Stash balance", "Clicked on 'Put your stash in cash' text in main page");
            }
            else {
                extent.extentLoggerFail("Navigate to Stashes", "Unable to click on Stashes link");
            }
        } else {
            extent.extentLoggerFail("Your Tonix Account text", "Text 'Your Tonix Account' found in main page");
        }
    }

    /**
     * Get the tonix account balance
     */
    public String getTonikAccounBalance() throws Exception {
    	
    	if(waitForElementToBePresent(MainSelectors.txtYourTonikAccount, 120,"Your Tonix Account text")) {
            String accountBalance = getText(MainSelectors.txtTonixAccountBalance);
            accountBalance = accountBalance.replace("₱","").replace(",","");
            return accountBalance;   		
    	} else {
    		extent.extentLoggerFail("Your Tonix Account text", "Text 'Your Tonix Account' found in main page");
    		return null;
    	}
    }

    /**
     * verify the tonix account balance
     */
    public void verifyTonikAccountBalance(String expectedBalance) throws Exception {
        extent.HeaderChildNode("Verify Tonix Account Balance");
        waitTime(2000);
        
        if(waitForElementToBePresent(MainSelectors.txtYourTonikAccount, 120,"Your Tonix Account text")) {
            String accountBalance = getText(MainSelectors.txtTonixAccountBalance);
            accountBalance = accountBalance.replace("₱","").replace(",","");
            if(expectedBalance.endsWith(".0"))
            	expectedBalance = expectedBalance.replace(".0",".00");
            if(accountBalance.equals(expectedBalance)) {
                extent.extentLoggerPass("Tonix Account Balance", "Expected: "+accountBalance);
            } else {
                extent.extentLoggerFail("Tonix Account Balance", "Actual: "+accountBalance+", Expected:"+expectedBalance);
            }        	
        } else {
        	extent.extentLoggerFail("Your Tonix Account text", "Text 'Your Tonix Account' found in main page");
        }
        

    }
}
