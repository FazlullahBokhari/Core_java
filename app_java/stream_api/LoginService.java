package app_java.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//convert dto to entity and vice versa
public class LoginService {
	
	public static void main(String[] args) {
		Login login1 = new Login();
		login1.setUsername("mike");
		login1.setPassword("test");
		
		Login login2 = new Login();
		login2.setUsername("stallin");
		login2.setPassword("test");
		
		Login login3 = new Login();
		login3.setUsername("faiz");
		login3.setPassword("test");
		
		List<Login> loginList = Arrays.asList(login1, login2, login3);
		System.out.println(loginList);
		
		List<LoginDto> entityLogin = loginList.stream().map(l->mapToDto(l)).collect(Collectors.toList());
		System.out.println(entityLogin);
		
		
		LoginDto login11 = new LoginDto();
		login11.setUsername("mike");
		login11.setPassword("test");
		
		LoginDto login22 = new LoginDto();
		login22.setUsername("stallin");
		login22.setPassword("test");
		
		LoginDto login33 = new LoginDto();
		login33.setUsername("faiz");
		login33.setPassword("test");
		
		List<LoginDto> loginDtoList = Arrays.asList(login11, login22, login33);
		System.out.println(loginDtoList);
		
		List<Login> dtoLogin = loginDtoList.stream().map(x->mapToLogin(x)).collect(Collectors.toList());
		System.out.println(dtoLogin);
		
	}
	
	static Login mapToLogin(LoginDto loginDto) {
		Login login = new Login();
		login.setUsername(loginDto.getUsername());
		login.setPassword(loginDto.getPassword());
		
		return login;
	}
	
	static LoginDto mapToDto(Login login) {
		LoginDto dto = new LoginDto();
		
		dto.setUsername(login.getUsername());
		dto.setPassword(login.getPassword());
		
		return dto;
	}

}
