import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;


public class FactParser {

    // private FactRepository factRepository;


    // public FactParser() {
    //     this.factRepository = getFactRepository();
    // }


    // public FactRepository getFactRepository() {
    //     return new FactRepository();        
    // }

    
    public static void main(String[] args) {


        try {
            File xmlFile = new File("Facts.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);

            doc.getDocumentElement().normalize();

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("Fact");

            System.out.println("----------------------------");

            for(int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                System.out.println("Current element: " + nNode.getNodeName());

                if(nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    System.out.println("Staff id: " + eElement.getAttribute("id"));
                    System.out.println("Description: " + eElement.getAttribute("value"));

                }


            }


        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }


}