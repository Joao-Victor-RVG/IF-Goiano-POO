import java.util.*;

public class Main {

    private  static HashMap<Integer, Book> bookshelf = new HashMap<>();

    public static ArrayList<Login> logs = new ArrayList<>();

    public static Login logado = null;



    public static void main(String[] args){

        Loan bookingDate = null;


        bookshelf.put(1,  new Book("Halliday Fundamentos Da Fisica Eletromagnetismo","David Halliday", "Amazon", 10 ));
        bookshelf.put(2,  new Book("Halliday Fundamentos Da Fisica Eletromagnetismo","David Halliday", "Amazon", 11 ));
        bookshelf.put(3,  new Book("Halliday Fundamentos Da Fisica Eletromagnetismo","David Halliday", "Amazon", 12 ));
        bookshelf.put(4,  new Book("Codigo Limpo","Robert", "Amazon", 1 ));
        bookshelf.put(5,  new Book("Pense em Python","Robert", "Amazon", 1 ));
        bookshelf.put(6,  new Book("As cronicas de narnia","Lewis", "Amazon", 1 ));
        bookshelf.put(7,  new Book("Arte da Guerra","Lewis", "Amazon", 1 ));
        bookshelf.put(8,  new Book("Diario de Anne Frank","Lewis", "Amazon", 1 ));
        bookshelf.put(9,  new Book("A menina que roubava livros","Lewis", "Amazon", 1 ));
        bookshelf.put(10, new Book("As Aventuras de PI","Lewis", "Amazon", 1 ));

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        logs.add(new Login("Marcel", 1234));
        logs.add(new Login("Joao", 1234));
        logs.add(new Login("Pedro", 1234));



            System.out.println("Digite seu Login:");
            String loguer = sc.nextLine();

            System.out.println("Digite sua Senha:");
            double acess = sc.nextDouble();



        System.out.println("Escolha um livro" +
                "[1]  Halliday Fundamentos Da Fisica Eletromagnetismo Vol 10 " +
                "[2]  Halliday Fundamentos Da Fisica Eletromagnetismo Vol 11" +
                "[3]  Halliday Fundamentos Da Fisica Eletromagnetismo Vol 12" +
                "[4]  Codigo Limpo vol 1" +
                "[5]  Pense em Python vol 1" +
                "[6]  As cronicas de narnia vol 1" +
                "[7]  Arte da Guerra vol 1" +
                "[8]  Diario de Anne Frank vol 1" +
                "[9]  A menina que roubava livros vol 1" +
                "[10] As aventuras de pi vol 1");
        int chooseBook = sc.nextInt();
        switch (chooseBook){
            case 1:
                System.out.println("Você Escolheu a Opção [1]");
                break;
            case 2:
                System.out.println("Você escolheu a Opção [2]");
                break;
            case 3:
                System.out.println("Você escolheu a Opção [3]");
                break;
            case 4:
                System.out.println("Você escolheu a Opção [4]");
                break;
            case 5:
                System.out.println("Você escolheu a Opção [5]");
                break;
            case 6:
                System.out.println("Você escolheu a Opção [6]");
                break;
            case 7:
                System.out.println("Você escolheu a Opção [7]");
                break;
            case 8:
                System.out.println("Você escolheu a Opção [8]");
                break;
            case 9:
                System.out.println("Você escolheu a Opção [9]");
                break;
            case 10:
                System.out.println("Você escolheu a Opção [10]");
                break;
            default:
                System.out.println("Opção Invalida!");
        }













        sc.close();


    }
}


