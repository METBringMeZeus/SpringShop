package Shop.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Shop.DAO.CategorysDAO;
import Shop.DAO.MenuDAO;
import Shop.DAO.ProductsDAO;
import Shop.DAO.SlideDAO;
import Shop.DTO.ProductsDTO;
import Shop.entity.Categorys;
import Shop.entity.Menu;
import Shop.entity.Slide;

@Service
public class ImplementHome implements InterfaceHome {
	@Autowired
	private SlideDAO slideDAO;
	@Autowired
	private CategorysDAO categorysDAO;
	@Autowired
	private MenuDAO menuDAO;
	@Autowired
	private ProductsDAO productDAO;

	public List<Slide> getDataSlide() {
		return slideDAO.getDataSlide();
	}

	public List<Categorys> getDataCategorys() {
		return categorysDAO.getDataCategorys();

	}

	public List<Menu> getDataMenu() {
		return menuDAO.getDataMenu();
	}

	public List<ProductsDTO> getDataProducts(){
		return productDAO.getDataProducts();
	}
}
