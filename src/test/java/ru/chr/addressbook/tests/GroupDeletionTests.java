package ru.chr.addressbook.tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.returnToGroupPage(By.linkText("groups"));
    }
}