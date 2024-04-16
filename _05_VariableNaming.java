// 변수 이름 정하기

// 변수이름 짓는법 
// 1. 저장할 값에 어울리는 이름
// 2. 밑줄, 문자, 숫자 사용 가능 / 공백은 사용 불가
// 3. 밑줄 또는 문자로 시작이 가능하다.
// 4. 한 단어 또는 2개 이상 단어의 연속으로 짓는다.
// 5. 소문자로 시작하고 각 단어의 시작 글자는 대문자로(첫 단어 제외) firstName 
// 6. 예약어 사용 불가 (public, private, protected, static, final ..)

public class _05_VariableNaming {
    public static void main(String[] args) {
       // 입국 신고서 (여행)
       String nationality = "대한민국";
       String firstName = "소희";
       String lastName = "윤";
       String dateOfBirth = "1996-07-01";
       String residentialAddress = "호텔"; //체류지
       String purposeOfVisit = "여행"; //입국목적
       String _flightNo = "KE657"; //항공편명
       String flight_no = "KE658"; //밑줄 포함 
   
       int accompany = 2;//동반가족수
       int lengthOfStay = 10;//체류기간
       
       String item1 = "시계";
       String item2 = "술";
       
   
       // 절대 변하지 않는 상수는 대문자로 지정
       
       final String CODE = "KR"; // final키워드 붙이면 상수가 되는 것
       // CODE = "US"; 아래에서 이렇게 변경하려 해도 변경 불가능 
   
   
    }   
   }
   