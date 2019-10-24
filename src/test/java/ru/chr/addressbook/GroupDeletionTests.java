package ru.chr.addressbook;

import org.junit.Test;
import org.openqa.selenium.By;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        gotoGroupPage();
        selectGroup();
        deleteSelectedGroups();
        returnToGroupPage(By.linkText("groups"));
    }
}