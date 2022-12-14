import java.util.Scanner;
//Класс медкарты персонажа
public class MedicalCard
{
    private Human human; //Персонаж
    private String HealthStatus; //Статус здоровья
    private int Weight, Height; //Вес, рост

    MedicalCard() {//Конструктор без параметров
        this.human = new Human();
        this.Weight = this.Height = 0;
        this.HealthStatus = "";
    }
    MedicalCard(Human human, int weight, int height, String status) {//конструктор с параметрами
        this.Weight = weight;
        this.Height = height;
        this.HealthStatus = status;
        this.human = human;
    }
    public void Read(Human human) {//Ввод с клавиатуры
        String status;
        int height, weight;
        Scanner inp = new Scanner(System.in);
        System.out.println("Вес (в кг): ");
        weight = inp.nextInt();
        System.out.println("Рост (в см): ");
        height = inp.nextInt();
        System.out.println("Состояние здоровья: ");
        status = inp.nextLine();
        this.Weight = weight;
        this.Height = height;
        this.HealthStatus = status;
        this.human = human;
    }
    public void Display() { //Вывод на экран
        System.out.println("Имя пациента: " + human.NameDisplay());
        System.out.println("Вес (в кг): " + Weight);
        System.out.println("Рост (в см): " + Height);
        System.out.println("Состояние здоровья: " + HealthStatus);
    }
    public void BodyMassIndex() { //Метод рассчёта ИМТ
        double Index, weight, height;
        if (Height > 0 && Weight > 0) {
            weight = Weight;
            height = Height;
            Index = weight / (height * height / 10000);
            if (Index > 18.5f && Index < 25.0f)
                System.out.println("Нормальный вес, ИМТ = " + Index);
            else if (Index <= 18.5f)
                System.out.println("Дефицитный веса, ИМТ = " + Index);
            else
                System.out.println("Избыточный вес, ИМТ = " + Index);
        }
    }
    public void SetHealthStatus() { //Метод изменения статуса здоровья
        String status;
        Scanner inp = new Scanner(System.in);
        System.out.println("Текущее состояние здоровья: " + HealthStatus);
        System.out.println("Новое состояние здоровья: ");
        status = inp.nextLine();
        this.HealthStatus = status;
    }
}