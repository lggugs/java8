package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 *
 * @author Luis
 */
public class Java8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Tandera Service");
        palavras.add("Compass");
        palavras.add("Visualizador");
//        ComparadorDeStringPorTamanho comparador = new ComparadorDeStringPorTamanho();        
//        Collections.sort(palavras, comparador);

//        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));        
//        Comparator<String> comparador = Comparator.comparing(s -> s.length());
//        palavras.sort(comparador);
        
//        Function<String, Integer> funcao = s -> s.length();
//        Comparator<String> comparador = Comparator.comparing(funcao);
//        palavras.sort(comparador);
        
//        palavras.sort(Comparator.comparing(s -> s.length()));
        
        palavras.sort(Comparator.comparing(String::length));        
        

//        for (String palavra : palavras) {
//            System.out.println(palavra);            
//        }
//        ConsumidorDeString consumidor = new ConsumidorDeString();
//        Consumer<String> consumidor =  s -> System.out.println(s);
//        palavras.forEach(consumidor);    
//        palavras.forEach(s -> System.out.println(s));
        palavras.forEach(System.out::println);

//        new Thread(() -> System.out.println("excutando um Runnable")).start();
    }
}

class ConsumidorDeString implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparadorDeStringPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return -1;
        }

        if (s1.length() > s2.length()) {
            return 1;
        }

        return 0;
    }
}
