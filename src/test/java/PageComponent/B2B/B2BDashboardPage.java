package PageComponent.B2B;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class B2BDashboardPage {
      public static B2BDashboardPage b2bDashboardInstance;
      private B2BDashboardPage(){}

      public static B2BDashboardPage getInstance()
      {
            if(b2bDashboardInstance == null)
            {
                  b2bDashboardInstance = new B2BDashboardPage();
            }
            return b2bDashboardInstance;
      }
      @FindBy(id = "dashboard-agency-count") private WebElement textAgencyCount;
      public String getAgencyCount()
      {
            return Utils.getWebElementText(textAgencyCount);
      }
      @FindBy(id = "dashboard-partner-count") private WebElement textPartnerCount;
      public String getPartnerCount()
      {
            return Utils.getWebElementText(textPartnerCount);
      }
      @FindBy(id = "dashboard-affiliate-count") private WebElement textAffiliateCount;
      public String getAffiliateCount()
      {
            return Utils.getWebElementText(textAffiliateCount);
      }
      @FindBy(id = "dashboard-corporate-count") private WebElement textCorporateCount;
      public String getCorporateCount()
      {
            return Utils.getWebElementText(textCorporateCount);
      }
      @FindBy(id = "recent-agency-count") private WebElement textRecentAgenciesCount;
      public String getRecentAgenciesCount()
      {
            String recentAgenciesCount = textRecentAgenciesCount.getText();
            return recentAgenciesCount.replaceAll("[()]", "");
      }
      @FindBy(id = "recent-partner-count") private WebElement textRecentPartnersCount;
      public String getRecentPartnersCount()
      {
            String recentPartnersCount = textRecentPartnersCount.getText();
            return  recentPartnersCount.replaceAll("[()]", "");
      }
      @FindBy(id = "recent-affiliate-count") private WebElement textRecentAffiliatesCount;
      public String getRecentAffiliatesCount()
      {
            String recentAffiliatesCount = textRecentAffiliatesCount.getText();
            return recentAffiliatesCount.replaceAll("[()]", "");
      }
      @FindBy(id = "recent-corporate-count") private WebElement textRecentCorporatesCount;
      public String getRecentCorporatesCount()
      {
            String recentCorporatesCount = textRecentCorporatesCount.getText();
            return recentCorporatesCount.replaceAll("[()]", "");
      }
      @FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div[2]/div/div[3]/div[1]/div/table/tfoot/tr[1]/th/button") private WebElement textAgencyShowMoreBtn;
      @FindBy(xpath = "//table[@id='recent-agency-table']//tr[@class='recent-agency-item']")
      private List<WebElement> textRecentAgencies;
      public List<String> getRecentAgencies()
      {
            List<String> recentAgencies = new ArrayList<>();
            if(textAgencyShowMoreBtn.isDisplayed())
            {
                  Utils.clickOnElement(textAgencyShowMoreBtn);
            }
            for (WebElement recentAgency : textRecentAgencies)
            {
                  recentAgencies.add(recentAgency.getText());
            }
            return recentAgencies;
      }

      @FindBy(xpath = "//tr[@class='recent-partner-item']")
      private List<WebElement> textRecentPartners;
      public List<String> getRecentPartners()
      {
            List<String> recentPartners = new ArrayList<>();
            for (WebElement recentPartner : textRecentPartners)
            {
                  recentPartners.add(recentPartner.getText());
            }
            return recentPartners;
      }
      @FindBy(xpath = "//tr[@class='recent-affiliate-item']")
      private List<WebElement> textRecentAffiliates;
      public List<String> getRecentAffiliates()
      {
            List<String> recentAffiliates = new ArrayList<>();
            for (WebElement recentAffiliate : textRecentAffiliates)
            {
                  recentAffiliates.add(recentAffiliate.getText());
            }
            return recentAffiliates;
      }
      @FindBy(id = "corporate_show_more") private WebElement btnCorporateShowMore;
      @FindBy(xpath = "//table[@id='recent-corporate-table']//tr[@class='recent-corporate-item']")
      private List<WebElement> textRecentCorporates;
      public List<String> getRecentCorporates()
      {
            List<String> recentCorporates = new ArrayList<>();
            if (btnCorporateShowMore.isDisplayed())
            {
                  btnCorporateShowMore.click();
            }
            for (WebElement recentCorporate : textRecentCorporates)
            {
                  recentCorporates.add(recentCorporate.getText());
            }
            return recentCorporates;
      }
      @FindBy(id = "last-month-btn") private WebElement LinkLastMonth;
      public void clickOnLastMonthLink()
      {
            Utils.clickOnElement(LinkLastMonth);
      }


}
