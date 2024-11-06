package br.com.fabiopereira.desafio_banco_inter.domain;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class UniqueDigitTest {

    @Test
    void itShouldReturnUniqueDigit() {
        var number = BigInteger.valueOf(9875);
        var k = 4;

        UniqueDigit uniqueDigit = new UniqueDigit(number, 4);

        assertEquals(8, uniqueDigit.getResult());
    }

}