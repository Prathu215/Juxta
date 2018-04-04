package com.juxta.controllers;
import java.util.ArrayList;
import java.util.List;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.juxta.entities.AutoMobile;
import com.juxta.models.AutoMobileModel;
import com.juxta.services.AutoMobileService;

@RestController
@CrossOrigin
public class AutoMobileController {
	Logger logger=Logger.getLogger(AutoMobileController.class);	
	
	@Autowired
	private AutoMobileService autoMobileService;
	
	@RequestMapping(value="/automobiles",method=RequestMethod.GET)
	public List<AutoMobile> getAutoMobiles() {
		return this.autoMobileService.getAutoMobiles();
	}
	
	@RequestMapping(value="/automobiles",method=RequestMethod.POST)	
	public List<AutoMobileModel> addAutoMobile(@RequestBody AutoMobileModel autoMobile) {
		logger.info("Entry to post method, printing automobile model:"+autoMobile);
		List<AutoMobileModel> autoMobileModelList=null;
		try {
			autoMobileModelList = new ArrayList<AutoMobileModel>();
			autoMobileModelList.add(this.autoMobileService.addAutoMobile(autoMobile));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return autoMobileModelList;    
	}
}

