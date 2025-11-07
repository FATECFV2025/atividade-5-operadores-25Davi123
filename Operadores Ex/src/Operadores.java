public class Operadores {
    private float valor;

    //Operadores:
    public float adicao  (float v1, float v2){
    return v1+v2;
    }
    public float subtracao(float v1, float v2){
        return v1-v2;
    }
    public float multiplicacao(float v1, float v2){
        return v1*v2;
    }
    public float divisao (float v1, float v2){
        return v1/v2;
    }
    public float resto (float v1, float v2){
        return v1%v2;
    }

    //Operadores de Atribuição
    public void atribuir(float valor) {
        this.valor = valor;
    }
    public float getValor(){
        return this.valor;
    }
    public float adicionarEatribuir(float valor) {
        this.valor += valor;
        return this.valor;
    }
    public float subtrairEatribuir(float valor){
        this.valor -= valor;
        return this.valor;
    }
    public float multiplicarEatribuir(float valor){
        this.valor *= valor;
        return this.valor;
    }
    public float dividirEatribuir(float valor){
        this.valor /= valor;
        return this.valor;
    }

    //Operadores Lógicos:
    public boolean E(boolean v1, boolean v2){
        return v1 && v2;
    }
    public boolean Ou(boolean v1, boolean v2){
        return v1 || v2;
    }
    public boolean Nao(boolean v1){
        return !v1;
    }

    //Operadores de Comparação:
    public boolean igual(float v1 , float v2) {
         return v1 == v2;
    }
    public boolean diferente(float v1, float v2){
        return v1 != v2;
    }
    public boolean menor(float v1, float v2){
        return v1 < v2;
    }
    public boolean maior(float v1, float v2){
        return v1 > v2;
    }
    public boolean menorigual(float v1, float v2){
        return v1 <= v2;
    }
    public boolean maiorigual(float v1, float v2){
        return v1 >= v2;
    }

   
}
