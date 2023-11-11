import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private String studentName;
    private int studentId;
    private Book borrowedBook; // объект типа Book

    public void borrowedBook(Book book) {
        if (borrowedBook == null) {
            borrowedBook = book;
            System.out.println(studentName + " взятая студентом книга: " + book.getTitle());
        } else {
            System.out.println(studentName + " взял книгу и не может взять еще одну");
        }
    }

    private void returnBook() {
        if (borrowedBook != null) {
            System.out.println(studentName + " вернул книгу: " + borrowedBook.getTitle());
            borrowedBook = null;
        }
    }
    //Студент представляет студента с полями для его имени и номера студенческого билета
    //Студент может держать только одну книгу одновременно.
    // Этот класс должен иметь метод для отображния его деталей и взятой книги.
//Студент может взять взаймы только одну книгу за раз.
}
