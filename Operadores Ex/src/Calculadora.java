public class Calculadora {
    public static void main(String[] args){
        Operadores op = new Operadores();

        //Operadores:
        System.out.println("O Resultado é: "+ op.adicao(10,5));

        System.out.println("O Resultado é: "+ op.subtracao(10,5));

        System.out.println("O Resultado é: "+ op.multiplicacao(10,5));

        System.out.println("O Resultado é: "+ op.divisao(10,5));

        System.out.println("O Resultado é: "+ op.resto(10,5));

        //Operadores de atribuição:
        op.atribuir(10f);
        System.out.println("Valor inicial: " + op.getValor());

        System.out.println("Adicionar e atribuir (+= 5): " + op.adicionarEatribuir(5f));

        System.out.println("Subtrair e atribuir (-= 5): " + op.subtrairEatribuir(5f));

        System.out.println("Multiplicar e atribuir (*= 5): " + op.multiplicarEatribuir(5f));

        System.out.println("Dividr e atribuir (/= 5): " + op.dividirEatribuir(5f));

        //Operadores Lógicos
        System.out.println("true && false : " + op.E(true, false));
        System.out.println("true || false : " + op.Ou(true, false));
        System.out.println("!true = : " + op.Nao(true));
       
        //Operadores de Comparação
        System.out.println("10 == 3 :  " + op.igual(10, 5));

        System.out.println("10 != 3 : " + op.diferente(10, 5));

        System.out.println("10 > 5 : "+ op.maior(10, 5));

        System.out.println("10 < 3 : " + op.menor(10, 5));

        System.out.println("10 >= 3 : " + op.maiorigual(10, 5));

        System.out.println("10 <= 3 : " + op.menorigual(10, 5));

    }


}
