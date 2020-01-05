public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("600",1000, 2015);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
//        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook("2000", 1500, 2017);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
//        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook("1600", 500, 2013);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " +oldNotebook.year);
        oldNotebook.checkPrice();
//        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();

        String waga= notebook.getWeight();
        System.out.println(waga);

        LeapYear year = new LeapYear(2019);
        System.out.println(year.main());

            }
}