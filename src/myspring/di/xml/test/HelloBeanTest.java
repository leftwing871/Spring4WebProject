package myspring.di.xml.test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.GenericXmlApplicationContext;

import myspring.di.xml.Hello;

/*
 * Junit을 사용한 단위테스트 클래스
 * 단위테스트 메서드에는 선언부에 @Test 어노테이션을 선언해야 한다.
 */
public class HelloBeanTest {
	@Test
	public void hello() {
		//1. IoC 컨테이너 역할을 하는 객체생성
		BeanFactory factory = 
				new GenericXmlApplicationContext("configuration/springbeans.xml");
		//2. IoC 컨테이너에게 bean을 요청
		Hello hello1 = (Hello)factory.getBean("hello");
		Hello hello2 = factory.getBean("hello", Hello.class);
		System.out.println(hello1 == hello2);
		//2-1. Assert 클래스의 assertSame()을 사용하여 주소비교
		Assert.assertSame(hello1, hello2);//true
	}
}
