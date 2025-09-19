package com.example.challenge_mottu;

import org.apache.catalina.util.ServerInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeMottuApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeMottuApplication.class, args);
		System.out.println(ServerInfo.getServerInfo());
	}

}
