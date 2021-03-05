
package net.guides.springboot2.springboot2jpacrudexample.generated.soapclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour responseStatistique complex type.
 * 
 * <p>Le fragment de schema suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="responseStatistique">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statistique" type="{http://simple.java7.soap.formation.alltech.com/}statistique" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseStatistique", propOrder = {
    "statistique"
})
public class ResponseStatistique {

    protected Statistique statistique;

    /**
     * Obtient la valeur de la propriete statistique.
     * 
     * @return
     *     possible object is
     *     {@link Statistique }
     *     
     */
    public Statistique getStatistique() {
        return statistique;
    }

    /**
     * Definit la valeur de la propriete statistique.
     * 
     * @param value
     *     allowed object is
     *     {@link Statistique }
     *     
     */
    public void setStatistique(Statistique value) {
        this.statistique = value;
    }

}
