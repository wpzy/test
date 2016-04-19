package action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ModelDriven;

import bo.ContextInfoModelBo;
import model.ContextInfoModel;

public class QueryAction implements ModelDriven{

	ContextInfoModel cim=new ContextInfoModel();
	List<ContextInfoModel> cimList=new ArrayList<ContextInfoModel>();
	ContextInfoModelBo cimBo;
	public ContextInfoModelBo getCimBo() {
		return cimBo;
	}
	public void setCimBo(ContextInfoModelBo cimBo) {
		this.cimBo = cimBo;
	}
	public Object getModel(){
		return cim;
	}
	public List<ContextInfoModel> getCimList() {
		return cimList;
	}
	public void setCimList(List<ContextInfoModel> cimList) {
		this.cimList = cimList;
	}
	
	
	public String query() throws Exception{
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String choose=cim.getChoose();
		String param=cim.getChooseOption();

		switch(choose){
		case "LegalBG":cimList=cimBo.findFileByLegalBG_S(param);break;
		case "AdminBG":cimList=cimBo.findFileByAdminBG_S(param);break;
		case "CreateReason":cimList=cimBo.findFileByCreateReason_S(param);break;
		case "ISDescription":cimList=cimBo.findFileByISDescription_S(param);break;
		case "ISLegalDescription":cimList=cimBo.findFileByISLegalDescription_S(param);break;
		case "ISEnvironment":cimList=cimBo.findFileByISEnvironment_S(param);break;
		case "ProcessType":cimList=cimBo.findFileByProcessType_S(param);break;
		case "Processor":cimList=cimBo.findFileByProcessor_S(param);break;
		case "ReceiveDate":cimList=cimBo.findFileByReceiveDate_S(format1.parse(param));break;
		case "ProcessDate":cimList=cimBo.findFileByProcessDate_S(format1.parse(param));break;
		case "SendDate":cimList=cimBo.findFileBySendDate_S(format1.parse(param));break;
		case "DraftDate":cimList=cimBo.findFileByDraftDate_S(format1.parse(param));break;
		case "ExaminedDate":cimList=cimBo.findFileByExaminedDate_S(format1.parse(param));break;
		case "SignDate":cimList=cimBo.findFileBySignDate_S(format1.parse(param));break;
		case "ProcessView":cimList=cimBo.findFileByProcessView_S(param);break;
		case "Drafter":cimList=cimBo.findFileByDrafter_S(param);break;
		case "Examiner":cimList=cimBo.findFileByExaminer_S(param);break;
		case "ArchivedID":cimList=cimBo.findFileByArchivedID_S(param);break;
		default : cimList=cimBo.findFileByArchivedID_S(param);break;
		}
		
		return "SUCCESS";
	}
	
	
	
	
}
