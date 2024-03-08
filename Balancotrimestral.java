class Balancotrimestral{
  public static void main(String[] args){
    int gastosJaneiro = 15000;
    int gastosFevereiro = 23000;
    int gastosMarco = 17000;
    int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
    int mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco)/3;
    System.out.println(gastosTrimestre);
    System.out.printf("Valor da média="+mediaMensal);
  }
}
