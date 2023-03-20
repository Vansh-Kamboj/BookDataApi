package com.text;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;

import services.Bookservices;
@RestController
public class apicontroller {;
	 //@RequestMapping(value="/start",method=RequestMethod.GET)
	@GetMapping("/start")
    @ResponseBody
        public List<jsonob_creat> control() { 
	     System.out.println("Check it started");
		 Bookservices bookgroup=new Bookservices();
		// apicontroller.resp();
		return bookgroup.getbooks();
	}
	@GetMapping("/start/{id}")
    @ResponseBody
	public  jsonob_creat controlbyid(@PathVariable int id) throws Exception{ 
	     System.out.println("the id we get is "+id);
		 Bookservices bookgroup=new Bookservices();
		// apicontroller.resp();
		jsonob_creat resp_ob= bookgroup.getbooksbyid(id);
		if(resp_ob.id == 0) { System.out.println("id do not exist");
		// throw new Userid_exception("id do not exist");
		}
		 return resp_ob;
	}
	@DeleteMapping("/start/{id}")
    @ResponseBody
	public String deletebyid(@PathVariable int id) throws Exception { 
	     System.out.println("the id we get is "+id);
		 Bookservices bookgroup=new Bookservices();
		// apicontroller.resp();
		boolean resp_ob= bookgroup.deletebooksbyid(id);
		if(resp_ob== true) { 
			return "deletion done successfully ";
		}else {
		 return "the id given is wrong ";}
	}
   @PostMapping("/startit")
   public  jsonob_creat takeit( @RequestBody  jsonob_creat newbook) { 
	   Bookservices bookcome=new Bookservices();
	   bookcome.addbooks(newbook);
	   return newbook;
   }
 public  static ResponseEntity<String> resp() {
	 return ResponseEntity.ok("yes it is working");
	 
 }
}
