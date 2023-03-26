import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        User user = new User();


        System.out.println("Dados do Produto: ");
        System.out.println("Nome: ");
        product.name = sc.nextLine();


        System.out.println("Preço: ");
        product.price = sc.nextDouble();


        System.out.print("Quantidade que deseja comprar: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("dados do Produto: " + product);

        if (product.quantity <= 0) {
            System.out.println("Quantidade de produtos invalida!");
        } else {
            System.out.println("Quantidade de produtos aceita!");
        }



        System.out.println();
        System.out.println("Nome do cliente");
        user.nameUser = sc.nextLine();

        System.out.println();
        System.out.println("CPF");
        user.cpf = sc.nextDouble();

        System.out.println();
        System.out.println("telefone");
        user.phoneNunber = sc.nextDouble();

        System.out.println();
        System.out.println("Dados do cliente");
        System.out.println();
        System.out.println("Nome " + user.nameUser);
        System.out.println();
        System.out.println("CPF " + user.cpf);
        System.out.println();
        System.out.println("Telefone " + user.phoneNunber);

        sc.close();

    }
}
