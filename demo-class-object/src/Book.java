import java.time.LocalDate;

public class Book {

  private String authorName;
  private LocalDate publishDate;
  private int noofPage;


  // instance method (Object method)
  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

   // instance method (Object method)
  public void setPublicDate(LocalDate publishDate) {
    this.publishDate = publishDate;
  }

   // instance method (Object method)
  public void setNoofPage(int noofPage) {
    this.noofPage = noofPage;
  }

   // instance method (Object method)
  public String getAuthorName() {
    return this.authorName;
  }

   // instance method (Object method)
  public LocalDate getPublishDate() {
    return this.publishDate;
  }

   // instance method (Object method)
  public int getNoofPage() {
    return this.noofPage;
  }

  // static method
  public static String hello() {
    return "hello";
  }

}
