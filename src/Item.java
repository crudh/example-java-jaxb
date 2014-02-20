import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Item {
    private String title;
    private String note;
    private int quantity;
    private double price;

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", note='" + note + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
