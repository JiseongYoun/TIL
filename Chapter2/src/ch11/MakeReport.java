package ch11;
// Buffer 를 사용하여 string을 연결하여, string값으로 리턴함.
// append 라는 메서드를 쓰면 string을 쭉 연결할 수 있음.
// Header, Body, Footer 를 private 
public class MakeReport {
	
	StringBuffer buffer = new StringBuffer();
	
	private String line = "=======================================\n";
	private String title = "  이름\t   주소 \t\t   전화번호 \n";
	private void makeHeader() 
	{
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody()
	{
		buffer.append("James  \t");
		buffer.append("Seoul Korea  \t");
		buffer.append("010-2222-3333\n");
		
		buffer.append("Tomas  \t");
		buffer.append("NewYork Us  \t");
		buffer.append("010-7777-0987\n");
	}
	
	private void makeFooter()
	{
		buffer.append(line);
	}
	
	public String getReport()
	{
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}

}
