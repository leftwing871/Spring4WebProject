package myspring.di.xml.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import myspring.di.xml.Hello;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:configuration/springbeans.xml")
public class HelloBeanSpringTest {
	
	@Autowired
	@Qualifier("helloC")
	Hello hello;
	
	@Test
	public void hello() {
		Assert.assertEquals("Hello »ý¼ºÀÚ", hello.sayHello());
		hello.print();
		
		List<String> names = hello.getNames();
		for (String value : names) {
			System.out.println(value);
		}
	}
}
