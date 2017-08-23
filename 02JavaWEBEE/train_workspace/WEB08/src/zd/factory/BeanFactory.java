package zd.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class BeanFactory {
	public static Object getBean(String beanName) throws DocumentException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		// 1放bean的集合
		Map<String, Object> map = new HashMap<>();
		// 2读取配置文件
		// a创建解析器
		SAXReader reader = new SAXReader();
		//b加载配置文件
		Document document = reader.read("src/application.xml");
		//c获取根节点
		Element rootElement = document.getRootElement();
		//获取bean元素
		List beans=rootElement.elements("bean");
		//遍历bean
		for(Object obj:beans){
			Element bean=(Element) obj;
			//id class
			List props = bean.elements("property");
			if(props.size()>0){
				for(Object obj2:props){
					Element prop=(Element) obj2;
					String name = prop.attribute("name").getValue();//key
					String text = prop.getText();
					//创建对象
					Object obj3=Class.forName(text).newInstance();//value
					map.put(name, obj3);
				}
			}
			//获取id class
			String key = bean.attribute("id").getValue();//key
			String value = bean.attribute("class").getValue();//value
			//创建对象
			Object obj4 = Class.forName(value).newInstance();
			//对象放在map中
			map.put(key, obj4);
		}
		return map.get(beanName);
	}
}
