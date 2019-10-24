package ru.chr.addressbook.tests;

import org.junit.Test;
import ru.chr.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test3", "test23", "test33"));
        app.getGroupHelper().submitGroupModification();
    }
}
