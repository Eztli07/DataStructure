import junit.framework.TestCase;
import java.util.*;

import java.util.LinkedList;

public class NodeTest extends Main {

    public void testAddAce()
    {
        Deque<String> deck = new LinkedList<>();
        deck.add("Ace");
        assert (deck.peekFirst() == "Ace");
    }

    public void testAddKing()
    {
        Deque<String> deck = new LinkedList<>();
        deck.addLast("King");
        assert (deck.peekLast() == "King");
    }

    public void testRemoveAce()
    {
        Deque<String> deck = new LinkedList<>();
        deck.remove("Ace");
        assert (deck.peekFirst() != "Ace");
    }

    public void testRemoveKing()
    {
        Deque<String> deck = new LinkedList<>();
        deck.remove("King");
        assert (deck.peekFirst() != "King");
    }
}