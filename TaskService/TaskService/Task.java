package TaskService;


public class Task {
	private String ID;
	private String reqName;
	private String reqDesc;


	public Task(String id, String reqName, String reqDesc) {
        if (id == null || id.length() > 10) {
            throw new IllegalArgumentException("Invalid Id");
        }

        if (reqName == null || reqName.length() > 20) {
            throw new IllegalArgumentException("Invalid reqName");
        }

        if (reqDesc == null || reqDesc.length() > 50) {
            throw new IllegalArgumentException("Invalid reqDescription");
        }
        
				this.ID = id;
				this.reqName = reqName;
				this.reqDesc = reqDesc;
}


	public String getID() {
		return ID;
}
	public String getreqName() {
		return reqName;
}

	public String getreqDesc() {
		return reqDesc;
}
	public void updatreqName(String reqName) {
		this.reqName = reqName;
}
	public void updatereqDesc(String reqDesc) {
		this.reqDesc = reqDesc;
}

}




