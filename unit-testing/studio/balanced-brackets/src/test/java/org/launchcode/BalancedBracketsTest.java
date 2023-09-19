package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    String str = "[Launch] [Code]";

    @Test
    public void checkIfNull(){
        assertNotNull(str);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    /*That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].*/
    @Test
    public void BracketNotLeftOpen() {
        String msg = ""
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void BracketsNotMisNested() {
        String msg = "Makes sure brackets are not mis-nested";
        String testData = str;
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, msg);
    }}

    /*The string may contain non-bracket characters as well.

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    }
     */
