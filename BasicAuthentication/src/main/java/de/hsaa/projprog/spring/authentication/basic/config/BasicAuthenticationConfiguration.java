package de.hsaa.projprog.spring.authentication.basic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class BasicAuthenticationConfiguration {
    @Bean
    PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
                .antMatchers("/h2-console/**")
                .permitAll()
                .antMatchers("/public/**")
                .permitAll()
                .antMatchers("/private/**")
                .hasAnyRole("USER", "ADMIN")
                .and()
                .httpBasic(withDefaults());

        httpSecurity.csrf()
                .ignoringAntMatchers("/h2-console/**");
        httpSecurity.headers()
                .frameOptions()
                .sameOrigin();

        return httpSecurity.build();
    }

//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user = User.withDefaultPasswordEncoder()
//                .username("user")
//                .password("password")
//                .roles("USER")
//                .build();
//        UserDetails admin = User.withDefaultPasswordEncoder()
//                .username("admin")
//                .password("password")
//                .roles("ADMIN", "USER")
//                .build();
//        return new InMemoryUserDetailsManager(user);
//    }

}
