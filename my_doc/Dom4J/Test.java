import java.io.*;

import org.dom4j.*;

/**
 * 在Dom4J中组装和解析XML代码，需要一个Document对象，有两个重要概念Element和Node
 * 	1.Element:即标签本身，如<dog></dog>就是一个element
 *  2.Node:即节点或子元素，包含整个element和内容，如<dogName>pipi</dogName>
 * 下面代码将生成一个如下的XML片段：
    <MyRoot>
		<dog>
			<dogName>pipi</dogName>
			<dogColor>black</dogColor>
		</dog>
	
		<cat>
			<catName>mimi</catName>
			<catColor>white</catColor>
		</cat>
	</MyRoot>
 *
 * 其中：<MyRoot>的element的个数是2，分别是<dog></dog>和<cat></cat>,Node个数也是2.
 * 	          叫"dog"的element的个数是myRoot.elements("dog").size() = 1,Node个数是2.  
 */
public class Test {

	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("test.xml");
		Document doc = DocumentHelper.createDocument();
		Element myRoot = doc.addElement("MyRoot");
		Element dog = myRoot.addElement("dog");
		Element cat = myRoot.addElement("cat");
		Element dogName = dog.addElement("dogName");
		Element dogColor = dog.addElement("dogColor");
		Element catName = cat.addElement("catName");
		Element catColor = cat.addElement("catColor");

		dogName.addText("pipi");
		dogColor.addText("black");
		catName.addText("mimi");
		catColor.addText("white");
		
		System.out.println("MyRoot的Node个数为：" + myRoot.nodeCount());
		System.out.println("MyRoot的Element个数为：" + myRoot.elements().size());
		System.out.println("dog的Node个数为：" + dog.nodeCount());
		System.out.println("dog的Element个数为：" + myRoot.elements("dog").size());
		
		doc.write(file);
		file.close();
	}

}
