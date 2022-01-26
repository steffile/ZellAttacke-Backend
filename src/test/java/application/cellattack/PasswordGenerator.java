package application.cellattack;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @source https://www.codejava.net/frameworks/spring-boot/user-registration-and-login-tutorial 
 *
 */
public class PasswordGenerator {

	public static void main(String[] args) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String plainPassword = "nam2020";
		String encodedPassword = passwordEncoder.encode(plainPassword);
		
		System.out.println(encodedPassword);
	}

}
