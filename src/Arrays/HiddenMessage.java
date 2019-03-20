package Arrays;

public class HiddenMessage {
  public static void main(String[] args) {
    hidden_message();
  }
  public static void hidden_message(){
    int[] coded_message = {
            1110010, 1101000, 1101000, 1111011, 10000100, 1100100, 1111011, 10000100, 1111011, 1101011,
            1101000, 10000100, 1111011, 1101011, 1101000, 1100100, 1111011, 1101000, 1111001, 10000100,
            1100100, 1111011, 10000100, 1110011, 1101110, 1110011, 1101000, 10000100, 1110101, 1110010,
            10000101
    };
    char[] char_codes = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
            'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '.', '?'
    };
    int[] decimal_codes = {
            100, 101, 102, 103, 104, 105, 106, 107, 110, 111, 112, 113, 114, 115, 116, 117, 120, 121, 122,
            123, 124, 125, 126, 127,130,131,132,133,134
    };
    Integer number;
    for (int k = 0; k < coded_message.length; k++) {
      number = coded_message[k];
      int length = number.toString().length();
      int decimal = 0;
      for (int i = 0; i < length; i++) {
        int remainder = number % 10;
        number = number / 10;
        int multiply_with = 1;
        for (int j = 0; j < i; j++) {
          multiply_with = multiply_with * 2;
        }
        decimal = decimal + (remainder * multiply_with);
      }
      for (int l = 0; l < decimal_codes.length; l++) {
        if (decimal == decimal_codes[l]) {
          char hidden_message = char_codes[l];
          System.out.print(hidden_message);
        }
      }
    }
  }
}
