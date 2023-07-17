package Shop.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCategorys implements RowMapper<Categorys> {

	@Override
	public Categorys mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Categorys cate = new Categorys();
		cate.setId(rs.getInt("id"));
		cate.setName(rs.getString("name"));
		cate.setDescription(rs.getString("description"));
					
		return cate;
	}

}
