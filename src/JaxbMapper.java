import javax.xml.bind.JAXBException;
import java.io.File;

class JaxbMapper {
    public static void main(String[] args) throws JAXBException {
        File xml = new File("src/xml/shiporder.xml");

        Shiporder shiporder = XmlUtil.unmarshal(Shiporder.class, xml);

        System.out.println(shiporder.toString());
    }
}
