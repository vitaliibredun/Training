package enums;

public class Test {
    public static void main(String[] args) {
        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());

        Season season = Season.AUTUMN;
        System.out.println(season.name());

        Animal cat = Animal.valueOf("CAT");
        System.out.println(cat.getTranslation());

//        Season season = Season.AUTUMN;
//        System.out.println(season.getTemperature());

//        Animal animal = Animal.DOG;
//        System.out.println(animal);


//
//        switch (animal) {
//            case CAT:
//                System.out.println("It's a cat");
//                break;
//            case DOG:
//                System.out.println("It's a dog");
//                break;
//        }

        //Object -> Enum -> Season
//
//        Season season = Season.AUTUMN;
//
//        switch (season) {
//            case WINTER:
//                System.out.println("It's a warm day");
//                break;
//            case SUMMER:
//                System.out.println("It's a hot day");
//                break;
//        }
//
//    }


















        //так было до появления Enum

//    private static final int DOG = 0;
//    private static final int CAT = 1;
//    private static final int FROG = 2;
//
//    public static void main(String[] args) {
//        int animal = 0;
//
//        switch (animal) {
//            case DOG:
//                System.out.println("It's a dog");
//                break;
//            case FROG:
//                System.out.println("It's a frog");
//                break;
//            default:
//                System.out.println("It's not an animal");
//        }
    }

}
