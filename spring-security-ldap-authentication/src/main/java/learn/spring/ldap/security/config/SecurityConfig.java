package learn.spring.ldap.security.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		String ldapServerUrl = "ldap://localhost:8389/dc=springframework,dc=org";

		auth.ldapAuthentication().userDnPatterns("uid={0},ou=people").groupSearchBase("ou=groups").contextSource()
				.url(ldapServerUrl).and().passwordCompare().passwordEncoder(new BCryptPasswordEncoder())
				.passwordAttribute("userPassword");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().anyRequest().fullyAuthenticated().and().formLogin();
	}

}
