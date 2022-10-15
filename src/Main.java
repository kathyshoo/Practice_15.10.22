import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер задачи ");
        int nomer = input.nextInt();
        if (nomer == 1){
            zadacha1();
        }
        else if (nomer == 2){
            zadacha2();
        }
        else if (nomer == 3){
            zadacha3();
        }
        else if (nomer == 4){
            zadacha4();
        }
        else if (nomer == 5){
            zadacha5();
        }
        else if (nomer == 6){
            zadacha6();
        }
        else if (nomer == 7){
            zadacha7();
        }
        else if (nomer == 8){
            zadacha8();
        }
        else if (nomer == 9){
            zadacha9();
        }
        else if (nomer == 10){
            zadacha10();
        }
        else if (nomer == 11){
            zadacha11();
        }
        else {
            System.out.println("Неправильно");
        }
    }

    public static void zadacha1(){
        double temp = (101 + 0) / 3;
        boolean temp_ = false;
        System.out.println("a) (101 + 0) / 3 = " + temp);
        temp = 3.06e-6 * 10000000.1;
        System.out.println("b) 3.06e-6 * 10000000.1 = " + temp);
        temp_ = true && true;
        System.out.println("c) true && true = " + temp_ );
        temp_ = false && true;
        System.out.println("d) false && true = " + temp_);
        temp_ = (false && false) | (true && true);
        System.out.println("e) (false && false) or (true && true) = " + temp_);
        temp_ = (false | false) && (true && true);
        System.out.println("f) (false or false) && (true && true) =" + temp_);
    }
    public static void zadacha2(){
        boolean i = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int a = input.nextInt();
        System.out.print("Введите 2 число: ");
        int b = input.nextInt();
        if (a == b){
            System.out.print("Введите 3 число: ");
            b = input.nextInt();
            if(a==b){
                System.out.print("Введите 4 число: ");
                b = input.nextInt();
                if (a==b){
                    i = true;
                }
            }
        }
        if (i){
            System.out.println("Равно");
        }
        else {
            System.out.println("Не равно");
        }
    }
    public static void zadacha3(){
        double[] mas = new double[100];
        int temp=0;
        for (int i=0; i<100; i++){
            mas[i] = Math.random()*5000;
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Сколько надо чисел? ");
        int k = input.nextInt();
        double[] ch = new double[k];
        for (int l=0; l<k;l++){
            for (int i=0; i<100; i++){
                if (mas[i]>ch[l]){
                    ch[l]=mas[i];
                    temp = i;
                }
            }
            mas[temp] = 0;
            System.out.println(ch[l]);
        }
    }
    public static void zadacha4(){
        double[] mas = new double[100];
        int temp=0;
        for (int i=0; i<100; i++){
            mas[i] = Math.random()*5000;
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Сколько надо чисел? ");
        int k = input.nextInt();
        double[] ch = new double[k];
        for (int i=0; i<k;i++){
            ch[i]=99999;
        }
        for (int l=0; l<k;l++){
            for (int i=0; i<100; i++){
                if (mas[i] < ch[l]) {
                    ch[l] = mas[i];
                    temp = i;
                }
            }
            mas[temp] = 99999999;
            System.out.println(ch[l]);
        }
    }
    public static void zadacha5(){
        double[] mas = new double[100];
        double sred  = 0;
        for (int i=0; i<100; i++){
            mas[i] = Math.random()*5000;
            sred = sred + mas[i];
        }
        sred = sred / 100;
        System.out.println("Среднее значение = " + sred);
        for (int i=0; i<100; i++){
            if(mas[i]>sred){
                System.out.println(mas[i]);
            }
        }
    }
    public static void zadacha6(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = input.nextInt();
        System.out.print("Введите b: ");
        int b = input.nextInt();
        int otvet = 0;
        for (int i=0;i<b;i++){
            otvet = otvet + a;
        }
        System.out.println("a * b = " + otvet);
    }

    public static void zadacha7(){
        long[] mas = new long[100];
        long[] chet = new long[100];
        long[] nechet = new long[100];
        int tempc=0;
        int tempn=0;
        boolean ol = true;
        for (int i=0; i<100; i++){
            mas[i] = (int) (Math.random()*5000);
        }
        for (int i=0;i<100;i++){
            if(mas[i]%2==0){
                chet[tempc] = mas[i];
                tempc++;
            }
            else{
                nechet[tempn] = mas[i];
                tempn++;
            }
        }
        System.out.println("Четные числа: ");
        for(int i=0;i<tempc;i++){
            System.out.println(chet[i]);
        }
        System.out.println("Нечетные числа: ");
        for(int i=0;i<tempn;i++){
            System.out.println(nechet[i]);
        }
    }
    public static void zadacha8(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите температуру в Фарегнейтах");
        double a = input.nextDouble();

    }
    public static void zadacha9(){

    }
    public static void zadacha10(){

    }
    public static void zadacha11(){

    }
}