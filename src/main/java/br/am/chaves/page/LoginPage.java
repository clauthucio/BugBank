package br.am.chaves.page;

import static br.am.chaves.core.DriverFactory.getDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public void acessInitialPage() {
        getDriver().get("https://bugbank.netlify.app/");
    }

    public void setCredentials(String email, String password) {
        getDriver().findElement(By.xpath("//div[@class='card__login']//input[@placeholder='Informe seu e-mail']")).sendKeys(email);
        getDriver().findElement(By.xpath("//div[@class='card__login']//input[@placeholder='Informe sua senha']")).sendKeys(password);
        getDriver().findElement(By.xpath("//div[@class='login__buttons']/button[.='Acessar']")).click();
    }

    public String registerNewUserWithBalance(String email, String name, String password) {
        getDriver().findElement(By.xpath("//div[@class='login__buttons']/button[.='Registrar']")).click();
        getDriver().findElement(By.xpath("//div[@class='card__register']//input[@placeholder='Informe seu e-mail']")).sendKeys(email);
        getDriver().findElement(By.xpath("//div[@class='card__register']//input[@placeholder='Informe seu Nome']")).sendKeys(name);
        getDriver().findElement(By.xpath("//div[@class='card__register']//input[@placeholder='Informe sua senha']")).sendKeys(password);
        getDriver().findElement(By.xpath("//div[@class='card__register']//input[@placeholder='Informe a confirmação da senha']")).sendKeys(password);
        WebElement element = getDriver().findElement(By.id("toggleAddBalance"));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", element);
        getDriver().findElement(By.xpath("//button[.='Cadastrar']")).click();
        String accountNumber = getDriver().findElement(By.xpath("//p[@id='modalText']")).getText();
//        getDriver().findElement(By.xpath("//a[@id='btnCloseModal']")).click();
        element = getDriver().findElement(By.id("btnCloseModal"));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", element);
        return accountNumber;
    }



}
