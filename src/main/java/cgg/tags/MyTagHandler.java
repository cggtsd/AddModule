package cgg.tags;

import java.time.LocalDate;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class MyTagHandler extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		try {
			//task ....tag
			JspWriter out = pageContext.getOut();
			out.println("<h1>This is my custom tag</h1>");
			out.println("<p>this is custom paragraph</p>");
			out.println("<br>");
			out.println(LocalDate.now());
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}
}
