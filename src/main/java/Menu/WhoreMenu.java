package Menu;

import Service.ServiceWhore;
import enity.Whore;

import java.util.ArrayList;
import java.util.Scanner;

public class WhoreMenu {
    ServiceWhore serviceWhore;
    Scanner in;

    public WhoreMenu(){
        serviceWhore = new ServiceWhore();
        in = new Scanner(System.in);
        printGreeting();
    }

    private void printGreeting() {
        System.out.println("Салют, ты попал в шлюший дом");
        System.out.println("Лови наше предложение:");
        System.out.println("1) Добавить шлюху");
        System.out.println("2) Найти шлюху по имени");
        System.out.println("3) Вывести имена всех шлюх");
        System.out.println("4) Выкупить проститутку :(");
        System.out.println("5) Вывести имена всех рабов по возрастанию силы.......");
        System.out.println("0) Самовыпил");
        int choice = in.nextInt();

        if(choice == 1){
            Whore whore = createAWhoreFromConsole();
            serviceWhore.addWhore(whore);
        }

        if(choice == 2){
            Whore whore = serviceWhore.searchByName(in.next());
            printWhore(whore);
        }

        if(choice == 3){
            printWhores(serviceWhore.getAllWhore());
        }
        printGreeting();
    }

    private void printWhore(Whore whore) {
        System.out.println(whore.toString());
    }

    private void printWhores(ArrayList<Whore> allWhore) {
        for(Whore whore : allWhore){
            System.out.println(whore.getName());
            System.out.println(whore.getPrice());
        }
    }

    private Whore createAWhoreFromConsole() {
        Whore whore = new Whore();
        whore.setName(in.next());
        whore.setPrice(in.nextDouble());
        return whore;
    }
}
