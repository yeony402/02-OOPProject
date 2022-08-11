public class Bus {
    int busNum;
    int intake = 0;
    int passenger = 0;
    int max_passenger = 30;
    int possible_passenger;
    int gas = 100;
    int speed = 0;
    boolean state = true;


    public Bus(int num) {
        this.busNum = num;
    }

    public void Passenger(int passenger) {
        this.passenger += passenger;
        this.intake += (1000 * this.passenger);
        this.possible_passenger = (this.max_passenger - passenger);

        if (this.passenger > this.max_passenger) {
            System.out.println("최대 승객 수 초과");
            this.passenger = 0;
            this.intake = 0;
        }
    }


    public void State(boolean state) {
        this.state = state;
        if (gas < 10) {
            this.state = false;
        }
    }


    public void Gas(int gas) {
        this.gas += gas;
        if (this.gas < 10) {
            state = false;
            System.out.println("주유가 필요합니다!");
        }
    }

    public void Speed(int speed) {
        this.speed += speed;
    }


    public String getState() {
        String st = "";
        st = (state == true) ? "운행중" : "차고지행";
        return st;
    }


    public int getBusNum() {
        return busNum;
    }


    public int getIntake() {
        return intake;
    }


    public int getPassenger() {
        return passenger;
    }


    public int getPossPassenger() {
        return possible_passenger;
    }

    public int getGas() {
        return gas;
    }


    public void showInfo() {
        System.out.println("탑승 승객 수 = " + getPassenger());
        System.out.println("잔여 승객수 = " + getPossPassenger());
        System.out.println("요금 확인 = " + getIntake());
        System.out.println();
    }

    public void showInfo1() {
        System.out.println("상태 = " + getState());
        System.out.println("주유량 = " + getGas());
        System.out.println();
    }
}
