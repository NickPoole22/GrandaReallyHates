package org.example;

import junit.framework.TestCase;

public class JamieTest extends TestCase {
    public void testLikesWord()
    {
        Jamie j = new Jamie();
        assertTrue(j.likesWord("jamie"));
        assertTrue(j.likesWord("grandma"));
        assertFalse(j.likesWord("green"));
        assertFalse(j.likesWord(""));
    }
}