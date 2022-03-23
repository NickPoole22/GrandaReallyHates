package org.example;

import junit.framework.TestCase;

public class BarbTest extends TestCase {

    public void testLikesWord() {
        Barb b = new Barb();
        assertTrue(b.likesWord("vera"));
        assertTrue(b.likesWord("ball"));
        assertFalse(b.likesWord("energy"));
        assertFalse(b.likesWord(""));
    }

}