package StepDefinitions.B2B;

import Database.Agency_App_DB;
import PageComponent.B2B.B2BNavBarPage;
import PageComponent.B2B.B2BNotesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.io.IOException;
import java.sql.SQLException;

public class Download_Notes_for_agency {
      @And("I click on the search agency from the navigation bar")
      public void iClickOnTheSearchAgencyFromTheNavigationBar() {
            B2BNavBarPage.getInstance().clickOnSearchAgencyLink();
      }

      @And("I click on notes menu")
      public void iClickOnNotesMenu() {
            B2BNotesPage.getInstance().clickOnNotesLink();
      }
      @And("I verify the add button is disabled when no text in the notes field")
      public void iVerifyTheAddButtonIsDisabledWhenNoTextInTheNotesField() {
            Assert.assertFalse(B2BNotesPage.getInstance().isAddBtnEnabled());
      }
      @And("I enter {string} in the notes field")
      public void iEnterInTheNotesField(String notes) {
            B2BNotesPage.getInstance().enterNotesData(notes);
      }
      @And("I verify the add button is disabled when blank spaces in the notes field")
      public void iVerifyTheAddButtonIsDisabledWhenBlankSpacesInTheNotesField() {
            Assert.assertFalse(B2BNotesPage.getInstance().isAddBtnEnabled());
      }

      @And("I enter agency notes as {string}")
      public void iEnterAgencyNotesAs(String notes) {
            B2BNotesPage.getInstance().enterNotesData(notes);
      }

      @And("I click on add button in the notes page")
      public void iClickOnAddButtonInTheNotesPage() {
            B2BNotesPage.getInstance().clickOnAddBtn();
      }

      @And("I verify the success toast message {string} in notes page")
      public void iVerifyTheSuccessToastMessageInNotesPage(String success_msg) {
            Assert.assertEquals(B2BNotesPage.getInstance().getSuccessMsg(), success_msg);
      }

      @And("I verify the notes {string} added successfully in the UI")
      public void iVerifyTheNotesAddedSuccessfullyInTheUI(String resulted_notes) throws InterruptedException {
            Assert.assertEquals(B2BNotesPage.getInstance().getResultedNotes(), resulted_notes);
      }

      @And("I verify the notes {string} is displaying in the UI if the char limit is greater than thirty two")
      public void iVerifyTheNotesIsDisplayingInTheUIIfTheCharLimitIsGreaterThanThirtyTwo(String download_link_text) {
            Assert.assertTrue(B2BNotesPage.getInstance().isDisplayedDownloadLink(download_link_text));
      }

      @And("I get the agency notes data from csv file")
      public void iGetTheAgencyNotesDataFromCsvFile() {

      }

      @And("I compare the Csv agency note data to my expected data {string}")
      public void iCompareTheCsvAgencyNoteDataToMyExpectedData(String arg0) {
      }


      @And("I verify the notes {string} updated successfully in the DB")
      public void iVerifyTheNotesUpdatedSuccessfullyInTheDB(String notes) throws SQLException, IOException {
            Assert.assertEquals(notes, Agency_App_DB.getAgencyNotes(notes));
      }



}
