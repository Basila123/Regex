package com.bridgelabzregex;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
//* For junit testing */
public class JUnitTest {
    FirstName obj = new FirstName();

        @Test
        public void testFirstName1() {
            Assert.assertTrue(obj.isFirstName("Basila"));
        }

        @Test
        public void testFirstName2() {
            Assert.assertFalse(obj.isFirstName("noushad"));
        }

    LastName1 obj1 = new LastName1();
        @Test
    public void isLastName1() {
        Assert.assertTrue(obj1.isLastName("Shehmin"));
    }

    @Test
    public void isLastName2() {
        Assert.assertFalse(obj1.isLastName("Shehmin1"));
    }

    Email obj2 = new Email();

    @Test
    public void isEmail1() {
        Assert.assertTrue(obj2.isEmail("abc@yahoo.com"));
    }

    @Test
    public void isEmail2() {
        Assert.assertTrue(obj2.isEmail("abc-100@yahoo.com"));
    }

    @Test
    public void isEmail3() {
        Assert.assertTrue(obj2.isEmail("abc.100@yahoo.com"));
    }

    @Test
    public void isEmail4() {
        Assert.assertTrue(obj2.isEmail("abc111@abc.com"));
    }

    @Test
    public void isEmail5() {
        Assert.assertTrue(obj2.isEmail("abc-100@abc.net"));
    }

    @Test
    public void isEmail6() {
        Assert.assertTrue(obj2.isEmail("abc.100@abc.com.au"));
    }

    @Test
    public void isEmail7() {
        Assert.assertTrue(obj2.isEmail("abc@1.com"));
    }

    @Test
    public void isEmail8() {
        Assert.assertTrue(obj2.isEmail("abc@yahoo.com.com"));
    }

    @Test
    public void isEmail9() {
        Assert.assertTrue(obj2.isEmail("abc+100@yahoo.com"));
    }

    Phone obj3 = new Phone();

    @Test
    public void isNumber() {
        Assert.assertTrue(obj3.isNumber("+971 569680786"));
    }

    Password obj4 = new Password();

    @Test
    public void password() {
        Assert.assertTrue(obj4.password("^&^%**$bas"));
    }
    }


