package TechCrunchAssignment.pages;

import TechCrunchAssignment.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TheLatestNews extends BasePage {
    public TheLatestNews(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//h2[contains(text(),'The Latest')]")
    public WebElement TheLatestNews;
    @FindBy(className = "river-byline__authors")
    public List <WebElement> authors;
    @FindBy(className ="post-block__footer")
    public List <WebElement> images;
    @FindBy(className = "post-block__content")
    public WebElement clickOneOfTheNews;
    @FindBy(className = "article-content")
    public WebElement content;
    @FindBy(className = "article__title")
    public WebElement title;
    @FindBy(xpath = "//div[@class='article-content']//p/a")
    public List <WebElement> links;

}
