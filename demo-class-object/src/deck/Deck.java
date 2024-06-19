package deck;

public class Deck {
  private static String[] suits = new String[] {"DIAMOND" , "CLUB", "HEART", "SPADE"};
  private static String[] ranks = new String[] {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};

  // Player, Deck, Card

  public static int length = suits.length * ranks.length;

  private Card[] cards;

  public Deck() {
    this.cards = new Card[suits.length * ranks.length];
    int idx = 0;
    for (String suit : suits) {
      for (String rank : ranks) {
        this.cards[idx++] = new Card(suit, rank);
      }
    }
  }


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

