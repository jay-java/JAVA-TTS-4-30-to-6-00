    <%@ page import="java.sql.*" %>  
    <%  
    String name=request.getParameter("val");  
    if(name==null||name.trim().equals(""))
    {  
    	out.print("<p>Please enter Email!</p>");  
    }
    else
    {  
    	try
    	{  
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUD","root","");  
    		PreparedStatement ps=con.prepareStatement("select * from student2 where email=?");  
    		ps.setString(1, name);
    		ResultSet rs=ps.executeQuery();  
      		while(rs.next()) 
      		{      
     			out.println("<p>Email Id Already Used</p>");   
    		}
      		
    		con.close();  
    	}
    	catch(Exception e)
    	{
    		out.print(e);
    	}  
    }  
    %>  