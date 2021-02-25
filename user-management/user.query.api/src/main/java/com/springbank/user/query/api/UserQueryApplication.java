package com.springbank.user.query.api;

import com.springbank.user.core.configuration.AxonConfig;
import com.springbank.user.query.api.configuration.ApplicationSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
//@EnableGlobalMethodSecurity(prePostEnabled = true)
@SpringBootApplication
@Import({ AxonConfig.class, ApplicationSecurity.class })
public class UserQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserQueryApplication.class, args);
	}

}
