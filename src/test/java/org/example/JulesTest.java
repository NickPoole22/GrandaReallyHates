package org.example;

import junit.framework.TestCase;

public class JulesTest extends TestCase {

    public void testLikesWord() {
        Jules j = new Jules();
        assertTrue(j.likesWord("jules"));
        assertTrue(j.likesWord("hatch"));
        assertFalse(j.likesWord("good"));
        assertFalse(j.likesWord(""));

    }
}