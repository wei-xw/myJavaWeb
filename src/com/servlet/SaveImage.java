package com.servlet;  
  
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.InputStream;  
import java.io.OutputStream;  
import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
  



import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;    

import sun.misc.BASE64Decoder;  
import sun.misc.BASE64Encoder;  
  
public class SaveImage extends HttpServlet {  
    private static final long serialVersionUID = -1915463532411657451L;  
       
    public void init() throws ServletException {    
         
    }   
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {  
          
    }  
   
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {  
        String a = request.getParameter("a");  
       System.out.println(a);
        try {  
            String[] url = a.split(",");  
            String u = url[1];  
            // Base64解码  
            byte[] b = new BASE64Decoder().decodeBuffer(u);  
            
            // 生成图片  
            OutputStream out = new FileOutputStream(new File("D:\\test.png"));  
            out.write(b);  
            out.flush();  
            out.close();  
             
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        System.out.println(a);
           
            
            // Base64解码  
          
    }  
      
}  