package com.devweb.rh;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class RhApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RhApplication.class, args);
	}

	@Autowired
	PasswordEncoder encoder;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(encoder.encode("passer"));
	}
}
