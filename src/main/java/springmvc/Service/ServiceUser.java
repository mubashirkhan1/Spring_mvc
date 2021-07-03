package springmvc.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.Dao.UserDao;
import springmvc.model.User;
@Service
public class ServiceUser 
{

@Autowired
private  UserDao userdao;




	public String madeuser(User user)
	{
		this.userdao.save(user);
		return "user";
	}
}
