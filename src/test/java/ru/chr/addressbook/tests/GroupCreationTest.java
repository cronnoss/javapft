package ru.chr.addressbook.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import ru.chr.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.gotoGroupPage();
        app.initGroupCreation("new");
        app.initGroupCreation("group_name");
        app.fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.submitGroupCreation("submit");
        app.returnToGroupPage(By.linkText("groups"));
    }
}
