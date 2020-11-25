package RocioAguirre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenAlfabetico {
    List<String> nombresPersonas = new ArrayList<String>();

        public void loadStrings(String...strings){
            for (var string : strings) this.nombresPersonas.add(string);
        }

    public List<String> ClaseAnonimaOA(){
        List<String> strings = this.nombresPersonas;
        Collections.sort(strings ,new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareToIgnoreCase(str2);
            }
        });
        return strings;
    }

    public List<String> ExpresionLambdaOA(){
        List<String> strings = this.nombresPersonas;
        strings.sort((str1,str2) -> str1.compareToIgnoreCase(str2));
        return  strings;
    }

    public List<String> MetodoReferenciaOA(){
        List<String> strings = this.nombresPersonas;
        ordena OAR = new ordena();
        Collections.sort(strings,OAR::compare);
        return  strings;
    }

    public void showList(List<String> list){
        list.forEach(System.out::println);
    }
}

class ordena implements Comparator{

    public static int sort(Object o, Object o1) {
        return o.toString().compareToIgnoreCase(o1.toString());
    }

    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().compareToIgnoreCase(o2.toString());
    }
}

class longi implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().length() - o2.toString().length();
    }
}
