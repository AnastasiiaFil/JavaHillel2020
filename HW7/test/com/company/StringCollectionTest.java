package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCollectionTest {

    @Test
    public void testAddPos() throws Exception {
        StringCollection test = new StringCollection();
        test.add("Hi");
        assertEquals("Hi", test.get(test.getSize() - 1));
    }

    @Test
    public void testAddNeg() throws Exception {
        StringCollection test = new StringCollection();
        test.add("Hi");
        assertNotEquals("H1", test.get(test.getSize() - 1));
    }

    @Test
    public void testDeletePos() throws Exception {
        StringCollection test = new StringCollection();
        test.add("Hi");
        test.add("How're you?");
        test.delete("Hi");
        assertEquals("How're you?", test.get(0));
    }

    @Test
    public void testDeleteNeg() throws Exception {
        StringCollection test = new StringCollection();
        test.add("Hi");
        test.add("How're you?");
        test.delete("Hi");
        assertNotEquals("Hi", test.get(0));
    }

    @Test
    public void testGetPos() throws Exception {
        StringCollection test = new StringCollection();
        test.add("Hi");
        test.add("How're you?");
        test.add("What's your name?");
        assertEquals("How're you?", test.get(1));
    }

    @Test
    public void testGetNeg() throws Exception {
        StringCollection test = new StringCollection();
        test.add("Hi");
        test.add("How're you?");
        test.add("What's your name?");
        assertNotEquals("Hi", test.get(1));
    }

    @Test
    public void testEqualsPos() throws Exception {
        StringCollection test = new StringCollection();
        test.add("Hi");
        test.add("How're you?");
        String[] str = new String[] {"Hi", "How're you?"};
        assertEquals(true, test.equals(str));
    }

    @Test
    public void testEqualsNeg() throws Exception {
        StringCollection test = new StringCollection();
        test.add("Hi");
        test.add("How're you?");
        String[] str = new String[] {"H1", "How're you?"};
        assertNotEquals(true, test.equals(str));
    }

    @Test
    public void testClearPos() {
        StringCollection test = new StringCollection();
        test.add("Hi");
        test.add("How're you?");
        test.add("What's your name?");
        test.clear();
        assertEquals(0, test.getSize());
    }

    @Test
    public void testClearNeg() {
        StringCollection test = new StringCollection();
        test.add("Hi");
        test.add("How're you?");
        test.add("What's your name?");
        test.clear();
        assertNotEquals(1, test.getSize());
    }

    @Test
    public void testIndexOfPos() {
        StringCollection test = new StringCollection();
        test.add("Hi");
        test.add("How're you?");
        test.add("What's your name?");
        assertEquals(1, test.indexOf("How're you?"));
    }

    @Test
    public void testIndexOfNeg() {
        StringCollection test = new StringCollection();
        test.add("Hi");
        test.add("How're you?");
        test.add("What's your name?");
        assertNotEquals(0, test.indexOf("How're you?"));
    }

    @Test
    public void testGetSizePos() {
        StringCollection test = new StringCollection();
        test.add("Hi");
        test.add("How're you?");
        test.add("What's your name?");
        assertEquals(3, test.getSize());
    }

    @Test
    public void testGetSizeNeg() {
        StringCollection test = new StringCollection();
        test.add("Hi");
        test.add("How're you?");
        test.add("What's your name?");
        assertNotEquals(2, test.getSize());
    }
}