package br.com.fabiopereira.desafio_banco_inter.domain;

import lombok.Getter;

import java.math.BigInteger;

@Getter
public class UniqueDigit {
    private int result;

    public UniqueDigit(BigInteger number, Integer k) {
        result = calculateNewUniqueDigit(number, k);
    }

    private int calculateNewUniqueDigit(BigInteger number, Integer k) {
        String numberString = String.valueOf(number).repeat(k);

        int uniqueDigit = sumOfDigits(numberString);

        while (uniqueDigit > 9) {
            uniqueDigit = sumOfDigits(String.valueOf(uniqueDigit));
        }

        return uniqueDigit;
    }

    private int sumOfDigits(String numberString) {
        int sum = 0;

        for(char digit : numberString.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }

        return sum;
    }
}
