package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자, 사용가능 (공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개이상 의 단어로 가능
        // 5. 소문자로 시작, 각단어의 시작글자는 대문자( 첫 단어는 제외)
        // 6. 예약어 사용 불가 (public,static, void, int, double 등등

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "햔성"; // 이름
        String LastName =  "김"; // 성
        String dateOfBirth = "2001-12-31"; // 생년월일
        String residentialAddress = "호텔이름"; // 체류지
        String purposeOfVisit = "관광";// 입국목적
        String flightNo = "KE657"; //항공편명
        String _flightNo = "KE657"; // 밑줄시작
        String flightNo_no_2 = "Ke675"; //밑줄 숫자 포함
        // String -flinghtNo = "KE657"; 밑줄이 아니기 때문에 오류가 난다.

        int accompany = 2; // 동반가족수
        int lengthOfStay = 5; //체류 기간

        String item1 = "시계";
        String item2 = "가방";

        //절대 변하지 않는 상수는 대문자로
        final String CODE = "kr";
        // CODE = "us" 중간에 값을 변수처럼 바꾸어 주려고 해도 바뀌지 않는다.


    }
}
