public class Demo {

  public static void main(String[] args) {
    // Bank bank = new Bank();

    // Nested static class
    Bank.Account account = new Bank.Account();
    System.out.println(account.getAccNo()); // 1

    // Nested class/ Inner class (non-static)
    // Box.Ball ball = new Box().new Ball();

    Box box = new Box();
    Box.Ball ball = box.new Ball();
    System.out.println(ball.getCapacity()); // 10
    box.add(ball);
    System.out.println(box.getBalls().size()); // 1

    // Anonymous Inner Class
    Swimable john = new Swimable() {
      @Override
      public void swim() {
        System.out.println("John is swimming...");
      }
    };

    john.swim();

    Swimable sally = new Swimable () {
      // public String name = "Sally";

      // public String getName() {
      //  return this.name;
      //}
      @Override
      public void swim() {
        System.out.println("Sally is swimming...");
      }
    };

    sally.swim();
    // sally.getName(); // Polynorphsim
    
  }
  
}
