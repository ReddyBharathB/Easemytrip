package Pageclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Flightpage {
	@FindBy(xpath="//*[@id='myTopnav']/div[1]/ul/li[1]/a")
	 WebElement flight;
	
	@FindBy(xpath="//li[@class='border-lft flig-show click-one bg-color']")
	 WebElement oneway;
	
	@FindBy(xpath="//li[@class='click-round flig-show bg-color']")
	 WebElement roundway;
	
	@FindBy(id="FromSector_show")
	 WebElement from;
	
	@FindBy(xpath="//*[@class='aut-bx-m_not_use bx1']//li[1]")
	 WebElement fromSelected;
	
	@FindBy(id="Editbox13_show")
	 WebElement to;
	
	@FindBy(xpath="//*[@id='toautoFill']//li[2]")
	 WebElement toSelected;
	
	@FindBy(id="ddate")
	WebElement ddate;
	
	@FindBy(xpath="//li[@id='trd_3_17/08/2022']")
	WebElement Sdate;
	
	@FindBy(id="rdate")
	 WebElement returndate;
	
	@FindBy(xpath="//*[@class='active-date']/following-sibling::li[1]")
	 WebElement nextActiveDate;
	
	@FindBy(xpath="(//span[@class='drpNoTrv'])[1]")
	 WebElement Noofpeople;
	
	@FindBy(id="traveLer")
	 WebElement done;
	
	@FindBy(xpath="//span[@class='optclass-name']")
	 WebElement typeofclass;
	
	@FindBy(xpath="//div[@class='eb_widget_box']")
	 WebElement done1;
	
	@FindBy(xpath="//div[@id='eb_top_box_header_minimize']")
	 WebElement min_chat;
	
	@FindBy(xpath="//input[@class='src_btn']")
	 WebElement search;
	
	@FindBy(xpath="//button[@class='btn book-bt-n ng-scope']")
	 WebElement booknow;
	
	@FindBy(xpath="//*[@id='divInsuranceTab']//*[@class='insurencediv']//*[@class='insur-no']")
	 WebElement insurance;
	
	@FindBy(id="txtEmailId")
	 WebElement ContactInfo;
	
	@FindBy(id="spnVerifyEmail")
	 WebElement conbook;
	
	@FindBy(xpath="//div[@class='pdn12']//label[@class='ctr_cbox']//span[@class='cmark_cbox']")
	 WebElement selectpassenger;
	
	@FindBy(id="titleAdult0")
	 WebElement title;
	
	@FindBy(id="txtFNAdult0")
	 WebElement firstname;
	
	@FindBy(id="txtLNAdult0")
	 WebElement lastname;
	
	@FindBy(id="txtCPhone")
	 WebElement contact;
	
	@FindBy(id="spnTransaction")
	 WebElement conbook2;
	
	@FindBy(xpath="//a[@class='skipotp']")
	 WebElement skip;
	
	
	 WebDriver driver;
	 JavascriptExecutor js;
		
	 public Flightpage(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	 }
		
	 public void selectFlight() {
	  flight.click();
	  }
	
	 public void selectOneWay() {
	  oneway.click();
	 }
	
	 public void selectRoundway() {
	  roundway.click();
	 }
	
	 public void setFrom(String frm) {
	  from.click();
	  from.sendKeys(frm);
	 }
	
	 public void selectFrom() {
	  fromSelected.click();
	 }
	
	 public void setTo(String To) {
	  to.click();
	  to.sendKeys(To);
	 }
	
	 public void selectTo() {
	  toSelected.click();
	 }
	
	 public void SelectDate() {
		 ddate.click();
	 }
	 
	 public void SelectDate1() {
		 Sdate.click();
	 }
	 
	 public void clickRdate() {
	  returndate.click();
	 }
		
	 public void selectRdate() {
	  nextActiveDate.click(); 
	 }
	 
	 public void selectTraveler() {
	  Noofpeople.click();
	 }
	 
	 public void clickdone() {
	  done.click();
	 }
	 
	 public void selectclasstype() {
	  typeofclass.click();
	 }
	 
	 public void selectdone() {
	  done1.click();
	 }
	 
	 public void minimizeChatBox() {
		 min_chat.click();
	 }
	 
	 public void clickSearch() {
	  search.click();
	 }
	 
	 public void selectBooknow() {
	  booknow.click();
	 }
	 
	 public void selectInsurance() {
	  insurance.click();
	 }
	 
	 public void setemail(String em) {
	  ContactInfo.sendKeys(em);
	 }
	 
	 public void selectContinue() {
	  conbook.click();
	 }
	 
	 public void clickpassengerCheckBox() {
	  selectpassenger.click();
	 }
	 
	 public void selectTitle() {
	  Select choice=new Select(title);
	  choice.selectByIndex(1);
	 }
	 
	 public void setFirstName(String fn) {
	  firstname.sendKeys(fn);
	 }
	 
	 public void setLastName(String ln) {
	  lastname.sendKeys(ln);
	 }
	 
	 public void setContact(String cn) {
	  contact.sendKeys(cn);
	 }
	 
	 public void selectContinueBooking() {
		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView();",conbook2);
		 js.executeScript("arguments[0].click();",conbook2);
	  //conbook2.click();
	 }
	 
	 public void selectSkip() {
	  skip.click();
	 }
	

}
