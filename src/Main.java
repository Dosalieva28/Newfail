public class Main {
    public static void main(String[] args){

        Cat ct = new Cat("Kitty", 3, 'm', 10);
        Cat ct1 = new Cat("Mia", 1, 'm', 11);
        Cat ct2 = new Cat("Kate", 2, 'm', 9);
        Cat ct3 = new Cat("Kit", 4, 'm', 8);
        Cat ct4 = new Cat("Nana", 6, 'm', 15);

        Cow cw5 = new Cow("Mumu", 5, 'm', 19);
        Cow cw6 = new Cow("Drakula", 7, 'm', 101);
        Cow cw7 = new Cow("Lia", 9, 'm', 107);
        Cow cw8 = new Cow("Jack", 19, 'f', 85);
        Cow cw9 = new Cow("Phil", 10, 'f', 120);
        Cow cw10 = new Cow("Den", 11, 'f', 135);
        Cow cw11 = new Cow("Ben", 13, 'f', 111);

        Horse he = new Horse("Mike", 23, 'f', 137);
        Horse he1 = new Horse("Kelly", 22, 'm', 145);
        Horse he2 = new Horse("Nelly", 14, 'm', 108);
        Horse he3 = new Horse("Meddy", 17, 'm', 155);
        Horse he4 = new Horse("Kessi", 15, 'm', 189);
        Horse he5 = new Horse("Luna", 6, 'm', 123);
        Horse he6 = new Horse("Clever", 15, 'f', 162);

        Sheep sp7 = new Sheep("john", 9, 'f', 100);
        Sheep sp8 = new Sheep("Gloriya", 10, 'm', 59);
        Sheep sp9 = new Sheep("Kai", 5, 'f', 68);
        Sheep sp10 = new Sheep("Elza", 4, 'm', 98);
        Sheep sp11 = new Sheep("Olaff", 14, 'f', 74);
        Sheep sp12 = new Sheep("Kristof", 7, 'f', 56);
        Sheep sp13 = new Sheep("Swen", 6, 'f', 109);

        Cow[]cows = {cw5,cw6,cw7,cw8,cw9};
        Sheep[]sheeps = {sp7,sp8,sp9};
        Horse[]horses = {he1,he};

        Sheep[]sheeps1 = {sp10};
        Cow[]cows1 = {cw10};
        Horse[]horses1 = {he6};

        Farm farm1 = new Farm("Cholpon-Ata",cows,horses, sheeps, "Mr. Key " );
        Farm farm2 = new Farm("Bishkek city",cows1,horses1, sheeps1, "Mrs. Lia" );

        System.out.println(" Информация о первой ферме: ");
        System.out.println("|   Address      |        cows         |      horses      |     sheeps         |     Owner name     | \n");
        System.out.printf("|     %s       |       %s          |        %s       |      %s       |    %s         |\n"    , farm1.getAddress(),
                cows[0].getName(), horses[0].getName(), sheeps[0].getName(), farm1.getOwnerName());
        System.out.printf("|          |       %s          |        %s       |      %s       |          | \n" ,
                cows[1].getName(), horses[1].getName(), sheeps[1].getName());
        System.out.printf("|          |       %s          |              |      %s       |          | \n" ,
                cows[2].getName(), sheeps[2].getName());
        System.out.printf("|          |       %s          |              |          |          | \n" ,
                cows[3].getName());
        System.out.printf("|          |       %s          |              |          |          | \n" ,
                cows[4].getName());

        System.out.println(farm1.getCows()[3].getName());
        System.out.println(farm1.getHorses()[1].getName());
        System.out.println(farm1.getSheeps()[2].getName());































    }

}