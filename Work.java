import java.util.Scanner;

public class Work {
    Human human;
    int Payment;
    String Namework;

    Work() {
        this.human = new Human();
        this.Namework = "";
        this.Payment = 0;
    }
    Work(Human human, String namework, int payment) {
        this.human = human;
        this.Namework = namework;
        this.Payment = payment;
    }
    void Read(Human human) {
        int payment;
        String strnamework;
        Scanner inp = new Scanner(System.in);
        System.out.println("Место работы: ");
        strnamework = inp.nextLine();
        System.out.println("Оплата за работу: ");
        payment = inp.nextInt();
        this.human = human;
        this.Namework = strnamework;
        this.Payment = payment;
    }
    void Display() {
        System.out.println("Место работы: " + Namework);
        System.out.println("Оплата за работу: " + Payment);
    }
    void Working(Human human) {
        System.out.println("За свою работу вы получили " + Payment + "р!");
        human.MoneyBalance += Payment;
    }
}
