
package lab10.ex1;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;


public class XMLparser {
    public static void main(String[] args) {
        try {
            DocumentBuilder docBuild = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = docBuild.parse("src/lab10/ex1/example.xml");

            Node root = document.getDocumentElement();

            System.out.println("Книги");
            System.out.println();

            NodeList books = root.getChildNodes();
            for (int i = 0; i < books.getLength(); i++){
                Node book = books.item(i);

                if(book.getNodeType() != Node.TEXT_NODE){
                    NodeList bookProps = book.getChildNodes();
                    for(int j = 0; j< bookProps.getLength(); j++){
                        Node bookProp = bookProps.item(j);

                        if(bookProp.getNodeType() != Node.TEXT_NODE) {
                            System.out.println(bookProp.getNodeName() + ":" + bookProp.getChildNodes().item(0).getTextContent());

                        }
                    }
                    System.out.println("-----------------------");

                }





        }
    }
        catch (ParserConfigurationException ex) {
            ex.printStackTrace(System.out);
        }
        catch (SAXException ex){
            ex.printStackTrace(System.out);
        }
        catch (IOException ex){
            ex.printStackTrace(System.out);
        }
}
}