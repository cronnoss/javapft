package ru.chr.addressbook.tests;

import org.testng.annotations.Test;
import ru.chr.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void contactCreationTests() {
        app.getNavigationHelper().gotoHome();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Konstantin", "Solpakov", "4, apt 2,\\nFadeeva Str,\\nMoscow,\\n125047", "+79201211112", "ksolpakov@yahoo.com"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }
}
