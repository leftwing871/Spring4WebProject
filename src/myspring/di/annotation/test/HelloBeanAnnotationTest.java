package myspring.di.annotation.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import myspring.di.annotation.Hello;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:configuration/springbeans_annotation.xml")
public class HelloBeanAnnotationTest {
	
	@Autowired
	Hello helloA;
	
	@Test
	public void bean() {
		helloA.print();
	}
}
