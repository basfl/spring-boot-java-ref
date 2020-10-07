package com;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBSource;

import com.x.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JAXBException
    {
        System.out.println( "Hello World!" );
        Customer cx=new Customer();
        cx.setName("cx");
        // Create the JAXBContext
     
        
        ///////////////////////////////
        Customer originalCustomer = new Customer();
        originalCustomer.setName("Jane Doe");
//        Address originalAddress = new Address();
//        originalAddress.setStreet("123 A Street");
//        originalAddress.setCity("Any Town");
//        originalCustomer.setAddress(originalAddress);
// 
        // Create the JAXBContext
        JAXBContext jc = JAXBContext.newInstance(Customer.class);
 
        // Wrap the Customer object in a JAXBSource
        JAXBSource source = new JAXBSource(jc, originalCustomer);
        
        System.out.println("*******"+source);
 
        // Treat the JAXBSource as an XML input and unmarshal it
        Unmarshaller unmarshaller = jc.createUnmarshaller();
       Object cp = unmarshaller.unmarshal(source);
       System.out.println("----"+cp);
       com.common.Customer cp1=(com.common.Customer) cp;
      //  com.common.Customer copiedCustomer = (com.common.Customer) unmarshaller.unmarshal(source);
// 
        // Marshal the copy of Customer to demonstrate that it is populated
//        Marshaller marshaller = jc.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        marshaller.marshal(copiedCustomer, System.out);
        ///////////////////////////////
    }
}
