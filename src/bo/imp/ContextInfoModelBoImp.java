package bo.imp;

import java.util.Date;
import java.util.List;

import bo.ContextInfoModelBo;
import dao.ContextInfoModelDao;
import model.ContextInfoModel;

public class ContextInfoModelBoImp implements ContextInfoModelBo{
	ContextInfoModelDao ContextInfoModelDAO;

	public ContextInfoModelDao getContextInfoModelDAO() {
		return ContextInfoModelDAO;
	}

	public void setContextInfoModelDAO(ContextInfoModelDao contextInfoModelDAO) {
		ContextInfoModelDAO = contextInfoModelDAO;
	}

	@Override
	public String findFileByLegalBG(String LegalBG) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByLegalBG(LegalBG);
	}

	@Override
	public String findFileByAdminBG(String AdminBG) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByAdminBG(AdminBG);
	}

	@Override
	public String findFileByCreateReason(String CreateReason) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByCreateReason(CreateReason);
	}

	@Override
	public String findFileByISDescription(String ISDescription) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByISDescription(ISDescription);
	}

	@Override
	public String findFileByISLegalDescription(String ISLegalDescription) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByISLegalDescription(ISLegalDescription);
	}

	@Override
	public String findFileByISEnvironment(String ISEnvironment) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByISEnvironment(ISEnvironment);
	}

	@Override
	public String findFileByProcessType(String ProcessType) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByProcessType(ProcessType);
	}

	@Override
	public String findFileByProcessor(String Processor) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByProcessor(Processor);
	}

	@Override
	public String findFileByReceiveDate(Date ReceiveDate) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByReceiveDate(ReceiveDate);
	}

	@Override
	public String findFileByProcessDate(Date ProcessDate) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByProcessDate(ProcessDate);
	}

	@Override
	public String findFileBySendDate(Date SendDate) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileBySendDate(SendDate);
	}

	@Override
	public String findFileByDraftDate(Date DraftDate) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByDraftDate(DraftDate);
	}

	@Override
	public String findFileByExaminedDate(Date ExaminedDate) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByExaminedDate(ExaminedDate);
	}

	@Override
	public String findFileBySignDate(Date SignDate) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileBySignDate(SignDate);
	}

	@Override
	public String findFileByProcessView(String ProcessView) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByProcessView(ProcessView);
	}

	@Override
	public String findFileByDrafter(String Drafter) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByDrafter(Drafter);
	}

	@Override
	public String findFileByExaminer(String Examiner) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByExaminer(Examiner);
	}

	@Override
	public String findFileByArchivedID(String ArchivedID) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByArchivedID(ArchivedID);
	}

	@Override
	public List<ContextInfoModel> findFileByLegalBG_S(String LegalBG) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByLegalBG_S(LegalBG);
	}

	@Override
	public List<ContextInfoModel> findFileByAdminBG_S(String AdminBG) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByAdminBG_S(AdminBG);
	}

	@Override
	public List<ContextInfoModel> findFileByCreateReason_S(String CreateReason) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByCreateReason_S(CreateReason);
	}

	@Override
	public List<ContextInfoModel> findFileByISDescription_S(String ISDescription) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByISDescription_S(ISDescription);
	}

	@Override
	public List<ContextInfoModel> findFileByISLegalDescription_S(String ISLegalDescription) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByISLegalDescription_S(ISLegalDescription);
	}

	@Override
	public List<ContextInfoModel> findFileByISEnvironment_S(String ISEnvironment) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByISEnvironment_S(ISEnvironment);
	}

	@Override
	public List<ContextInfoModel> findFileByProcessType_S(String ProcessType) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByProcessType_S(ProcessType);
	}

	@Override
	public List<ContextInfoModel> findFileByProcessor_S(String Processor) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByProcessor_S(Processor);
	}

	@Override
	public List<ContextInfoModel> findFileByReceiveDate_S(Date ReceiveDate) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByReceiveDate_S(ReceiveDate);
	}

	@Override
	public List<ContextInfoModel> findFileByProcessDate_S(Date ProcessDate) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByProcessDate_S(ProcessDate);
	}

	@Override
	public List<ContextInfoModel> findFileBySendDate_S(Date SendDate) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileBySendDate_S(SendDate);
	}

	@Override
	public List<ContextInfoModel> findFileByDraftDate_S(Date DraftDate) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByDraftDate_S(DraftDate);
	}

	@Override
	public List<ContextInfoModel> findFileByExaminedDate_S(Date ExaminedDate) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByExaminedDate_S(ExaminedDate);
	}

	@Override
	public List<ContextInfoModel> findFileBySignDate_S(Date SignDate) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileBySignDate_S(SignDate);
	}

	@Override
	public List<ContextInfoModel> findFileByProcessView_S(String ProcessView) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByProcessView_S(ProcessView);
	}

	@Override
	public List<ContextInfoModel> findFileByDrafter_S(String Drafter) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByDrafter_S(Drafter);
	}

	@Override
	public List<ContextInfoModel> findFileByExaminer_S(String Examiner) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByExaminer_S(Examiner);
	}

	@Override
	public List<ContextInfoModel> findFileByArchivedID_S(String ArchivedID) {
		// TODO Auto-generated method stub
		return ContextInfoModelDAO.findFileByArchivedID_S(ArchivedID);
	}
	
}
