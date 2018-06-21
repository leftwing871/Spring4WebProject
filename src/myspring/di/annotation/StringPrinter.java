package myspring.di.annotation;

import org.springframework.stereotype.Component;

/*
 * <bean id="sPrinter" class="xx.StringPrinter"/>
   @Component("stringPrinter") �� id�� ������
 */
@Component
public class StringPrinter implements Printer {
	private StringBuffer buffer = new StringBuffer();

	public void print(String message) {
		this.buffer.append(message);
	}

	public String toString() {
		return this.buffer.toString();
	}
}
