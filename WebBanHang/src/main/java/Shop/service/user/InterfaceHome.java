package Shop.service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import Shop.DTO.ProductsDTO;
import Shop.entity.Categorys;
import Shop.entity.Menu;
import Shop.entity.Slide;
@Service

public interface InterfaceHome {
	public List<Slide> getDataSlide();
	public List<Categorys> getDataCategorys();
	public List<Menu> getDataMenu();
	public List<ProductsDTO> getDataProducts();
}
