package deck;

public class Card {
  // private static String[] suits = new String[] {"DIAMOND" , "CLUB", "HEART", "SPADE"};
  // private static String[] ranks = new String[] {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};

  // private String suit;
  // private String rank;

  private Suit suit;
  private Rank rank;

 public Card(Suit suit, Rank rank) {
  this.suit = suit;
  this.rank = rank;
 }

 // public String getSuit()
 public Suit geSuit() {
  return this.suit;
 }

 // public String getRanks()
 public Rank getRank() {
  return this.rank;
 }

// Coding Style: Early Return
 public boolean isHigherThan(Card card) { // when the method is defined small enough
  // compare rank first, if they are equal, then compare suit.

  // "OR" relationship
  if (this.rank.isHigherThan(card.getRank()))
    return true; // exit method!!
   if (this.rank == card.getRank() && this.suit.isHigherThan(card.geSuit()))
    return true;
  return false; // base condition("most likely" fall into)
 }
 // 打出細可能性的condition, 剩下既就會係base condition既return

 @Override
 public String toString() {
  return "Card("
  + "suit=" + this.suit
  + ", rank=" + this.rank
  +")" ;
 }

  public static void main(String[] args) {
    Deck deck = new Deck();
    // Card[] cards = deck.getCards();

    // deck.shuffle(200);

    new ShuffleManager(deck.getCards()).shuffle(10);
     for (Card card : deck.getCards()) {
    System.out.println(card);
    }

 System.out.println(new Card(Suit.CLUB, Rank.NINE).isHigherThan(new Card(Suit.DIAMOND, Rank.JACK))); //false

 System.out.println(new Card(Suit.CLUB, Rank.JACK).isHigherThan(new Card(Suit.DIAMOND, Rank.JACK))); //true
 

  }


}
