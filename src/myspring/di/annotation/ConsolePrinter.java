package myspring.di.annotation;

import org.springframework.stereotype.Component;

/*
 * @Component("consolePrinter")
 */
@Component
public class ConsolePrinter implements Printer {
	public void print(String message) {
		System.out.println(message);
	}
}
