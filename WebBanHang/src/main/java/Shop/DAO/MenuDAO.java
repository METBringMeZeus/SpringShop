package Shop.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Shop.entity.Menu;
import Shop.entity.MapperMenu;

@Repository
public class MenuDAO {
	@Autowired
	
	public JdbcTemplate _jdbcTemplate;
	
	public List<Menu> getDataMenu(){
		List<Menu> list = new ArrayList<Menu>();
		String sql = "select * from menu";
		list = _jdbcTemplate.query(sql, new MapperMenu());
		return list;		
	}
}
