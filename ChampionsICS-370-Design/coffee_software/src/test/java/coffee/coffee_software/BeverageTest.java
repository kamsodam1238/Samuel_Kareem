package coffee.coffee_software;
import coffee.coffee_beverage.*;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import static org.junit.jupiter.api.Assertions.*;

class BeverageTest {
    Beverage b1 = new Beverage(BeverageType.Latte, drinkAdd.Almond, drinkSize.Tall, brewOpt.Double);
    //Beverage b2 = new Beverage("LATTE", "ALMOND", "TALL","DOUBLE SHOT");

    @Test
    void addOption() {
        b1.addOption(customAdds.oat);
        b1.addOption(customAdds.mocha);
        String[] testArray = new String[] {"OAT", "MOCHA"};
        assertArrayEquals(testArray, b1.getCustomAdditives().toArray());
    }

    @Test
    void getType() {
        assertEquals(BeverageType.Latte,b1.getType());
    }

    @Test
    void getAdditive(){
        assertEquals(drinkAdd.Almond, b1.getAdditive());
    }

    @Test
    void getSize() {
        assertEquals(drinkSize.Tall,b1.getSize());
    }

    @Test
    void getBrewOption() {
        assertEquals(brewOpt.Double,b1.getBrewOption());
    }

    @Test
    void clearCustom() {
        b1.addOption(customAdds.eggnog);
        b1.clearCustom();
        assertTrue(b1.getCustomAdditives().isEmpty());
    }

    @Test
    void removeAdditive() {
        b1.addOption(customAdds.pumpkin);
        assertEquals(customAdds.pumpkin, b1.getCustomAdditives().get(0));
        b1.removeAdditive(customAdds.pumpkin);
        assertTrue(b1.getCustomAdditives().isEmpty());
    }

    @Test
    void diplayToString() {
        System.out.println(b1);
    }

    @Test
    void toXML() throws Exception {
        Beverage b2 = new Beverage();
        //New Bevarage is Caramel Cappuccino, Size TALL and Double Brew Shots
        b2.setType(BeverageType.Cappuccino);
        b2.setAdditive(drinkAdd.Caramel);
        b2.setSize(drinkSize.Tall);
        b2.setBrewOption(brewOpt.Double);
        //Extra custom additives are ALMOND and CINNAMON DOLCE
        b2.addOption(customAdds.almond);
        b2.addOption(customAdds.cindolce);

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        Document doc = docBuilder.newDocument();

        Element root = doc.createElement("Beverage");
        doc.appendChild(root);

        Element options = doc.createElement("Options");

        // Write additives
        for(customAdds additive : b2.getCustomAdditives()) {
            Element option = doc.createElement("Option");
            option.setTextContent(additive.toString());
            options.appendChild(option);
        }
        root.appendChild(options);

        writeXml(doc, new FileOutputStream("beverage.xml"));

        assertTrue(new File("beverage.xml").exists());
    }


    // write doc to output stream
    // from https://mkyong.com/java/how-to-create-xml-file-in-java-dom/
    private static void writeXml(Document doc,
                                 OutputStream output)
            throws TransformerException {

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(output);

        transformer.transform(source, result);

    }
}