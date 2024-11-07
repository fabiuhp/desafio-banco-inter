package br.com.fabiopereira.desafio_banco_inter.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.UUID;

@Getter
@Entity
@Table(name = "unique_digits")
@AllArgsConstructor
@NoArgsConstructor
public class UniqueDigit {
    @Id
    private UUID id;

    private int result;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

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
