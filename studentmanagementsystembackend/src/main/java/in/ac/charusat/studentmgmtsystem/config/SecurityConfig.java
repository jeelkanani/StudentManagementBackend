package in.ac.charusat.studentmgmtsystem.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

      
        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception{
                auth.inMemoryAuthentication()
                .withUser("admin")
                .password("admin")
                .roles("ADMIN");
        } 


        // provide encoding without any opration this method automatic called by spring boot
        @Bean
        public PasswordEncoder getPasswordEncoder()
        {
                return NoOpPasswordEncoder.getInstance();
        }

}