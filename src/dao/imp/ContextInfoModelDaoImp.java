package dao.imp;

import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import dao.ContextInfoModelDao;
import model.ContextInfoModel;

public class ContextInfoModelDaoImp extends HibernateDaoSupport implements ContextInfoModelDao{

	@Override
	public String findFileByLegalBG(String LegalBG) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String findFileByAdminBG(String AdminBG) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findFileByCreateReason(String CreateReason) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findFileByISDescription(String ISDescription) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findFileByISLegalDescription(String ISLegalDescription) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findFileByISEnvironment(String ISEnvironment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findFileByProcessType(String ProcessType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findFileByProcessor(String Processor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findFileByReceiveDate(Date ReceiveDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findFileByProcessDate(Date ProcessDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findFileBySendDate(Date SendDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findFileByDraftDate(Date DraftDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findFileByExaminedDate(Date ExaminedDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findFileBySignDate(Date SignDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findFileByProcessView(String ProcessView) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findFileByDrafter(String Drafter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findFileByExaminer(String Examiner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findFileByArchivedID(String ArchivedID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ContextInfoModel> findFileByAdminBG_S(String AdminBG) {
		// TODO Auto-generated method stub
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.AdminBG like ?","%"+AdminBG+"%");	
	}

	@Override
	public List<ContextInfoModel> findFileByCreateReason_S(String CreateReason) {
		// TODO Auto-generated method stub
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.CreateReason like ?","%"+CreateReason+"%");	
	}

	@Override
	public List<ContextInfoModel> findFileByISDescription_S(String ISDescription) {
		// TODO Auto-generated method stub
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.ISDescription like ?","%"+ISDescription+"%");	
	}

	@Override
	public List<ContextInfoModel> findFileByISLegalDescription_S(String ISLegalDescription) {
		// TODO Auto-generated method stub
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.ISLegalDescription like ?","%"+ISLegalDescription+"%");	
	}

	@Override
	public List<ContextInfoModel> findFileByISEnvironment_S(String ISEnvironment) {
		// TODO Auto-generated method stub
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.ISEnvironment like ?","%"+ISEnvironment+"%");	
	}

	@Override
	public List<ContextInfoModel> findFileByProcessType_S(String ProcessType) {
		// TODO Auto-generated method stub
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.ProcessType like ?","%"+ProcessType+"%");	
	}

	@Override
	public List<ContextInfoModel> findFileByProcessor_S(String Processor) {
		// TODO Auto-generated method stub
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.Processor like ?","%"+Processor+"%");	
	}

	@Override
	public List<ContextInfoModel> findFileByReceiveDate_S(Date ReceiveDate) {
		// TODO Auto-generated method stub
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.ReceiveDate like ?","%"+ReceiveDate+"%");	
	}

	@Override
	public List<ContextInfoModel> findFileByProcessDate_S(Date ProcessDate) {
		// TODO Auto-generated method stub
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.ProcessDate like ?","%"+ProcessDate+"%");	
	}

	@Override
	public List<ContextInfoModel> findFileBySendDate_S(Date SendDate) {
		// TODO Auto-generated method stub
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.SendDate like ?","%"+SendDate+"%");	
	}

	@Override
	public List<ContextInfoModel> findFileByDraftDate_S(Date DraftDate) {
		// TODO Auto-generated method stub
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.DraftDate like ?","%"+DraftDate+"%");	
	}

	@Override
	public List<ContextInfoModel> findFileByExaminedDate_S(Date ExaminedDate) {
		// TODO Auto-generated method stub
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.ExaminedDate like ?","%"+ExaminedDate+"%");	
	}

	@Override
	public List<ContextInfoModel> findFileBySignDate_S(Date SignDate) {
		// TODO Auto-generated method stub
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.SignDate like ?","%"+SignDate+"%");	
	}

	@Override
	public List<ContextInfoModel> findFileByProcessView_S(String ProcessView) {
		// TODO Auto-generated method stub
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.ProcessView like ?","%"+ProcessView+"%");	
	}

	@Override
	public List<ContextInfoModel> findFileByDrafter_S(String Drafter) {
		// TODO Auto-generated method stub
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.Drafter like ?","%"+Drafter+"%");	
	}

	@Override
	public List<ContextInfoModel> findFileByExaminer_S(String Examiner) {
		// TODO Auto-generated method stub
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.Examiner like ?","%"+Examiner+"%");	
	}

	@Override
	public List<ContextInfoModel> findFileByArchivedID_S(String ArchivedID) {
		// TODO Auto-generated method stub
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.ArchivedID like ?","%"+ArchivedID+"%");	
	}

	@Override
	public List<ContextInfoModel> findFileByLegalBG_S(String LegalBG) {
		// TODO Auto-generated method stub
		System.out.println("here"+LegalBG);
		return (List<ContextInfoModel>) getHibernateTemplate().find("from ContextInfoModel cim where cim.LegalBG like ?","%"+LegalBG+"%");	
	}
	

	
	

}
