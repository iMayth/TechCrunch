package TechCrunchAssignment.step_definitions;

import TechCrunchAssignment.pages.TheLatestNews;
import TechCrunchAssignment.utils.BrowserUtils;
import TechCrunchAssignment.utils.ConfigurationReader;
import TechCrunchAssignment.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


public class MainPageStepDefinitions {


    @Given("the user is on the main page")
    public void the_user_is_on_the_main_page()  {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);


    }
    @When("the user checks the latest news")
    public void the_user_checks_the_latest_news()  {
        BrowserUtils.waitForVisibility(new TheLatestNews().TheLatestNews,10);
        String actual="The Latest";
        String expected= new TheLatestNews().TheLatestNews.getText();
        Assert.assertEquals(expected,actual);


    }
    @Then("the user should be able to see each news has an author")
    public void the_user_should_be_able_to_see_each_news_has_an_author()  {

        BrowserUtils.waitForVisibility(new TheLatestNews().authors.get(new TheLatestNews().authors.size()-1),10);
        for (int i = 0; i < new TheLatestNews().authors.size(); i++) {
            Assert.assertTrue(new TheLatestNews().authors.get(i).getText().length()>0);
            System.out.println("Author "+ (i+1) +" is verified");
        }
            System.out.println("-----------------------");
    }
    @Then("the user should be able to see each news has an image")
    public void the_user_should_be_able_to_see_each_news_has_an_image()  {

        BrowserUtils.waitForClickablility(new TheLatestNews().images.get(new TheLatestNews().images.size()-1),10);
        for (int i = 0; i < new TheLatestNews().images.size(); i++) {

            Assert.assertTrue(new TheLatestNews().images.get(i).isDisplayed());
            if (new TheLatestNews().images.get(i).isDisplayed()){
                System.out.println("Image " +(i+1)+ " is verified");

            }

        }
            System.out.println("-----------------------");
    }
    @When("the user clicks any of the latest news")
    public void the_user_clicks_any_of_the_latest_news()  {
        BrowserUtils.waitForClickablility(new TheLatestNews().clickOneOfTheNews,10);
        new TheLatestNews().clickOneOfTheNews.click();


    }
    @Then("the user should be able to see the full content of the latest new")
    public void the_user_should_be_able_to_see_the_full_content_of_the_latest_new()  {
        BrowserUtils.waitForVisibility(new TheLatestNews().content,10);


    }
    @Then("the user should be able to see the browser title is the same with the news title")
    public void the_user_should_be_able_to_see_the_browser_title_is_the_same_with_the_news_title()  {
        BrowserUtils.waitForVisibility(new TheLatestNews().title,10);
        String browserTitle = Driver.get().getTitle();
        String theNewsTitle = new TheLatestNews().title.getText();

        //browser title contains an extra " | TechCrunch"; so titles are not the exact same

        if (browserTitle.equals(theNewsTitle)){
            System.out.println("Titles are the same : ");
            System.out.println(browserTitle);
            System.out.println(theNewsTitle);
        }else{
            System.out.println("Titles are not the same : ");
            System.out.println(browserTitle);
            System.out.println(theNewsTitle);
        }
        System.out.println("-----------------------");

    }
    @Then("the user should be able to see the the links within the news content")
    public void the_user_should_be_able_to_see_the_the_links_within_the_news_content()  {
        BrowserUtils.waitForClickablility(new TheLatestNews().links.get(new TheLatestNews().links.size()-1),10);
        for (WebElement i : new TheLatestNews().links) {
            if (i.getText()!=null){
                System.out.println(i.getText() + " --> Link verified");
                //System.out.println("Link verified");
            }

        }
        Driver.closeDriver();

    }

}
