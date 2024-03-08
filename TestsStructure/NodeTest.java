import org.junit.Test;
import java.util.*;


import java.util.LinkedList;

public class NodeTest {

    @Test
    public void testAddAce()
    {
        Deque<String> deck = new LinkedList<>();
        deck.add("Ace");
        assert (deck.peekFirst() == "Ace");
    }

    @Test
    public void testAddKing()
    {
        Deque<String> deck = new LinkedList<>();
        deck.addLast("King");
        assert (deck.peekLast() == "King");
    }

    @Test
    public void testRemoveAce()
    {
        Deque<String> deck = new LinkedList<>();
        deck.remove("Ace");
        assert (deck.peekFirst() != "Ace");
    }

    @Test
    public void testRemoveKing()
    {
        Deque<String> deck = new LinkedList<>();
        deck.remove("King");
        assert (deck.peekFirst() != "King");
    }
}