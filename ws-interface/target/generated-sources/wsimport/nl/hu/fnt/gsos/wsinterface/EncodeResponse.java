
package nl.hu.fnt.gsos.wsinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncodeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncodeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="morse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncodeResponse", propOrder = {
    "morse"
})
public class EncodeResponse {

    @XmlElement(required = true)
    protected String morse;

    /**
     * Gets the value of the morse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMorse() {
        return morse;
    }

    /**
     * Sets the value of the morse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMorse(String value) {
        this.morse = value;
    }

}
