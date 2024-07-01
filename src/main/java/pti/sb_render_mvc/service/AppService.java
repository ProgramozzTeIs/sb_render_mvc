package pti.sb_render_mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pti.sb_render_mvc.db.Database;
import pti.sb_render_mvc.dto.UserDto;
import pti.sb_render_mvc.model.User;


@Service
public class AppService {

	private Database db;
	
	
	@Autowired
	public AppService(Database db) {
		super();
		this.db = db;
	}



	public UserDto doLogin(String userName, String userPassword) {
		
		UserDto userDto = null;
		
		User user = db.getUserByNameAndPassword(userName, userPassword);
		if(user != null) {
			userDto = convertUserToUserDto(user);
		}
		
		return userDto;
	}

	

	private UserDto convertUserToUserDto(User user) {
		
		UserDto userDto = null;
		
		userDto = new UserDto(
					user.getId(),
					user.getName(),
					user.getHp()
				);
		
		return userDto;
	}

}
