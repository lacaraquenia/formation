
package net.guides.springboot2.springboot2jpacrudexample.generated.soapclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour responseEquipes complex type.
 * 
 * <p>Le fragment de schema suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="responseEquipes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equipes" type="{http://simple.java7.soap.formation.alltech.com/}equipe" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseEquipes", propOrder = {
    "equipes"
})
public class ResponseEquipes {

    @XmlElement(nillable = true)
    protected List<Equipe> equipes;

    /**
     * Gets the value of the equipes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Equipe }
     * 
     * 
     */
    public List<Equipe> getEquipes() {
        if (equipes == null) {
            equipes = new ArrayList<Equipe>();
        }
        return this.equipes;
    }

}
