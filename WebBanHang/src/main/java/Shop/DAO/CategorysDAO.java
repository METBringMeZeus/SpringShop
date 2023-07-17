package Shop.DAO;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Shop.entity.Categorys;
import Shop.entity.MapperCategorys;


@Repository
public class CategorysDAO {
	@Autowired
	
	public JdbcTemplate _jdbcTemplate;
	
	public List<Categorys> getDataCategorys(){
		List<Categorys> list = new ArrayList<Categorys>();
		String sql = "select * from categorys";
		list = _jdbcTemplate.query(sql, new MapperCategorys());
		return list;		
	}

}
