package info.gezielcarvalho.desafio01;

import info.gezielcarvalho.desafio01.entities.Order;
import info.gezielcarvalho.desafio01.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	private final OrderService orderService;

    public Desafio01Application(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Código: ");
		String code = sc.nextLine();
		System.out.println("Valor básico: ");
		double basic = sc.nextDouble();
		System.out.println("Desconto: ");
		double discount = sc.nextDouble();

		var order = new Order();
		order.setCode(Integer.parseInt(code));
		order.setBasic(basic);
		order.setDiscount(discount);

		var totalValue = orderService.total(order);

		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor Total = R$ %.2f%n", totalValue);
		sc.close();
	}
}
