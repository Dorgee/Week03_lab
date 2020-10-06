
package servlets;

import domain.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class NoteServlet extends HttpServlet {

   
  

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          String edit = request.getParameter("edit");
          if(edit !=null){
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
                }
           String path = this.getServletContext().getRealPath("/WEB-INF/note.txt");
         BufferedReader br = new BufferedReader(new FileReader(new File(path)));
           
            String title = br.readLine();
            String content;    
             content = br.readLine();
            br.close();
            Note n1= new Note( title,  content);
            request.setAttribute("note", n1);
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        
    }
    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
   
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        String t2 = request.getParameter("title");
        String c2 = request.getParameter("content");
        Note n1 = new Note(t2, c2);
        request.setAttribute("note", n1);
        pw.println(t2);
        pw.println(c2);
         getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        pw.close();
                
    }

    
   

}
