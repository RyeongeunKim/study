package fbbs;

import java.sql.Date;

public class BoardBean {
	
	private int num;
	private String name;
	private String subject;
	private String content;
	private String filename;
	private String oFileName;
	private int readcount;
	private String pass;
	private Date date;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getoFileName() {
		return oFileName;
	}
	public void setoFileName(String oFileName) {
		this.oFileName = oFileName;
	}
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "BoardBean [num=" + num + ", name=" + name + ", subject=" + subject + ", content=" + content
				+ ", filename=" + filename + ", oFileName=" + oFileName + ", readcount=" + readcount + ", pass=" + pass
				+ ", date=" + date + "]";
	}

}
