package client;
import beans.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("injections/configure.xml");
		BeanFactory bfactory = new XmlBeanFactory(resource);
		Car car = (Car)bfactory.getBean("car1");
		car.displayCar();
	}

}
