package com.text;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
@RestController 
public class filehandel {
	@PostMapping("/uploaditsp")
	 public ResponseEntity<String> Uploadfilespeci(@RequestParam("file")MultipartFile file) throws IOException{
		  final String Uploadfil="E:\\Spring\\sts_workspace\\bootrestapibook\\src\\main\\resources\\static\\fileupload";
		  InputStream is = file.getInputStream();
		  byte stor[]=new byte[is.available()];
		  System.out.println(is.available());
		  is.read(stor);
		 //Files.copy(file.getInputStream(),Paths.get(Uploadfil +File.separator+file.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);//diiferway
		  FileOutputStream puter=new FileOutputStream(Uploadfil +File.separator+file.getOriginalFilename());
		  System.out.println(puter);
		  puter.write(stor);
		  puter.flush();
		  puter.close();
		  filehandel.info(file);
		 return ResponseEntity.ok("get the response from user try to save it and it may be  saved now ");
	}
	
	public static void info(MultipartFile file) {
		System.out.println(file.getContentType());
		 System.out.println(file.getName());
		 System.out.println(file.getSize());
		
	}
	@PostMapping("/uploaditdy")
	public ResponseEntity<String> uploaddynamic(@RequestParam("file")MultipartFile file)throws IOException{
		 final String Uploadfil=new ClassPathResource("static/fileupload/").getFile().getAbsolutePath();
		 System.out.println(Uploadfil);
		 InputStream is = file.getInputStream();
	     byte stor[]=new byte[is.available()];
	     is.read(stor);
	     FileOutputStream puter=new FileOutputStream(Uploadfil +File.separator+file.getOriginalFilename());
		  System.out.println(puter); 
		  puter.write(stor);
		  puter.flush();
		  puter.close();
		  filehandel.info(file);
		  return ResponseEntity.ok("get the response from user save it the dynamic relation ");
	}

}
