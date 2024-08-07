package deck;

public class Deck{
  // public static final String[] suits = new String[] {"DIAMOND" , "CLUB", "HEART", "SPADE"};
  // public static final String[] ranks = new String[] {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
  private Suit suits;
  private Rank ranks;

  // "static" belongs to class, not object

  // Player, Deck, Card

  public static int length = Suit.values().length * Rank.values().length;

  private Card[] cards;

  public Deck() {
    this.cards = new Card[Suit.values().length * Rank.values().length];
    int idx = 0;
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        this.cards[idx++] = new Card(suit, rank);
      }
    }
  }

  public static void test() {
    System.out.println("hello");
    Deck d = new Deck();
    d.getCards();
  }
  // cannot use "this", as it is a static method, need to point out which object is calling at.


    public Card[] getCards() {
      return this.cards;
    }

    public void shuffle(int times) {
      ShuffleManager sm = new ShuffleManager(getCards());
      sm.shuffle(times);
      this.cards = sm.getCards();
    }
  
    public static void main(String[] args) {
      Deck deck = new Deck();
      deck.shuffle(100);
      System.out.println("Card[] after shuffle():");
      for (Card card : deck.getCards()) {
        System.out.println(card);
      }
  
      Deck.test(); 
    }
  }

