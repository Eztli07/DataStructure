public class Node
{
    private Main deck;

    private Node data;

    public Node(Main deck)
    {
        this.deck = deck;
        this.data = data;
    }

    public Main getDeck()
    {
        return deck;
    }

    public void setDeck(Main deck)
    {
        this.deck = deck;
    }

    public Node getData()
    {
        return data;
    }

    public void setData(Node data)
    {
        this.data = data;
    }


}
