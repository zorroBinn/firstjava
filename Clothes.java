import java.util.Scanner;
//Класс одежда
public class Clothes {
    private int ClothesStatus; //Статус целостности одежды
    private String Body, Pants, Shoes; //Верх, низ, обувь

    Clothes() { //Конструктор без параметров
        this.ClothesStatus = 0;
        this.Body = "";
        this.Pants = "";
        this.Shoes = "";
    }
    Clothes(int status, String body, String pants, String shoes) { //конструктор с параметрами
        this.ClothesStatus = status;
        this.Body = body;
        this.Pants = pants;
        this.Shoes = shoes;
    }
    public void Read() { //Ввод с клавиатуры
        int status;
        String strbody, strpants, strshoes;
        Scanner inp = new Scanner(System.in);
        System.out.println("Введите информацию об одежде персонажа:");
        System.out.println("Верхняя одежда: ");
        strbody = inp.nextLine();
        System.out.println("Штаны: ");
        strpants = inp.nextLine();
        System.out.println("Обувь: ");
        strshoes = inp.nextLine();
        System.out.println("Состояние одежды (в %): ");
        status = inp.nextInt();
        this.ClothesStatus = status;
        this.Body = strbody;
        this.Pants = strpants;
        this.Shoes = strshoes;
    }
    public void Display() { //Вывод на экран
        System.out.println("Верхняя одежда: " + Body);
        System.out.println("Штаны: " + Pants);
        System.out.println("Обувь: " + Shoes);
        System.out.println("Состояние одежды (в %): " + ClothesStatus);
    }
    public void TearClothes(){ //Метод порвать одежду
        if (this.ClothesStatus > 0) {
            System.out.println("Ваша одежда порвалась!");
            this.ClothesStatus -= 15;
            if (this.ClothesStatus < 0)
                this.ClothesStatus = 0;
        }
    }
    public void SewUpClothes() { //Метод зашить одежду
        if (this.ClothesStatus >= 0) {
            System.out.println("Вы зашили вашу одежду!");
            this.ClothesStatus += 20;
            if (this.ClothesStatus > 100)
                this.ClothesStatus = 100;
        }
    }
}