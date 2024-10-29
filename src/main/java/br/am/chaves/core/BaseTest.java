package br.am.chaves.core;

import static br.am.chaves.core.DriverFactory.killDriver;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

import br.am.chaves.page.LoginPage;

public class BaseTest {

//    @Rule
//    public TestName testName = new TestName();

    private static LoginPage loginPage = new LoginPage();

    @Before
    public void initialize() {
        loginPage.acessInitialPage();
    }

    @After
    public void ends() throws IOException {

//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        String zoomPage = "document.body.style.zoom = '50%'";
//        js.executeScript(zoomPage);
//
//        TakesScreenshot ss = (TakesScreenshot) getDriver();
//        File arquivo = ss.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" + File.separator +
//                testName.getMethodName() + ".jpg"));

        if(Properties.CLOSE_BROWSER) {
            killDriver();
        }
    }

}
