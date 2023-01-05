package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Please specify a name and email");
        } else if (args.length < 2) {
            System.out.printf("Please specify an email for %s", args[0]).println();
        } else {
            System.out.printf("%s <%s>", args[0], args[1]).println();
        }
    }
}