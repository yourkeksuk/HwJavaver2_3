public class Main {
    public static void main(String[] args) {

        int start = 300;     // Начальный счет
        int pay = 500;       // Сумма пополнения
        int discount = pay / 100;    // Сумма кэшбека

        if (pay < 1000){
            System.out.println("Скидки предоставляются только при пополнении от 1000р.");
            System.out.println("Итоговая сумма счета: " + ((start) + (pay)) + " рубля(ей)");
        }
    }
}

