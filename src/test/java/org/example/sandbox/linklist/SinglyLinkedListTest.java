package org.example.sandbox.linklist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    private SinglyLinkedList<String> list;

    @BeforeEach
    void setUp() {
        list = new SinglyLinkedList<>();
    }

    @Test
    void testAddFirst() {
        list.addFirst("first");
        assertEquals("first", list.peekFirst());
        assertEquals("first", list.peekLast());
        assertEquals(1, list.size());

        list.addFirst("second");
        assertEquals("second", list.peekFirst());
        assertEquals("first", list.peekLast());
        assertEquals(2, list.size());
    }

    @Test
    void testAddLast() {
        list.addLast("first");
        assertEquals("first", list.peekFirst());
        assertEquals("first", list.peekLast());
        assertEquals(1, list.size());

        list.addLast("second");
        assertEquals("first", list.peekFirst());
        assertEquals("second", list.peekLast());
        assertEquals(2, list.size());
    }

    @Test
    void testPollFirst() {
        list.addFirst("first");
        list.addFirst("second");
        assertEquals("second", list.pollFirst());
        assertEquals("first", list.peekFirst());
        assertEquals(1, list.size());

        assertEquals("first", list.pollFirst());
        assertNull(list.peekFirst());
        assertEquals(0, list.size());
    }

    @Test
    void testPollLast() {
        list.addLast("first");
        list.addLast("second");
        assertEquals("second", list.pollLast());
        assertEquals("first", list.peekLast());
        assertEquals(1, list.size());

        assertEquals("first", list.pollLast());
        assertNull(list.peekLast());
        assertEquals(0, list.size());
    }

    @Test
    void testPeekFirst() {
        assertNull(list.peekFirst());
        list.addFirst("first");
        assertEquals("first", list.peekFirst());
    }

    @Test
    void testPeekLast() {
        assertNull(list.peekLast());
        list.addLast("first");
        assertEquals("first", list.peekLast());
    }

    @Test
    void testClear() {
        list.addFirst("first");
        list.addLast("second");
        list.clear();
        assertNull(list.peekFirst());
        assertNull(list.peekLast());
        assertEquals(0, list.size());
    }

    @Test
    void testContains() {
        list.addFirst("first");
        list.addLast("second");
        assertTrue(list.contains("first"));
        assertTrue(list.contains("second"));
        assertFalse(list.contains("third"));
    }

    @Test
    void testSize() {
        assertEquals(0, list.size());
        list.addFirst("first");
        assertEquals(1, list.size());
        list.addLast("second");
        assertEquals(2, list.size());
    }

    @Test
    void testToString() {
        assertEquals("[]", list.toString());
        list.addFirst("first");
        assertEquals("[first]", list.toString());
        list.addLast("second");
        assertEquals("[first, second]", list.toString());
    }
}