package lab10.ex4;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class JsonParser {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lab10/ex4/example-JSON.json"));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("корневой элемент: " + jsonObject.keySet().iterator().next());

        }
    }
}
