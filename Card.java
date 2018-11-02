public class Card{
    int id;
    String name;
    String effect;

    public Card(){
        //instantiate with nothing
    }

    public Card(int _id,String _name,String _effect){
        //instantiate id, name and effect
        id = _id;
        name = _name;
        effect = _effect;
        //System.out.println(i+" "+n+" "+e);
    }
}