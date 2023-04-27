package coffee.record;

import coffee.coffee_software.Beverage;
import coffee.coffee_software.Order;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Order_history {

    static AtomicInteger incre = new AtomicInteger();
    static DocumentBuilderFactory docFact = DocumentBuilderFactory.newInstance();
    static DocumentBuilder documentBuilder;

    static {
        try {
            documentBuilder = docFact.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    static Document doc = documentBuilder.newDocument();
    static Element rootElement = (Element) doc.appendChild(doc.createElement("orders"));

    public static void writeXml( OutputStream output)  throws TransformerException {

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        // pretty print XML
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");

        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(output);

        transformer.transform(source, result);

    }

    public static void xml_record(Order newOrder) {
        //Extract Beverage from the Order Object passed as argument
        Beverage beverageSold = newOrder.getBeverage();

        /// root elements
        // Create all element to be present in the file
        // Add Coffee Variety element
        Element CoffeeVariety = doc.createElement("espressoVariety");
        rootElement.appendChild(CoffeeVariety);
        CoffeeVariety.setAttribute("id", String.valueOf(incre.incrementAndGet()));

        // Date
        Element date = doc.createElement("date");
        date.setTextContent(newOrder.getDate().toString());
        CoffeeVariety.appendChild(date);

        // Espresso Variety
        Element estype = doc.createElement("name");
        estype.setTextContent(beverageSold.getType().getEtype());
        CoffeeVariety.appendChild(estype);
        // Additives
        Element eadds = doc.createElement("additives");
        eadds.setTextContent(beverageSold.getAdditive().getAdds());
        CoffeeVariety.appendChild(eadds);

        // Sizes
        Element esizes = doc.createElement("sizes");
        esizes.setTextContent(beverageSold.getSize().getSize());
        CoffeeVariety.appendChild(esizes);

        // Brew Options
        Element eoptions = doc.createElement("brewOptions");
        eoptions.setTextContent(beverageSold.getBrewOption().getBrew());
        CoffeeVariety.appendChild(eoptions);

        // Price
        Element eprice = doc.createElement("price");
        eprice.setTextContent(String.valueOf(newOrder.getTotal()));
        CoffeeVariety.appendChild(eprice);
    }

}

