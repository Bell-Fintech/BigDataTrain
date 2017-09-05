package zd.dom4j;

import java.io.InputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4JTest {
public static void main(String[] args) throws Exception {
	SAXReader sax=new SAXReader();
	InputStream in=Dom4JTest.class.getResourceAsStream("items.xml");
	Document dom=sax.read(in);
	Element root=dom.getRootElement();
	List<Element> child=root.elements();
	for(Element first:child){
		System.out.println(first.attributeValue("count")+"\t");
		List<Element> grandson=first.elements();
		for(Element second:grandson){
			System.out.println(second.getName()+"\t"+second.getText()+"\t");
		}
		System.out.println();
	}
}
}
