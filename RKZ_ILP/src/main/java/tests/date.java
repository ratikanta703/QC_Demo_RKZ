package tests;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;*/

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class date {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String date = "05/13/2020";
		LocalDate convertedDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		convertedDate = convertedDate.withDayOfMonth(
		convertedDate.getMonth().length(convertedDate.isLeapYear()));
		System.out.println("Month Last Day is : " + convertedDate);				 
		String WriteoffDate = convertedDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));	 
		System.out.println("Writeoff Date is: " + WriteoffDate);			
						
		String Due_Date[] =WriteoffDate.split("-");
        String Due_Date1 = Due_Date[0];
        String Due_Date2 = Due_Date[1];
        String Due_Date3 = Due_Date[2];

	}

}
