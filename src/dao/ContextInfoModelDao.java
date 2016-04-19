package dao;

import java.util.Date;
import java.util.List;

import model.ContextInfoModel;

public interface ContextInfoModelDao {
	public String findFileByLegalBG(String LegalBG);
	public String findFileByAdminBG(String AdminBG);
	public String findFileByCreateReason(String CreateReason);
	public String findFileByISDescription(String ISDescription);
	public String findFileByISLegalDescription(String ISLegalDescription);
	public String findFileByISEnvironment(String ISEnvironment);
	public String findFileByProcessType(String ProcessType);
	public String findFileByProcessor(String Processor);
	public String findFileByReceiveDate(Date ReceiveDate);
	public String findFileByProcessDate(Date ProcessDate);
	public String findFileBySendDate(Date SendDate);
	public String findFileByDraftDate(Date DraftDate);
	public String findFileByExaminedDate(Date ExaminedDate);
	public String findFileBySignDate(Date SignDate);
	public String findFileByProcessView(String ProcessView);
	public String findFileByDrafter(String Drafter);
	public String findFileByExaminer(String Examiner);
	public String findFileByArchivedID(String ArchivedID);
	
	public List<ContextInfoModel> findFileByLegalBG_S(String LegalBG);
	public List<ContextInfoModel> findFileByAdminBG_S(String AdminBG);
	public List<ContextInfoModel> findFileByCreateReason_S(String CreateReason);
	public List<ContextInfoModel> findFileByISDescription_S(String ISDescription);
	public List<ContextInfoModel> findFileByISLegalDescription_S(String ISLegalDescription);
	public List<ContextInfoModel> findFileByISEnvironment_S(String ISEnvironment);
	public List<ContextInfoModel> findFileByProcessType_S(String ProcessType);
	public List<ContextInfoModel> findFileByProcessor_S(String Processor);
	public List<ContextInfoModel> findFileByReceiveDate_S(Date ReceiveDate);
	public List<ContextInfoModel> findFileByProcessDate_S(Date ProcessDate);
	public List<ContextInfoModel> findFileBySendDate_S(Date SendDate);
	public List<ContextInfoModel> findFileByDraftDate_S(Date DraftDate);
	public List<ContextInfoModel> findFileByExaminedDate_S(Date ExaminedDate);
	public List<ContextInfoModel> findFileBySignDate_S(Date SignDate);
	public List<ContextInfoModel> findFileByProcessView_S(String ProcessView);
	public List<ContextInfoModel> findFileByDrafter_S(String Drafter);
	public List<ContextInfoModel> findFileByExaminer_S(String Examiner);
	public List<ContextInfoModel> findFileByArchivedID_S(String ArchivedID);
	
}
