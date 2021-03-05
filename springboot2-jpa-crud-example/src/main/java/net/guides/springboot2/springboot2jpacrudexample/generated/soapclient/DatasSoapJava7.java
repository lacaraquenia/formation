
package net.guides.springboot2.springboot2jpacrudexample.generated.soapclient;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DatasSoapJava7", targetNamespace = "http://simple.java7.soap.formation.alltech.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DatasSoapJava7 {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.ResponseEquipes
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/associerRequest", output = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/associerResponse")
    public ResponseEquipes associer(
        @WebParam(name = "arg0", partName = "arg0")
        long arg0,
        @WebParam(name = "arg1", partName = "arg1")
        long arg1);

    /**
     * 
     * @return
     *     returns net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.ResponseEquipes
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/getAllEquipesRequest", output = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/getAllEquipesResponse")
    public ResponseEquipes getAllEquipes();

    /**
     * 
     * @param arg0
     * @return
     *     returns net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.ResponseEquipe
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/getEquipeByIdRequest", output = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/getEquipeByIdResponse")
    public ResponseEquipe getEquipeById(
        @WebParam(name = "arg0", partName = "arg0")
        long arg0);

    /**
     * 
     * @return
     *     returns net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.ResponseEmployees
     */
    @WebMethod
    @WebResult(name = "reponse", partName = "reponse")
    @Action(input = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/getAllEmployeesRequest", output = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/getAllEmployeesResponse")
    public ResponseEmployees getAllEmployees();

    /**
     * 
     * @param arg0
     * @return
     *     returns net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.ResponseEmployees
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/deleteEmployeeRequest", output = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/deleteEmployeeResponse")
    public ResponseEmployees deleteEmployee(
        @WebParam(name = "arg0", partName = "arg0")
        long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.ResponseEmployee
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/getEmployeeByIdRequest", output = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/getEmployeeByIdResponse")
    public ResponseEmployee getEmployeeById(
        @WebParam(name = "arg0", partName = "arg0")
        long arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.ResponseEmployee
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/updateEmployeeRequest", output = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/updateEmployeeResponse")
    public ResponseEmployee updateEmployee(
        @WebParam(name = "arg0", partName = "arg0")
        long arg0,
        @WebParam(name = "arg1", partName = "arg1")
        Employee arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.ResponseEmployee
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/createEmployeeRequest", output = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/createEmployeeResponse")
    public ResponseEmployee createEmployee(
        @WebParam(name = "arg0", partName = "arg0")
        Employee arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.ResponseStatistique
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/getStatistiqueEquipeRequest", output = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/getStatistiqueEquipeResponse")
    public ResponseStatistique getStatistiqueEquipe(
        @WebParam(name = "arg0", partName = "arg0")
        long arg0);

    /**
     * 
     * @return
     *     returns net.guides.springboot2.springboot2jpacrudexample.generated.soapclient.ResponseStatistique
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/getStatistiqueAllEmployeesRequest", output = "http://simple.java7.soap.formation.alltech.com/DatasSoapJava7/getStatistiqueAllEmployeesResponse")
    public ResponseStatistique getStatistiqueAllEmployees();

}
