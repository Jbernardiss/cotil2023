import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choosenOption;
        int searchInput;

        Book b1 = new Book(1, "The Lord of The Rings", 25.00, "J.R.R Tolkien");
        Book b2 = new Book(2, "Oliver Twist", 15.00, "Charles Dickens");
        CD cd1 = new CD(3, "Nevermind", 25.00, 13);
        DVD dvd1 = new DVD(4, "Ten", 45.00, 53);
        DVD dvd2 = new DVD(5, "Superunknown", 45.00, 70);

        Scanner scanner = new Scanner(System.in);

        ArrayList<GenericItem> Items = new ArrayList<GenericItem>();
        Items.add(b1);
        Items.add(b2);
        Items.add(cd1);
        Items.add(dvd1);
        Items.add(dvd2);

        for(GenericItem g : Items) {
            System.out.println(g.getName());
        }

        while(true) {
            System.out.println("Choose an option: ");
            System.out.println("[1] Show Books");
            System.out.println("[2] Show CDs");
            System.out.println("[3] Show DVDs");
            System.out.println("[4] Search for item");
            System.out.println("[5] Exit");

            System.out.print("> ");
            choosenOption = scanner.nextInt();

            if(choosenOption == 1) {
                for(GenericItem g : Items) {
                    if (g instanceof Book) {
                        Book b = (Book) g;
                        System.out.println(b.toString());
                    }
                }
            } else if(choosenOption == 2) {
                for(GenericItem g : Items) {
                    if (g instanceof CD) {
                        CD cd = (CD) g;
                        System.out.println(cd.toString());
                    }
                }
            } else if(choosenOption == 3) {
                for(GenericItem g : Items) {
                    if (g instanceof DVD) {
                        DVD dvd = (DVD) g;
                        System.out.println(dvd.toString());
                    }
                }
            } else if(choosenOption == 4) {
                boolean itemExists  = false;

                System.out.print("Enter product ID: ");
                searchInput = scanner.nextInt();

                for(GenericItem g : Items) {
                    if (g.getId() == searchInput) {
                        if(g instanceof Book) {
                            System.out.println(((Book)g).toString());
                        } else if(g instanceof CD) {
                            System.out.println(((CD)g).toString());
                        } else if(g instanceof DVD) {
                            System.out.println(((DVD)g).toString());
                        }
                    itemExists = true;
                    }
                }

                if(!itemExists) {
                    System.out.println("Item not found");
                }
            } else if(choosenOption == 5) {
                break;
            }
        }
    }
}