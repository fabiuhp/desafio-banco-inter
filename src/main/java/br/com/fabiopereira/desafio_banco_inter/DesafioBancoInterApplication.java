package br.com.fabiopereira.desafio_banco_inter;

import br.com.fabiopereira.desafio_banco_inter.domain.UniqueDigit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;

@SpringBootApplication
public class DesafioBancoInterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioBancoInterApplication.class, args);

		UniqueDigit uniqueDigit = new UniqueDigit(BigInteger.valueOf(9875), 4);
		System.out.println(uniqueDigit.getResult());
	}

}
