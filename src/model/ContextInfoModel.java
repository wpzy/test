package model;

import java.util.Date;

public class ContextInfoModel {
	private String choose;
	private String chooseOption;
	
	
	private String LegalBG;
	private String AdminBG;
	private String CreateReason;
	private String ISDescription;
	private String ISLegalDescription;
	private String ISEnvironment;
	private String ProcessType;
	private String Processor;
	private Date ReceiveDate;
	private Date ProcessDate;
	private Date SendDate;
	private Date DraftDate;
	private Date ExaminedDate;
	private Date SignDate;
	
	private String ProcessView;
	private String Drafter;
	private String Examiner;
	private String ArchivedID;
	public String getChoose() {
		return choose;
	}
	public void setChoose(String choose) {
		this.choose = choose;
	}
	public String getChooseOption() {
		return chooseOption;
	}
	public void setChooseOption(String chooseOption) {
		this.chooseOption = chooseOption;
	}
	public String getLegalBG() {
		return LegalBG;
	}
	public void setLegalBG(String legalBG) {
		LegalBG = legalBG;
	}
	public String getAdminBG() {
		return AdminBG;
	}
	public void setAdminBG(String adminBG) {
		AdminBG = adminBG;
	}
	public String getCreateReason() {
		return CreateReason;
	}
	public void setCreateReason(String createReason) {
		CreateReason = createReason;
	}
	public String getISDescription() {
		return ISDescription;
	}
	public void setISDescription(String iSDescription) {
		ISDescription = iSDescription;
	}
	public String getISLegalDescription() {
		return ISLegalDescription;
	}
	public void setISLegalDescription(String iSLegalDescription) {
		ISLegalDescription = iSLegalDescription;
	}
	public String getISEnvironment() {
		return ISEnvironment;
	}
	public void setISEnvironment(String iSEnvironment) {
		ISEnvironment = iSEnvironment;
	}
	public String getProcessType() {
		return ProcessType;
	}
	public void setProcessType(String processType) {
		ProcessType = processType;
	}
	public String getProcessor() {
		return Processor;
	}
	public void setProcessor(String processor) {
		Processor = processor;
	}
	public Date getReceiveDate() {
		return ReceiveDate;
	}
	public void setReceiveDate(Date receiveDate) {
		ReceiveDate = receiveDate;
	}
	public Date getProcessDate() {
		return ProcessDate;
	}
	public void setProcessDate(Date processDate) {
		ProcessDate = processDate;
	}
	public Date getSendDate() {
		return SendDate;
	}
	public void setSendDate(Date sendDate) {
		SendDate = sendDate;
	}
	public Date getDraftDate() {
		return DraftDate;
	}
	public void setDraftDate(Date draftDate) {
		DraftDate = draftDate;
	}
	public Date getExaminedDate() {
		return ExaminedDate;
	}
	public void setExaminedDate(Date examinedDate) {
		ExaminedDate = examinedDate;
	}
	public Date getSignDate() {
		return SignDate;
	}
	public void setSignDate(Date signDate) {
		SignDate = signDate;
	}
	public String getProcessView() {
		return ProcessView;
	}
	public void setProcessView(String processView) {
		ProcessView = processView;
	}
	public String getDrafter() {
		return Drafter;
	}
	public void setDrafter(String drafter) {
		Drafter = drafter;
	}
	public String getExaminer() {
		return Examiner;
	}
	public void setExaminer(String examiner) {
		Examiner = examiner;
	}
	public String getArchivedID() {
		return ArchivedID;
	}
	public void setArchivedID(String archivedID) {
		ArchivedID = archivedID;
	}
	public ContextInfoModel(String choose, String chooseOption, String legalBG,
			String adminBG, String createReason, String iSDescription,
			String iSLegalDescription, String iSEnvironment,
			String processType, String processor, Date receiveDate,
			Date processDate, Date sendDate, Date draftDate, Date examinedDate,
			Date signDate, String processView, String drafter, String examiner,
			String archivedID) {
		super();
		this.choose = choose;
		this.chooseOption = chooseOption;
		LegalBG = legalBG;
		AdminBG = adminBG;
		CreateReason = createReason;
		ISDescription = iSDescription;
		ISLegalDescription = iSLegalDescription;
		ISEnvironment = iSEnvironment;
		ProcessType = processType;
		Processor = processor;
		ReceiveDate = receiveDate;
		ProcessDate = processDate;
		SendDate = sendDate;
		DraftDate = draftDate;
		ExaminedDate = examinedDate;
		SignDate = signDate;
		ProcessView = processView;
		Drafter = drafter;
		Examiner = examiner;
		ArchivedID = archivedID;
	}
	public ContextInfoModel() {
	}
	
	
	
}
