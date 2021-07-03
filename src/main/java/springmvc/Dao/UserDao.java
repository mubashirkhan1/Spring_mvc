package springmvc.Dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import springmvc.model.User;
@Repository
public class UserDao
{	//save user in database
	@Autowired
	private HibernateTemplate hibernatetamplate;
       
	
//	public HibernateTemplate getHibernatetamplate() {
//		return hibernatetamplate;
//	}
//
//
//	public void setHibernatetamplate(HibernateTemplate hibernatetamplate) {
//		this.hibernatetamplate = hibernatetamplate;
//	}


	@Transactional
	public int save(User user) 
	{
	int value=	(Integer) this.hibernatetamplate.save(user);
	return value;
	
	}
}
