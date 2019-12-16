package ru.chr.addressbook.tests;

import org.testng.annotations.Test;
import ru.chr.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoHome();
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Konstantin", "Solpakov", "44, apt 2,\\nFadeeva Str,\\nMoscow,\\n125047", "+79201211112", "ksolpakov@qq.com"));
        app.getContactHelper().submitContactModification();
    }
}
