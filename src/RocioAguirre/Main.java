package RocioAguirre;

public class Main {

    public static void main(String[] args) {
        OrdenAlfabetico alfa = new OrdenAlfabetico();
        Longitud log = new Longitud();

        alfa.loadStrings("Rocio",
                "Samantha","Monserrath",
                "Karyme","Yamileth",
                "Marisol", "Mitzi",
                "Pamela", "Nelly",
                "Evelyn");

        log.loadStrings("Rocio",
                "Samantha","Monserrath",
                "Karyme","Yamileth",
                "Marisol", "Mitzi",
                "Pamela", "Nelly",
                "Evelyn");

        var OA1 = alfa.ClaseAnonimaOA();
        var OA2 = alfa.ExpresionLambdaOA();
        var OA3 = alfa.MetodoReferenciaOA();

        System.out.println("Clase anonima por orden alfabetico:");
        alfa.showList(OA1);
        System.out.println("\nExpresion Lamda por orden alfabetico:");
        alfa.showList(OA2);
        System.out.println("\nMetodo de referencia por orden alfabetico:");
        alfa.showList(OA3);

        var L1 = log.ClaseAnonimaL();
        var L2 = log.ExpresionLambdaL();
        var L3 = log.MetodoReferenciaL();
        System.out.println("\n----------------------------------");
        System.out.println("\nClase anonima por longitud:");
        log.showList(L1);
        System.out.println("\nExpresion Lamda por longitud:");
        log.showList(L2);
        System.out.println("\nMetodo de referencia por longitud:");
        log.showList(L3);

    }

}

