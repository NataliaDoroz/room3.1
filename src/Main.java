public class Main {

    public static void main(String[] args) {
        Table table1 = new Table("white", 60, 3, "wood", "plastic");
        Table table2 = new Table("black", 100, 4, "wood", "wood");

        System.out.println("Table 1.\t Colour: " + table1.color + "\t Hight: " + table1.height + "cm\t Number Of Legs: " + table1.nrOfLegs +
                "\t Legs material: " + table1.materialLegs + "\t Countertop material: " + table1.materialCountertop);

        System.out.println("Table 2.\t Colour: " + table2.color + "\t Hight: " + table2.height + "cm\t Number Of Legs: " + table2.nrOfLegs +
                " \t Legs material: " + table2.materialLegs + "\t Countertop material: " + table2.materialCountertop);

    }
}
