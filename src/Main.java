import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Deque<String> deck = new ArrayDeque<String>();
        deck.add("Heart");
        deck.add("Club");
        deck.add("Diamond");

        for (String c : deck)
        {
            System.out.println(c);
        }
        System.out.println();

        deck.push("Spade");

        for (String c : deck)
        {
            System.out.println(c);
        }
        System.out.println();

        deck.pop();
        deck.remove("Diamond");

        for (String c : deck)
        {
            System.out.println(c);
        }
        System.out.println();
    }
}