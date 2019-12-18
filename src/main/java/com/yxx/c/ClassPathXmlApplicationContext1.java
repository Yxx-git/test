package com.yxx.c;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ClassPathXmlApplicationContext1 implements MyApplicationContext {
	public ClassPathXmlApplicationContext1() {
		// TODO Auto-generated constructor stub
	}
	
	Map<String,String> map =new HashMap<String,String>();
	public ClassPathXmlApplicationContext1(String filePath) {
		//使用dom4j生成解析xml的对象
		SAXReader reader =new SAXReader();
		try {
		//读取xml文档
			Document doc= reader.read(ClassPathXmlApplicationContext1.class.getClassLoader().getResourceAsStream(filePath));
			//获得xml文档的根标签
			Element root =doc.getRootElement();
			//获得子标签
			Iterator<Element> it= root.elementIterator();
			//遍历所有子标签
			while(it.hasNext()) {
				Element child =it.next();
				List<Attribute> attr= child.attributes();
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public Object getBean(String beanid) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
