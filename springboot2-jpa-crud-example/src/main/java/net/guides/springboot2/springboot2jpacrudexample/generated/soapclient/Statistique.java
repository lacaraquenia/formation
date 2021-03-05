
package net.guides.springboot2.springboot2jpacrudexample.generated.soapclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour statistique complex type.
 * 
 * <p>Le fragment de schema suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="statistique">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beneficeTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="chiffreAffairesTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="employeeChiffreAffairesMax" type="{http://simple.java7.soap.formation.alltech.com/}employee" minOccurs="0"/>
 *         &lt;element name="employeeChiffreAffairesMin" type="{http://simple.java7.soap.formation.alltech.com/}employee" minOccurs="0"/>
 *         &lt;element name="employeePlusRentable" type="{http://simple.java7.soap.formation.alltech.com/}employee" minOccurs="0"/>
 *         &lt;element name="employeesPeuRentables" type="{http://simple.java7.soap.formation.alltech.com/}employee" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="equipe" type="{http://simple.java7.soap.formation.alltech.com/}equipe" minOccurs="0"/>
 *         &lt;element name="idStatistique" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statistique", propOrder = {
    "beneficeTotal",
    "chiffreAffairesTotal",
    "employeeChiffreAffairesMax",
    "employeeChiffreAffairesMin",
    "employeePlusRentable",
    "employeesPeuRentables",
    "equipe",
    "idStatistique"
})
public class Statistique {

    protected double beneficeTotal;
    protected double chiffreAffairesTotal;
    protected Employee employeeChiffreAffairesMax;
    protected Employee employeeChiffreAffairesMin;
    protected Employee employeePlusRentable;
    @XmlElement(nillable = true)
    protected List<Employee> employeesPeuRentables;
    protected Equipe equipe;
    protected int idStatistique;

    /**
     * Obtient la valeur de la propriete beneficeTotal.
     * 
     */
    public double getBeneficeTotal() {
        return beneficeTotal;
    }

    /**
     * Definit la valeur de la propriete beneficeTotal.
     * 
     */
    public void setBeneficeTotal(double value) {
        this.beneficeTotal = value;
    }

    /**
     * Obtient la valeur de la propriete chiffreAffairesTotal.
     * 
     */
    public double getChiffreAffairesTotal() {
        return chiffreAffairesTotal;
    }

    /**
     * Definit la valeur de la propriete chiffreAffairesTotal.
     * 
     */
    public void setChiffreAffairesTotal(double value) {
        this.chiffreAffairesTotal = value;
    }

    /**
     * Obtient la valeur de la propriete employeeChiffreAffairesMax.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getEmployeeChiffreAffairesMax() {
        return employeeChiffreAffairesMax;
    }

    /**
     * Definit la valeur de la propriete employeeChiffreAffairesMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setEmployeeChiffreAffairesMax(Employee value) {
        this.employeeChiffreAffairesMax = value;
    }

    /**
     * Obtient la valeur de la propriete employeeChiffreAffairesMin.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getEmployeeChiffreAffairesMin() {
        return employeeChiffreAffairesMin;
    }

    /**
     * Definit la valeur de la propriete employeeChiffreAffairesMin.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setEmployeeChiffreAffairesMin(Employee value) {
        this.employeeChiffreAffairesMin = value;
    }

    /**
     * Obtient la valeur de la propriete employeePlusRentable.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getEmployeePlusRentable() {
        return employeePlusRentable;
    }

    /**
     * Definit la valeur de la propriete employeePlusRentable.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setEmployeePlusRentable(Employee value) {
        this.employeePlusRentable = value;
    }

    /**
     * Gets the value of the employeesPeuRentables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeesPeuRentables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeesPeuRentables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Employee }
     * 
     * 
     */
    public List<Employee> getEmployeesPeuRentables() {
        if (employeesPeuRentables == null) {
            employeesPeuRentables = new ArrayList<Employee>();
        }
        return this.employeesPeuRentables;
    }

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

    /**
     * Obtient la valeur de la propriete idStatistique.
     * 
     */
    public int getIdStatistique() {
        return idStatistique;
    }

    /**
     * Definit la valeur de la propriete idStatistique.
     * 
     */
    public void setIdStatistique(int value) {
        this.idStatistique = value;
    }

}
