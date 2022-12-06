enum Season {
    WINTER,
    SPRING,
    SUMMER,
    FALL
}

class Enums {
    public static void main(String[] args) {
        Season a = Season.FALL;

        switch (a) {
            case WINTER:
                System.out.println("It is winter season.");
                break;
            case SPRING:
                System.out.println("It is spring season.");
                break;
            case SUMMER:
                System.out.println("It is summer season.");
                break;
            case FALL:
                System.out.println("It is fall season.");
                break;
            default:
                System.out.println("I can't tell the season");
                break;
        }
    }
}
