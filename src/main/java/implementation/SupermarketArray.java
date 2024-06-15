package implementation;

public class SupermarketArray implements SuperMarket{

    //atributos
   private final String[] itens;

   private int lastIndex;

   //construtores
    public SupermarketArray(final int size) {
        itens = new String[size];
        lastIndex = -1;
    }

    //métodos
    @Override
    public void add(String item) {
        if(lastIndex == itens.length-1){
            System.err.println("Lista de supermercado cheia.");
        } else {
            lastIndex++;
            itens[lastIndex] = item;
        }
    }

    @Override
    public void print() {
        System.out.println("####################");
        if(lastIndex < 0) {
            System.out.println("Lista de supermercado vazia");
        }
        for(int i = 0; i<= lastIndex; i++){
            System.out.println(i + " - " + itens[i]);
        }

        System.out.println("####################");
    }

    @Override
    public void delete(final int index) {
        if(index >= 0 && index<= lastIndex){
            //operacaodoshift(da direita para a esquerda)
            shift(index);
            lastIndex --;
        } else {
            System.err.println("Indice inválido");
        }
    }

    private void shift(final int index) {
        for(int i = 0; i< lastIndex; i++){
            itens[i] = itens[i+1];
        }
    }
}
