package bo.imp;

import java.util.List;
import dao.AdminDao;
import entity.Admin;
import bo.AdminBo;

public class AdminBoImp implements AdminBo{

	AdminDao adminDAO;
	
	public void setAdminDAO(AdminDao adminDAO){
		this.adminDAO=adminDAO;
	}
	
	public void addAdmin(Admin admin){
		adminDAO.addAdmin(admin);
		
	}
	
	public List<Admin> listAdmin(){
		return adminDAO.listAdmin();
	}
	
	
}
