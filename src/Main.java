


public class Main {
    /*
    public static int contagemRegressivaRecursiva(int numero){
        System.out.println(numero);
        if(numero == 0){
            return numero;
        }
        return contagemRegressivaRecursiva(numero-1);
    }
    public static int somaAcumulativaRecurssiva(int numero){
        if(numero == 0){
            return numero;
        }

        return somaAcumulativaRecurssiva(numero-1)+numero;

    }
    public static float potenciaDeDoisRecursiva(float valor){
        if(valor > 0){
            if(valor == 0)
                return 1;
            return potenciaDeDoisRecursiva(valor-1)*2;
        }
        else {
            if(valor == 0)
                return 1;
            return potenciaDeDoisRecursiva(valor+1)/2;
        }
    }

    public static float potenciaDeDoisIterativa(float valor){
        float resultado = 1;
        if(valor == 1)
            return 1;
        else{
            if (valor > 0){
                for (int i = 0; i < valor; i++) {
                    resultado = resultado * 2;
                }
            }else {
                for (int i = 0; i > valor; i--) {
                    resultado = resultado / 2;
                }
            }

        }
        return resultado;
    }
    public static long fibonacciRecursiva(long numero){
        if (numero <= 1)
            return 1;
        return fibonacciRecursiva(numero-1) + fibonacciRecursiva(numero-2);
    }

    public static long fibonacciInterativa(long numero){
        long primeiro = 0;
        long segundo = 1;
        long terceiro = 0;
        for (int i = 0; i < numero; i++) {
            primeiro = segundo + terceiro;
            terceiro = segundo;
            segundo = primeiro;

        }
        return primeiro;
    }


    */
    public static void main(String[] args) {

        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        //arvoreBinaria.inserir(10);
        //arvoreBinaria.inserir(5);
        //arvoreBinaria.inserir(2);
        //arvoreBinaria.inserir(200);

        arvoreBinaria.inserirRecursivo(arvoreBinaria.getRaiz(),6);
        arvoreBinaria.inserirRecursivo(arvoreBinaria.getRaiz(),8);
        arvoreBinaria.inserirRecursivo(arvoreBinaria.getRaiz(),7);
        arvoreBinaria.inserirRecursivo(arvoreBinaria.getRaiz(),3);
        arvoreBinaria.inserirRecursivo(arvoreBinaria.getRaiz(),2);
        arvoreBinaria.inserirRecursivo(arvoreBinaria.getRaiz(),18);
        arvoreBinaria.remover(arvoreBinaria.getRaiz(),8);

        arvoreBinaria.preOrdem(arvoreBinaria.getRaiz());
        System.out.println("**************");
        arvoreBinaria.preOrdem(arvoreBinaria.getRaiz());
        System.out.println("**************");

        arvoreBinaria.printTree();



    }
}