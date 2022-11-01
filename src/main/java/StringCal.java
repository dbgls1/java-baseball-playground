public class StringCal {

  public int add(int a, int b){
    return a + b;
  }

  public int subtract(int a, int b){
    return a - b;
  }

  public int multiply(int a, int b){
    return a * b;
  }

  public int divide(int a, int b){
    try{
        return a / b;
    } catch(Exception e){
      System.out.println("0으로 나눌 수 없습니다");
    }
    return 0;
  }

  public int calculate(int firstValue, char operator, int secondValue){

    if(operator == '+'){
      return add(firstValue, secondValue);
    }

    if(operator == '-')
      return subtract(firstValue, secondValue);

    if(operator == '*')
      return multiply(firstValue,secondValue);

    if(operator == '/')
      return divide(firstValue, secondValue);
    else System.out.println("잘못된 값 입력");
    throw new RuntimeException();
  }

  public String[] seperate(String str){
    if(str == "")
        System.out.println("값을 입력해주세요");
    return str.split(" ");
  }

  public int toInt(String str){
    try{
      return Integer.parseInt(str);
    } catch (NumberFormatException e){
      System.out.println("숫자 형식이 아닙니다");
    }
    return 0;
  }

  public int calculateString(String[] str){
    int result = toInt(str[0]);
    for(int i = 0; i < str.length - 2; i += 2){
      result = calculate(result, str[i + 1].charAt(0), toInt(str[i + 2]));
    }
    return result;
  }

}

