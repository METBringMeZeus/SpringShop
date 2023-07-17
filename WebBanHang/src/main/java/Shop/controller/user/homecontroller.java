package Shop.controller.user;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class homecontroller extends basecontroller{

	@RequestMapping(value={"/","/TrangChu"})
	public ModelAndView index(){
		
		_mvShare.addObject("slide",_HomeImpl.getDataSlide());
		_mvShare.addObject("categorys", _HomeImpl.getDataCategorys());
		_mvShare.addObject("products", _HomeImpl.getDataProducts());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}
	@RequestMapping(value={"/Product"})
	public ModelAndView product(){
		_mvShare.setViewName("user/product");
		return _mvShare;
	}	
}
