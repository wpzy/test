package bo;

import java.util.List;

import entity.Admin;

public interface AdminBo {
	
	void addAdmin(Admin admin);
	List<Admin> listAdmin();
	
}
