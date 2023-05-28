package lab10.ex3;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
public class JSONcreator {

    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("title", "Война и мир");
        book1.put("author", "Лев Толстой");
        book1.put("year", "1869");

        JSONObject book2 = new JSONObject();
        book2.put("title", "Мастер и Маргарита");
        book2.put("author", "Михаил Булшаков");
        book2.put("year", "1967");

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        try (FileWriter file = new FileWriter("src/lab10/ex3/example.json")) {
            file.write(library.toJSONString());
            System.out.println("Json успешно записан");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

