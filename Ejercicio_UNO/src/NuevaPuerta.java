public class NuevaPuerta {
    public static void main(String[] args) {
        CocheNuevo deDaniela = new CocheNuevo();
        deDaniela.color = "Rojo";
        deDaniela.marca = "Renault";
        deDaniela.puertas = 1;
        deDaniela.agregarPuertas(2);

        System.out.println("===>> R E S U L T A D O <<===");
        System.out.println("El coche nuevo de Daniela marca: " + deDaniela.marca);
        System.out.println("es de color: " + deDaniela.color);
        System.out.println("se le agregaron: " + deDaniela.puertas + " puertas");
    }
}
