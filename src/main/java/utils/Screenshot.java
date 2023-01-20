package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import driverFactory.DriverFactory;

public class Screenshot
{
   
    
    public static void getScreenshot (String path, String name) throws IOException
    {    	
        TakesScreenshot sc 	 = (TakesScreenshot)DriverFactory.getDriver();
        File sourceF =  sc.getScreenshotAs(OutputType.FILE);
        File destF = new File("./CrmBDD/screenshots/" + name +"/.jpg" );
        FileHandler.copy(sourceF, destF);
       
    }

}
