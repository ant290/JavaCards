public class Card{
    int id;
    String name;
    String effect;

    public Card(){
        //instantiate with nothing
    }

    public Card(int i,String n,String e){
        //instantiate id, name and effect
        id = i;
        name = n;
        effect = e;
        System.out.println(i+" "+n+" "+e);
    }
}