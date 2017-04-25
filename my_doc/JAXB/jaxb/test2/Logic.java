package jaxb.test2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Logic")
public class Logic {

	private Sub1 sub1;
	private Sub2 sub2;
	
	public Logic() {}
	
	public Logic(Sub1 sub1, Sub2 sub2) {
		super();  
		this.sub1 = sub1;
		this.sub2 = sub2;
	}

	@XmlElement 
	public Sub1 getSub1() {
		return sub1;
	}

	public void setSub1(Sub1 sub1) {
		this.sub1 = sub1;
	}

	@XmlElement 
	public Sub2 getSub2() {
		return sub2;
	}

	public void setSub2(Sub2 sub2) {
		this.sub2 = sub2;
	}
}
