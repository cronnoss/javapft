package ru.chr.addressbook;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("http://localhost/addressbook/");
        driver.manage().window().setSize(new Dimension(1400, 700));
        login("admin", "secret");
    }

    private void login(String username, String password) {
        driver.findElement(By.name("user")).sendKeys(username);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.cssSelector("input:nth-child(7)")).click();
    }

    protected void gotoGroupPage() {
        driver.findElement(By.linkText("groups")).click();
    }

    protected void initGroupCreation(String s) {
        driver.findElement(By.name(s)).click();
    }

    protected void fillGroupForm(GroupData groupData) {
        driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
        driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    protected void submitGroupCreation(String submit) {
        driver.findElement(By.name(submit)).click();
    }

    protected void returnToGroupPage(By groups) {
        driver.findElement(groups).click();
    }

    protected void selectGroup() {
        driver.findElement(By.name("selected[]")).click();
    }

    protected void deleteSelectedGroups() {
        driver.findElement(By.name("delete")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}