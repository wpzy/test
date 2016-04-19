package dao.imp;

import java.util.List;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import dao.AdminDao;
import entity.Admin;

public class AdminDaoImp extends HibernateDaoSupport implements AdminDao{

	public void addAdmin(Admin admin){
		getHibernateTemplate().save(admin);
	}
	

	@SuppressWarnings("unchecked")
	public List<Admin> listAdmin(){

		return (List<Admin>) getHibernateTemplate().find("from Admin");		
	}

}
