package org.partbiz;

import org.partbiz.repository.InMemoryClientRepository;
import org.partbiz.service.BankService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static BankService bankService;

    public static void main(String[] args) {
       new Main().run();
    }

    public void run() {
        final InMemoryClientRepository repository = new InMemoryClientRepository(new ArrayList<>());
        bankService= new BankService(repository);

        try (Scanner scanner=new Scanner(System.in)) {
            while (true) {
                System.out.println("1- add user");
                System.out.println("2- find user");
                System.out.println("3- exit app");
                final String next = scanner.next();
                if (next.equals("1")) {
                    addUser(scanner);
                }
                if (next.equals("2")) {
                    printUser(scanner);
                }
                if (next.equals("3")) {
                    break;
                }
            }
        }
    }

    private void printUser(Scanner scanner) {
        System.out.println("Enter email:");
        final String mail = scanner.next();
        System.out.println(bankService.findByEmail(mail));
    }


    private void addUser(Scanner scanner) {
        System.out.println("Enter name:");
        final String name = scanner.next();
        System.out.println("Enter email:");
        final String mail = scanner.next();
        System.out.println("Enter balance:");
        final double balance = scanner.nextDouble();
        bankService.save(new Client(name, mail, balance));
    }
}
