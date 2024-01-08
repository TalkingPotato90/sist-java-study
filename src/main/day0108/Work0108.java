package day0108;

public class Work0108 {

    // 1. 자신의 이름을 출력하는 method
    // 2. 자신의 이름 중에 성을 반환하는 method
    // 3. 점수를 입력받아 점수의 판정을 출력하는 method 작성
    // 점수는  0 ~ 100사이 일때만 판정을 하고 그렇지 않으면 "잘못된 점수"를 출력
    // 0~ 39 : 과락 출력, 40 ~59 : 다른 과목을 참조, 60~100 : 합격
    // 4. 문자를 입력방아 해당 문자가 "대문자", "소문자", "숫자" 인지를 판단하여 출력하는 method.
    // A - 대문자
    // 그 외에는 $ - 대문자, 소문자, 숫자가 아닙니다. 를 출력
    // 5. 태어난 해를 입력받아 나이를 반환하는 method
    // 6. 3개의 수를 입력받아 가장 "작은 수"를 반환하는 일을 하는 method
    public void fullName(){
        System.out.println("홍길동");
    }

    public void lastName(){
        System.out.println("홍");
    }

    public String checkGrade(int score){
        String grade = null;
        if (score >= 0 && score <= 39){
            grade = "과락";
        } else if(score >= 40 && score <= 59){
            grade = "다른 과목 참조";
        } else if(score >= 60 && score <= 100){
            grade = "합격";
        }

        if (score >= 0 && score <= 100){
         return grade;
        }
        return "잘못된 점수";
    }

    public String checkCharacterType(char character){
        if(character>= 'A' && character <= 'Z'){
            return "대문자";
        } else if(character>='a' && character <= 'z'){
            return "소문자";
        } else if(character>= '0' && character<= '9') {
            return "숫자";
        }
        return "대문자, 소문자, 숫자가 아닙니다.";
    }

    public int calculateAge(int birthYear){
        int thisYear = 2024;
        return thisYear - birthYear;
    }

    public int checkSmallestNumber(int num1, int num2, int num3){
        if (num1 < num2 && num1 < num3){
            return num1;
        } else if(num2 < num1 && num2 < num3){
            return num2;
        }
        return num3;
    }

    public static void main(String[] args) {
        Work0108 work0108 = new Work0108();

        work0108.fullName();
        work0108.lastName();

        String grade = work0108.checkGrade(100);
        System.out.println(grade);

        String characterType = work0108.checkCharacterType('s');
        System.out.println(characterType);

        int age = work0108.calculateAge(1990);
        System.out.println(age);

        int smallestNumber = work0108.checkSmallestNumber(1,3,0);
        System.out.println(smallestNumber);
    }

}
