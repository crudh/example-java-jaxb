import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Shiporder {
    private String orderperson;
    private Shipto shipto;

    @XmlElement(name="item")
    private List<Item> items;

    @Override
    public String toString() {
        return "Shiporder{" +
                "orderPerson='" + orderperson + '\'' +
                ", shipto=" + shipto +
                ", items=" + items +
                '}';
    }
}
