package deck;

public class Card {
  private static String[] suits = new String[] {"DIAMOND" , "CLUB", "HEART", "SPADE"};
  private static String[] ranks = new String[] {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};

  private String suit;
  private String rank;

 public Card(String suit, String rank) {
  this.suit = suit;
  this.rank = rank;
 }

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
  }

}
