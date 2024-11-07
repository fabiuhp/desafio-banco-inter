package br.com.fabiopereira.desafio_banco_inter.domain;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UniqueDigitTest {

    @Test
    void itShouldReturnUniqueDigit() {
        var number = BigInteger.valueOf(9875);

        UniqueDigit uniqueDigit1 = new UniqueDigit(number, 4);
        UniqueDigit uniqueDigit2 = new UniqueDigit(number, 1);

        assertThat(uniqueDigit1.getResult()).isEqualTo(8);
        assertThat(uniqueDigit2.getResult()).isEqualTo(2);
    }

}