package org.example;

import junit.framework.TestCase;

public class PennyTest extends TestCase {

    public void testLikesWord() {
        Penny p = new Penny();
        assertTrue(p.likesWord("penny"));
        assertTrue(p.likesWord("racecar"));
        assertFalse(p.likesWord("ginger"));
        assertFalse(p.likesWord(""));

    }
}