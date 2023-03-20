package services;
import java.util.ArrayList;
import java.util.List;

import com.text.jsonob_creat;

public class Bookservices {
	private static List<jsonob_creat>list=new ArrayList<>();
	static{
		list.add(new jsonob_creat(112,"computers","yamunanagar"));
		list.add(new jsonob_creat(1,"computers with us ","dehli"));
	}
	static int coun=0;
	public List<jsonob_creat> getbooks(){
		System.out.println(list);
		System.out.println("No of times add of books occured is "+coun);
		return list;
		
	}
	public jsonob_creat getbooksbyid(int idc){jsonob_creat ret=new jsonob_creat();
		for(jsonob_creat j: list) {if(j.id==idc) {
			ret=j;
		}
			
	}return ret;
	}
	public jsonob_creat getbookbyid(int giveid){
		jsonob_creat req_book=new jsonob_creat();
		for(jsonob_creat book:list){
			if(book.id == giveid) {
				req_book=book;
			}
			else {
			}
		}
		return req_book;
	}
	public List<jsonob_creat> addbooks(jsonob_creat in_book){
		list.add(in_book);
		coun++;
		return list;
		
}
	public boolean deletebooksbyid(int giveid) {
		int a=0;
		for(jsonob_creat book:list){
		if(book.id == giveid) {
			list.remove(book); a=1;
		  break;
		}

	}
    if(a==0) {
    	return false;
    }
    else {
    	return true;

    }
	}
}