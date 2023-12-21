package test.java.IstqbNc;

import main.java.pages.IstqbPage;
import main.java.pages.ResultatTestpage;
import main.java.pages.ToolBoxPage;
import org.testng.annotations.Test;
import test.java.base.BaseTests;

public class IstqbTests extends BaseTests {
    @Test
    public void higtestIstqTest() throws InterruptedException {
        ToolBoxPage toolBoxPage = homePage.clickToolBoxLink();
        IstqbPage istqbTestPage = toolBoxPage.clickOnIstqbTestfrenchLink();
        istqbTestPage.answerIstqbQuestion();
        ResultatTestpage resultatTestpage =istqbTestPage.clickOntermineBouton();
        resultatTestpage.submitEmail("zoe@hightest.nc");

    }

}
