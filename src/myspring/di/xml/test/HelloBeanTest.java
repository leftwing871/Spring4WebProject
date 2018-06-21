package myspring.di.xml.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

import myspring.di.xml.Hello;

/*
 * Junit�� ����� �����׽�Ʈ Ŭ����
 * �����׽�Ʈ �޼��忡�� ����ο� @Test ������̼��� �����ؾ� �Ѵ�.
 */
public class HelloBeanTest {
	@Test
	public void hello() {
		//1. IoC �����̳� ������ �ϴ� ��ü����
		BeanFactory factory = 
				new GenericXmlApplicationContext("configuration/springbeans.xml");
		//2. IoC �����̳ʿ��� bean�� ��û
		Hello hello1 = (Hello)factory.getBean("hello");
		Hello hello2 = factory.getBean("hello", Hello.class);
		System.out.println(hello1 == hello2);
		//2-1. Assert Ŭ������ assertSame()�� ����Ͽ� �ּҺ�
		Assert.assertSame(hello1, hello2);//true
	}
}
