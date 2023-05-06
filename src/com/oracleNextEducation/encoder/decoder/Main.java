package com.oracleNextEducation.encoder.decoder;

import java.util.Scanner;

import static com.oracleNextEducation.encoder.decoder.EncoderDecoder.Encoder.decode;
import static com.oracleNextEducation.encoder.decoder.EncoderDecoder.Encoder.encode;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to encode: ");
        String input = scanner.nextLine();
        String encoded = encode(input);
        System.out.println("Encoded: " + encoded);

        System.out.print("Enter text to decode: ");
        String encodedInput = scanner.nextLine();
        String decoded = decode(encodedInput);
        System.out.println("Decoded: " + decoded);
    }
}
