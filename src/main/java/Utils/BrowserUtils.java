package Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserUtils {
    //WE CREATE BROWSERUTILS TO BE ABLE TO CALL REUSABLE METHODS FROM HERE TO REDUCE AMOUNT OF
    //THE CODES.
    public static void selectBy(WebElement element,String value,String methodName){
        Select select = new Select(element);

        switch (methodName){

            case "text":
                select.selectByVisibleText(value);
                break;
            case "index":
                select.selectByIndex(Integer.parseInt(value));
                break;
            case "value":
                select.selectByValue(value);
                break;
            default:
                System.out.println("Method name is not available,Use text,value,or index for method name");

            }
        }
    public static String getTextMethod(WebElement element){

        return element.getText().trim();
    }
}
