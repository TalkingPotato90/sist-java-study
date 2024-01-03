package day0103;

public class Work0103 {
    public static final int BASIC_VILLAGE_BUS = 1200;
    public static final int BASIC_BUS = 1500;
    public static final int BASIC_METRO = 1400;

    public static final int BASIC_DISTANCE = 10;
    public static final int BASIC_Monthday = 20;


    public static void main(String[] args) {
        int basicFee =0;
        int distance = Integer.parseInt(args[1]);
        int excessDistance = distance - BASIC_DISTANCE;
        int onewayFee = 0;
        int excessFee = 0;
        int roundTripFee = 0;

        if ((distance > BASIC_DISTANCE) && (excessDistance % 5 ==0)){
            excessFee = (excessDistance / 5) * 100;
        } else if ((distance > BASIC_DISTANCE) && (excessDistance % 5 !=0)) {
            excessFee = ((excessDistance / 5) + 1)* 100;
        }

        if (args[0].equals("마을버스")){
            basicFee = BASIC_VILLAGE_BUS;
            onewayFee = basicFee + excessFee;
            roundTripFee = onewayFee * 2;
        } else if (args[0].equals("버스")) {
            basicFee = BASIC_BUS;
            onewayFee = basicFee + excessFee;
            roundTripFee = onewayFee * 2;
        } else if (args[0].equals("지하철")) {
            basicFee = BASIC_METRO;
            onewayFee = basicFee + excessFee;
            roundTripFee = onewayFee * 2;
        }


        if(args[0].equals("마을버스") || args[0].equals("버스") || args[0].equals("지하철")) {
            System.out.println("입력하신 교통수단은 " + args[0] + "이고, 이동거리는 " + distance + "Km 입니다.");
            System.out.println("교통수단의 기본요금 : " + basicFee +"원,");
            System.out.println("편도요금 : " + onewayFee +"원");
            System.out.println("왕복요금 : " + roundTripFee +"원");
            System.out.println("한달 20일 기준 총 교통 요금은 " + (roundTripFee * BASIC_Monthday) +"원 입니다.");
        } else {
            System.out.println("대중교통 수단이 아닙니다.");
        }
    }
}
