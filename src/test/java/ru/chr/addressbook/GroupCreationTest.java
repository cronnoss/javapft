package ru.chr.addressbook;

import org.junit.Test;
import org.openqa.selenium.By;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation("new");
        initGroupCreation("group_name");
        fillGroupForm(new GroupData("test1", "test2", "test3"));
        submitGroupCreation("submit");
        returnToGroupPage(By.linkText("groups"));
    }
}
