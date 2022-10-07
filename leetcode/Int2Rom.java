import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str1 = "";
        String str2 = "";
        String str4 = "";
        String roman = "";
        String numstr = "";
        boolean flag = false;
            do {
                System.out.print("Integer Number: ");
                numstr = input.next();

                int z = Integer.parseInt(numstr);


                if ( Integer.parseInt(numstr) < 1 || Integer.parseInt(numstr) > 3999) {
                    System.out.println("NUMBER CAN ONLY BE BETWEEN 1 & 3999 INCLUSIVE! Try Again.");
                }
            } while (Integer.parseInt(numstr) < 1 || Integer.parseInt(numstr) > 3999);

            int x = numstr.length();

            int unit = 0;
            switch (x) {
                case 1:
                    if (numstr.charAt(0) == 51) {
                        roman = "IV";
                    }
                    if (numstr.charAt(0) >= 49 && numstr.charAt(0) <= 51) {
                        for (int i = 0; i < Integer.parseInt(numstr); i++) {
                            roman = roman + "I";
                        }
                    } else if (Integer.parseInt(numstr) == 5) {
                        roman = "V";
                    } else if (Integer.parseInt(numstr) >= 6 && Integer.parseInt(numstr) <= 8) {
                        roman = "V";
                        for (int i = 0; i < (Integer.parseInt(numstr) - 5); i++) {
                            roman = roman + "I";
                        }
                    } else {
                        roman = "IX";
                    }
                    System.out.printf("Roman Numeral: %s", roman);
                    break;
                case 2:
                    //Tens
                    if (numstr.charAt(0) == 49) {
                        str1 = "X";
                    } else if (numstr.charAt(0) == 50) {
                        str1 = "XX";
                    } else if (numstr.charAt(0) == 51) {
                        str1 = "XXX";
                    } else if (numstr.charAt(0) == 52) {
                        str1 = "XL";
                    } else if (numstr.charAt(0) == 53) {
                        str1 = "L";
                    } else if (numstr.charAt(0) == 54) {
                        str1 = "LX";
                    } else if (numstr.charAt(0) == 55) {
                        str1 = "LXX";
                    } else if (numstr.charAt(0) == 56) {
                        str1 = "LXXX";
                    } else if (numstr.charAt(0) == 57) {
                        str1 = "XC";
                    }
                    //Units
                    if (numstr.charAt(1) == 48) {
                        roman = "";
                    }
                    if (numstr.charAt(1) == 52) {
                        roman = "IV";
                    }
                    unit = (Integer.parseInt(numstr))%10;
                    if (numstr.charAt(1) >= 49 && numstr.charAt(1) <= 51) {
                        for (int i = 0; i < unit; i++) {
                            roman = roman + "I";
                        }
                    } else if (unit == 5) {
                        roman = "V";
                    } else if (unit >= 6 && unit <= 8) {
                        roman = "V";
                        for (int i = 0; i < (unit - 5); i++) {
                            roman = roman + "I";
                        }
                    }
                    if (numstr.charAt(1) == '9') {
                        roman = "IX";
                    }
                    System.out.println("Roman Numeral: " + str1.concat(roman));
                    break;
                case 3:
                    //Hundreds
                    if (numstr.charAt(0) == 49) {
                        str2 = "C";
                    } else if (numstr.charAt(0) == 50) {
                        str2 = "CC";
                    } else if (numstr.charAt(0) == 51) {
                        str2 = "CCC";
                    } else if (numstr.charAt(0) == 52) {
                        str2 = "CD";
                    } else if (numstr.charAt(0) == 53) {
                        str2 = "D";
                    } else if (numstr.charAt(0) == 54) {
                        str2 = "DC";
                    } else if (numstr.charAt(0) == 55) {
                        str2 = "DCC";
                    } else if (numstr.charAt(0) == 56) {
                        str2 = "DCCC";
                    } else if (numstr.charAt(0) == 57) {
                        str2 = "CM";
                    }
                    //Tens
                    if (numstr.charAt(1) == 48) {
                        str1 = "";
                    }
                    if (numstr.charAt(1) == 49) {
                        str1 = "X";
                    } else if (numstr.charAt(1) == 50) {
                        str1 = "XX";
                    } else if (numstr.charAt(1) == 51) {
                        str1 = "XXX";
                    } else if (numstr.charAt(1) == 52) {
                        str1 = "XL";
                    } else if (numstr.charAt(1) == 53) {
                        str1 = "L";
                    } else if (numstr.charAt(1) == 54) {
                        str1 = "LX";
                    } else if (numstr.charAt(1) == 55) {
                        str1 = "LXX";
                    } else if (numstr.charAt(1) == 56) {
                        str1 = "LXXX";
                    } else if (numstr.charAt(1) == 57) {
                        str1 = "XC";
                    }
                    //Units
                    unit = (Integer.parseInt(numstr))%10;
                    if (numstr.charAt(2) == 52) {
                        roman = "IV";
                    }
                    if (numstr.charAt(2) >= 49 && numstr.charAt(2) <= 51) {
                        for (int i = 0; i < unit; i++) {
                            roman = roman + "I";
                        }
                    } else if (unit == 5) {
                        roman = "V";
                    } else if (unit >= 6 && unit <= 8) {
                        roman = "V";
                        for (int i = 0; i < (unit - 5); i++) {
                            roman = roman + "I";
                        }
                    } else if (unit == 9) {
                        roman = "IX";
                    } else {
                        roman = "";
                    }

                    System.out.println("Roman Numeral: " + str2 + str1 + roman);
                    break;
                default:
                    //Thousands
                    if (numstr.charAt(0) == 49) {
                        str4 = "M";
                    } else if (numstr.charAt(0) == 50) {
                        str4 = "MM";
                    } else if (numstr.charAt(0) == 51) {
                        str4 = "MMM";
                    }
                    //Hundreds
                    if (numstr.charAt(1) == 49) {
                        str2 = "C";
                    } else if (numstr.charAt(1) == 50) {
                        str2 = "CC";
                    } else if (numstr.charAt(1) == 51) {
                        str2 = "CCC";
                    } else if (numstr.charAt(1) == 52) {
                        str2 = "CD";
                    } else if (numstr.charAt(1) == 53) {
                        str2 = "D";
                    } else if (numstr.charAt(1) == 54) {
                        str2 = "DC";
                    } else if (numstr.charAt(1) == 55) {
                        str2 = "DCC";
                    } else if (numstr.charAt(1) == 56) {
                        str2 = "DCCC";
                    } else if (numstr.charAt(1) == 57) {
                        str2 = "CM";
                    }
                    //Tens
                    if (numstr.charAt(2) == 48) {
                        str1 = "";
                    }
                    if (numstr.charAt(2) == 49) {
                        str1 = "X";
                    } else if (numstr.charAt(2) == 51) {
                        str1 = "XX";
                    } else if (numstr.charAt(2) == 51) {
                        str1 = "XXX";
                    } else if (numstr.charAt(2) == 52) {
                        str1 = "XL";
                    } else if (numstr.charAt(2) == 53) {
                        str1 = "L";
                    } else if (numstr.charAt(2) == 54) {
                        str1 = "LX";
                    } else if (numstr.charAt(2) == 55) {
                        str1 = "LXX";
                    } else if (numstr.charAt(2) == 56) {
                        str1 = "LXXX";
                    } else if (numstr.charAt(2) == 57) {
                        str1 = "XC";
                    }
                    //Units
                    unit = (Integer.parseInt(numstr))%10;
                    if (numstr.charAt(3) == 52) {
                        roman = "IV";
                    }
                    if (numstr.charAt(3) >= 49 && numstr.charAt(3) <= 51) {
                        for (int i = 0; i < unit; i++) {
                            roman = roman + "I";
                        }
                    } else if (unit == 5) {
                        roman = "V";
                    } else if (unit >= 6 && unit <= 8) {
                        roman = "V";
                        for (int i = 0; i < (unit - 5); i++) {
                            roman = roman + "I";
                        }
                    } else if (unit == 9) {
                        roman = "IX";
                    } else if (unit == 0){
                        roman = "";
                    }
                    System.out.println("Roman Numeral: " + str4 + str2 + str1 + roman);



            }
    }
}