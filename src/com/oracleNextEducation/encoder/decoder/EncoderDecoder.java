package com.oracleNextEducation.encoder.decoder;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EncoderDecoder {

    private static final String REGEX = "^[a-z0-9s]+$";
    private static final Pattern PATTERN = Pattern.compile(REGEX);

    public class Encoder {


        public static String encode(String input) {
            Matcher matcher = PATTERN.matcher(input);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Input contains invalid characters");
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                switch (c) {
                    case 'a':
                        sb.append("ai");
                        break;
                    case 'e':
                        sb.append("enter");
                        break;
                    case 'i':
                        sb.append("imes");
                        break;
                    case 'o':
                        sb.append("ober");
                        break;
                    case 'u':
                        sb.append("ufat");
                        break;
                    default:
                        sb.append(c);
                }
            }
            return sb.toString();
        }

        public static String decode(String input) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == 'a' && i + 1 < input.length() && input.charAt(i + 1) == 'i') {
                    sb.append('a');
                    i++;
                } else if (c == 'e' && i + 4 < input.length() && input.substring(i, i + 5).equals("enter")) {
                    sb.append('e');
                    i += 4;
                } else if (c == 'i' && i + 3 < input.length() && input.substring(i, i + 4).equals("imes")) {
                    sb.append('i');
                    i += 3;
                } else if (c == 'o' && i + 3 < input.length() && input.substring(i, i + 4).equals("ober")) {
                    sb.append('o');
                    i += 3;
                } else if (c == 'u' && i + 3 < input.length() && input.substring(i, i + 4).equals("ufat")) {
                    sb.append('u');
                    i += 3;
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
    }

}
