package file;

public class FileDTO {

	String fileName; //업로드(다운로드)한 파일의 원본이름
	String fileRealName; //업로드(다운로드)한 파일의 실제이름
	int downloadCount;//다운로드한 횟수
	
	
	public FileDTO() {
	}
	
	public FileDTO(String fileName, String fileRealName, int downloadCount) {
		this.fileName = fileName;
		this.fileRealName = fileRealName;
		this.downloadCount = downloadCount;
	}
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileRealName() {
		return fileRealName;
	}
	public void setFileRealName(String fileRealName) {
		this.fileRealName = fileRealName;
	}
	public int getDownloadCount() {
		return downloadCount;
	}
	public void setDownloadCount(int downloadCount) {
		this.downloadCount = downloadCount;
	}

		
}
