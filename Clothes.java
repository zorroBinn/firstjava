import java.util.Scanner;

public class Clothes {
    int ClothesStatus;
    String Body, Pants, Shoes;

    Clothes() {
        this.ClothesStatus = 0;
        this.Body = "";
        this.Pants = "";
        this.Shoes = "";
    }
    Clothes(int status, String body, String pants, String shoes) {
        this.ClothesStatus = status;
        this.Body = body;
        this.Pants = pants;
        this.Shoes = shoes;
    }
    void Read() {
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
    void Display() {
        System.out.println("Верхняя одежда: " + Body);
        System.out.println("Штаны: " + Pants);
        System.out.println("Обувь: " + Shoes);
        System.out.println("Состояние одежды (в %): " + ClothesStatus);
    }
    void TearClothes(){
        if (this.ClothesStatus > 0) {
            System.out.println("Ваша одежда порвалась!");
            this.ClothesStatus -= 15;
            if (this.ClothesStatus < 0)
                this.ClothesStatus = 0;
        }
    }
    void SewUpClothes() {
        if (this.ClothesStatus >= 0) {
            System.out.println("Вы зашили вашу одежду!");
            this.ClothesStatus += 20;
            if (this.ClothesStatus > 100)
                this.ClothesStatus = 100;
        }
    }
}
