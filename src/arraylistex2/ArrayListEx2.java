import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
    public static void main(String[] args) {
        // Criar uma ArrayList com uma lista de números
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        boolean add = numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        
        // Exibir o conteúdo da ArrayList utilizando um Iterator
        System.out.println("ArrayList original:");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(); // Pular linha
        
        // Remover todos os números pares
        iterator = numeros.iterator(); // Reiniciando o iterator
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove(); // Remove o elemento atual (número par)
            }
        }
        
        // Exibir o conteúdo da ArrayList após a remoção
        System.out.println("ArrayList após remoção dos números pares:");
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println(); // Pular linha
    }
}

