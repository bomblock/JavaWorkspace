package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "김재승";
        int hour = 15;

        System.out.println(name + "님 안녕하세요. 배송이 완료되었습니다.");
        System.out.println(name + "님 안녕하세요. " + hour + "시 방문예정입니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강호동";
        System.out.println(name + "님의 평균 점수는 " + score + " 점입니다.");
        System.out.println("학점은" + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번시험에 합격 했을까요?"+ pass);

        double d = 3.14;
        float f = 3.14F;
        System.out.println(d);
        System.out.println(f);

        long l = 10000000000L;
        l = 1_000_0000_000_000L;
        System.out.println(l);

        //변수 출력 종류
        //int, long, float,double,char, string, boolean
    }
}
