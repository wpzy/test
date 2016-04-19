package action;
import java.util.ArrayList;
import java.util.List;
import bo.AdminBo;
import com.opensymphony.xwork2.ModelDriven;
import entity.Admin;

@SuppressWarnings("rawtypes")
public class AdminAction implements ModelDriven{
	
	Admin admin=new Admin();
	List<Admin> AdminList=new ArrayList<Admin>();
	
	AdminBo adminBo;
	public void setAdminBo(AdminBo adminBo){
		this.adminBo=adminBo;
	}
	public Object getModel(){
		return admin;
	}
	
	public List<Admin> getAdminList(){
		return AdminList;
	}
	
	public void setAdminList(List<Admin> admin){
		this.AdminList=admin;
	}
	

	public String addAdmin() throws Exception{
		
			adminBo.addAdmin(admin);
			AdminList=null;
			AdminList=adminBo.listAdmin();
			return "success";

	}
	
	

	public String listAdmin(){
		AdminList=adminBo.listAdmin();
		return "success";
	}
	
	
	
	
	
	
	
	
}
