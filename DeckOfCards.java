import java.util.*;
public class DeckOfCards implements iDeckOfCards{
    List<Card> cards = new ArrayList<Card>();

    public DeckOfCards(){
        //instantiate deck
        AddCard(1,"my card name","my card effect");
        AddCard(2,"my card name2","my card effect2");
        AddCard(2,"my card name3","my card effect3");
        AddCard(2,"my card name4","my card effect4");
    }

    public void AddCard(int i,String n,String e){
        cards.add(new Card(i,n,e));
    }
    
    public void ShuffleDeck(){
        Collections.shuffle(cards);
    }
}