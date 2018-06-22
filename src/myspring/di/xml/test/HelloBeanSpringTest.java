package myspring.di.xml.test;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Ignore;
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
	
	//@Autowired
	@Resource(name="dataSource")
	DataSource dataSource;
	
	@Test
	public void conn() {
		try {
			System.out.println(dataSource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test @Ignore
	public void hello() {
		Assert.assertEquals("Hello »ý¼ºÀÚ", hello.sayHello());
		hello.print();
		
		List<String> names = hello.getNames();
		for (String value : names) {
			System.out.println(value);
		}
	}
}
