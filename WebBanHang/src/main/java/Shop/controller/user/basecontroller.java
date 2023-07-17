package Shop.controller.user;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import Shop.service.user.ImplementHome;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class basecontroller {
	@Autowired
	
	ImplementHome _HomeImpl;
	ModelAndView _mvShare = new ModelAndView();
	@PostConstruct
	public ModelAndView Init() {
		_mvShare.addObject("menu",_HomeImpl.getDataMenu());
		return _mvShare;
		
	}
}
