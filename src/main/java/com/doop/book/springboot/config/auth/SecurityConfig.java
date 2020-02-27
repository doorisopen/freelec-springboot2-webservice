package com.doop.book.springboot.config.auth;

import com.doop.book.springboot.domain.user.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@RequiredArgsConstructor
@EnableWebSecurity // (1)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final CustomOAuth2UserService customOAuth2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .headers().frameOptions().disable() // (2)
                .and()
                    .authorizeRequests() // (3)
                    .antMatchers("/","/css/**","/images/**","/js/**","/h2-console/**").permitAll()
                    .antMatchers("/api/v1/**").hasRole(Role.USER.name()) // (4)
                    .anyRequest().authenticated() // (5)
                .and()
                    .logout()
                        .logoutSuccessUrl("/") // (6)
                .and()
                    .oauth2Login()// (7)
                        .userInfoEndpoint() // (8)
                            .userService(customOAuth2UserService); // (9)


    }
}
