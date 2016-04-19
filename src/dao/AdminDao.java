package dao;

import java.util.List;

import entity.Admin;

public interface AdminDao {
	void addAdmin(Admin admin);
	List<Admin> listAdmin();
}
