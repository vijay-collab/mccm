package Mccm.Pega.DMPRealTime.PegaTest;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import Mccm.Pega.DMP.RealTime.PegaPreChkValidDMPCampCd;
import Mccm.Pega.Outbound.PegaMain.HomePage;
import Mccm.Pega.Outbound.PegaMain.LoginPage;
import Mccm.Pega.Outbound.PegaMain.PegaMarketPage;

import Mccm.Pega.Outbound.PegaMain.PegaPreChkValidCampCd;
import Mccm.Pega.Outbound.PegaMain.HomePageDetails;
//import Mccm.Pega.Outbound.PegaSubClass.HomePageDetails;
import Mccm.Pega.Outbound.PegaTestBase.TestBase;
import Mccm.Pega.QAUtil.TestUtil;

public class PegaPreChkValidDMPCampCdTest extends TestBase {

	private static final String priorty = null;
	LoginPage loginpage;
	HomePage  homepage;
	PegaPreChkValidDMPCampCd pegaPreChkValidDMPCampCd;
	TestUtil testutil;


	public PegaPreChkValidDMPCampCdTest()
	{
		super();
	}
	@BeforeMethod

	public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password")); 
		testutil=new TestUtil();
		pegaPreChkValidDMPCampCd =new PegaPreChkValidDMPCampCd();
		//    pegaMrktNBAValuChk=homepage.PegaMrktNBAValuChk();
	//	pegaPreChkValidDMPCampCd=homepage.Pegamrklunch4();
		 driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
	}



	@Test (priority=1)
	public void VerifyPreCheckDMPRTCampCodeValueValidSuccessfully() throws InterruptedException, AWTException { 

		homepage.Pegamrklunch4();
		pegaPreChkValidDMPCampCd.pegamarkting();
		testutil.WindowHandling();
		 driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		pegaPreChkValidDMPCampCd.ExpandPegMrkPage1();
		pegaPreChkValidDMPCampCd.CampaignImage();
		pegaPreChkValidDMPCampCd.Campaigns();
		testutil.SwitcToFrame(1);
		testutil.RobertAction();
		//	pegaPreChkValidDMPCampCd.Filter();
		//	pegaPreChkValidDMPCampCd.CampaignVlSrch();
		//	pegaPreChkValidDMPCampCd.View();
		pegaPreChkValidDMPCampCd.PreChkValdDMPCampCd();

	}

	@AfterMethod

	public void teardown() {

		driver.quit();

		System.out.println("DMP PreCheck Campaign Code Validation Done");
	}	 
}



