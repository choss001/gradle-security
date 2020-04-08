package jss.security;
//package sideProjectGradle.security;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
	//@Override
    //protected void configure(HttpSecurity http) throws Exception {
        ////http
            ////.authorizeRequests()
                ////.antMatchers("/**", "/login","/service","/resources/**","/create", "/hello").permitAll()
                ////.antMatchers("/admin").hasRole("ADMIN")
                ////.anyRequest().permitAll()
                ////.and()
           ////.formLogin()
                ////.permitAll()
                ////.and()
            ////.logout()
                ////.permitAll();
        //http
        	//.csrf().disable()
            //.authorizeRequests()
            	//.antMatchers("/admin").hasRole("ADMIN")
            	//.antMatchers("/private").hasRole("USER")
            	//.antMatchers("/**").authenticated()
            	//.antMatchers("/hello").permitAll()
            	//.anyRequest().authenticated()
            	//.and()
            	//.httpBasic();
//
    //}
//	
	//@Bean
	//public PasswordEncoder passwordEncoder(){
		//return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	//}
//}