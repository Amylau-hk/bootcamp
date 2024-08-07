import javax.security.auth.Subject;

public class School {

  public static void createSubject() {

    // 自私用!!! ONLY can use inside createSubject()
    class subject {

    }

    Subject subject = new Subject();
  }

  public static void main(String[] args) {
    // Subject class can be only used by createSubject() method
  }
  
}
