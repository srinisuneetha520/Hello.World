import java.io.*;
import java.util.concurrent.TimeUnit;
import org.apache.poi.hssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class DataDrivenUsingExcelFile
{
 
        public static void main(String[] args) 
        { 
 
        	System.setProperty("webdriver.chrome.driver","g:\\chromedriver.exe");
        	WebDriver  driver = new ChromeDriver();
            driver.get("http://www.google.com");
            driver.manage().window().maximize();  
            WebElement searchbox=driver.findElement(By.name("q"));
 
          try 
          {
    
                FileInputStream file = new FileInputStream(new File("d:\\testdata.xls")); 
                HSSFWorkbook workbook = new HSSFWorkbook(file);
                HSSFSheet sheet = workbook.getSheetAt(0);
                //System.out.println("Hello");
                for (int i=0; i <= sheet.getLastRowNum(); i++)
                {
   
                	String keyword=sheet.getRow(i).getCell(0).getStringCellValue();
       
                	searchbox.sendKeys(keyword);
 
                	searchbox.submit();       
  
                	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
 
                }
 
                workbook.close();
                file.close();
 
          }
          catch (FileNotFoundException fnfe) 
          {
        	  fnfe.printStackTrace();
          } 
          catch (IOException ioe) 
          {
        	  ioe.printStackTrace();
          }
    }
}