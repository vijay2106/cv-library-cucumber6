package co.library.demo6;

import co.library.demo6.propertyreader.PropertyReader;
import co.library.demo6.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Utility {
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));

    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
