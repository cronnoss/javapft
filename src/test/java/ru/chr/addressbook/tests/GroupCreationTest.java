package ru.chr.addressbook.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import ru.chr.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation("new");
        app.getGroupHelper().initGroupCreation("group_name");
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitGroupCreation("submit");
        app.getGroupHelper().returnToGroupPage(By.linkText("groups"));
    }
}