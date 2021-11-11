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


    Email2 obj5 = new Email2();

    @Test
    public void isEmail10() {
        Assert.assertFalse(obj5.isEmail("abc"));
    }

    @Test
    public void isEmail11() {
        Assert.assertFalse(obj5.isEmail("abc@.com.my"));
    }

    @Test
    public void isEmail12() {
        Assert.assertFalse(obj5.isEmail("abc123@gmail.a"));
    }

    @Test
    public void isEmail13() {
        Assert.assertFalse(obj5.isEmail("abc123@.com"));
    }

    @Test
    public void isEmail14() {
        Assert.assertFalse(obj5.isEmail("abc123@.com.com"));
    }

    @Test
    public void isEmail15() {
        Assert.assertFalse(obj5.isEmail(".abc@abc.com"));
    }

    @Test
    public void isEmail16() {
        Assert.assertFalse(obj5.isEmail("abc()*@gmail.com"));
    }

    @Test
    public void isEmail17() {
        Assert.assertFalse(obj5.isEmail("abc@%*.com"));
    }

    @Test
    public void isEmail18() {
        Assert.assertFalse(obj5.isEmail("abc..2002@gmail.com"));
    }

    @Test
    public void isEmail19() {
        Assert.assertFalse(obj5.isEmail("abc.@gmail.com"));
    }

    @Test
    public void isEmail20() {
        Assert.assertFalse(obj5.isEmail("abc@abc@gmail.com"));
    }

    @Test
    public void isEmail21() {
        Assert.assertFalse(obj5.isEmail("abc@gmail.com.1a"));
    }

    @Test
    public void isEmail22() {
        Assert.assertFalse(obj5.isEmail("abc@gmail.com.aa.au"));
    }
    }


