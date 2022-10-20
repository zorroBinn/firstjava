import java.util.Scanner;

public class Human
{
    int Age;
    long MoneyBalance;
    String Name, Sex;
    Clothes clothes;

    Human() {
        this.Age = 0;
        this.Name = "";
        this.Sex = "";
        this.MoneyBalance = 1000;
        this.clothes = new Clothes();
    }
    Human(int age, String name, String sex, Clothes clothes) {
        this.Age = age;
        this.Name = name;
        this.Sex = sex;
        this.MoneyBalance = 1000;
        this.clothes = clothes;
    }
    void Read() {
        String strname, strsex;
        int age;
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите информацию о персонаже:");
        System.out.println("Имя: ");
        strname = inp.nextLine();
        System.out.println("Пол: ");
        strsex = inp.nextLine();
        System.out.println("Возраст: ");
        age = inp.nextInt();
        this.Age = age;
        this.Name = strname;
        this.Sex = strsex;
        this.MoneyBalance = 1000;
        clothes = new Clothes();
        clothes.Read();
        this.clothes = clothes;
    }
    void Display() {
        System.out.println("Имя: " + Name);
        System.out.println("Пол: " + Sex);
        System.out.println("Возраст: " + Age);
        System.out.println("Баланс денег: " + MoneyBalance);
        clothes.Display();
    }
}