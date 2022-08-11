public class Taxi {
    int taxiNum;
    int intake = 3000;
    int add_intake = 1000;
    int payment = 0;
    int all_payment = 0;
    int passenger = 0;
    int possible_passenger = 0;
    int max_passenger = 4;
    int gas = 100;
    String place = "";
    int base_distance = 1;
    int place_distance = 0;


    public Taxi(int num) {
        this.taxiNum = num;
    }

    public void Passenger(int passenger) {
        this.passenger += passenger;
        this.possible_passenger = this.max_passenger - passenger;
        if (this.passenger > 4) {
            System.out.println("최대 승객 수를 초과하였습니다!");
        }
    }

    public void Gas(int gas) {
        this.gas += gas;
        if (this.gas < 10) {
            System.out.println("주유가 필요합니다!");
        }
    }

    public void Place_Distance(int place_distance) {
        this.place_distance = place_distance;
    }

    public String getPlace() {
        return place;
    }

    public int getPlace_distance() {
        return place_distance;
    }

    public int getPayment() {
        int distance = 0;
        if (this.place_distance > this.base_distance) {
            distance = this.place_distance - this.base_distance;
            this.payment = this.intake + (distance * this.add_intake);
        }
        return payment;
    }

    public int getTaxiNum() {
        return taxiNum;
    }

    public int getIntake() {
        return intake;
    }

    public int getGas() {
        return gas;
    }

    public int getPassenger() {
        return passenger;
    }

    public String getState() {
        String st = "";
        if (passenger > 0 & gas > 10) {
            st = "운행중";
        } else if (passenger == 0 & gas > 10) {
            st = "일반";
        } else {
            st = "운행불가";
        }
        return st;
    }

    public int getAll_Payment() {
        all_payment += payment;

        passenger = 0;
        place_distance = 0;

        return all_payment;
    }

    public void showInfo() {
        System.out.println("탑승 승객 수 = " + getPassenger());
        System.out.println("잔여 승객 수 = " + possible_passenger);
        System.out.println("기본 요금 확인 = " + getIntake());
        System.out.println("목적지 = " + getPlace());
        System.out.println("목적지까지 거리 = " + getPlace_distance() + "km");
        System.out.println("지불할 요금 = " + getPayment());
    }

    public void showInfo1() {
        System.out.println("주유량 = " + getGas());
        System.out.println("누적 요금 = " + getAll_Payment());
    }

    public void stateInfo() {
        System.out.println("상태 = " + getState());
        System.out.println();
    }
}
