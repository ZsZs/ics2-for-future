package com.springbank.user.cmd.api.configuration;

import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class ApplicationSecurity extends WebSecurityConfigurerAdapter {
   @Override public void configure( WebSecurity web ) throws Exception {
      web.ignoring().antMatchers( "/**" );
   }
}
