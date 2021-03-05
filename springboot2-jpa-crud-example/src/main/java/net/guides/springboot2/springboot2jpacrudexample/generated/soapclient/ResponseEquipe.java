
package net.guides.springboot2.springboot2jpacrudexample.generated.soapclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour responseEquipe complex type.
 * 
 * <p>Le fragment de schema suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="responseEquipe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equipe" type="{http://simple.java7.soap.formation.alltech.com/}equipe" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseEquipe", propOrder = {
    "equipe"
})
public class ResponseEquipe {

    protected Equipe equipe;

    /**
     * Obtient la valeur de la propriete equipe.
     * 
     * @return
     *     possible object is
     *     {@link Equipe }
     *     
     */
    public Equipe getEquipe() {
        return equipe;
    }

    /**
     * Definit la valeur de la propriete equipe.
     * 
     * @param value
     *     allowed object is
     *     {@link Equipe }
     *     
     */
    public void setEquipe(Equipe value) {
        this.equipe = value;
    }

}
