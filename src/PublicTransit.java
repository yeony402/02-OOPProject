public class PublicTransit {

    public static void main(String[] args) {
        System.out.println("---------BUS---------");
        Bus bus100 = new Bus(100);
        Bus bus50 = new Bus(50);
        bus100.Passenger(2);
        System.out.println("버스 = "+ bus100.getBusNum() +", "+ bus50.getBusNum() + "번");
        System.out.println();

        bus100.showInfo();
        bus100.Gas(-50);
        System.out.println("주유량 = " + bus100.getGas());
        System.out.println();

        bus100.State(false);
        bus100.Gas(10);
        bus100.showInfo1();

        bus100.State(true);
        bus100.Passenger((45));
        System.out.println();

        bus100.Passenger(5);
        bus100.showInfo();

        bus100.Gas(-55);
        bus100.showInfo1();




        System.out.println("---------TAXI---------");
        Taxi taxi3 = new Taxi(3);
        Taxi taxi5 = new Taxi(5);
        System.out.println("택시 = "+  taxi3.getTaxiNum()+", "+ taxi5.getTaxiNum() + "번");
        System.out.println("주유량 = " + taxi3.getGas());
        taxi3.stateInfo();

        taxi3.Passenger(2);
        taxi3.place = "서울역";
        taxi3.Place_Distance(2);
        taxi3.showInfo();
        taxi3.stateInfo();

        taxi3.Gas(-80);
        taxi3.showInfo1();
        System.out.println();

        taxi3.Passenger(3);
        taxi3.place = "구로디지털단지역";
        taxi3.Place_Distance(12);

        taxi3.showInfo();
        System.out.println();
        taxi3.Gas(-20);

        taxi3.showInfo1();
        taxi3.stateInfo();


    }
}