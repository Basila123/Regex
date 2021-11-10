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
    }

