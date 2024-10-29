package br.am.chaves.test;

import br.am.chaves.core.BaseTest;
import br.am.chaves.page.LoginPage;
import org.junit.Test;

public class TranferTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void testeOk (){
        String account1 = loginPage.registerNewUserWithBalance("test1@test.com", "João", "pass123");
//        String account2 = loginPage.registerNewUserWithBalance("test2@test.com", "Maria", "pass321");
        loginPage.setCredentials("test1@test.com", "pass123");
        System.out.println(account1);
//        System.out.println(account2);
    }

}
