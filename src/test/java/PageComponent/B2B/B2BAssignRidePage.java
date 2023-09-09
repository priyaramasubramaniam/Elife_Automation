package PageComponent.B2B;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class B2BAssignRidePage {
      private static B2BAssignRidePage b2bAssignRideInstance;
      private B2BAssignRidePage(){}
      public static B2BAssignRidePage getInstance()
      {
            if(b2bAssignRideInstance == null)
            {
                  b2bAssignRideInstance = new B2BAssignRidePage();
            }
            return b2bAssignRideInstance;
      }

      @FindBy(id = "assign-ride") private WebElement linkAssignRide;
      public void clickOnAssignRideLink() {
            Utils.clickOnElement(linkAssignRide);}
      @FindBy(id = "ride_id") private WebElement inputRideId;
      public void enterRideId(String ride_id){ Utils.setTextOnElement(inputRideId, ride_id);}
      @FindBy(xpath = "/html/body/div[3]/div[5]/div[2]/div[1]/div[5]/div[6]/div[1]/div[2]/button") private WebElement btnSearch;
      public void clickOnSearchBtnInAssignRidePage() {Utils.clickOnElement(btnSearch);}
      @FindBy(id = "assign-ride-btn") private WebElement btnAssignRide;
      public void clickOnAssignRideBtn() {Utils.clickOnElement(btnAssignRide);}
      @FindBy(id = "modal-confirmation-input") private WebElement inputConfirmation;
      public void enterConfirmationText(String confirm_text){ Utils.setTextOnElement(inputConfirmation, confirm_text);}
      @FindBy(id = "send-assign-ride-to-agency") private WebElement btnConfirm;
      public void clickOnConfirmBtn() { Utils.clickOnElement(btnConfirm);}
}
