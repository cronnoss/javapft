package ru.chr.addressbook.tests;

import org.junit.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().gotoHome();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContacts();
        app.getContactHelper().acceptAllert();
        app.getContactHelper().returnToHomePage();
    }
}
