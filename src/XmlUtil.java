import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.StringReader;

public class XmlUtil {
    public static <T> T unmarshal(Class<T> targetClass, String xml) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(targetClass);
        Unmarshaller um = jc.createUnmarshaller();

        return (T)um.unmarshal(new StringReader(xml));
    }

    public static <T> T unmarshal(Class<T> targetClass, File xmlFile) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(targetClass);
        Unmarshaller um = jc.createUnmarshaller();

        return (T)um.unmarshal(xmlFile);
    }
}
