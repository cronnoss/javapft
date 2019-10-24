package ru.chr.addressbook.tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage(By.linkText("groups"));
    }
}