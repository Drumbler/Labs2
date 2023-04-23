package lab10.ex1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ElementTraversal;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XMLcreator {
    public static void main(String[] args) {

        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
//создаем корень
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("library");
            doc.appendChild(rootElement);
//создание книги
            Element book1 = doc.createElement("book");
            rootElement.appendChild(book1);
//название книги
            Element title1 = doc.createElement("title");
            title1.appendChild(doc.createTextNode("123"));
            book1.appendChild(title1);
//Автор
            Element author1 = doc.createElement("author");
            author1.appendChild(doc.createTextNode("вася пупкин"));
            book1.appendChild(author1);
//год выпуска
            Element year1 = doc.createElement("year");
            year1.appendChild(doc.createTextNode("199999"));
            book1.appendChild(year1);

//создание книги
            Element book2 = doc.createElement("book");
            rootElement.appendChild(book2);
//название книги
            Element title2 = doc.createElement("title");
            title2.appendChild(doc.createTextNode("1234"));
            book2.appendChild(title2);
//Автор
            Element author2 = doc.createElement("author");
            author2.appendChild(doc.createTextNode("Иван Иваныч"));
            book2.appendChild(author2);
//год выпуска
            Element year2 = doc.createElement("year");
            year2.appendChild(doc.createTextNode("2000"));
            book2.appendChild(year2);
//запись инфы в XML и создание XML файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lab10/ex1/example.xml"));
            transformer.transform(source, result);
            System.out.println("XML СОЗДАН!");
        }
        catch (Exception pce) {
            pce.printStackTrace();
        }

    }
}
