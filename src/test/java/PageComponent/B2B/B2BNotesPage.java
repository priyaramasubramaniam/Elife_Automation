package PageComponent.B2B;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class B2BNotesPage {
      private static B2BNotesPage b2bNotesInstance;
      private B2BNotesPage(){}
      public static B2BNotesPage getInstance()
      {
            if(b2bNotesInstance == null)
            {
                  b2bNotesInstance = new B2BNotesPage();
            }
            return b2bNotesInstance;
      }

      @FindBy(id = "ag-note-log") private WebElement linkNotes;
      public void clickOnNotesLink() { Utils.clickOnElement(linkNotes);}
      @FindBy(id = "agency-notes-data") private WebElement textAreaNotes;
      public void enterNotesData(String notes_data) { Utils.setTextOnElement(textAreaNotes, notes_data);}
      @FindBy(id = "agency-notes-add-btn") private WebElement btnAdd;
      public boolean isAddBtnEnabled(){ return Utils.checkIfElementIsEnabled(btnAdd);}
      public void clickOnAddBtn(){ Utils.clickOnElement(btnAdd);}
      @FindBy(xpath = "//*[@id=\"top-notification-message\"]/strong") private WebElement textSuccessMsg;
      public String  getSuccessMsg() {  return Utils.getWebElementText(textSuccessMsg);}
      @FindBy(id = "note-content") private WebElement textResultedNotes;
      public String getResultedNotes() throws InterruptedException {
            Thread.sleep(10000);
            System.out.println(Utils.getWebElementText(textResultedNotes));
            return Utils.getWebElementText(textResultedNotes);
      }
      @FindBy(id = "downloadButton_qvsarrbhk") private WebElement linkDownloadNoteAsATextFile;
      public String getDownloadAsATextFileText(){
            return Utils.getWebElementText(linkDownloadNoteAsATextFile);}

      public boolean isDisplayedDownloadLink(String notes_data)
      {
            if(notes_data.length() >= 32)
            {
                  return linkDownloadNoteAsATextFile.isDisplayed();
            }
            return false;
      }

}
