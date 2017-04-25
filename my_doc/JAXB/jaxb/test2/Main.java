package jaxb.test2;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Main {

	public static void main(String[] args) throws Exception{
		File file = new File("config/test2.xml");  
        JAXBContext jaxbContext = JAXBContext.newInstance(Logic.class);  
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
        Logic logic = (Logic)jaxbUnmarshaller.unmarshal(file);  
          
        System.out.println("sub1:");
        for(Column column : logic.getSub1().getColumn()) {
        	System.out.println("name:" + column.getName() + " id:" + column.getId());
        }
        
        System.out.println("sub2:");
        for(Column column : logic.getSub2().getColumn()) {
        	System.out.println("name:" + column.getName() + " id:" + column.getId());
        }
	}

}
