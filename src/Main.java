import object.Author;
import object.Book;

public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Author archibaldKronin = new Author("Арчибальд", "Кронин");
        Book annaKarenina = new Book("Анна Каренина",levTolstoy, 1984);
        Book citadel = new Book("Цитадель", archibaldKronin, 1968);



        System.out.println("Книга: " +annaKarenina.getTitle() + " автор:" +annaKarenina.getAuthor().getName()+ annaKarenina.getAuthor().getSurname()  + " Год публикации " + annaKarenina.getPublicationYear() );
    }
}