package model;

public class Product {
	private int pid, sid, pprice;
	private String image, pname, pcategory, pdesc;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcategory() {
		return pcategory;
	}

	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", sid=" + sid + ", pprice=" + pprice + ", image=" + image + ", pname=" + pname
				+ ", pcategory=" + pcategory + ", pdesc=" + pdesc + "]";
	}

}
