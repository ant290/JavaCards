public class Main
{
    public static void main()
    {
       DeckOfCards myDeck = new DeckOfCards();
       myDeck.ShuffleDeck();

       for (Card card : myDeck.cards){
           System.out.println("id" + card.id + "title"+" "+ card.name);
       }
    }
}