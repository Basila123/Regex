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
    }

