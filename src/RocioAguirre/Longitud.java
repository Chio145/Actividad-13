package RocioAguirre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Longitud {
    List<String> nombresPersonas = new ArrayList<String>();


    public void loadStrings(String...strings){
        for (var string : strings) this.nombresPersonas.add(string);
    }

    public List<String> ClaseAnonimaL(){
        List<String> strings = this.nombresPersonas;
        strings.sort( new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.length() - str2.length();
            }
        });
        return strings;
    }

    public List<String> ExpresionLambdaL(){
        List<String> strings = this.nombresPersonas;
        Collections.sort(strings,(str1,str2) ->  str1.length() - str2.length());
        return  strings;
    }

    public List<String> MetodoReferenciaL(){
        List<String> strings = this.nombresPersonas;
        longi LR = new longi();
        strings.sort(LR::compare);
        return  strings;
    }

    public void showList(List<String> list){
        list.forEach(System.out::println);
    }
}


