package Shop.DAO;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Shop.entity.MapperSlide;
import Shop.entity.Slide;

@Repository
public class SlideDAO {
	@Autowired
	
	public JdbcTemplate _jdbcTemplate;
	
	public List<Slide> getDataSlide(){
		List<Slide> list = new ArrayList<Slide>();
		String sql = "select * from slide";
		list = _jdbcTemplate.query(sql, new MapperSlide());
		return list;		
	}
	
}
