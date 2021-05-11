package LoopInJava;

public class Month {

    public void showDatesOfMonth(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng " + month + " có 28 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày");
                break;
        }
    }

    public void getDatesInMonth(int month) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Tháng " + month + " có 30 ngày");
        } else if (month == 2 ) {
            System.out.println("Tháng " + month + " có 28 ngày");
        } else {
            System.out.println("Tháng " + month + " có 31 ngày");
        }
    }

}
