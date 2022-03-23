package org.example;

import junit.framework.TestCase;

public class SherryTest extends TestCase {

    public void testLikesWord() {
        Sherry s = new Sherry();
        assertTrue(s.likesWord("sherry"));
        assertTrue(s.likesWord("blight"));
        assertFalse(s.likesWord("orange"));
        assertFalse(s.likesWord(""));
    }
}