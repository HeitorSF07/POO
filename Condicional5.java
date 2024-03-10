import java.util.Scanner;
class Condicional5{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.printf("Digite o primeiro número:");
    int n1 = scanner.nextInt();
    System.out.printf("Digite o segundo número:");
    int n2 = scanner.nextInt();
    if(n1>n2){
        System.out.printf("O primeiro número é maior");
    }else{
        System.out.printf("O segundo número é maior");
    }
    }
}
