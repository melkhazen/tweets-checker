package com.tweetschecker.tweetschecker.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Mohamed Elkahzen
 * @13/06/2022 - 8:36 AM
 * @project tweets-checker
 */

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception {

        httpSecurity
                .antMatcher("/**").authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
//                .oauth2Login()
//                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll();
    }
}
