import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    //Класс Книга представляет собой книгу с полями для автора, названия и ID.
   private String title;
   private String author;
   private int id;

    //Этот класс также должен иметь метод для отображения его деталей.
    public void showDetails_Book() {
        System.out.println("Книга: " + title + " Автор: " + author + " ID: " + id);
    }
}
