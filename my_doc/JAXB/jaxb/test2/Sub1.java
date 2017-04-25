package jaxb.test2;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="sub1")
public class Sub1 {

	private List<Column> column;
	
	public Sub1() {}
	
	public Sub1(List<Column> column) {
		super();
		this.column = column;
	}

	@XmlElement
	public List<Column> getColumn() {
		return column;
	}

	public void setColumn(List<Column> column) {
		this.column = column;
	}

}
