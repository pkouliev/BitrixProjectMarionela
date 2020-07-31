package com.Bytrix.Pages;

import com.Bytrix.Utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public  abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
