public class Main {

    public static void main(String[] args) {
        Table table1 = new Table();
        Table table2 = new Table();

        table1.color = "white";
        table1.hight = 60;
        table1.nrOfLegs = 3;
        table1.materialLegs = "wood";
        table1.materialCountertop = "plastic";

        table2.color = "black";
        table2.hight = 100;
        table2.nrOfLegs = 4;
        table2.materialLegs = "wood";
        table2.materialCountertop = table2.materialLegs;

        System.out.println("Table 1.\t Colour: " + table1.color + "\t Hight: " + table1.hight + "cm\t Number Of Legs: " + table1.nrOfLegs +
                "\t Legs material: " + table1.materialLegs + "\t Countertop material: " + table1.materialCountertop);

        System.out.println("Table 2.\t Colour: " + table2.color + "\t Hight: " + table2.hight + "cm\t Number Of Legs: " + table2.nrOfLegs +
                "\t Legs material: " + table2.materialLegs + "\t Countertop material: " + table2.materialCountertop);
    }
}
